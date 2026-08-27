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

public abstract class fpi {
   private static final float aS = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aT;
   private final Runnable aU;
   protected static final fpi.p c = new fpi.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final fpi.p d = new fpi.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fpi.p e = new fpi.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fpi.p f = new fpi.p(
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
   protected static final fpi.p g = new fpi.p(
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
   protected static final fpi.p h = new fpi.p(
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
   protected static final fpi.m i = new fpi.m();
   protected static final fpi.m j = new fpi.m(fou::v);
   protected static final fpi.m k = new fpi.m(fou::p);
   protected static final fpi.m l = new fpi.m(fou::r);
   protected static final fpi.m m = new fpi.m(fou::s);
   protected static final fpi.m n = new fpi.m(fou::w);
   protected static final fpi.m o = new fpi.m(fou::q);
   protected static final fpi.m p = new fpi.m(fou::z);
   protected static final fpi.m q = new fpi.m(fou::A);
   protected static final fpi.m r = new fpi.m(fou::B);
   protected static final fpi.m s = new fpi.m(fou::C);
   protected static final fpi.m t = new fpi.m(fou::D);
   protected static final fpi.m u = new fpi.m(fou::E);
   protected static final fpi.m v = new fpi.m(fou::F);
   protected static final fpi.m w = new fpi.m(fou::G);
   protected static final fpi.m x = new fpi.m(fou::H);
   protected static final fpi.m y = new fpi.m(fou::I);
   protected static final fpi.m z = new fpi.m(fou::J);
   protected static final fpi.m A = new fpi.m(fou::K);
   protected static final fpi.m B = new fpi.m(fou::L);
   protected static final fpi.m C = new fpi.m(fou::M);
   protected static final fpi.m D = new fpi.m(fou::N);
   protected static final fpi.m E = new fpi.m(fou::O);
   protected static final fpi.m F = new fpi.m(fou::P);
   protected static final fpi.m G = new fpi.m(fou::Q);
   protected static final fpi.m H = new fpi.m(fou::R);
   protected static final fpi.m I = new fpi.m(fou::S);
   protected static final fpi.m J = new fpi.m(fou::T);
   protected static final fpi.m K = new fpi.m(fou::U);
   protected static final fpi.m L = new fpi.m(fou::V);
   protected static final fpi.m M = new fpi.m(fou::W);
   protected static final fpi.m N = new fpi.m(fou::X);
   protected static final fpi.m O = new fpi.m(fou::Y);
   protected static final fpi.m P = new fpi.m(fou::Z);
   protected static final fpi.m Q = new fpi.m(fou::aa);
   protected static final fpi.m R = new fpi.m(fou::ab);
   protected static final fpi.m S = new fpi.m(fou::ac);
   protected static final fpi.m T = new fpi.m(fou::ad);
   protected static final fpi.m U = new fpi.m(fou::ae);
   protected static final fpi.m V = new fpi.m(fou::af);
   protected static final fpi.m W = new fpi.m(fou::ar);
   protected static final fpi.m X = new fpi.m(fou::ag);
   protected static final fpi.m Y = new fpi.m(fou::ah);
   protected static final fpi.m Z = new fpi.m(fou::ai);
   protected static final fpi.m aa = new fpi.m(fou::aj);
   protected static final fpi.m ab = new fpi.m(fou::ak);
   protected static final fpi.m ac = new fpi.m(fou::al);
   protected static final fpi.m ad = new fpi.m(fou::am);
   protected static final fpi.m ae = new fpi.m(fou::an);
   protected static final fpi.m af = new fpi.m(fou::ao);
   protected static final fpi.m ag = new fpi.m(fou::ap);
   protected static final fpi.m ah = new fpi.m(fou::aq);
   protected static final fpi.m ai = new fpi.m(fou::as);
   protected static final fpi.m aj = new fpi.m(fou::at);
   protected static final fpi.m ak = new fpi.m(fou::au);
   protected static final fpi.m al = new fpi.m(fou::av);
   protected static final fpi.n am = new fpi.n(fzz.e, false, true);
   protected static final fpi.n an = new fpi.n(fzz.e, false, false);
   protected static final fpi.e ao = new fpi.e();
   protected static final fpi.o ap = new fpi.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final fpi.o aq = new fpi.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final fpi.o ar = new fpi.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final fpi.g as = new fpi.g(true);
   protected static final fpi.g at = new fpi.g(false);
   protected static final fpi.l au = new fpi.l(true);
   protected static final fpi.l av = new fpi.l(false);
   protected static final fpi.c aw = new fpi.c(true);
   protected static final fpi.c ax = new fpi.c(false);
   protected static final fpi.d ay = new fpi.d("always", 519);
   protected static final fpi.d az = new fpi.d("==", 514);
   protected static final fpi.d aA = new fpi.d("<=", 515);
   protected static final fpi.d aB = new fpi.d(">", 516);
   protected static final fpi.q aC = new fpi.q(true, true);
   protected static final fpi.q aD = new fpi.q(true, false);
   protected static final fpi.q aE = new fpi.q(false, true);
   protected static final fpi.f aF = new fpi.f("no_layering", () -> {
   }, () -> {
   });
   protected static final fpi.f aG = new fpi.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final fpi.f aH = new fpi.f("view_offset_z_layering", () -> {
      emh $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      emh $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final fpi.k aI = new fpi.k("main_target", () -> {
   }, () -> {
   });
   protected static final fpi.k aJ = new fpi.k("outline_target", () -> ero.O().f.s().a(false), () -> ero.O().g().a(false));
   protected static final fpi.k aK = new fpi.k("translucent_target", () -> {
      if (ero.M()) {
         ero.O().f.t().a(false);
      }
   }, () -> {
      if (ero.M()) {
         ero.O().g().a(false);
      }
   });
   protected static final fpi.k aL = new fpi.k("particles_target", () -> {
      if (ero.M()) {
         ero.O().f.v().a(false);
      }
   }, () -> {
      if (ero.M()) {
         ero.O().g().a(false);
      }
   });
   protected static final fpi.k aM = new fpi.k("weather_target", () -> {
      if (ero.M()) {
         ero.O().f.w().a(false);
      }
   }, () -> {
      if (ero.M()) {
         ero.O().g().a(false);
      }
   });
   protected static final fpi.k aN = new fpi.k("clouds_target", () -> {
      if (ero.M()) {
         ero.O().f.x().a(false);
      }
   }, () -> {
      if (ero.M()) {
         ero.O().g().a(false);
      }
   });
   protected static final fpi.k aO = new fpi.k("item_entity_target", () -> {
      if (ero.M()) {
         ero.O().f.u().a(false);
      }
   }, () -> {
      if (ero.M()) {
         ero.O().g().a(false);
      }
   });
   protected static final fpi.h aP = new fpi.h(OptionalDouble.of(1.0));
   protected static final fpi.b aQ = new fpi.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final fpi.b aR = new fpi.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public fpi(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * ero.O().m.ai().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends fpi {
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

   protected static class b extends fpi {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends fpi.a {
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

   protected static class d extends fpi {
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

   protected static class e extends fpi {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<afw> c() {
         return Optional.empty();
      }
   }

   protected static class f extends fpi {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends fpi.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               ero.O().j.n().c();
            }
         }, () -> {
            if ($$0) {
               ero.O().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends fpi {
      private final OptionalDouble aS;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)ero.O().aM().k() / 1920.0F * 2.5F));
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

   protected static class i extends fpi.e {
      private final Optional<afw> aS;

      i(ImmutableList<Triple<afw, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<afw, Boolean, Boolean> $$2 = (Triple<afw, Boolean, Boolean>)var2.next();
               gab $$3 = ero.O().Y();
               $$3.b((afw)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (afw)$$2.getLeft());
            }
         }, () -> {
         });
         this.aS = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<afw> c() {
         return this.aS;
      }

      public static fpi.i.a d() {
         return new fpi.i.a();
      }

      public static final class a {
         private final Builder<Triple<afw, Boolean, Boolean>> a = new Builder();

         public fpi.i.a a(afw $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public fpi.i a() {
            return new fpi.i(this.a.build());
         }
      }
   }

   protected static final class j extends fpi.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends fpi {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends fpi.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               ero.O().j.o().a();
            }
         }, () -> {
            if ($$0) {
               ero.O().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends fpi {
      private final Optional<Supplier<fpo>> aS;

      public m(Supplier<fpo> $$0) {
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

   protected static class n extends fpi.e {
      private final Optional<afw> aS;
      private final boolean aT;
      private final boolean aU;

      public n(afw $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gab $$3 = ero.O().Y();
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
      protected Optional<afw> c() {
         return this.aS;
      }
   }

   protected static class o extends fpi {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends fpi {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends fpi {
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
