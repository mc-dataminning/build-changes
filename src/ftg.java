import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import org.apache.commons.lang3.tuple.Triple;
import org.joml.Matrix4f;

public abstract class ftg {
   private static final float aS = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aT;
   private final Runnable aU;
   protected static final ftg.p c = new ftg.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final ftg.p d = new ftg.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final ftg.p e = new ftg.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final ftg.p f = new ftg.p(
      "glint_transparency",
      () -> {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_COLOR, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE
         );
      },
      () -> {
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   );
   protected static final ftg.p g = new ftg.p(
      "crumbling_transparency",
      () -> {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.DST_COLOR, GlStateManager.DestFactor.SRC_COLOR, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
         );
      },
      () -> {
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   );
   protected static final ftg.p h = new ftg.p(
      "translucent_transparency",
      () -> {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA,
            GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
            GlStateManager.SourceFactor.ONE,
            GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA
         );
      },
      () -> {
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   );
   protected static final ftg.m i = new ftg.m();
   protected static final ftg.m j = new ftg.m(fss::v);
   protected static final ftg.m k = new ftg.m(fss::p);
   protected static final ftg.m l = new ftg.m(fss::r);
   protected static final ftg.m m = new ftg.m(fss::s);
   protected static final ftg.m n = new ftg.m(fss::w);
   protected static final ftg.m o = new ftg.m(fss::q);
   protected static final ftg.m p = new ftg.m(fss::z);
   protected static final ftg.m q = new ftg.m(fss::A);
   protected static final ftg.m r = new ftg.m(fss::B);
   protected static final ftg.m s = new ftg.m(fss::C);
   protected static final ftg.m t = new ftg.m(fss::D);
   protected static final ftg.m u = new ftg.m(fss::E);
   protected static final ftg.m v = new ftg.m(fss::F);
   protected static final ftg.m w = new ftg.m(fss::G);
   protected static final ftg.m x = new ftg.m(fss::H);
   protected static final ftg.m y = new ftg.m(fss::I);
   protected static final ftg.m z = new ftg.m(fss::J);
   protected static final ftg.m A = new ftg.m(fss::K);
   protected static final ftg.m B = new ftg.m(fss::L);
   protected static final ftg.m C = new ftg.m(fss::M);
   protected static final ftg.m D = new ftg.m(fss::N);
   protected static final ftg.m E = new ftg.m(fss::O);
   protected static final ftg.m F = new ftg.m(fss::P);
   protected static final ftg.m G = new ftg.m(fss::Q);
   protected static final ftg.m H = new ftg.m(fss::R);
   protected static final ftg.m I = new ftg.m(fss::S);
   protected static final ftg.m J = new ftg.m(fss::T);
   protected static final ftg.m K = new ftg.m(fss::U);
   protected static final ftg.m L = new ftg.m(fss::W);
   protected static final ftg.m M = new ftg.m(fss::X);
   protected static final ftg.m N = new ftg.m(fss::Y);
   protected static final ftg.m O = new ftg.m(fss::Z);
   protected static final ftg.m P = new ftg.m(fss::aa);
   protected static final ftg.m Q = new ftg.m(fss::ab);
   protected static final ftg.m R = new ftg.m(fss::ac);
   protected static final ftg.m S = new ftg.m(fss::ad);
   protected static final ftg.m T = new ftg.m(fss::ae);
   protected static final ftg.m U = new ftg.m(fss::af);
   protected static final ftg.m V = new ftg.m(fss::ar);
   protected static final ftg.m W = new ftg.m(fss::ag);
   protected static final ftg.m X = new ftg.m(fss::ah);
   protected static final ftg.m Y = new ftg.m(fss::ai);
   protected static final ftg.m Z = new ftg.m(fss::aj);
   protected static final ftg.m aa = new ftg.m(fss::ak);
   protected static final ftg.m ab = new ftg.m(fss::al);
   protected static final ftg.m ac = new ftg.m(fss::am);
   protected static final ftg.m ad = new ftg.m(fss::an);
   protected static final ftg.m ae = new ftg.m(fss::ao);
   protected static final ftg.m af = new ftg.m(fss::ap);
   protected static final ftg.m ag = new ftg.m(fss::aq);
   protected static final ftg.m ah = new ftg.m(fss::as);
   protected static final ftg.m ai = new ftg.m(fss::at);
   protected static final ftg.m aj = new ftg.m(fss::au);
   protected static final ftg.m ak = new ftg.m(fss::av);
   protected static final ftg.m al = new ftg.m(fss::V);
   protected static final ftg.n am = new ftg.n(gee.e, false, true);
   protected static final ftg.n an = new ftg.n(gee.e, false, false);
   protected static final ftg.e ao = new ftg.e();
   protected static final ftg.o ap = new ftg.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final ftg.o aq = new ftg.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final ftg.o ar = new ftg.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final ftg.g as = new ftg.g(true);
   protected static final ftg.g at = new ftg.g(false);
   protected static final ftg.l au = new ftg.l(true);
   protected static final ftg.l av = new ftg.l(false);
   protected static final ftg.c aw = new ftg.c(true);
   protected static final ftg.c ax = new ftg.c(false);
   protected static final ftg.d ay = new ftg.d("always", 519);
   protected static final ftg.d az = new ftg.d("==", 514);
   protected static final ftg.d aA = new ftg.d("<=", 515);
   protected static final ftg.d aB = new ftg.d(">", 516);
   protected static final ftg.q aC = new ftg.q(true, true);
   protected static final ftg.q aD = new ftg.q(true, false);
   protected static final ftg.q aE = new ftg.q(false, true);
   protected static final ftg.f aF = new ftg.f("no_layering", () -> {
   }, () -> {
   });
   protected static final ftg.f aG = new ftg.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final ftg.f aH = new ftg.f("view_offset_z_layering", () -> {
      ept $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      ept $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final ftg.k aI = new ftg.k("main_target", () -> {
   }, () -> {
   });
   protected static final ftg.k aJ = new ftg.k("outline_target", () -> eva.N().f.s().a(false), () -> eva.N().g().a(false));
   protected static final ftg.k aK = new ftg.k("translucent_target", () -> {
      if (eva.L()) {
         eva.N().f.t().a(false);
      }
   }, () -> {
      if (eva.L()) {
         eva.N().g().a(false);
      }
   });
   protected static final ftg.k aL = new ftg.k("particles_target", () -> {
      if (eva.L()) {
         eva.N().f.v().a(false);
      }
   }, () -> {
      if (eva.L()) {
         eva.N().g().a(false);
      }
   });
   protected static final ftg.k aM = new ftg.k("weather_target", () -> {
      if (eva.L()) {
         eva.N().f.w().a(false);
      }
   }, () -> {
      if (eva.L()) {
         eva.N().g().a(false);
      }
   });
   protected static final ftg.k aN = new ftg.k("clouds_target", () -> {
      if (eva.L()) {
         eva.N().f.x().a(false);
      }
   }, () -> {
      if (eva.L()) {
         eva.N().g().a(false);
      }
   });
   protected static final ftg.k aO = new ftg.k("item_entity_target", () -> {
      if (eva.L()) {
         eva.N().f.u().a(false);
      }
   }, () -> {
      if (eva.L()) {
         eva.N().g().a(false);
      }
   });
   protected static final ftg.h aP = new ftg.h(OptionalDouble.of(1.0));
   protected static final ftg.b aQ = new ftg.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final ftg.b aR = new ftg.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public ftg(String $$0, Runnable $$1, Runnable $$2) {
      this.b = $$0;
      this.aT = $$1;
      this.aU = $$2;
   }

   public void a() {
      this.aT.run();
   }

   public void b() {
      this.aU.run();
   }

   @Override
   public String toString() {
      return this.b;
   }

   private static void a(float $$0) {
      long $$1 = (long)((double)ac.b() * eva.N().m.aj().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends ftg {
      private final boolean aS;

      public a(String $$0, Runnable $$1, Runnable $$2, boolean $$3) {
         super($$0, $$1, $$2);
         this.aS = $$3;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aS + "]";
      }
   }

   protected static class b extends ftg {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends ftg.a {
      public c(boolean $$0) {
         super("cull", () -> {
            if (!$$0) {
               RenderSystem.disableCull();
            }
         }, () -> {
            if (!$$0) {
               RenderSystem.enableCull();
            }
         }, $$0);
      }
   }

   protected static class d extends ftg {
      private final String aS;

      public d(String $$0, int $$1) {
         super("depth_test", () -> {
            if ($$1 != 519) {
               RenderSystem.enableDepthTest();
               RenderSystem.depthFunc($$1);
            }
         }, () -> {
            if ($$1 != 519) {
               RenderSystem.disableDepthTest();
               RenderSystem.depthFunc(515);
            }
         });
         this.aS = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aS + "]";
      }
   }

   protected static class e extends ftg {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<ahd> c() {
         return Optional.empty();
      }
   }

   protected static class f extends ftg {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends ftg.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               eva.N().j.n().c();
            }
         }, () -> {
            if ($$0) {
               eva.N().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends ftg {
      private final OptionalDouble aS;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)eva.N().aL().k() / 1920.0F * 2.5F));
               }
            }
         }, () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               RenderSystem.lineWidth(1.0F);
            }
         });
         this.aS = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + (this.aS.isPresent() ? this.aS.getAsDouble() : "window_scale") + "]";
      }
   }

   protected static class i extends ftg.e {
      private final Optional<ahd> aS;

      i(ImmutableList<Triple<ahd, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<ahd, Boolean, Boolean> $$2 = (Triple<ahd, Boolean, Boolean>)var2.next();
               geg $$3 = eva.N().X();
               $$3.b((ahd)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (ahd)$$2.getLeft());
            }
         }, () -> {
         });
         this.aS = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<ahd> c() {
         return this.aS;
      }

      public static ftg.i.a d() {
         return new ftg.i.a();
      }

      public static final class a {
         private final Builder<Triple<ahd, Boolean, Boolean>> a = new Builder();

         public ftg.i.a a(ahd $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public ftg.i a() {
            return new ftg.i(this.a.build());
         }
      }
   }

   protected static final class j extends ftg.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends ftg {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends ftg.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               eva.N().j.o().a();
            }
         }, () -> {
            if ($$0) {
               eva.N().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends ftg {
      private final Optional<Supplier<ftn>> aS;

      public m(Supplier<ftn> $$0) {
         super("shader", () -> RenderSystem.setShader($$0), () -> {
         });
         this.aS = Optional.of($$0);
      }

      public m() {
         super("shader", () -> RenderSystem.setShader(() -> null), () -> {
         });
         this.aS = Optional.empty();
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aS + "]";
      }
   }

   protected static class n extends ftg.e {
      private final Optional<ahd> aS;
      private final boolean aT;
      private final boolean aU;

      public n(ahd $$0, boolean $$1, boolean $$2) {
         super(() -> {
            geg $$3 = eva.N().X();
            $$3.b($$0).a($$1, $$2);
            RenderSystem.setShaderTexture(0, $$0);
         }, () -> {
         });
         this.aS = Optional.of($$0);
         this.aT = $$1;
         this.aU = $$2;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aS + "(blur=" + this.aT + ", mipmap=" + this.aU + ")]";
      }

      @Override
      protected Optional<ahd> c() {
         return this.aS;
      }
   }

   protected static class o extends ftg {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends ftg {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends ftg {
      private final boolean aS;
      private final boolean aT;

      public q(boolean $$0, boolean $$1) {
         super("write_mask_state", () -> {
            if (!$$1) {
               RenderSystem.depthMask($$1);
            }

            if (!$$0) {
               RenderSystem.colorMask($$0, $$0, $$0, $$0);
            }
         }, () -> {
            if (!$$1) {
               RenderSystem.depthMask(true);
            }

            if (!$$0) {
               RenderSystem.colorMask(true, true, true, true);
            }
         });
         this.aS = $$0;
         this.aT = $$1;
      }

      @Override
      public String toString() {
         return this.b + "[writeColor=" + this.aS + ", writeDepth=" + this.aT + "]";
      }
   }
}
