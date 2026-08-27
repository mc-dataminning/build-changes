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

public abstract class fua {
   private static final float aS = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aT;
   private final Runnable aU;
   protected static final fua.p c = new fua.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final fua.p d = new fua.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fua.p e = new fua.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fua.p f = new fua.p(
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
   protected static final fua.p g = new fua.p(
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
   protected static final fua.p h = new fua.p(
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
   protected static final fua.m i = new fua.m();
   protected static final fua.m j = new fua.m(ftm::v);
   protected static final fua.m k = new fua.m(ftm::p);
   protected static final fua.m l = new fua.m(ftm::r);
   protected static final fua.m m = new fua.m(ftm::s);
   protected static final fua.m n = new fua.m(ftm::w);
   protected static final fua.m o = new fua.m(ftm::q);
   protected static final fua.m p = new fua.m(ftm::z);
   protected static final fua.m q = new fua.m(ftm::A);
   protected static final fua.m r = new fua.m(ftm::B);
   protected static final fua.m s = new fua.m(ftm::C);
   protected static final fua.m t = new fua.m(ftm::D);
   protected static final fua.m u = new fua.m(ftm::E);
   protected static final fua.m v = new fua.m(ftm::F);
   protected static final fua.m w = new fua.m(ftm::G);
   protected static final fua.m x = new fua.m(ftm::H);
   protected static final fua.m y = new fua.m(ftm::I);
   protected static final fua.m z = new fua.m(ftm::J);
   protected static final fua.m A = new fua.m(ftm::K);
   protected static final fua.m B = new fua.m(ftm::L);
   protected static final fua.m C = new fua.m(ftm::M);
   protected static final fua.m D = new fua.m(ftm::N);
   protected static final fua.m E = new fua.m(ftm::O);
   protected static final fua.m F = new fua.m(ftm::P);
   protected static final fua.m G = new fua.m(ftm::Q);
   protected static final fua.m H = new fua.m(ftm::R);
   protected static final fua.m I = new fua.m(ftm::S);
   protected static final fua.m J = new fua.m(ftm::T);
   protected static final fua.m K = new fua.m(ftm::U);
   protected static final fua.m L = new fua.m(ftm::W);
   protected static final fua.m M = new fua.m(ftm::X);
   protected static final fua.m N = new fua.m(ftm::Y);
   protected static final fua.m O = new fua.m(ftm::Z);
   protected static final fua.m P = new fua.m(ftm::aa);
   protected static final fua.m Q = new fua.m(ftm::ab);
   protected static final fua.m R = new fua.m(ftm::ac);
   protected static final fua.m S = new fua.m(ftm::ad);
   protected static final fua.m T = new fua.m(ftm::ae);
   protected static final fua.m U = new fua.m(ftm::af);
   protected static final fua.m V = new fua.m(ftm::ar);
   protected static final fua.m W = new fua.m(ftm::ag);
   protected static final fua.m X = new fua.m(ftm::ah);
   protected static final fua.m Y = new fua.m(ftm::ai);
   protected static final fua.m Z = new fua.m(ftm::aj);
   protected static final fua.m aa = new fua.m(ftm::ak);
   protected static final fua.m ab = new fua.m(ftm::al);
   protected static final fua.m ac = new fua.m(ftm::am);
   protected static final fua.m ad = new fua.m(ftm::an);
   protected static final fua.m ae = new fua.m(ftm::ao);
   protected static final fua.m af = new fua.m(ftm::ap);
   protected static final fua.m ag = new fua.m(ftm::aq);
   protected static final fua.m ah = new fua.m(ftm::as);
   protected static final fua.m ai = new fua.m(ftm::at);
   protected static final fua.m aj = new fua.m(ftm::au);
   protected static final fua.m ak = new fua.m(ftm::av);
   protected static final fua.m al = new fua.m(ftm::V);
   protected static final fua.n am = new fua.n(gfa.e, false, true);
   protected static final fua.n an = new fua.n(gfa.e, false, false);
   protected static final fua.e ao = new fua.e();
   protected static final fua.o ap = new fua.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final fua.o aq = new fua.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final fua.o ar = new fua.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final fua.g as = new fua.g(true);
   protected static final fua.g at = new fua.g(false);
   protected static final fua.l au = new fua.l(true);
   protected static final fua.l av = new fua.l(false);
   protected static final fua.c aw = new fua.c(true);
   protected static final fua.c ax = new fua.c(false);
   protected static final fua.d ay = new fua.d("always", 519);
   protected static final fua.d az = new fua.d("==", 514);
   protected static final fua.d aA = new fua.d("<=", 515);
   protected static final fua.d aB = new fua.d(">", 516);
   protected static final fua.q aC = new fua.q(true, true);
   protected static final fua.q aD = new fua.q(true, false);
   protected static final fua.q aE = new fua.q(false, true);
   protected static final fua.f aF = new fua.f("no_layering", () -> {
   }, () -> {
   });
   protected static final fua.f aG = new fua.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final fua.f aH = new fua.f("view_offset_z_layering", () -> {
      eqk $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      eqk $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final fua.k aI = new fua.k("main_target", () -> {
   }, () -> {
   });
   protected static final fua.k aJ = new fua.k("outline_target", () -> evr.O().f.s().a(false), () -> evr.O().g().a(false));
   protected static final fua.k aK = new fua.k("translucent_target", () -> {
      if (evr.M()) {
         evr.O().f.t().a(false);
      }
   }, () -> {
      if (evr.M()) {
         evr.O().g().a(false);
      }
   });
   protected static final fua.k aL = new fua.k("particles_target", () -> {
      if (evr.M()) {
         evr.O().f.v().a(false);
      }
   }, () -> {
      if (evr.M()) {
         evr.O().g().a(false);
      }
   });
   protected static final fua.k aM = new fua.k("weather_target", () -> {
      if (evr.M()) {
         evr.O().f.w().a(false);
      }
   }, () -> {
      if (evr.M()) {
         evr.O().g().a(false);
      }
   });
   protected static final fua.k aN = new fua.k("clouds_target", () -> {
      if (evr.M()) {
         evr.O().f.x().a(false);
      }
   }, () -> {
      if (evr.M()) {
         evr.O().g().a(false);
      }
   });
   protected static final fua.k aO = new fua.k("item_entity_target", () -> {
      if (evr.M()) {
         evr.O().f.u().a(false);
      }
   }, () -> {
      if (evr.M()) {
         evr.O().g().a(false);
      }
   });
   protected static final fua.h aP = new fua.h(OptionalDouble.of(1.0));
   protected static final fua.b aQ = new fua.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final fua.b aR = new fua.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public fua(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * evr.O().m.aj().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends fua {
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

   protected static class b extends fua {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends fua.a {
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

   protected static class d extends fua {
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

   protected static class e extends fua {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<ahh> c() {
         return Optional.empty();
      }
   }

   protected static class f extends fua {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends fua.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               evr.O().j.n().c();
            }
         }, () -> {
            if ($$0) {
               evr.O().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends fua {
      private final OptionalDouble aS;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)evr.O().aM().k() / 1920.0F * 2.5F));
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

   protected static class i extends fua.e {
      private final Optional<ahh> aS;

      i(ImmutableList<Triple<ahh, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<ahh, Boolean, Boolean> $$2 = (Triple<ahh, Boolean, Boolean>)var2.next();
               gfc $$3 = evr.O().Y();
               $$3.b((ahh)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (ahh)$$2.getLeft());
            }
         }, () -> {
         });
         this.aS = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<ahh> c() {
         return this.aS;
      }

      public static fua.i.a d() {
         return new fua.i.a();
      }

      public static final class a {
         private final Builder<Triple<ahh, Boolean, Boolean>> a = new Builder();

         public fua.i.a a(ahh $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public fua.i a() {
            return new fua.i(this.a.build());
         }
      }
   }

   protected static final class j extends fua.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends fua {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends fua.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               evr.O().j.o().a();
            }
         }, () -> {
            if ($$0) {
               evr.O().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends fua {
      private final Optional<Supplier<fuh>> aS;

      public m(Supplier<fuh> $$0) {
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

   protected static class n extends fua.e {
      private final Optional<ahh> aS;
      private final boolean aT;
      private final boolean aU;

      public n(ahh $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gfc $$3 = evr.O().Y();
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
      protected Optional<ahh> c() {
         return this.aS;
      }
   }

   protected static class o extends fua {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends fua {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends fua {
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
