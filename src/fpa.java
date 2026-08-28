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

public class fpa {
   private static final int a = 14737632;
   private static final int b = 2;
   private static final int c = 2;
   private static final int d = 2;
   private static final Map<ecr.a, String> e = af.a(new EnumMap<>(ecr.a.class), $$0 -> {
      $$0.put(ecr.a.a, "SW");
      $$0.put(ecr.a.b, "S");
      $$0.put(ecr.a.c, "OW");
      $$0.put(ecr.a.d, "O");
      $$0.put(ecr.a.e, "M");
      $$0.put(ecr.a.f, "ML");
   });
   private final fli f;
   private final fpa.a g;
   private final fob h;
   private fax i;
   private fax j;
   @Nullable
   private dfn k;
   @Nullable
   private dzb l;
   @Nullable
   private CompletableFuture<dzb> m;
   private boolean n;
   private boolean o;
   private boolean p;
   private boolean q;
   private final bnc r = new bnc(1);
   private final bnc s = new bnc(bnh.values().length);
   private final bnc t = new bnc(1);
   private final bnc u = new bnc(1);
   private final Map<bnd, bnc> v = Map.of(bnd.a, this.s);
   private final fqj w;
   private final fqm x;
   private final fqk y;
   private final fqi z;
   private final fql A;

   public fpa(fli $$0) {
      this.f = $$0;
      this.g = new fpa.a();
      this.h = $$0.h;
      this.w = new fqj(this.h, this.r);
      this.x = new fqm(this.h, this.s, () -> $$0.s.u().g());
      this.y = new fqk(this.h, this.t);
      this.z = new fqi(this.h, this.u);
      this.A = new fql(this.h);
   }

   public void a() {
      this.m = null;
      this.l = null;
   }

   public void a(fod $$0) {
      bos $$1 = bor.a();
      $$1.a("debug");
      buk $$2 = this.f.ao();
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

      try (box $$9 = $$1.d("profilerPie")) {
         this.A.a($$0);
      }

      $$1.c();
   }

   protected void b(fod $$0) {
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

   protected void c(fod $$0) {
      List<String> $$1 = this.c();
      this.a($$0, $$1, false);
   }

   private void a(fod $$0, List<String> $$1, boolean $$2) {
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
      hjc $$0 = this.f.V();
      gfz $$1 = this.f.L();
      vi $$2 = $$1.k();
      float $$3 = $$2.p();
      float $$4 = $$2.o();
      bss $$5 = this.s().u();
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
         alp $$9 = $$0.aP();
         boolean $$10 = $$9.a();
         if ($$10) {
            $$6 = " (sprinting)";
         }

         String $$11 = $$10 ? "-" : String.format(Locale.ROOT, "%.1f", $$5.g());
         $$12 = String.format(Locale.ROOT, "Integrated server @ %.1f/%s ms%s, %.0f tx, %.0f rx", $$0.aO(), $$11, $$6, $$3, $$4);
      } else {
         $$12 = String.format(Locale.ROOT, "\"%s\" server%s, %.0f tx, %.0f rx", $$1.f(), $$6, $$3, $$4);
      }

      ji $$14 = this.f.ao().dv();
      if (this.f.az()) {
         return Lists.newArrayList(
            new String[]{
               "Minecraft " + ab.b().c() + " (" + this.f.i() + "/" + ClientBrandRetriever.getClientModName() + ")",
               this.f.A,
               $$12,
               this.f.f.f(),
               this.f.f.k(),
               "P: " + this.f.g.d() + ". T: " + this.f.s.g(),
               this.f.s.J(),
               "",
               String.format(Locale.ROOT, "Chunk-relative: %d %d %d", $$14.u() & 15, $$14.v() & 15, $$14.w() & 15)
            }
         );
      } else {
         buk $$15 = this.f.ao();
         jn $$16 = $$15.cO();

         String $$21 = switch ($$16) {
            case c -> "Towards negative Z";
            case d -> "Towards positive Z";
            case e -> "Towards negative X";
            case f -> "Towards positive X";
            default -> "Invalid";
         };
         dfn $$22 = new dfn($$14);
         if (!Objects.equals(this.k, $$22)) {
            this.k = $$22;
            this.a();
         }

         dgh $$23 = this.s();
         LongSet $$24 = (LongSet)($$23 instanceof ard ? ((ard)$$23).y() : LongSets.EMPTY_SET);
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
               this.f.s.J()
            }
         );
         String $$26 = this.r();
         if ($$26 != null) {
            $$25.add($$26);
         }

         $$25.add(this.f.s.ai().a() + " FC: " + $$24.size());
         $$25.add("");
         $$25.add(String.format(Locale.ROOT, "XYZ: %.3f / %.5f / %.3f", this.f.ao().dA(), this.f.ao().dC(), this.f.ao().dG()));
         $$25.add(String.format(Locale.ROOT, "Block: %d %d %d [%d %d %d]", $$14.u(), $$14.v(), $$14.w(), $$14.u() & 15, $$14.v() & 15, $$14.w() & 15));
         $$25.add(String.format(Locale.ROOT, "Chunk: %d %d %d [%d %d in r.%d.%d.mca]", $$22.h, kk.a($$14.v()), $$22.i, $$22.j(), $$22.k(), $$22.h(), $$22.i()));
         $$25.add(String.format(Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", $$16, $$21, ayz.h($$15.dL()), ayz.h($$15.dN())));
         dzb $$27 = this.u();
         if ($$27.E()) {
            $$25.add("Waiting for chunk...");
         } else {
            int $$28 = this.f.s.h().p().a($$14, 0);
            int $$29 = this.f.s.a(dgq.a, $$14);
            int $$30 = this.f.s.a(dgq.b, $$14);
            $$25.add("Client Light: " + $$28 + " (" + $$29 + " sky, " + $$30 + " block)");
            dzb $$31 = this.t();
            StringBuilder $$32 = new StringBuilder("CH");

            for (ecr.a $$33 : ecr.a.values()) {
               if ($$33.b()) {
                  $$32.append(" ").append(e.get($$33)).append(": ").append($$27.a($$33, $$14.u(), $$14.w()));
               }
            }

            $$25.add($$32.toString());
            $$32.setLength(0);
            $$32.append("SH");

            for (ecr.a $$34 : ecr.a.values()) {
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
                  float $$35 = $$23.ar();
                  long $$36 = $$31.w();
                  bsh $$37 = new bsh($$23.am(), $$23.ae(), $$36, $$35);
                  $$25.add(String.format(Locale.ROOT, "Local Difficulty: %.2f // %.2f (Day %d)", $$37.b(), $$37.d(), this.f.s.ae() / 24000L));
               } else {
                  $$25.add("Local Difficulty: ??");
               }
            }

            if ($$31 != null && $$31.u()) {
               $$25.add("Blending: Old");
            }
         }

         ard $$38 = this.q();
         if ($$38 != null) {
            ara $$39 = $$38.m();
            dys $$40 = $$39.g();
            edf $$41 = $$39.i();
            $$40.a($$25, $$41, $$14);
            dhs.f $$42 = $$41.b();
            dhn $$43 = $$40.d();
            $$43.a($$25, $$14, $$42);
            dgs.d $$44 = $$39.n();
            if ($$44 != null) {
               Object2IntMap<bvj> $$45 = $$44.b();
               int $$46 = $$44.a();
               $$25.add(
                  "SC: "
                     + $$46
                     + ", "
                     + Stream.of(bvj.values())
                        .map($$1x -> Character.toUpperCase($$1x.a().charAt(0)) + ": " + $$45.getInt($$1x))
                        .collect(Collectors.joining(", "))
               );
            } else {
               $$25.add("SC: N/A");
            }
         }

         akv $$47 = this.f.j.f();
         if ($$47 != null) {
            $$25.add("Post: " + $$47);
         }

         $$25.add(this.f.ak().j() + String.format(Locale.ROOT, " (Mood %d%%)", Math.round(this.f.t.e() * 100.0F)));
         return $$25;
      }
   }

   private static String a(jr<dhj> $$0) {
      return (String)$$0.d().map($$0x -> $$0x.a().toString(), $$0x -> "[unregistered " + $$0x + "]");
   }

   @Nullable
   private ard q() {
      hjc $$0 = this.f.V();
      return $$0 != null ? $$0.a(this.f.s.ai()) : null;
   }

   @Nullable
   private String r() {
      ard $$0 = this.q();
      return $$0 != null ? $$0.J() : null;
   }

   private dgh s() {
      return (dgh)DataFixUtils.orElse(Optional.ofNullable(this.f.V()).flatMap($$0 -> Optional.ofNullable($$0.a(this.f.s.ai()))), this.f.s);
   }

   @Nullable
   private dzb t() {
      if (this.m == null) {
         ard $$0 = this.q();
         if ($$0 == null) {
            return null;
         }

         this.m = $$0.m().b(this.k.h, this.k.i, dzs.n, false).thenApply($$0x -> (dzb)$$0x.b(null));
      }

      return this.m.getNow(null);
   }

   private dzb u() {
      if (this.l == null) {
         this.l = this.f.s.d(this.k.h, this.k.i);
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
            String.format(Locale.ROOT, "CPU: %s", fem.b()),
            "",
            String.format(Locale.ROOT, "Display: %dx%d (%s)", fli.Q().aO().k(), fli.Q().aO().l(), fem.a()),
            fem.c(),
            fem.d()
         }
      );
      if (this.f.az()) {
         return $$4;
      } else {
         if (this.i.d() == fax.a.b) {
            ji $$5 = ((fav)this.i).b();
            dww $$6 = this.f.s.a_($$5);
            $$4.add("");
            $$4.add(n.t + "Targeted Block: " + $$5.u() + ", " + $$5.v() + ", " + $$5.w());
            $$4.add(String.valueOf(mb.e.b($$6.b())));

            for (Entry<dxy<?>, Comparable<?>> $$7 : $$6.G().entrySet()) {
               $$4.add(this.a($$7));
            }

            $$6.w().map($$0x -> "#" + $$0x.b()).forEach($$4::add);
         }

         if (this.j.d() == fax.a.b) {
            ji $$8 = ((fav)this.j).b();
            esy $$9 = this.f.s.b_($$8);
            $$4.add("");
            $$4.add(n.t + "Targeted Fluid: " + $$8.u() + ", " + $$8.v() + ", " + $$8.w());
            $$4.add(String.valueOf(mb.c.b($$9.a())));

            for (Entry<dxy<?>, Comparable<?>> $$10 : $$9.G().entrySet()) {
               $$4.add(this.a($$10));
            }

            $$9.k().map($$0x -> "#" + $$0x.b()).forEach($$4::add);
         }

         buk $$11 = this.f.v;
         if ($$11 != null) {
            $$4.add("");
            $$4.add(n.t + "Targeted Entity");
            $$4.add(String.valueOf(mb.f.b($$11.aq())));
         }

         return $$4;
      }
   }

   private String a(Entry<dxy<?>, Comparable<?>> $$0) {
      dxy<?> $$1 = $$0.getKey();
      Comparable<?> $$2 = $$0.getValue();
      String $$3 = af.a($$1, $$2);
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

   public bnc l() {
      return this.s;
   }

   public bnc m() {
      return this.t;
   }

   public bnc n() {
      return this.u;
   }

   public fql o() {
      return this.A;
   }

   public void a(long[] $$0, bnd $$1) {
      bnc $$2 = this.v.get($$1);
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
