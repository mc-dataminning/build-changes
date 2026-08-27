import com.google.common.base.Strings;
import com.google.common.collect.Lists;
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

public class ffm {
   private static final int a = 14737632;
   private static final int b = 2;
   private static final int c = 2;
   private static final int d = 2;
   private static final Map<dvz.a, String> e = ac.a(new EnumMap<>(dvz.a.class), $$0 -> {
      $$0.put(dvz.a.a, "SW");
      $$0.put(dvz.a.b, "S");
      $$0.put(dvz.a.c, "OW");
      $$0.put(dvz.a.d, "O");
      $$0.put(dvz.a.e, "M");
      $$0.put(dvz.a.f, "ML");
   });
   private final fde f;
   private final ffm.a g;
   private final fep h;
   private etn i;
   private etn j;
   @Nullable
   private czk k;
   @Nullable
   private dsn l;
   @Nullable
   private CompletableFuture<dsn> m;
   private boolean n;
   private boolean o;
   private boolean p;
   private boolean q;
   private final bkm r = new bkm(1);
   private final bkm s = new bkm(bkr.values().length);
   private final bkm t = new bkm(1);
   private final bkm u = new bkm(1);
   private final Map<bkn, bkm> v = Map.of(bkn.a, this.s);
   private final fgv w;
   private final fgx x;
   private final fgw y;
   private final fgu z;

   public ffm(fde $$0) {
      this.f = $$0;
      this.g = new ffm.a();
      this.h = $$0.h;
      this.w = new fgv(this.h, this.r);
      this.x = new fgx(this.h, this.s, () -> $$0.r.s().g());
      this.y = new fgw(this.h, this.t);
      this.z = new fgu(this.h, this.u);
   }

   public void a() {
      this.m = null;
      this.l = null;
   }

   public void a(fer $$0) {
      this.f.aJ().a("debug");
      brh $$1 = this.f.ao();
      this.i = $$1.a(20.0, 0.0F, false);
      this.j = $$1.a(20.0, 0.0F, true);
      $$0.a(() -> {
         this.b($$0);
         this.c($$0);
         if (this.p) {
            int $$1x = $$0.a();
            int $$2 = $$1x / 2;
            this.w.a($$0, 0, this.w.a($$2));
            if (this.s.d() > 0) {
               int $$3 = this.x.a($$2);
               this.x.a($$0, $$1x - $$3, $$3);
            }
         }

         if (this.q) {
            int $$4 = $$0.a();
            int $$5 = $$4 / 2;
            if (!this.f.T()) {
               this.z.a($$0, 0, this.z.a($$5));
            }

            int $$6 = this.y.a($$5);
            this.y.a($$0, $$4 - $$6, $$6);
         }
      });
      this.f.aJ().c();
   }

   protected void b(fer $$0) {
      List<String> $$1 = this.b();
      $$1.add("");
      boolean $$2 = this.f.V() != null;
      $$1.add(
         "Debug charts: [F3+1] Profiler "
            + (this.o ? "visible" : "hidden")
            + "; [F3+2] "
            + ($$2 ? "FPS + TPS " : "FPS ")
            + (this.p ? "visible" : "hidden")
            + "; [F3+3] "
            + (!this.f.T() ? "Bandwidth + Ping" : "Ping")
            + (this.q ? " visible" : " hidden")
      );
      $$1.add("For help: press F3 + Q");
      this.a($$0, $$1, true);
   }

   protected void c(fer $$0) {
      List<String> $$1 = this.c();
      this.a($$0, $$1, false);
   }

   private void a(fer $$0, List<String> $$1, boolean $$2) {
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
      grd $$0 = this.f.V();
      fvx $$1 = this.f.L();
      vs $$2 = $$1.l();
      float $$3 = $$2.p();
      float $$4 = $$2.o();
      bpx $$5 = this.r().s();
      String $$6;
      if ($$5.j()) {
         $$6 = " (frozen - stepping)";
      } else if ($$5.l()) {
         $$6 = " (frozen)";
      } else {
         $$6 = "";
      }

      String $$12;
      if ($$0 != null) {
         ala $$9 = $$0.aQ();
         boolean $$10 = $$9.a();
         if ($$10) {
            $$6 = " (sprinting)";
         }

         String $$11 = $$10 ? "-" : String.format(Locale.ROOT, "%.1f", $$5.g());
         $$12 = String.format(Locale.ROOT, "Integrated server @ %.1f/%s ms%s, %.0f tx, %.0f rx", $$0.aP(), $$11, $$6, $$3, $$4);
      } else {
         $$12 = String.format(Locale.ROOT, "\"%s\" server%s, %.0f tx, %.0f rx", $$1.g(), $$6, $$3, $$4);
      }

      in $$14 = this.f.ao().dn();
      if (this.f.ax()) {
         return Lists.newArrayList(
            new String[]{
               "Minecraft " + aa.b().c() + " (" + this.f.i() + "/" + ClientBrandRetriever.getClientModName() + ")",
               this.f.z,
               $$12,
               this.f.f.g(),
               this.f.f.l(),
               "P: " + this.f.g.d() + ". T: " + this.f.r.h(),
               this.f.r.I(),
               "",
               String.format(Locale.ROOT, "Chunk-relative: %d %d %d", $$14.u() & 15, $$14.v() & 15, $$14.w() & 15)
            }
         );
      } else {
         brh $$15 = this.f.ao();
         is $$16 = $$15.cF();

         String $$21 = switch ($$16) {
            case c -> "Towards negative Z";
            case d -> "Towards positive Z";
            case e -> "Towards negative X";
            case f -> "Towards positive X";
            default -> "Invalid";
         };
         czk $$22 = new czk($$14);
         if (!Objects.equals(this.k, $$22)) {
            this.k = $$22;
            this.a();
         }

         dad $$23 = this.r();
         LongSet $$24 = (LongSet)($$23 instanceof aqh ? ((aqh)$$23).w() : LongSets.EMPTY_SET);
         List<String> $$25 = Lists.newArrayList(
            new String[]{
               "Minecraft "
                  + aa.b().c()
                  + " ("
                  + this.f.i()
                  + "/"
                  + ClientBrandRetriever.getClientModName()
                  + ("release".equalsIgnoreCase(this.f.j()) ? "" : "/" + this.f.j())
                  + ")",
               this.f.z,
               $$12,
               this.f.f.g(),
               this.f.f.l(),
               "P: " + this.f.g.d() + ". T: " + this.f.r.h(),
               this.f.r.I()
            }
         );
         String $$26 = this.q();
         if ($$26 != null) {
            $$25.add($$26);
         }

         $$25.add(this.f.r.ae().a() + " FC: " + $$24.size());
         $$25.add("");
         $$25.add(String.format(Locale.ROOT, "XYZ: %.3f / %.5f / %.3f", this.f.ao().ds(), this.f.ao().du(), this.f.ao().dy()));
         $$25.add(String.format(Locale.ROOT, "Block: %d %d %d [%d %d %d]", $$14.u(), $$14.v(), $$14.w(), $$14.u() & 15, $$14.v() & 15, $$14.w() & 15));
         $$25.add(String.format(Locale.ROOT, "Chunk: %d %d %d [%d %d in r.%d.%d.mca]", $$22.e, jp.a($$14.v()), $$22.f, $$22.j(), $$22.k(), $$22.h(), $$22.i()));
         $$25.add(String.format(Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", $$16, $$21, axz.g($$15.dD()), axz.g($$15.dF())));
         dsn $$27 = this.t();
         if ($$27.C()) {
            $$25.add("Waiting for chunk...");
         } else {
            int $$28 = this.f.r.i().p().a($$14, 0);
            int $$29 = this.f.r.a(dam.a, $$14);
            int $$30 = this.f.r.a(dam.b, $$14);
            $$25.add("Client Light: " + $$28 + " (" + $$29 + " sky, " + $$30 + " block)");
            dsn $$31 = this.s();
            StringBuilder $$32 = new StringBuilder("CH");

            for (dvz.a $$33 : dvz.a.values()) {
               if ($$33.b()) {
                  $$32.append(" ").append(e.get($$33)).append(": ").append($$27.a($$33, $$14.u(), $$14.w()));
               }
            }

            $$25.add($$32.toString());
            $$32.setLength(0);
            $$32.append("SH");

            for (dvz.a $$34 : dvz.a.values()) {
               if ($$34.d()) {
                  $$32.append(" ").append(e.get($$34)).append(": ");
                  if ($$31 != null) {
                     $$32.append($$31.a($$34, $$14.u(), $$14.w()));
                  } else {
                     $$32.append("??");
                  }
               }
            }

            $$25.add($$32.toString());
            if ($$14.v() >= this.f.r.I_() && $$14.v() < this.f.r.al()) {
               $$25.add("Biome: " + a(this.f.r.t($$14)));
               if ($$31 != null) {
                  float $$35 = $$23.ap();
                  long $$36 = $$31.u();
                  bpk $$37 = new bpk($$23.ak(), $$23.Z(), $$36, $$35);
                  $$25.add(String.format(Locale.ROOT, "Local Difficulty: %.2f // %.2f (Day %d)", $$37.b(), $$37.d(), this.f.r.Z() / 24000L));
               } else {
                  $$25.add("Local Difficulty: ??");
               }
            }

            if ($$31 != null && $$31.s()) {
               $$25.add("Blending: Old");
            }
         }

         aqh $$38 = this.p();
         if ($$38 != null) {
            aqf $$39 = $$38.l();
            dse $$40 = $$39.g();
            dwn $$41 = $$39.i();
            $$40.a($$25, $$41, $$14);
            dbl.f $$42 = $$41.b();
            dbg $$43 = $$40.c();
            $$43.a($$25, $$14, $$42);
            dao.d $$44 = $$39.n();
            if ($$44 != null) {
               Object2IntMap<bsd> $$45 = $$44.b();
               int $$46 = $$44.a();
               $$25.add(
                  "SC: "
                     + $$46
                     + ", "
                     + Stream.of(bsd.values())
                        .map($$1x -> Character.toUpperCase($$1x.a().charAt(0)) + ": " + $$45.getInt($$1x))
                        .collect(Collectors.joining(", "))
               );
            } else {
               $$25.add("SC: N/A");
            }
         }

         gbr $$47 = this.f.j.g();
         if ($$47 != null) {
            $$25.add("Shader: " + $$47.a());
         }

         $$25.add(this.f.ak().j() + String.format(Locale.ROOT, " (Mood %d%%)", Math.round(this.f.s.d() * 100.0F)));
         return $$25;
      }
   }

   private static String a(iw<dbc> $$0) {
      return (String)$$0.d().map($$0x -> $$0x.a().toString(), $$0x -> "[unregistered " + $$0x + "]");
   }

   @Nullable
   private aqh p() {
      grd $$0 = this.f.V();
      return $$0 != null ? $$0.a(this.f.r.ae()) : null;
   }

   @Nullable
   private String q() {
      aqh $$0 = this.p();
      return $$0 != null ? $$0.I() : null;
   }

   private dad r() {
      return (dad)DataFixUtils.orElse(Optional.ofNullable(this.f.V()).flatMap($$0 -> Optional.ofNullable($$0.a(this.f.r.ae()))), this.f.r);
   }

   @Nullable
   private dsn s() {
      if (this.m == null) {
         aqh $$0 = this.p();
         if ($$0 == null) {
            return null;
         }

         this.m = $$0.l().b(this.k.e, this.k.f, dtc.n, false).thenApply($$0x -> (dsn)$$0x.b(null));
      }

      return this.m.getNow(null);
   }

   private dsn t() {
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
            String.format(Locale.ROOT, "Java: %s %dbit", System.getProperty("java.version"), this.f.ah() ? 64 : 32),
            String.format(Locale.ROOT, "Mem: %2d%% %03d/%03dMB", $$3 * 100L / $$0, b($$3), b($$0)),
            String.format(Locale.ROOT, "Allocation rate: %03dMB/s", b(this.g.a($$3))),
            String.format(Locale.ROOT, "Allocated: %2d%% %03dMB", $$1 * 100L / $$0, b($$1)),
            "",
            String.format(Locale.ROOT, "CPU: %s", ewq.b()),
            "",
            String.format(Locale.ROOT, "Display: %dx%d (%s)", fde.Q().aP().k(), fde.Q().aP().l(), ewq.a()),
            ewq.c(),
            ewq.d()
         }
      );
      if (this.f.ax()) {
         return $$4;
      } else {
         if (this.i.c() == etn.a.b) {
            in $$5 = ((etl)this.i).a();
            dqh $$6 = this.f.r.a_($$5);
            $$4.add("");
            $$4.add(n.t + "Targeted Block: " + $$5.u() + ", " + $$5.v() + ", " + $$5.w());
            $$4.add(String.valueOf(ld.e.b($$6.b())));

            for (Entry<drk<?>, Comparable<?>> $$7 : $$6.C().entrySet()) {
               $$4.add(this.a($$7));
            }

            $$6.s().map($$0x -> "#" + $$0x.b()).forEach($$4::add);
         }

         if (this.j.c() == etn.a.b) {
            in $$8 = ((etl)this.j).a();
            ema $$9 = this.f.r.b_($$8);
            $$4.add("");
            $$4.add(n.t + "Targeted Fluid: " + $$8.u() + ", " + $$8.v() + ", " + $$8.w());
            $$4.add(String.valueOf(ld.c.b($$9.a())));

            for (Entry<drk<?>, Comparable<?>> $$10 : $$9.C().entrySet()) {
               $$4.add(this.a($$10));
            }

            $$9.k().map($$0x -> "#" + $$0x.b()).forEach($$4::add);
         }

         brh $$11 = this.f.u;
         if ($$11 != null) {
            $$4.add("");
            $$4.add(n.t + "Targeted Entity");
            $$4.add(String.valueOf(ld.g.b($$11.ai())));
         }

         return $$4;
      }
   }

   private String a(Entry<drk<?>, Comparable<?>> $$0) {
      drk<?> $$1 = $$0.getKey();
      Comparable<?> $$2 = $$0.getValue();
      String $$3 = ac.a($$1, $$2);
      if (Boolean.TRUE.equals($$2)) {
         $$3 = n.k + $$3;
      } else if (Boolean.FALSE.equals($$2)) {
         $$3 = n.m + $$3;
      }

      return $$1.f() + ": " + $$3;
   }

   private static long b(long $$0) {
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

   public boolean g() {
      return this.d() && this.p;
   }

   public void h() {
      this.n = !this.n;
   }

   public void i() {
      this.q = !this.n || !this.q;
      if (this.q) {
         this.n = true;
         this.p = false;
      }
   }

   public void j() {
      this.p = !this.n || !this.p;
      if (this.p) {
         this.n = true;
         this.q = false;
      }
   }

   public void k() {
      this.o = !this.n || !this.o;
      if (this.o) {
         this.n = true;
      }
   }

   public void a(long $$0) {
      this.r.a($$0);
   }

   public bkm l() {
      return this.s;
   }

   public bkm m() {
      return this.t;
   }

   public bkm n() {
      return this.u;
   }

   public void a(long[] $$0, bkn $$1) {
      bkm $$2 = this.v.get($$1);
      if ($$2 != null) {
         $$2.a($$0);
      }
   }

   public void o() {
      this.n = false;
      this.s.e();
      this.t.e();
      this.u.e();
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
