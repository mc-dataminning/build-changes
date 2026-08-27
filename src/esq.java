import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.DataFixUtils;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.client.ClientBrandRetriever;

public class esq {
   private static final int a = 14737632;
   private static final int b = 2;
   private static final int c = 2;
   private static final int d = 2;
   private static final Map<dkh.a, String> e = ac.a(new EnumMap<>(dkh.a.class), $$0 -> {
      $$0.put(dkh.a.a, "SW");
      $$0.put(dkh.a.b, "S");
      $$0.put(dkh.a.c, "OW");
      $$0.put(dkh.a.d, "O");
      $$0.put(dkh.a.e, "M");
      $$0.put(dkh.a.f, "ML");
   });
   private final eqn f;
   private final esq.a g;
   private final erv h;
   private ehd i;
   private ehd j;
   @Nullable
   private cor k;
   @Nullable
   private dhf l;
   @Nullable
   private CompletableFuture<dhf> m;
   private static final int n = -65536;
   private static final int o = -256;
   private static final int p = -16711936;

   public esq(eqn $$0) {
      this.f = $$0;
      this.g = new esq.a();
      this.h = $$0.h;
   }

   public void a() {
      this.m = null;
      this.l = null;
   }

   public void a(erx $$0) {
      this.f.aG().a("debug");
      big $$1 = this.f.al();
      this.i = $$1.a(20.0, 0.0F, false);
      this.j = $$1.a(20.0, 0.0F, true);
      $$0.a(() -> {
         this.b($$0);
         this.c($$0);
         if (this.f.m.ac) {
            int $$1x = $$0.a();
            this.a($$0, this.f.aq(), 0, $$1x / 2, true);
            gcf $$2 = this.f.S();
            if ($$2 != null) {
               this.a($$0, $$2.aM(), $$1x - Math.min($$1x / 2, 240), $$1x / 2, false);
            }
         }
      });
      this.f.aG().c();
   }

   protected void b(erx $$0) {
      List<String> $$1 = this.b();
      $$1.add("");
      boolean $$2 = this.f.S() != null;
      $$1.add("Debug: Pie [shift]: " + (this.f.m.ab ? "visible" : "hidden") + ($$2 ? " FPS + TPS" : " FPS") + " [alt]: " + (this.f.m.ac ? "visible" : "hidden"));
      $$1.add("For help: press F3 + Q");
      this.a($$0, $$1, true);
   }

   protected void c(erx $$0) {
      List<String> $$1 = this.c();
      this.a($$0, $$1, false);
   }

   private void a(erx $$0, List<String> $$1, boolean $$2) {
      int $$3 = 9;

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         String $$5 = $$1.get($$4);
         if (!Strings.isNullOrEmpty($$5)) {
            int $$6 = this.h.b($$5);
            int $$7 = $$2 ? 2 : $$0.a() - 2 - $$6;
            int $$8 = 2 + $$3 * $$4;
            $$0.a($$7 - 1, $$8 - 1, $$7 + $$6 + 1, $$8 + $$3 - 1, -1873784752);
         }
      }

      for (int $$9 = 0; $$9 < $$1.size(); $$9++) {
         String $$10 = $$1.get($$9);
         if (!Strings.isNullOrEmpty($$10)) {
            int $$11 = this.h.b($$10);
            int $$12 = $$2 ? 2 : $$0.a() - 2 - $$11;
            int $$13 = 2 + $$3 * $$9;
            $$0.a(this.h, $$10, $$12, $$13, 14737632, false);
         }
      }
   }

   protected List<String> b() {
      gcf $$0 = this.f.S();
      fif $$1 = this.f.I();
      sf $$2 = $$1.l();
      float $$3 = $$2.r();
      float $$4 = $$2.q();
      String $$5;
      if ($$0 != null) {
         $$5 = String.format(Locale.ROOT, "Integrated server @ %.0f ms ticks, %.0f tx, %.0f rx", $$0.aL(), $$3, $$4);
      } else {
         $$5 = String.format(Locale.ROOT, "\"%s\" server, %.0f tx, %.0f rx", $$1.h(), $$3, $$4);
      }

      gv $$7 = this.f.al().dk();
      if (this.f.ax()) {
         return Lists.newArrayList(
            new String[]{
               "Minecraft " + aa.b().c() + " (" + this.f.g() + "/" + ClientBrandRetriever.getClientModName() + ")",
               this.f.A,
               $$5,
               this.f.f.g(),
               this.f.f.l(),
               "P: " + this.f.g.d() + ". T: " + this.f.s.h(),
               this.f.s.F(),
               "",
               String.format(Locale.ROOT, "Chunk-relative: %d %d %d", $$7.u() & 15, $$7.v() & 15, $$7.w() & 15)
            }
         );
      } else {
         big $$8 = this.f.al();
         hb $$9 = $$8.cD();

         String $$14 = switch ($$9) {
            case c -> "Towards negative Z";
            case d -> "Towards positive Z";
            case e -> "Towards negative X";
            case f -> "Towards positive X";
            default -> "Invalid";
         };
         cor $$15 = new cor($$7);
         if (!Objects.equals(this.k, $$15)) {
            this.k = $$15;
            this.a();
         }

         cpk $$16 = this.f();
         LongSet $$17 = (LongSet)($$16 instanceof aki ? ((aki)$$16).u() : LongSets.EMPTY_SET);
         List<String> $$18 = Lists.newArrayList(
            new String[]{
               "Minecraft "
                  + aa.b().c()
                  + " ("
                  + this.f.g()
                  + "/"
                  + ClientBrandRetriever.getClientModName()
                  + ("release".equalsIgnoreCase(this.f.h()) ? "" : "/" + this.f.h())
                  + ")",
               this.f.A,
               $$5,
               this.f.f.g(),
               this.f.f.l(),
               "P: " + this.f.g.d() + ". T: " + this.f.s.h(),
               this.f.s.F()
            }
         );
         String $$19 = this.e();
         if ($$19 != null) {
            $$18.add($$19);
         }

         $$18.add(this.f.s.ac().a() + " FC: " + $$17.size());
         $$18.add("");
         $$18.add(String.format(Locale.ROOT, "XYZ: %.3f / %.5f / %.3f", this.f.al().dp(), this.f.al().dr(), this.f.al().dv()));
         $$18.add(String.format(Locale.ROOT, "Block: %d %d %d [%d %d %d]", $$7.u(), $$7.v(), $$7.w(), $$7.u() & 15, $$7.v() & 15, $$7.w() & 15));
         $$18.add(String.format(Locale.ROOT, "Chunk: %d %d %d [%d %d in r.%d.%d.mca]", $$15.e, hy.a($$7.v()), $$15.f, $$15.j(), $$15.k(), $$15.h(), $$15.i()));
         $$18.add(String.format(Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", $$9, $$14, aro.g($$8.dA()), aro.g($$8.dC())));
         dhf $$20 = this.h();
         if ($$20.C()) {
            $$18.add("Waiting for chunk...");
         } else {
            int $$21 = this.f.s.i().p().a($$7, 0);
            int $$22 = this.f.s.a(cpt.a, $$7);
            int $$23 = this.f.s.a(cpt.b, $$7);
            $$18.add("Client Light: " + $$21 + " (" + $$22 + " sky, " + $$23 + " block)");
            dhf $$24 = this.g();
            StringBuilder $$25 = new StringBuilder("CH");

            for (dkh.a $$26 : dkh.a.values()) {
               if ($$26.b()) {
                  $$25.append(" ").append(e.get($$26)).append(": ").append($$20.a($$26, $$7.u(), $$7.w()));
               }
            }

            $$18.add($$25.toString());
            $$25.setLength(0);
            $$25.append("SH");

            for (dkh.a $$27 : dkh.a.values()) {
               if ($$27.d()) {
                  $$25.append(" ").append(e.get($$27)).append(": ");
                  if ($$24 != null) {
                     $$25.append($$24.a($$27, $$7.u(), $$7.w()));
                  } else {
                     $$25.append("??");
                  }
               }
            }

            $$18.add($$25.toString());
            if ($$7.v() >= this.f.s.C_() && $$7.v() < this.f.s.aj()) {
               $$18.add("Biome: " + a(this.f.s.s($$7)));
               if ($$24 != null) {
                  float $$28 = $$16.an();
                  long $$29 = $$24.u();
                  bgm $$30 = new bgm($$16.ai(), $$16.W(), $$29, $$28);
                  $$18.add(String.format(Locale.ROOT, "Local Difficulty: %.2f // %.2f (Day %d)", $$30.b(), $$30.d(), this.f.s.W() / 24000L));
               } else {
                  $$18.add("Local Difficulty: ??");
               }
            }

            if ($$24 != null && $$24.s()) {
               $$18.add("Blending: Old");
            }
         }

         aki $$31 = this.d();
         if ($$31 != null) {
            akg $$32 = $$31.k();
            dgv $$33 = $$32.g();
            dkv $$34 = $$32.i();
            $$33.a($$18, $$34, $$7);
            cqr.f $$35 = $$34.b();
            cqm $$36 = $$33.c();
            $$36.a($$18, $$7, $$35);
            cpv.d $$37 = $$32.n();
            if ($$37 != null) {
               Object2IntMap<biz> $$38 = $$37.b();
               int $$39 = $$37.a();
               $$18.add(
                  "SC: "
                     + $$39
                     + ", "
                     + Stream.of(biz.values())
                        .map($$1x -> Character.toUpperCase($$1x.a().charAt(0)) + ": " + $$38.getInt($$1x))
                        .collect(Collectors.joining(", "))
               );
            } else {
               $$18.add("SC: N/A");
            }
         }

         fnj $$40 = this.f.j.g();
         if ($$40 != null) {
            $$18.add("Shader: " + $$40.a());
         }

         $$18.add(this.f.ah().h() + String.format(Locale.ROOT, " (Mood %d%%)", Math.round(this.f.t.d() * 100.0F)));
         return $$18;
      }
   }

   private static String a(hf<cqi> $$0) {
      return (String)$$0.d().map($$0x -> $$0x.a().toString(), $$0x -> "[unregistered " + $$0x + "]");
   }

   @Nullable
   private aki d() {
      gcf $$0 = this.f.S();
      return $$0 != null ? $$0.a(this.f.s.ac()) : null;
   }

   @Nullable
   private String e() {
      aki $$0 = this.d();
      return $$0 != null ? $$0.F() : null;
   }

   private cpk f() {
      return (cpk)DataFixUtils.orElse(Optional.ofNullable(this.f.S()).flatMap($$0 -> Optional.ofNullable($$0.a(this.f.s.ac()))), this.f.s);
   }

   @Nullable
   private dhf g() {
      if (this.m == null) {
         aki $$0 = this.d();
         if ($$0 == null) {
            return null;
         }

         this.m = $$0.k().b(this.k.e, this.k.f, dgz.n, false).thenApply($$0x -> (dhf)$$0x.map($$0xx -> (dhf)$$0xx, $$0xx -> null));
      }

      return this.m.getNow(null);
   }

   private dhf h() {
      if (this.l == null) {
         this.l = this.f.s.d(this.k.e, this.k.f);
      }

      return this.l;
   }

   protected List<String> c() {
      long $$0 = Runtime.getRuntime().maxMemory();
      long $$1 = Runtime.getRuntime().totalMemory();
      long $$2 = Runtime.getRuntime().freeMemory();
      long $$3 = $$1 - $$2;
      List<String> $$4 = Lists.newArrayList(
         new String[]{
            String.format(Locale.ROOT, "Java: %s %dbit", System.getProperty("java.version"), this.f.ae() ? 64 : 32),
            String.format(Locale.ROOT, "Mem: % 2d%% %03d/%03dMB", $$3 * 100L / $$0, a($$3), a($$0)),
            String.format(Locale.ROOT, "Allocation rate: %03dMB /s", a(this.g.a($$3))),
            String.format(Locale.ROOT, "Allocated: % 2d%% %03dMB", $$1 * 100L / $$0, a($$1)),
            "",
            String.format(Locale.ROOT, "CPU: %s", eka.b()),
            "",
            String.format(Locale.ROOT, "Display: %dx%d (%s)", eqn.N().aM().k(), eqn.N().aM().l(), eka.a()),
            eka.c(),
            eka.d()
         }
      );
      if (this.f.ax()) {
         return $$4;
      } else {
         if (this.i.c() == ehd.a.b) {
            gv $$5 = ((ehb)this.i).a();
            dey $$6 = this.f.s.a_($$5);
            $$4.add("");
            $$4.add(n.t + "Targeted Block: " + $$5.u() + ", " + $$5.v() + ", " + $$5.w());
            $$4.add(String.valueOf(jc.f.b($$6.b())));
            UnmodifiableIterator var12 = $$6.C().entrySet().iterator();

            while (var12.hasNext()) {
               Entry<dgb<?>, Comparable<?>> $$7 = (Entry<dgb<?>, Comparable<?>>)var12.next();
               $$4.add(this.a($$7));
            }

            $$6.s().map($$0x -> "#" + $$0x.b()).forEach($$4::add);
         }

         if (this.j.c() == ehd.a.b) {
            gv $$8 = ((ehb)this.j).a();
            eab $$9 = this.f.s.b_($$8);
            $$4.add("");
            $$4.add(n.t + "Targeted Fluid: " + $$8.u() + ", " + $$8.v() + ", " + $$8.w());
            $$4.add(String.valueOf(jc.d.b($$9.a())));
            UnmodifiableIterator var17 = $$9.C().entrySet().iterator();

            while (var17.hasNext()) {
               Entry<dgb<?>, Comparable<?>> $$10 = (Entry<dgb<?>, Comparable<?>>)var17.next();
               $$4.add(this.a($$10));
            }

            $$9.k().map($$0x -> "#" + $$0x.b()).forEach($$4::add);
         }

         big $$11 = this.f.v;
         if ($$11 != null) {
            $$4.add("");
            $$4.add(n.t + "Targeted Entity");
            $$4.add(String.valueOf(jc.h.b($$11.ag())));
         }

         return $$4;
      }
   }

   private String a(Entry<dgb<?>, Comparable<?>> $$0) {
      dgb<?> $$1 = $$0.getKey();
      Comparable<?> $$2 = $$0.getValue();
      String $$3 = ac.a($$1, $$2);
      if (Boolean.TRUE.equals($$2)) {
         $$3 = n.k + $$3;
      } else if (Boolean.FALSE.equals($$2)) {
         $$3 = n.m + $$3;
      }

      return $$1.f() + ": " + $$3;
   }

   private void a(erx $$0, arc $$1, int $$2, int $$3, boolean $$4) {
      int $$5 = $$1.a();
      int $$6 = $$1.b();
      long[] $$7 = $$1.c();
      int $$9 = $$2;
      int $$10 = Math.max(0, $$7.length - $$3);
      int $$11 = $$7.length - $$10;
      int $$8 = $$1.b($$5 + $$10);
      long $$12 = 0L;
      int $$13 = Integer.MAX_VALUE;
      int $$14 = Integer.MIN_VALUE;

      for (int $$15 = 0; $$15 < $$11; $$15++) {
         int $$16 = (int)($$7[$$1.b($$8 + $$15)] / 1000000L);
         $$13 = Math.min($$13, $$16);
         $$14 = Math.max($$14, $$16);
         $$12 += (long)$$16;
      }

      int $$17 = $$0.b();
      $$0.a(fno.D(), $$2, $$17 - 60, $$2 + $$11, $$17, -1873784752);

      while ($$8 != $$6) {
         int $$18 = $$1.a($$7[$$8], $$4 ? 30 : 60, $$4 ? 60 : 20);
         int $$19 = $$4 ? 100 : 60;
         int $$20 = this.a(aro.a($$18, 0, $$19), 0, $$19 / 2, $$19);
         $$0.a(fno.D(), $$9, $$17 - $$18, $$9 + 1, $$17, $$20);
         $$9++;
         $$8 = $$1.b($$8 + 1);
      }

      if ($$4) {
         $$0.a(fno.D(), $$2 + 1, $$17 - 30 + 1, $$2 + 14, $$17 - 30 + 10, -1873784752);
         $$0.a(this.h, "60 FPS", $$2 + 2, $$17 - 30 + 2, 14737632, false);
         $$0.a(fno.D(), $$2, $$2 + $$11 - 1, $$17 - 30, -1);
         $$0.a(fno.D(), $$2 + 1, $$17 - 60 + 1, $$2 + 14, $$17 - 60 + 10, -1873784752);
         $$0.a(this.h, "30 FPS", $$2 + 2, $$17 - 60 + 2, 14737632, false);
         $$0.a(fno.D(), $$2, $$2 + $$11 - 1, $$17 - 60, -1);
      } else {
         $$0.a(fno.D(), $$2 + 1, $$17 - 60 + 1, $$2 + 14, $$17 - 60 + 10, -1873784752);
         $$0.a(this.h, "20 TPS", $$2 + 2, $$17 - 60 + 2, 14737632, false);
         $$0.a(fno.D(), $$2, $$2 + $$11 - 1, $$17 - 60, -1);
      }

      $$0.a(fno.D(), $$2, $$2 + $$11 - 1, $$17 - 1, -1);
      $$0.b(fno.D(), $$2, $$17 - 60, $$17, -1);
      $$0.b(fno.D(), $$2 + $$11 - 1, $$17 - 60, $$17, -1);
      int $$21 = this.f.m.g().c();
      if ($$4 && $$21 > 0 && $$21 <= 250) {
         $$0.a(fno.D(), $$2, $$2 + $$11 - 1, $$17 - 1 - (int)(1800.0 / (double)$$21), -16711681);
      }

      String $$22 = $$13 + " ms min";
      String $$23 = $$12 / (long)$$11 + " ms avg";
      String $$24 = $$14 + " ms max";
      $$0.b(this.h, $$22, $$2 + 2, $$17 - 60 - 9, 14737632);
      $$0.a(this.h, $$23, $$2 + $$11 / 2, $$17 - 60 - 9, 14737632);
      $$0.b(this.h, $$24, $$2 + $$11 - this.h.b($$24), $$17 - 60 - 9, 14737632);
   }

   private int a(int $$0, int $$1, int $$2, int $$3) {
      return $$0 < $$2 ? this.a(-16711936, -256, (float)$$0 / (float)$$2) : this.a(-256, -65536, (float)($$0 - $$2) / (float)($$3 - $$2));
   }

   private int a(int $$0, int $$1, float $$2) {
      int $$3 = $$0 >> 24 & 0xFF;
      int $$4 = $$0 >> 16 & 0xFF;
      int $$5 = $$0 >> 8 & 0xFF;
      int $$6 = $$0 & 0xFF;
      int $$7 = $$1 >> 24 & 0xFF;
      int $$8 = $$1 >> 16 & 0xFF;
      int $$9 = $$1 >> 8 & 0xFF;
      int $$10 = $$1 & 0xFF;
      int $$11 = aro.a((int)aro.i($$2, (float)$$3, (float)$$7), 0, 255);
      int $$12 = aro.a((int)aro.i($$2, (float)$$4, (float)$$8), 0, 255);
      int $$13 = aro.a((int)aro.i($$2, (float)$$5, (float)$$9), 0, 255);
      int $$14 = aro.a((int)aro.i($$2, (float)$$6, (float)$$10), 0, 255);
      return $$11 << 24 | $$12 << 16 | $$13 << 8 | $$14;
   }

   private static long a(long $$0) {
      return $$0 / 1024L / 1024L;
   }

   static class a {
      private static final int a = 500;
      private static final List<GarbageCollectorMXBean> b = ManagementFactory.getGarbageCollectorMXBeans();
      private long c = 0L;
      private long d = -1L;
      private long e = -1L;
      private long f = 0L;

      long a(long $$0) {
         long $$1 = System.currentTimeMillis();
         if ($$1 - this.c < 500L) {
            return this.f;
         } else {
            long $$2 = a();
            if (this.c != 0L && $$2 == this.e) {
               double $$3 = (double)TimeUnit.SECONDS.toMillis(1L) / (double)($$1 - this.c);
               long $$4 = $$0 - this.d;
               this.f = Math.round((double)$$4 * $$3);
            }

            this.c = $$1;
            this.d = $$0;
            this.e = $$2;
            return this.f;
         }
      }

      private static long a() {
         long $$0 = 0L;

         for (GarbageCollectorMXBean $$1 : b) {
            $$0 += $$1.getCollectionCount();
         }

         return $$0;
      }
   }
}
