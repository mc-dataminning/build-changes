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

public class epq {
   private static final int a = 14737632;
   private static final int b = 2;
   private static final int c = 2;
   private static final int d = 2;
   private static final Map<dhk.a, String> e = ac.a(new EnumMap<>(dhk.a.class), $$0 -> {
      $$0.put(dhk.a.a, "SW");
      $$0.put(dhk.a.b, "S");
      $$0.put(dhk.a.c, "OW");
      $$0.put(dhk.a.d, "O");
      $$0.put(dhk.a.e, "M");
      $$0.put(dhk.a.f, "ML");
   });
   private final enn f;
   private final epq.a g;
   private final eov h;
   private eeg i;
   private eeg j;
   @Nullable
   private clt k;
   @Nullable
   private dei l;
   @Nullable
   private CompletableFuture<dei> m;
   private static final int n = -65536;
   private static final int o = -256;
   private static final int p = -16711936;

   public epq(enn $$0) {
      this.f = $$0;
      this.g = new epq.a();
      this.h = $$0.h;
   }

   public void a() {
      this.m = null;
      this.l = null;
   }

   public void a(eox $$0) {
      this.f.aG().a("debug");
      bfj $$1 = this.f.al();
      this.i = $$1.a(20.0, 0.0F, false);
      this.j = $$1.a(20.0, 0.0F, true);
      $$0.a(() -> {
         this.b($$0);
         this.c($$0);
         if (this.f.m.ac) {
            int $$1x = $$0.a();
            this.a($$0, this.f.aq(), 0, $$1x / 2, true);
            fyp $$2 = this.f.S();
            if ($$2 != null) {
               this.a($$0, $$2.aM(), $$1x - Math.min($$1x / 2, 240), $$1x / 2, false);
            }
         }
      });
      this.f.aG().c();
   }

   protected void b(eox $$0) {
      List<String> $$1 = this.b();
      $$1.add("");
      boolean $$2 = this.f.S() != null;
      $$1.add("Debug: Pie [shift]: " + (this.f.m.ab ? "visible" : "hidden") + ($$2 ? " FPS + TPS" : " FPS") + " [alt]: " + (this.f.m.ac ? "visible" : "hidden"));
      $$1.add("For help: press F3 + Q");
      this.a($$0, $$1, true);
   }

   protected void c(eox $$0) {
      List<String> $$1 = this.c();
      this.a($$0, $$1, false);
   }

   private void a(eox $$0, List<String> $$1, boolean $$2) {
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
      fyp $$0 = this.f.S();
      sd $$1 = this.f.I().g();
      float $$2 = $$1.o();
      float $$3 = $$1.n();
      String $$4;
      if ($$0 != null) {
         $$4 = String.format(Locale.ROOT, "Integrated server @ %.0f ms ticks, %.0f tx, %.0f rx", $$0.aL(), $$2, $$3);
      } else {
         $$4 = String.format(Locale.ROOT, "\"%s\" server, %.0f tx, %.0f rx", this.f.t.u(), $$2, $$3);
      }

      gu $$6 = this.f.al().di();
      if (this.f.ay()) {
         return Lists.newArrayList(
            new String[]{
               "Minecraft " + aa.b().c() + " (" + this.f.g() + "/" + ClientBrandRetriever.getClientModName() + ")",
               this.f.A,
               $$4,
               this.f.f.g(),
               this.f.f.l(),
               "P: " + this.f.g.d() + ". T: " + this.f.s.h(),
               this.f.s.F(),
               "",
               String.format(Locale.ROOT, "Chunk-relative: %d %d %d", $$6.u() & 15, $$6.v() & 15, $$6.w() & 15)
            }
         );
      } else {
         bfj $$7 = this.f.al();
         ha $$8 = $$7.cB();

         String $$13 = switch ($$8) {
            case c -> "Towards negative Z";
            case d -> "Towards positive Z";
            case e -> "Towards negative X";
            case f -> "Towards positive X";
            default -> "Invalid";
         };
         clt $$14 = new clt($$6);
         if (!Objects.equals(this.k, $$14)) {
            this.k = $$14;
            this.a();
         }

         cmm $$15 = this.f();
         LongSet $$16 = (LongSet)($$15 instanceof aif ? ((aif)$$15).u() : LongSets.EMPTY_SET);
         List<String> $$17 = Lists.newArrayList(
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
               $$4,
               this.f.f.g(),
               this.f.f.l(),
               "P: " + this.f.g.d() + ". T: " + this.f.s.h(),
               this.f.s.F()
            }
         );
         String $$18 = this.e();
         if ($$18 != null) {
            $$17.add($$18);
         }

         $$17.add(this.f.s.ac().a() + " FC: " + $$16.size());
         $$17.add("");
         $$17.add(String.format(Locale.ROOT, "XYZ: %.3f / %.5f / %.3f", this.f.al().dn(), this.f.al().dp(), this.f.al().dt()));
         $$17.add(String.format(Locale.ROOT, "Block: %d %d %d [%d %d %d]", $$6.u(), $$6.v(), $$6.w(), $$6.u() & 15, $$6.v() & 15, $$6.w() & 15));
         $$17.add(String.format(Locale.ROOT, "Chunk: %d %d %d [%d %d in r.%d.%d.mca]", $$14.e, hx.a($$6.v()), $$14.f, $$14.j(), $$14.k(), $$14.h(), $$14.i()));
         $$17.add(String.format(Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", $$8, $$13, apa.g($$7.dy()), apa.g($$7.dA())));
         dei $$19 = this.h();
         if ($$19.C()) {
            $$17.add("Waiting for chunk...");
         } else {
            int $$20 = this.f.s.i().p().a($$6, 0);
            int $$21 = this.f.s.a(cmv.a, $$6);
            int $$22 = this.f.s.a(cmv.b, $$6);
            $$17.add("Client Light: " + $$20 + " (" + $$21 + " sky, " + $$22 + " block)");
            dei $$23 = this.g();
            StringBuilder $$24 = new StringBuilder("CH");

            for (dhk.a $$25 : dhk.a.values()) {
               if ($$25.b()) {
                  $$24.append(" ").append(e.get($$25)).append(": ").append($$19.a($$25, $$6.u(), $$6.w()));
               }
            }

            $$17.add($$24.toString());
            $$24.setLength(0);
            $$24.append("SH");

            for (dhk.a $$26 : dhk.a.values()) {
               if ($$26.d()) {
                  $$24.append(" ").append(e.get($$26)).append(": ");
                  if ($$23 != null) {
                     $$24.append($$23.a($$26, $$6.u(), $$6.w()));
                  } else {
                     $$24.append("??");
                  }
               }
            }

            $$17.add($$24.toString());
            if ($$6.v() >= this.f.s.C_() && $$6.v() < this.f.s.aj()) {
               $$17.add("Biome: " + a(this.f.s.s($$6)));
               long $$27 = 0L;
               float $$28 = 0.0F;
               if ($$23 != null) {
                  $$28 = $$15.an();
                  $$27 = $$23.u();
               }

               bdv $$29 = new bdv($$15.ai(), $$15.W(), $$27, $$28);
               $$17.add(String.format(Locale.ROOT, "Local Difficulty: %.2f // %.2f (Day %d)", $$29.b(), $$29.d(), this.f.s.W() / 24000L));
            }

            if ($$23 != null && $$23.s()) {
               $$17.add("Blending: Old");
            }
         }

         aif $$30 = this.d();
         if ($$30 != null) {
            aid $$31 = $$30.k();
            ddy $$32 = $$31.g();
            dhy $$33 = $$31.i();
            $$32.a($$17, $$33, $$6);
            cnt.f $$34 = $$33.b();
            cno $$35 = $$32.c();
            $$35.a($$17, $$6, $$34);
            cmx.d $$36 = $$31.n();
            if ($$36 != null) {
               Object2IntMap<bgc> $$37 = $$36.b();
               int $$38 = $$36.a();
               $$17.add(
                  "SC: "
                     + $$38
                     + ", "
                     + Stream.of(bgc.values())
                        .map($$1x -> Character.toUpperCase($$1x.a().charAt(0)) + ": " + $$37.getInt($$1x))
                        .collect(Collectors.joining(", "))
               );
            } else {
               $$17.add("SC: N/A");
            }
         }

         fka $$39 = this.f.j.g();
         if ($$39 != null) {
            $$17.add("Shader: " + $$39.a());
         }

         $$17.add(this.f.ah().h() + String.format(Locale.ROOT, " (Mood %d%%)", Math.round(this.f.t.o() * 100.0F)));
         return $$17;
      }
   }

   private static String a(he<cnk> $$0) {
      return (String)$$0.d().map($$0x -> $$0x.a().toString(), $$0x -> "[unregistered " + $$0x + "]");
   }

   @Nullable
   private aif d() {
      fyp $$0 = this.f.S();
      return $$0 != null ? $$0.a(this.f.s.ac()) : null;
   }

   @Nullable
   private String e() {
      aif $$0 = this.d();
      return $$0 != null ? $$0.F() : null;
   }

   private cmm f() {
      return (cmm)DataFixUtils.orElse(Optional.ofNullable(this.f.S()).flatMap($$0 -> Optional.ofNullable($$0.a(this.f.s.ac()))), this.f.s);
   }

   @Nullable
   private dei g() {
      if (this.m == null) {
         aif $$0 = this.d();
         if ($$0 != null) {
            this.m = $$0.k().b(this.k.e, this.k.f, dec.n, false).thenApply($$0x -> (dei)$$0x.map($$0xx -> (dei)$$0xx, $$0xx -> null));
         }

         if (this.m == null) {
            this.m = CompletableFuture.completedFuture(this.h());
         }
      }

      return this.m.getNow(null);
   }

   private dei h() {
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
            String.format(Locale.ROOT, "CPU: %s", ehc.b()),
            "",
            String.format(Locale.ROOT, "Display: %dx%d (%s)", enn.N().aM().k(), enn.N().aM().l(), ehc.a()),
            ehc.c(),
            ehc.d()
         }
      );
      if (this.f.ay()) {
         return $$4;
      } else {
         if (this.i.c() == eeg.a.b) {
            gu $$5 = ((eee)this.i).a();
            dcb $$6 = this.f.s.a_($$5);
            $$4.add("");
            $$4.add(n.t + "Targeted Block: " + $$5.u() + ", " + $$5.v() + ", " + $$5.w());
            $$4.add(String.valueOf(jb.f.b($$6.b())));
            UnmodifiableIterator var12 = $$6.C().entrySet().iterator();

            while (var12.hasNext()) {
               Entry<dde<?>, Comparable<?>> $$7 = (Entry<dde<?>, Comparable<?>>)var12.next();
               $$4.add(this.a($$7));
            }

            $$6.s().map($$0x -> "#" + $$0x.b()).forEach($$4::add);
         }

         if (this.j.c() == eeg.a.b) {
            gu $$8 = ((eee)this.j).a();
            dxe $$9 = this.f.s.b_($$8);
            $$4.add("");
            $$4.add(n.t + "Targeted Fluid: " + $$8.u() + ", " + $$8.v() + ", " + $$8.w());
            $$4.add(String.valueOf(jb.d.b($$9.a())));
            UnmodifiableIterator var17 = $$9.C().entrySet().iterator();

            while (var17.hasNext()) {
               Entry<dde<?>, Comparable<?>> $$10 = (Entry<dde<?>, Comparable<?>>)var17.next();
               $$4.add(this.a($$10));
            }

            $$9.k().map($$0x -> "#" + $$0x.b()).forEach($$4::add);
         }

         bfj $$11 = this.f.v;
         if ($$11 != null) {
            $$4.add("");
            $$4.add(n.t + "Targeted Entity");
            $$4.add(String.valueOf(jb.h.b($$11.ae())));
         }

         return $$4;
      }
   }

   private String a(Entry<dde<?>, Comparable<?>> $$0) {
      dde<?> $$1 = $$0.getKey();
      Comparable<?> $$2 = $$0.getValue();
      String $$3 = ac.a($$1, $$2);
      if (Boolean.TRUE.equals($$2)) {
         $$3 = n.k + $$3;
      } else if (Boolean.FALSE.equals($$2)) {
         $$3 = n.m + $$3;
      }

      return $$1.f() + ": " + $$3;
   }

   private void a(eox $$0, aoo $$1, int $$2, int $$3, boolean $$4) {
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
      $$0.a(fkf.D(), $$2, $$17 - 60, $$2 + $$11, $$17, -1873784752);

      while ($$8 != $$6) {
         int $$18 = $$1.a($$7[$$8], $$4 ? 30 : 60, $$4 ? 60 : 20);
         int $$19 = $$4 ? 100 : 60;
         int $$20 = this.a(apa.a($$18, 0, $$19), 0, $$19 / 2, $$19);
         $$0.a(fkf.D(), $$9, $$17 - $$18, $$9 + 1, $$17, $$20);
         $$9++;
         $$8 = $$1.b($$8 + 1);
      }

      if ($$4) {
         $$0.a(fkf.D(), $$2 + 1, $$17 - 30 + 1, $$2 + 14, $$17 - 30 + 10, -1873784752);
         $$0.a(this.h, "60 FPS", $$2 + 2, $$17 - 30 + 2, 14737632, false);
         $$0.a(fkf.D(), $$2, $$2 + $$11 - 1, $$17 - 30, -1);
         $$0.a(fkf.D(), $$2 + 1, $$17 - 60 + 1, $$2 + 14, $$17 - 60 + 10, -1873784752);
         $$0.a(this.h, "30 FPS", $$2 + 2, $$17 - 60 + 2, 14737632, false);
         $$0.a(fkf.D(), $$2, $$2 + $$11 - 1, $$17 - 60, -1);
      } else {
         $$0.a(fkf.D(), $$2 + 1, $$17 - 60 + 1, $$2 + 14, $$17 - 60 + 10, -1873784752);
         $$0.a(this.h, "20 TPS", $$2 + 2, $$17 - 60 + 2, 14737632, false);
         $$0.a(fkf.D(), $$2, $$2 + $$11 - 1, $$17 - 60, -1);
      }

      $$0.a(fkf.D(), $$2, $$2 + $$11 - 1, $$17 - 1, -1);
      $$0.b(fkf.D(), $$2, $$17 - 60, $$17, -1);
      $$0.b(fkf.D(), $$2 + $$11 - 1, $$17 - 60, $$17, -1);
      int $$21 = this.f.m.g().c();
      if ($$4 && $$21 > 0 && $$21 <= 250) {
         $$0.a(fkf.D(), $$2, $$2 + $$11 - 1, $$17 - 1 - (int)(1800.0 / (double)$$21), -16711681);
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
      int $$11 = apa.a((int)apa.i($$2, (float)$$3, (float)$$7), 0, 255);
      int $$12 = apa.a((int)apa.i($$2, (float)$$4, (float)$$8), 0, 255);
      int $$13 = apa.a((int)apa.i($$2, (float)$$5, (float)$$9), 0, 255);
      int $$14 = apa.a((int)apa.i($$2, (float)$$6, (float)$$10), 0, 255);
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
