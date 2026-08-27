import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Reference2FloatMap;
import it.unimi.dsi.fastutil.objects.Reference2FloatMaps;
import it.unimi.dsi.fastutil.objects.Reference2FloatOpenHashMap;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class bip {
   private static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private final is<dkx> c;
   private final Set<agl<csf>> d;
   private final boolean e;
   private final ees.c f;
   private final Thread g;
   private final DataFixer h;
   private volatile boolean i = true;
   private volatile boolean j;
   private volatile float k;
   private volatile int l;
   private volatile int m;
   private volatile int n;
   private final Reference2FloatMap<agl<csf>> o = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   private volatile uv p = uv.c("optimizeWorld.stage.counting");
   private static final Pattern q = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   private final een r;

   public bip(ees.c $$0, DataFixer $$1, is<dkx> $$2, boolean $$3) {
      this.c = $$2;
      this.d = $$2.f().stream().map(kd::a).collect(Collectors.toUnmodifiableSet());
      this.e = $$3;
      this.h = $$1;
      this.f = $$0;
      this.r = new een(this.f.a(csf.h).resolve("data").toFile(), $$1);
      this.g = b.newThread(this::i);
      this.g.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.p = uv.c("optimizeWorld.stage.failed");
         this.j = true;
      });
      this.g.start();
   }

   public void a() {
      this.i = false;

      try {
         this.g.join();
      } catch (InterruptedException var2) {
      }
   }

   private void i() {
      this.l = 0;
      Builder<agl<csf>, ListIterator<crm>> $$0 = ImmutableMap.builder();

      for (agl<csf> $$1 : this.d) {
         List<crm> $$2 = this.b($$1);
         $$0.put($$1, $$2.listIterator());
         this.l = this.l + $$2.size();
      }

      if (this.l == 0) {
         this.j = true;
      } else {
         float $$3 = (float)this.l;
         ImmutableMap<agl<csf>, ListIterator<crm>> $$4 = $$0.build();
         Builder<agl<csf>, dkl> $$5 = ImmutableMap.builder();

         for (agl<csf> $$6 : this.d) {
            Path $$7 = this.f.a($$6);
            $$5.put($$6, new dkl($$7.resolve("region"), this.h, true));
         }

         ImmutableMap<agl<csf>, dkl> $$8 = $$5.build();
         long $$9 = ac.b();
         this.p = uv.c("optimizeWorld.stage.upgrading");

         while (this.i) {
            boolean $$10 = false;
            float $$11 = 0.0F;

            for (agl<csf> $$12 : this.d) {
               ListIterator<crm> $$13 = (ListIterator<crm>)$$4.get($$12);
               dkl $$14 = (dkl)$$8.get($$12);
               if ($$13.hasNext()) {
                  crm $$15 = $$13.next();
                  boolean $$16 = false;

                  try {
                     sd $$17 = $$14.e($$15).join().orElse(null);
                     if ($$17 != null) {
                        int $$18 = dkl.a($$17);
                        djk $$19 = this.c.e(kd.b($$12)).b();
                        sd $$20 = $$14.a($$12, () -> this.r, $$17, $$19.b());
                        crm $$21 = new crm($$20.h("xPos"), $$20.h("zPos"));
                        if (!$$21.equals($$15)) {
                           a.warn("Chunk {} has invalid position {}", $$15, $$21);
                        }

                        boolean $$22 = $$18 < aa.b().d().c();
                        if (this.e) {
                           $$22 = $$22 || $$20.e("Heightmaps");
                           $$20.r("Heightmaps");
                           $$22 = $$22 || $$20.e("isLightOn");
                           $$20.r("isLightOn");
                           sj $$23 = $$20.c("sections", 10);

                           for (int $$24 = 0; $$24 < $$23.size(); $$24++) {
                              sd $$25 = $$23.a($$24);
                              $$22 = $$22 || $$25.e("BlockLight");
                              $$25.r("BlockLight");
                              $$22 = $$22 || $$25.e("SkyLight");
                              $$25.r("SkyLight");
                           }
                        }

                        if ($$22) {
                           $$14.a($$15, $$20);
                           $$16 = true;
                        }
                     }
                  } catch (CompletionException | y var26) {
                     Throwable $$27 = var26.getCause();
                     if (!($$27 instanceof IOException)) {
                        throw var26;
                     }

                     a.error("Error upgrading chunk {}", $$15, $$27);
                  }

                  if ($$16) {
                     this.m++;
                  } else {
                     this.n++;
                  }

                  $$10 = true;
               }

               float $$28 = (float)$$13.nextIndex() / $$3;
               this.o.put($$12, $$28);
               $$11 += $$28;
            }

            this.k = $$11;
            if (!$$10) {
               this.i = false;
            }
         }

         this.p = uv.c("optimizeWorld.stage.finished");
         UnmodifiableIterator var33 = $$8.values().iterator();

         while (var33.hasNext()) {
            dkl $$29 = (dkl)var33.next();

            try {
               $$29.close();
            } catch (IOException var25) {
               a.error("Error upgrading chunk", var25);
            }
         }

         this.r.a();
         $$9 = ac.b() - $$9;
         a.info("World optimizaton finished after {} ms", $$9);
         this.j = true;
      }
   }

   private List<crm> b(agl<csf> $$0) {
      File $$1 = this.f.a($$0).toFile();
      File $$2 = new File($$1, "region");
      File[] $$3 = $$2.listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
      if ($$3 == null) {
         return ImmutableList.of();
      } else {
         List<crm> $$4 = Lists.newArrayList();

         for (File $$5 : $$3) {
            Matcher $$6 = q.matcher($$5.getName());
            if ($$6.matches()) {
               int $$7 = Integer.parseInt($$6.group(1)) << 5;
               int $$8 = Integer.parseInt($$6.group(2)) << 5;

               try (dkp $$9 = new dkp($$5.toPath(), $$2.toPath(), true)) {
                  for (int $$10 = 0; $$10 < 32; $$10++) {
                     for (int $$11 = 0; $$11 < 32; $$11++) {
                        crm $$12 = new crm($$10 + $$7, $$11 + $$8);
                        if ($$9.b($$12)) {
                           $$4.add($$12);
                        }
                     }
                  }
               } catch (Throwable var19) {
               }
            }
         }

         return $$4;
      }
   }

   public boolean b() {
      return this.j;
   }

   public Set<agl<csf>> c() {
      return this.d;
   }

   public float a(agl<csf> $$0) {
      return this.o.getFloat($$0);
   }

   public float d() {
      return this.k;
   }

   public int e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   public int g() {
      return this.n;
   }

   public uv h() {
      return this.p;
   }
}
