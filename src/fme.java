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

public class fme {
   private static final int a = 14737632;
   private static final int b = 2;
   private static final int c = 2;
   private static final int d = 2;
   private static final Map<ebj.a, String> e = ae.a(new EnumMap<>(ebj.a.class), $$0 -> {
      $$0.put(ebj.a.a, "SW");
      $$0.put(ebj.a.b, "S");
      $$0.put(ebj.a.c, "OW");
      $$0.put(ebj.a.d, "O");
      $$0.put(ebj.a.e, "M");
      $$0.put(ebj.a.f, "ML");
   });
   private final fjx f;
   private final fme.a g;
   private final flh h;
   private ezp i;
   private ezp j;
   @Nullable
   private del k;
   @Nullable
   private dxt l;
   @Nullable
   private CompletableFuture<dxt> m;
   private boolean n;
   private boolean o;
   private boolean p;
   private boolean q;
   private final bnb r = new bnb(1);
   private final bnb s = new bnb(bng.values().length);
   private final bnb t = new bnb(1);
   private final bnb u = new bnb(1);
   private final Map<bnc, bnb> v = Map.of(bnc.a, this.s);
   private final fnn w;
   private final fnq x;
   private final fno y;
   private final fnm z;
   private final fnp A;

   public fme(fjx $$0) {
      this.f = $$0;
      this.g = new fme.a();
      this.h = $$0.h;
      this.w = new fnn(this.h, this.r);
      this.x = new fnq(this.h, this.s, () -> $$0.s.s().g());
      this.y = new fno(this.h, this.t);
      this.z = new fnm(this.h, this.u);
      this.A = new fnp(this.h);
   }

   public void a() {
      this.m = null;
      this.l = null;
   }

   public void a(flj $$0) {
      bor $$1 = boq.a();
      $$1.a("debug");
      bui $$2 = this.f.ao();
      this.i = $$2.a(20.0, 0.0F, false);
      this.j = $$2.a(20.0, 0.0F, true);
      this.b($$0);
      this.c($$0);
      this.A.a(10);
      if (this.p) {
         int $$3 = $$0.a();
         int $$4 = $$3 / 2;
         this.w.a($$0, 0, this.w.a($$4));
         if (this.s.d() > 0) {
            int $$5 = this.x.a($$4);
            this.x.a($$0, $$3 - $$5, $$5);
         }

         this.A.a(this.x.a());
      }

      if (this.q) {
         int $$6 = $$0.a();
         int $$7 = $$6 / 2;
         if (!this.f.T()) {
            this.z.a($$0, 0, this.z.a($$7));
         }

         int $$8 = this.y.a($$7);
         this.y.a($$0, $$6 - $$8, $$8);
         this.A.a(this.y.a());
      }

      try (bow $$9 = $$1.d("profilerPie")) {
         this.A.a($$0);
      }

      $$1.c();
   }

   protected void b(flj $$0) {
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

   protected void c(flj $$0) {
      List<String> $$1 = this.c();
      this.a($$0, $$1, false);
   }

   private void a(flj $$0, List<String> $$1, boolean $$2) {
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
      hde $$0 = this.f.V();
      gcz $$1 = this.f.L();
      wf $$2 = $$1.k();
      float $$3 = $$2.p();
      float $$4 = $$2.o();
      bsq $$5 = this.s().s();
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
         amf $$9 = $$0.aP();
         boolean $$10 = $$9.a();
         if ($$10) {
            $$6 = " (sprinting)";
         }

         String $$11 = $$10 ? "-" : String.format(Locale.ROOT, "%.1f", $$5.g());
         $$12 = String.format(Locale.ROOT, "Integrated server @ %.1f/%s ms%s, %.0f tx, %.0f rx", $$0.aO(), $$11, $$6, $$3, $$4);
      } else {
         $$12 = String.format(Locale.ROOT, "\"%s\" server%s, %.0f tx, %.0f rx", $$1.f(), $$6, $$3, $$4);
      }

      jh $$14 = this.f.ao().dy();
      if (this.f.az()) {
         return Lists.newArrayList(
            new String[]{
               "Minecraft " + ab.b().c() + " (" + this.f.i() + "/" + ClientBrandRetriever.getClientModName() + ")",
               this.f.A,
               $$12,
               this.f.f.f(),
               this.f.f.k(),
               "P: " + this.f.g.d() + ". T: " + this.f.s.g(),
               this.f.s.I(),
               "",
               String.format(Locale.ROOT, "Chunk-relative: %d %d %d", $$14.u() & 15, $$14.v() & 15, $$14.w() & 15)
            }
         );
      } else {
         bui $$15 = this.f.ao();
         jm $$16 = $$15.cQ();

         String $$21 = switch ($$16) {
            case c -> "Towards negative Z";
            case d -> "Towards positive Z";
            case e -> "Towards negative X";
            case f -> "Towards positive X";
            default -> "Invalid";
         };
         del $$22 = new del($$14);
         if (!Objects.equals(this.k, $$22)) {
            this.k = $$22;
            this.a();
         }

         dff $$23 = this.s();
         LongSet $$24 = (LongSet)($$23 instanceof arq ? ((arq)$$23).w() : LongSets.EMPTY_SET);
         List<String> $$25 = Lists.newArrayList(
            new String[]{
               "Minecraft "
                  + ab.b().c()
                  + " ("
                  + this.f.i()
                  + "/"
                  + ClientBrandRetriever.getClientModName()
                  + ("release".equalsIgnoreCase(this.f.j()) ? "" : "/" + this.f.j())
                  + ")",
               this.f.A,
               $$12,
               this.f.f.f(),
               this.f.f.k(),
               "P: " + this.f.g.d() + ". T: " + this.f.s.g(),
               this.f.s.I()
            }
         );
         String $$26 = this.r();
         if ($$26 != null) {
            $$25.add($$26);
         }

         $$25.add(this.f.s.ag().a() + " FC: " + $$24.size());
         $$25.add("");
         $$25.add(String.format(Locale.ROOT, "XYZ: %.3f / %.5f / %.3f", this.f.ao().dD(), this.f.ao().dF(), this.f.ao().dJ()));
         $$25.add(String.format(Locale.ROOT, "Block: %d %d %d [%d %d %d]", $$14.u(), $$14.v(), $$14.w(), $$14.u() & 15, $$14.v() & 15, $$14.w() & 15));
         $$25.add(String.format(Locale.ROOT, "Chunk: %d %d %d [%d %d in r.%d.%d.mca]", $$22.g, kj.a($$14.v()), $$22.h, $$22.j(), $$22.k(), $$22.h(), $$22.i()));
         $$25.add(String.format(Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", $$16, $$21, azn.h($$15.dO()), azn.h($$15.dQ())));
         dxt $$27 = this.u();
         if ($$27.B()) {
            $$25.add("Waiting for chunk...");
         } else {
            int $$28 = this.f.s.h().p().a($$14, 0);
            int $$29 = this.f.s.a(dfo.a, $$14);
            int $$30 = this.f.s.a(dfo.b, $$14);
            $$25.add("Client Light: " + $$28 + " (" + $$29 + " sky, " + $$30 + " block)");
            dxt $$31 = this.t();
            StringBuilder $$32 = new StringBuilder("CH");

            for (ebj.a $$33 : ebj.a.values()) {
               if ($$33.b()) {
                  $$32.append(" ").append(e.get($$33)).append(": ").append($$27.a($$33, $$14.u(), $$14.w()));
               }
            }

            $$25.add($$32.toString());
            $$32.setLength(0);
            $$32.append("SH");

            for (ebj.a $$34 : ebj.a.values()) {
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
            if (this.f.s.d($$14.v())) {
               $$25.add("Biome: " + a(this.f.s.t($$14)));
               if ($$31 != null) {
                  float $$35 = $$23.ap();
                  long $$36 = $$31.t();
                  bsf $$37 = new bsf($$23.ak(), $$23.ab(), $$36, $$35);
                  $$25.add(String.format(Locale.ROOT, "Local Difficulty: %.2f // %.2f (Day %d)", $$37.b(), $$37.d(), this.f.s.ab() / 24000L));
               } else {
                  $$25.add("Local Difficulty: ??");
               }
            }

            if ($$31 != null && $$31.r()) {
               $$25.add("Blending: Old");
            }
         }

         arq $$38 = this.q();
         if ($$38 != null) {
            aro $$39 = $$38.l();
            dxk $$40 = $$39.g();
            ebx $$41 = $$39.i();
            $$40.a($$25, $$41, $$14);
            dgq.f $$42 = $$41.b();
            dgl $$43 = $$40.d();
            $$43.a($$25, $$14, $$42);
            dfq.d $$44 = $$39.n();
            if ($$44 != null) {
               Object2IntMap<bvh> $$45 = $$44.b();
               int $$46 = $$44.a();
               $$25.add(
                  "SC: "
                     + $$46
                     + ", "
                     + Stream.of(bvh.values())
                        .map($$1x -> Character.toUpperCase($$1x.a().charAt(0)) + ": " + $$45.getInt($$1x))
                        .collect(Collectors.joining(", "))
               );
            } else {
               $$25.add("SC: N/A");
            }
         }

         all $$47 = this.f.j.f();
         if ($$47 != null) {
            $$25.add("Post: " + $$47);
         }

         $$25.add(this.f.ak().j() + String.format(Locale.ROOT, " (Mood %d%%)", Math.round(this.f.t.c() * 100.0F)));
         return $$25;
      }
   }

   private static String a(jq<dgh> $$0) {
      return (String)$$0.d().map($$0x -> $$0x.a().toString(), $$0x -> "[unregistered " + $$0x + "]");
   }

   @Nullable
   private arq q() {
      hde $$0 = this.f.V();
      return $$0 != null ? $$0.a(this.f.s.ag()) : null;
   }

   @Nullable
   private String r() {
      arq $$0 = this.q();
      return $$0 != null ? $$0.I() : null;
   }

   private dff s() {
      return (dff)DataFixUtils.orElse(Optional.ofNullable(this.f.V()).flatMap($$0 -> Optional.ofNullable($$0.a(this.f.s.ag()))), this.f.s);
   }

   @Nullable
   private dxt t() {
      if (this.m == null) {
         arq $$0 = this.q();
         if ($$0 == null) {
            return null;
         }

         this.m = $$0.l().b(this.k.g, this.k.h, dyk.n, false).thenApply($$0x -> (dxt)$$0x.b(null));
      }

      return this.m.getNow(null);
   }

   private dxt u() {
      if (this.l == null) {
         this.l = this.f.s.d(this.k.g, this.k.h);
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
            String.format(Locale.ROOT, "Java: %s", System.getProperty("java.version")),
            String.format(Locale.ROOT, "Mem: %2d%% %03d/%03dMB", $$3 * 100L / $$0, b($$3), b($$0)),
            String.format(Locale.ROOT, "Allocation rate: %03dMB/s", b(this.g.a($$3))),
            String.format(Locale.ROOT, "Allocated: %2d%% %03dMB", $$1 * 100L / $$0, b($$1)),
            "",
            String.format(Locale.ROOT, "CPU: %s", fdd.b()),
            "",
            String.format(Locale.ROOT, "Display: %dx%d (%s)", fjx.Q().aO().k(), fjx.Q().aO().l(), fdd.a()),
            fdd.c(),
            fdd.d()
         }
      );
      if (this.f.az()) {
         return $$4;
      } else {
         if (this.i.d() == ezp.a.b) {
            jh $$5 = ((ezn)this.i).b();
            dvo $$6 = this.f.s.a_($$5);
            $$4.add("");
            $$4.add(n.t + "Targeted Block: " + $$5.u() + ", " + $$5.v() + ", " + $$5.w());
            $$4.add(String.valueOf(lz.e.b($$6.b())));

            for (Entry<dwq<?>, Comparable<?>> $$7 : $$6.G().entrySet()) {
               $$4.add(this.a($$7));
            }

            $$6.w().map($$0x -> "#" + $$0x.b()).forEach($$4::add);
         }

         if (this.j.d() == ezp.a.b) {
            jh $$8 = ((ezn)this.j).b();
            ero $$9 = this.f.s.b_($$8);
            $$4.add("");
            $$4.add(n.t + "Targeted Fluid: " + $$8.u() + ", " + $$8.v() + ", " + $$8.w());
            $$4.add(String.valueOf(lz.c.b($$9.a())));

            for (Entry<dwq<?>, Comparable<?>> $$10 : $$9.G().entrySet()) {
               $$4.add(this.a($$10));
            }

            $$9.k().map($$0x -> "#" + $$0x.b()).forEach($$4::add);
         }

         bui $$11 = this.f.v;
         if ($$11 != null) {
            $$4.add("");
            $$4.add(n.t + "Targeted Entity");
            $$4.add(String.valueOf(lz.f.b($$11.ar())));
         }

         return $$4;
      }
   }

   private String a(Entry<dwq<?>, Comparable<?>> $$0) {
      dwq<?> $$1 = $$0.getKey();
      Comparable<?> $$2 = $$0.getValue();
      String $$3 = ae.a($$1, $$2);
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
      return this.n && !this.f.n.X;
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

   public bnb l() {
      return this.s;
   }

   public bnb m() {
      return this.t;
   }

   public bnb n() {
      return this.u;
   }

   public fnp o() {
      return this.A;
   }

   public void a(long[] $$0, bnc $$1) {
      bnb $$2 = this.v.get($$1);
      if ($$2 != null) {
         $$2.a($$0);
      }
   }

   public void p() {
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
