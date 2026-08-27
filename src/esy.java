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

public class esy {
   private static final int a = 14737632;
   private static final int b = 2;
   private static final int c = 2;
   private static final int d = 2;
   private static final Map<dks.a, String> e = ac.a(new EnumMap<>(dks.a.class), $$0 -> {
      $$0.put(dks.a.a, "SW");
      $$0.put(dks.a.b, "S");
      $$0.put(dks.a.c, "OW");
      $$0.put(dks.a.d, "O");
      $$0.put(dks.a.e, "M");
      $$0.put(dks.a.f, "ML");
   });
   private final eqv f;
   private final esy.a g;
   private final esd h;
   private ehl i;
   private ehl j;
   @Nullable
   private cpc k;
   @Nullable
   private dhq l;
   @Nullable
   private CompletableFuture<dhq> m;
   private boolean n;
   private boolean o;
   private boolean p;
   private boolean q;
   private final ase r = new ase();
   private final ase s = new ase();
   private final ase t = new ase();
   private final ase u = new ase();
   private final euf v;
   private final euh w;
   private final eug x;
   private final eue y;

   public esy(eqv $$0) {
      this.f = $$0;
      this.g = new esy.a();
      this.h = $$0.h;
      this.v = new euf(this.h, this.r);
      this.w = new euh(this.h, this.s);
      this.x = new eug(this.h, this.t);
      this.y = new eue(this.h, this.u);
   }

   public void a() {
      this.m = null;
      this.l = null;
   }

   public void a(esf $$0) {
      this.f.aG().a("debug");
      biq $$1 = this.f.am();
      this.i = $$1.a(20.0, 0.0F, false);
      this.j = $$1.a(20.0, 0.0F, true);
      $$0.a(() -> {
         this.b($$0);
         this.c($$0);
         if (this.p) {
            int $$1x = $$0.a();
            int $$2 = $$1x / 2;
            this.v.a($$0, 0, this.v.a($$2));
            if (this.f.T() != null) {
               int $$3 = this.w.a($$2);
               this.w.a($$0, $$1x - $$3, $$3);
            }
         }

         if (this.q) {
            int $$4 = $$0.a();
            int $$5 = $$4 / 2;
            if (!this.f.R()) {
               this.y.a($$0, 0, this.y.a($$5));
            }

            int $$6 = this.x.a($$5);
            this.x.a($$0, $$4 - $$6, $$6);
         }
      });
      this.f.aG().c();
   }

   protected void b(esf $$0) {
      List<String> $$1 = this.b();
      $$1.add("");
      boolean $$2 = this.f.T() != null;
      $$1.add(
         "Debug charts: [F3+1] Profiler "
            + (this.o ? "visible" : "hidden")
            + "; [F3+2] "
            + ($$2 ? "FPS + TPS " : "FPS ")
            + (this.p ? "visible" : "hidden")
            + "; [F3+3] "
            + (!this.f.R() ? "Bandwidth + Ping" : "Ping")
            + (this.q ? " visible" : " hidden")
      );
      $$1.add("For help: press F3 + Q");
      this.a($$0, $$1, true);
   }

   protected void c(esf $$0) {
      List<String> $$1 = this.c();
      this.a($$0, $$1, false);
   }

   private void a(esf $$0, List<String> $$1, boolean $$2) {
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
      gdd $$0 = this.f.T();
      fiy $$1 = this.f.J();
      sm $$2 = $$1.l();
      float $$3 = $$2.r();
      float $$4 = $$2.q();
      String $$5;
      if ($$0 != null) {
         $$5 = String.format(Locale.ROOT, "Integrated server @ %.0f ms ticks, %.0f tx, %.0f rx", $$0.aL(), $$3, $$4);
      } else {
         $$5 = String.format(Locale.ROOT, "\"%s\" server, %.0f tx, %.0f rx", $$1.h(), $$3, $$4);
      }

      gw $$7 = this.f.am().dl();
      if (this.f.ax()) {
         return Lists.newArrayList(
            new String[]{
               "Minecraft " + aa.b().c() + " (" + this.f.h() + "/" + ClientBrandRetriever.getClientModName() + ")",
               this.f.z,
               $$5,
               this.f.f.g(),
               this.f.f.l(),
               "P: " + this.f.g.d() + ". T: " + this.f.r.h(),
               this.f.r.F(),
               "",
               String.format(Locale.ROOT, "Chunk-relative: %d %d %d", $$7.u() & 15, $$7.v() & 15, $$7.w() & 15)
            }
         );
      } else {
         biq $$8 = this.f.am();
         ha $$9 = $$8.cD();

         String $$14 = switch ($$9) {
            case c -> "Towards negative Z";
            case d -> "Towards positive Z";
            case e -> "Towards negative X";
            case f -> "Towards positive X";
            default -> "Invalid";
         };
         cpc $$15 = new cpc($$7);
         if (!Objects.equals(this.k, $$15)) {
            this.k = $$15;
            this.a();
         }

         cpv $$16 = this.p();
         LongSet $$17 = (LongSet)($$16 instanceof akq ? ((akq)$$16).u() : LongSets.EMPTY_SET);
         List<String> $$18 = Lists.newArrayList(
            new String[]{
               "Minecraft "
                  + aa.b().c()
                  + " ("
                  + this.f.h()
                  + "/"
                  + ClientBrandRetriever.getClientModName()
                  + ("release".equalsIgnoreCase(this.f.i()) ? "" : "/" + this.f.i())
                  + ")",
               this.f.z,
               $$5,
               this.f.f.g(),
               this.f.f.l(),
               "P: " + this.f.g.d() + ". T: " + this.f.r.h(),
               this.f.r.F()
            }
         );
         String $$19 = this.o();
         if ($$19 != null) {
            $$18.add($$19);
         }

         $$18.add(this.f.r.ac().a() + " FC: " + $$17.size());
         $$18.add("");
         $$18.add(String.format(Locale.ROOT, "XYZ: %.3f / %.5f / %.3f", this.f.am().dq(), this.f.am().ds(), this.f.am().dw()));
         $$18.add(String.format(Locale.ROOT, "Block: %d %d %d [%d %d %d]", $$7.u(), $$7.v(), $$7.w(), $$7.u() & 15, $$7.v() & 15, $$7.w() & 15));
         $$18.add(String.format(Locale.ROOT, "Chunk: %d %d %d [%d %d in r.%d.%d.mca]", $$15.e, hw.a($$7.v()), $$15.f, $$15.j(), $$15.k(), $$15.h(), $$15.i()));
         $$18.add(String.format(Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", $$9, $$14, arw.g($$8.dB()), arw.g($$8.dD())));
         dhq $$20 = this.r();
         if ($$20.C()) {
            $$18.add("Waiting for chunk...");
         } else {
            int $$21 = this.f.r.i().p().a($$7, 0);
            int $$22 = this.f.r.a(cqe.a, $$7);
            int $$23 = this.f.r.a(cqe.b, $$7);
            $$18.add("Client Light: " + $$21 + " (" + $$22 + " sky, " + $$23 + " block)");
            dhq $$24 = this.q();
            StringBuilder $$25 = new StringBuilder("CH");

            for (dks.a $$26 : dks.a.values()) {
               if ($$26.b()) {
                  $$25.append(" ").append(e.get($$26)).append(": ").append($$20.a($$26, $$7.u(), $$7.w()));
               }
            }

            $$18.add($$25.toString());
            $$25.setLength(0);
            $$25.append("SH");

            for (dks.a $$27 : dks.a.values()) {
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
            if ($$7.v() >= this.f.r.H_() && $$7.v() < this.f.r.aj()) {
               $$18.add("Biome: " + a(this.f.r.s($$7)));
               if ($$24 != null) {
                  float $$28 = $$16.an();
                  long $$29 = $$24.u();
                  bgw $$30 = new bgw($$16.ai(), $$16.W(), $$29, $$28);
                  $$18.add(String.format(Locale.ROOT, "Local Difficulty: %.2f // %.2f (Day %d)", $$30.b(), $$30.d(), this.f.r.W() / 24000L));
               } else {
                  $$18.add("Local Difficulty: ??");
               }
            }

            if ($$24 != null && $$24.s()) {
               $$18.add("Blending: Old");
            }
         }

         akq $$31 = this.n();
         if ($$31 != null) {
            ako $$32 = $$31.k();
            dhg $$33 = $$32.g();
            dlg $$34 = $$32.i();
            $$33.a($$18, $$34, $$7);
            crc.f $$35 = $$34.b();
            cqx $$36 = $$33.c();
            $$36.a($$18, $$7, $$35);
            cqg.d $$37 = $$32.n();
            if ($$37 != null) {
               Object2IntMap<bjj> $$38 = $$37.b();
               int $$39 = $$37.a();
               $$18.add(
                  "SC: "
                     + $$39
                     + ", "
                     + Stream.of(bjj.values())
                        .map($$1x -> Character.toUpperCase($$1x.a().charAt(0)) + ": " + $$38.getInt($$1x))
                        .collect(Collectors.joining(", "))
               );
            } else {
               $$18.add("SC: N/A");
            }
         }

         foh $$40 = this.f.j.g();
         if ($$40 != null) {
            $$18.add("Shader: " + $$40.a());
         }

         $$18.add(this.f.ai().h() + String.format(Locale.ROOT, " (Mood %d%%)", Math.round(this.f.s.d() * 100.0F)));
         return $$18;
      }
   }

   private static String a(he<cqt> $$0) {
      return (String)$$0.d().map($$0x -> $$0x.a().toString(), $$0x -> "[unregistered " + $$0x + "]");
   }

   @Nullable
   private akq n() {
      gdd $$0 = this.f.T();
      return $$0 != null ? $$0.a(this.f.r.ac()) : null;
   }

   @Nullable
   private String o() {
      akq $$0 = this.n();
      return $$0 != null ? $$0.F() : null;
   }

   private cpv p() {
      return (cpv)DataFixUtils.orElse(Optional.ofNullable(this.f.T()).flatMap($$0 -> Optional.ofNullable($$0.a(this.f.r.ac()))), this.f.r);
   }

   @Nullable
   private dhq q() {
      if (this.m == null) {
         akq $$0 = this.n();
         if ($$0 == null) {
            return null;
         }

         this.m = $$0.k().b(this.k.e, this.k.f, dhk.n, false).thenApply($$0x -> (dhq)$$0x.map($$0xx -> (dhq)$$0xx, $$0xx -> null));
      }

      return this.m.getNow(null);
   }

   private dhq r() {
      if (this.l == null) {
         this.l = this.f.r.d(this.k.e, this.k.f);
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
            String.format(Locale.ROOT, "Java: %s %dbit", System.getProperty("java.version"), this.f.af() ? 64 : 32),
            String.format(Locale.ROOT, "Mem: % 2d%% %03d/%03dMB", $$3 * 100L / $$0, c($$3), c($$0)),
            String.format(Locale.ROOT, "Allocation rate: %03dMB /s", c(this.g.a($$3))),
            String.format(Locale.ROOT, "Allocated: % 2d%% %03dMB", $$1 * 100L / $$0, c($$1)),
            "",
            String.format(Locale.ROOT, "CPU: %s", eki.b()),
            "",
            String.format(Locale.ROOT, "Display: %dx%d (%s)", eqv.O().aM().k(), eqv.O().aM().l(), eki.a()),
            eki.c(),
            eki.d()
         }
      );
      if (this.f.ax()) {
         return $$4;
      } else {
         if (this.i.c() == ehl.a.b) {
            gw $$5 = ((ehj)this.i).a();
            dfj $$6 = this.f.r.a_($$5);
            $$4.add("");
            $$4.add(n.t + "Targeted Block: " + $$5.u() + ", " + $$5.v() + ", " + $$5.w());
            $$4.add(String.valueOf(jb.f.b($$6.b())));
            UnmodifiableIterator var12 = $$6.C().entrySet().iterator();

            while (var12.hasNext()) {
               Entry<dgm<?>, Comparable<?>> $$7 = (Entry<dgm<?>, Comparable<?>>)var12.next();
               $$4.add(this.a($$7));
            }

            $$6.s().map($$0x -> "#" + $$0x.b()).forEach($$4::add);
         }

         if (this.j.c() == ehl.a.b) {
            gw $$8 = ((ehj)this.j).a();
            eam $$9 = this.f.r.b_($$8);
            $$4.add("");
            $$4.add(n.t + "Targeted Fluid: " + $$8.u() + ", " + $$8.v() + ", " + $$8.w());
            $$4.add(String.valueOf(jb.d.b($$9.a())));
            UnmodifiableIterator var17 = $$9.C().entrySet().iterator();

            while (var17.hasNext()) {
               Entry<dgm<?>, Comparable<?>> $$10 = (Entry<dgm<?>, Comparable<?>>)var17.next();
               $$4.add(this.a($$10));
            }

            $$9.k().map($$0x -> "#" + $$0x.b()).forEach($$4::add);
         }

         biq $$11 = this.f.u;
         if ($$11 != null) {
            $$4.add("");
            $$4.add(n.t + "Targeted Entity");
            $$4.add(String.valueOf(jb.h.b($$11.ag())));
         }

         return $$4;
      }
   }

   private String a(Entry<dgm<?>, Comparable<?>> $$0) {
      dgm<?> $$1 = $$0.getKey();
      Comparable<?> $$2 = $$0.getValue();
      String $$3 = ac.a($$1, $$2);
      if (Boolean.TRUE.equals($$2)) {
         $$3 = n.k + $$3;
      } else if (Boolean.FALSE.equals($$2)) {
         $$3 = n.m + $$3;
      }

      return $$1.f() + ": " + $$3;
   }

   private static long c(long $$0) {
      return $$0 / 1024L / 1024L;
   }

   public boolean d() {
      return this.n && !this.f.m.Z;
   }

   public boolean e() {
      return this.d() && this.o;
   }

   public boolean f() {
      return this.d() && this.q;
   }

   public void g() {
      this.n = !this.n;
   }

   public void h() {
      this.q = !this.n || !this.q;
      if (this.q) {
         this.n = true;
         this.p = false;
      }
   }

   public void i() {
      this.p = !this.n || !this.p;
      if (this.p) {
         this.n = true;
         this.q = false;
      }
   }

   public void j() {
      this.o = !this.n || !this.o;
      if (this.o) {
         this.n = true;
      }
   }

   public void a(long $$0) {
      this.r.a($$0);
   }

   public void b(long $$0) {
      this.s.a($$0);
   }

   public ase k() {
      return this.t;
   }

   public ase l() {
      return this.u;
   }

   public void m() {
      this.n = false;
      this.s.c();
      this.t.c();
      this.u.c();
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
