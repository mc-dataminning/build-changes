import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.DataFixUtils;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
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

public class fsr {
   private static final int a = 10;
   private static final int b = 14737632;
   private static final int c = 2;
   private static final int d = 2;
   private static final int e = 2;
   private static final Map<egg.a, String> f = Maps.newEnumMap(Map.of(egg.a.a, "SW", egg.a.b, "S", egg.a.c, "OW", egg.a.d, "O", egg.a.e, "M", egg.a.f, "ML"));
   private final foz g;
   private final fsr.a h;
   private final frt i;
   private final fjm j;
   private feo k;
   private feo l;
   @Nullable
   private dih m;
   @Nullable
   private eco n;
   @Nullable
   private CompletableFuture<eco> o;
   private boolean p;
   private boolean q;
   private boolean r;
   private boolean s;
   private final boy t = new boy(1);
   private final boy u = new boy(bpd.values().length);
   private final boy v = new boy(1);
   private final boy w = new boy(1);
   private final Map<boz, boy> x = Map.of(boz.a, this.u);
   private final fua y;
   private final fud z;
   private final fub A;
   private final ftz B;
   private final fuc C;

   public fsr(foz $$0) {
      this.g = $$0;
      this.h = new fsr.a();
      this.i = $$0.h;
      this.y = new fua(this.i, this.t);
      this.z = new fud(this.i, this.u, () -> $$0.s.u().g());
      this.A = new fub(this.i, this.v);
      this.B = new ftz(this.i, this.w);
      this.C = new fuc(this.i);

      try (fjg $$1 = new fjg(fjh.g.b() * 12)) {
         fjf $$2 = new fjf($$1, fjo.c.a, fjh.g);
         $$2.a(0.0F, 0.0F, 0.0F).a(-65536).b(1.0F, 0.0F, 0.0F);
         $$2.a(10.0F, 0.0F, 0.0F).a(-65536).b(1.0F, 0.0F, 0.0F);
         $$2.a(0.0F, 0.0F, 0.0F).a(-16711936).b(0.0F, 1.0F, 0.0F);
         $$2.a(0.0F, 10.0F, 0.0F).a(-16711936).b(0.0F, 1.0F, 0.0F);
         $$2.a(0.0F, 0.0F, 0.0F).a(-8421377).b(0.0F, 0.0F, 1.0F);
         $$2.a(0.0F, 0.0F, 10.0F).a(-8421377).b(0.0F, 0.0F, 1.0F);
         this.j = new fjm(fhe.b);
         this.j.a();
         this.j.a($$2.b());
         fjm.b();
      }
   }

   public void a() {
      this.o = null;
      this.n = null;
   }

   public void a(frv $$0) {
      bqo $$1 = bqn.a();
      $$1.a("debug");
      bwf $$2 = this.g.ao();
      this.k = $$2.a(20.0, 0.0F, false);
      this.l = $$2.a(20.0, 0.0F, true);
      this.b($$0);
      this.c($$0);
      this.C.a(10);
      if (this.r) {
         int $$3 = $$0.a();
         int $$4 = $$3 / 2;
         this.y.a($$0, 0, this.y.a($$4));
         if (this.u.d() > 0) {
            int $$5 = this.z.a($$4);
            this.z.a($$0, $$3 - $$5, $$5);
         }

         this.C.a(this.z.a());
      }

      if (this.s) {
         int $$6 = $$0.a();
         int $$7 = $$6 / 2;
         if (!this.g.T()) {
            this.B.a($$0, 0, this.B.a($$7));
         }

         int $$8 = this.A.a($$7);
         this.A.a($$0, $$6 - $$8, $$8);
         this.C.a(this.A.a());
      }

      try (bqt $$9 = $$1.d("profilerPie")) {
         this.C.a($$0);
      }

      $$1.c();
   }

   protected void b(frv $$0) {
      List<String> $$1 = this.b();
      $$1.add("");
      boolean $$2 = this.g.V() != null;
      $$1.add(
         "Debug charts: [F3+1] Profiler "
            + (this.q ? "visible" : "hidden")
            + "; [F3+2] "
            + ($$2 ? "FPS + TPS " : "FPS ")
            + (this.r ? "visible" : "hidden")
            + "; [F3+3] "
            + (!this.g.T() ? "Bandwidth + Ping" : "Ping")
            + (this.s ? " visible" : " hidden")
      );
      $$1.add("For help: press F3 + Q");
      this.a($$0, $$1, true);
   }

   protected void c(frv $$0) {
      List<String> $$1 = this.c();
      this.a($$0, $$1, false);
   }

   private void a(frv $$0, List<String> $$1, boolean $$2) {
      int $$3 = 9;

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         String $$5 = $$1.get($$4);
         if (!Strings.isNullOrEmpty($$5)) {
            int $$6 = this.i.b($$5);
            int $$7 = $$2 ? 2 : $$0.a() - 2 - $$6;
            int $$8 = 2 + $$3 * $$4;
            $$0.a($$7 - 1, $$8 - 1, $$7 + $$6 + 1, $$8 + $$3 - 1, -1873784752);
         }
      }

      for (int $$9 = 0; $$9 < $$1.size(); $$9++) {
         String $$10 = $$1.get($$9);
         if (!Strings.isNullOrEmpty($$10)) {
            int $$11 = this.i.b($$10);
            int $$12 = $$2 ? 2 : $$0.a() - 2 - $$11;
            int $$13 = 2 + $$3 * $$9;
            $$0.a(this.i, $$10, $$12, $$13, 14737632, false);
         }
      }
   }

   protected List<String> b() {
      hni $$0 = this.g.V();
      gka $$1 = this.g.L();
      vr $$2 = $$1.k();
      float $$3 = $$2.p();
      float $$4 = $$2.o();
      bum $$5 = this.t().u();
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
         ama $$9 = $$0.aP();
         boolean $$10 = $$9.a();
         if ($$10) {
            $$6 = " (sprinting)";
         }

         String $$11 = $$10 ? "-" : String.format(Locale.ROOT, "%.1f", $$5.g());
         $$12 = String.format(Locale.ROOT, "Integrated server @ %.1f/%s ms%s, %.0f tx, %.0f rx", $$0.aO(), $$11, $$6, $$3, $$4);
      } else {
         $$12 = String.format(Locale.ROOT, "\"%s\" server%s, %.0f tx, %.0f rx", $$1.f(), $$6, $$3, $$4);
      }

      iu $$14 = this.g.ao().dv();
      if (this.g.az()) {
         return Lists.newArrayList(
            new String[]{
               "Minecraft " + ab.b().c() + " (" + this.g.i() + "/" + ClientBrandRetriever.getClientModName() + ")",
               this.g.A,
               $$12,
               this.g.f.f(),
               this.g.f.k(),
               "P: " + this.g.g.d() + ". T: " + this.g.s.g(),
               this.g.s.J(),
               "",
               String.format(Locale.ROOT, "Chunk-relative: %d %d %d", $$14.u() & 15, $$14.v() & 15, $$14.w() & 15)
            }
         );
      } else {
         bwf $$15 = this.g.ao();
         ja $$16 = $$15.cO();

         String $$21 = switch ($$16) {
            case c -> "Towards negative Z";
            case d -> "Towards positive Z";
            case e -> "Towards negative X";
            case f -> "Towards positive X";
            default -> "Invalid";
         };
         dih $$22 = new dih($$14);
         if (!Objects.equals(this.m, $$22)) {
            this.m = $$22;
            this.a();
         }

         dja $$23 = this.t();
         LongSet $$24 = (LongSet)($$23 instanceof arq ? ((arq)$$23).y() : LongSets.EMPTY_SET);
         List<String> $$25 = Lists.newArrayList(
            new String[]{
               "Minecraft "
                  + ab.b().c()
                  + " ("
                  + this.g.i()
                  + "/"
                  + ClientBrandRetriever.getClientModName()
                  + ("release".equalsIgnoreCase(this.g.j()) ? "" : "/" + this.g.j())
                  + ")",
               this.g.A,
               $$12,
               this.g.f.f(),
               this.g.f.k(),
               "P: " + this.g.g.d() + ". T: " + this.g.s.g(),
               this.g.s.J()
            }
         );
         String $$26 = this.s();
         if ($$26 != null) {
            $$25.add($$26);
         }

         $$25.add(this.g.s.aj().a() + " FC: " + $$24.size());
         $$25.add("");
         $$25.add(String.format(Locale.ROOT, "XYZ: %.3f / %.5f / %.3f", this.g.ao().dA(), this.g.ao().dC(), this.g.ao().dG()));
         $$25.add(String.format(Locale.ROOT, "Block: %d %d %d [%d %d %d]", $$14.u(), $$14.v(), $$14.w(), $$14.u() & 15, $$14.v() & 15, $$14.w() & 15));
         $$25.add(String.format(Locale.ROOT, "Chunk: %d %d %d [%d %d in r.%d.%d.mca]", $$22.h, jx.a($$14.v()), $$22.i, $$22.j(), $$22.k(), $$22.h(), $$22.i()));
         $$25.add(String.format(Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", $$16, $$21, azm.h($$15.dL()), azm.h($$15.dN())));
         eco $$27 = this.v();
         if ($$27.E()) {
            $$25.add("Waiting for chunk...");
         } else {
            int $$28 = this.g.s.h().q().a($$14, 0);
            int $$29 = this.g.s.a(djj.a, $$14);
            int $$30 = this.g.s.a(djj.b, $$14);
            $$25.add("Client Light: " + $$28 + " (" + $$29 + " sky, " + $$30 + " block)");
            eco $$31 = this.u();
            StringBuilder $$32 = new StringBuilder("CH");

            for (egg.a $$33 : egg.a.values()) {
               if ($$33.b()) {
                  $$32.append(" ").append(f.get($$33)).append(": ").append($$27.a($$33, $$14.u(), $$14.w()));
               }
            }

            $$25.add($$32.toString());
            $$32.setLength(0);
            $$32.append("SH");

            for (egg.a $$34 : egg.a.values()) {
               if ($$34.d()) {
                  $$32.append(" ").append(f.get($$34)).append(": ");
                  if ($$31 != null) {
                     $$32.append($$31.a($$34, $$14.u(), $$14.w()));
                  } else {
                     $$32.append("??");
                  }
               }
            }

            $$25.add($$32.toString());
            if (this.g.s.d($$14.v())) {
               $$25.add("Biome: " + a(this.g.s.u($$14)));
               if ($$31 != null) {
                  float $$35 = $$23.as();
                  long $$36 = $$31.w();
                  bub $$37 = new bub($$23.an(), $$23.af(), $$36, $$35);
                  $$25.add(String.format(Locale.ROOT, "Local Difficulty: %.2f // %.2f (Day %d)", $$37.b(), $$37.d(), this.g.s.af() / 24000L));
               } else {
                  $$25.add("Local Difficulty: ??");
               }
            }

            if ($$31 != null && $$31.u()) {
               $$25.add("Blending: Old");
            }
         }

         arq $$38 = this.r();
         if ($$38 != null) {
            arn $$39 = $$38.m();
            ecf $$40 = $$39.g();
            egu $$41 = $$39.i();
            $$40.a($$25, $$41, $$14);
            dkm.f $$42 = $$41.b();
            dkh $$43 = $$40.d();
            $$43.a($$25, $$14, $$42);
            djl.d $$44 = $$39.o();
            if ($$44 != null) {
               Object2IntMap<bxh> $$45 = $$44.b();
               int $$46 = $$44.a();
               $$25.add(
                  "SC: "
                     + $$46
                     + ", "
                     + Stream.of(bxh.values())
                        .map($$1x -> Character.toUpperCase($$1x.a().charAt(0)) + ": " + $$45.getInt($$1x))
                        .collect(Collectors.joining(", "))
               );
            } else {
               $$25.add("SC: N/A");
            }
         }

         alg $$47 = this.g.j.f();
         if ($$47 != null) {
            $$25.add("Post: " + $$47);
         }

         $$25.add(this.g.ak().j() + String.format(Locale.ROOT, " (Mood %d%%)", Math.round(this.g.t.d() * 100.0F)));
         return $$25;
      }
   }

   private static String a(je<dkd> $$0) {
      return (String)$$0.d().map($$0x -> $$0x.a().toString(), $$0x -> "[unregistered " + $$0x + "]");
   }

   @Nullable
   private arq r() {
      hni $$0 = this.g.V();
      return $$0 != null ? $$0.a(this.g.s.aj()) : null;
   }

   @Nullable
   private String s() {
      arq $$0 = this.r();
      return $$0 != null ? $$0.J() : null;
   }

   private dja t() {
      return (dja)DataFixUtils.orElse(Optional.ofNullable(this.g.V()).flatMap($$0 -> Optional.ofNullable($$0.a(this.g.s.aj()))), this.g.s);
   }

   @Nullable
   private eco u() {
      if (this.o == null) {
         arq $$0 = this.r();
         if ($$0 == null) {
            return null;
         }

         this.o = $$0.m().b(this.m.h, this.m.i, edf.n, false).thenApply($$0x -> (eco)$$0x.b(null));
      }

      return this.o.getNow(null);
   }

   private eco v() {
      if (this.n == null) {
         this.n = this.g.s.d(this.m.h, this.m.i);
      }

      return this.n;
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
            String.format(Locale.ROOT, "Allocation rate: %03dMB/s", b(this.h.a($$3))),
            String.format(Locale.ROOT, "Allocated: %2d%% %03dMB", $$1 * 100L / $$0, b($$1)),
            "",
            String.format(Locale.ROOT, "CPU: %s", fid.b()),
            "",
            String.format(Locale.ROOT, "Display: %dx%d (%s)", foz.Q().aO().k(), foz.Q().aO().l(), fid.a()),
            fid.c(),
            fid.d()
         }
      );
      if (this.g.az()) {
         return $$4;
      } else {
         if (this.k.d() == feo.a.b) {
            iu $$5 = ((fem)this.k).b();
            eah $$6 = this.g.s.a_($$5);
            $$4.add("");
            $$4.add(n.t + "Targeted Block: " + $$5.u() + ", " + $$5.v() + ", " + $$5.w());
            $$4.add(String.valueOf(mf.e.b($$6.b())));

            for (Entry<ebk<?>, Comparable<?>> $$7 : $$6.G().entrySet()) {
               $$4.add(this.a($$7));
            }

            $$6.w().map($$0x -> "#" + $$0x.b()).forEach($$4::add);
         }

         if (this.l.d() == feo.a.b) {
            iu $$8 = ((fem)this.l).b();
            ewo $$9 = this.g.s.b_($$8);
            $$4.add("");
            $$4.add(n.t + "Targeted Fluid: " + $$8.u() + ", " + $$8.v() + ", " + $$8.w());
            $$4.add(String.valueOf(mf.c.b($$9.a())));

            for (Entry<ebk<?>, Comparable<?>> $$10 : $$9.G().entrySet()) {
               $$4.add(this.a($$10));
            }

            $$9.k().map($$0x -> "#" + $$0x.b()).forEach($$4::add);
         }

         bwf $$11 = this.g.v;
         if ($$11 != null) {
            $$4.add("");
            $$4.add(n.t + "Targeted Entity");
            $$4.add(String.valueOf(mf.f.b($$11.aq())));
         }

         return $$4;
      }
   }

   private String a(Entry<ebk<?>, Comparable<?>> $$0) {
      ebk<?> $$1 = $$0.getKey();
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
      return this.p && !this.g.n.X;
   }

   public boolean e() {
      return this.d() && this.q;
   }

   public boolean f() {
      return this.d() && this.s;
   }

   public boolean g() {
      return this.d() && this.r;
   }

   public void h() {
      this.p = !this.p;
   }

   public void i() {
      this.s = !this.p || !this.s;
      if (this.s) {
         this.p = true;
         this.r = false;
      }
   }

   public void j() {
      this.r = !this.p || !this.r;
      if (this.r) {
         this.p = true;
         this.s = false;
      }
   }

   public void k() {
      this.q = !this.p || !this.q;
      if (this.q) {
         this.p = true;
      }
   }

   public void a(long $$0) {
      this.t.a($$0);
   }

   public boy l() {
      return this.u;
   }

   public boy m() {
      return this.v;
   }

   public boy n() {
      return this.w;
   }

   public fuc o() {
      return this.C;
   }

   public void a(long[] $$0, boz $$1) {
      boy $$2 = this.x.get($$1);
      if ($$2 != null) {
         $$2.a($$0);
      }
   }

   public void p() {
      this.p = false;
      this.u.e();
      this.v.e();
      this.w.e();
   }

   public void q() {
      GlStateManager._depthMask(false);
      GlStateManager._disableCull();
      RenderSystem.setShader(gpk.Y);
      this.j.a();
      RenderSystem.lineWidth(4.0F);
      RenderSystem.setShaderColor(0.0F, 0.0F, 0.0F, 1.0F);
      this.j.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
      RenderSystem.lineWidth(2.0F);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      this.j.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
      fjm.b();
      RenderSystem.lineWidth(1.0F);
      GlStateManager._enableCull();
      GlStateManager._depthMask(true);
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
