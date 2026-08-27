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

public abstract class fol {
   private static final float aS = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aT;
   private final Runnable aU;
   protected static final fol.p c = new fol.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final fol.p d = new fol.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fol.p e = new fol.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fol.p f = new fol.p(
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
   protected static final fol.p g = new fol.p(
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
   protected static final fol.p h = new fol.p(
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
   protected static final fol.m i = new fol.m();
   protected static final fol.m j = new fol.m(fnx::v);
   protected static final fol.m k = new fol.m(fnx::p);
   protected static final fol.m l = new fol.m(fnx::r);
   protected static final fol.m m = new fol.m(fnx::s);
   protected static final fol.m n = new fol.m(fnx::w);
   protected static final fol.m o = new fol.m(fnx::q);
   protected static final fol.m p = new fol.m(fnx::z);
   protected static final fol.m q = new fol.m(fnx::A);
   protected static final fol.m r = new fol.m(fnx::B);
   protected static final fol.m s = new fol.m(fnx::C);
   protected static final fol.m t = new fol.m(fnx::D);
   protected static final fol.m u = new fol.m(fnx::E);
   protected static final fol.m v = new fol.m(fnx::F);
   protected static final fol.m w = new fol.m(fnx::G);
   protected static final fol.m x = new fol.m(fnx::H);
   protected static final fol.m y = new fol.m(fnx::I);
   protected static final fol.m z = new fol.m(fnx::J);
   protected static final fol.m A = new fol.m(fnx::K);
   protected static final fol.m B = new fol.m(fnx::L);
   protected static final fol.m C = new fol.m(fnx::M);
   protected static final fol.m D = new fol.m(fnx::N);
   protected static final fol.m E = new fol.m(fnx::O);
   protected static final fol.m F = new fol.m(fnx::P);
   protected static final fol.m G = new fol.m(fnx::Q);
   protected static final fol.m H = new fol.m(fnx::R);
   protected static final fol.m I = new fol.m(fnx::S);
   protected static final fol.m J = new fol.m(fnx::T);
   protected static final fol.m K = new fol.m(fnx::U);
   protected static final fol.m L = new fol.m(fnx::V);
   protected static final fol.m M = new fol.m(fnx::W);
   protected static final fol.m N = new fol.m(fnx::X);
   protected static final fol.m O = new fol.m(fnx::Y);
   protected static final fol.m P = new fol.m(fnx::Z);
   protected static final fol.m Q = new fol.m(fnx::aa);
   protected static final fol.m R = new fol.m(fnx::ab);
   protected static final fol.m S = new fol.m(fnx::ac);
   protected static final fol.m T = new fol.m(fnx::ad);
   protected static final fol.m U = new fol.m(fnx::ae);
   protected static final fol.m V = new fol.m(fnx::af);
   protected static final fol.m W = new fol.m(fnx::ar);
   protected static final fol.m X = new fol.m(fnx::ag);
   protected static final fol.m Y = new fol.m(fnx::ah);
   protected static final fol.m Z = new fol.m(fnx::ai);
   protected static final fol.m aa = new fol.m(fnx::aj);
   protected static final fol.m ab = new fol.m(fnx::ak);
   protected static final fol.m ac = new fol.m(fnx::al);
   protected static final fol.m ad = new fol.m(fnx::am);
   protected static final fol.m ae = new fol.m(fnx::an);
   protected static final fol.m af = new fol.m(fnx::ao);
   protected static final fol.m ag = new fol.m(fnx::ap);
   protected static final fol.m ah = new fol.m(fnx::aq);
   protected static final fol.m ai = new fol.m(fnx::as);
   protected static final fol.m aj = new fol.m(fnx::at);
   protected static final fol.m ak = new fol.m(fnx::au);
   protected static final fol.m al = new fol.m(fnx::av);
   protected static final fol.n am = new fol.n(fzd.e, false, true);
   protected static final fol.n an = new fol.n(fzd.e, false, false);
   protected static final fol.e ao = new fol.e();
   protected static final fol.o ap = new fol.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final fol.o aq = new fol.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final fol.o ar = new fol.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final fol.g as = new fol.g(true);
   protected static final fol.g at = new fol.g(false);
   protected static final fol.l au = new fol.l(true);
   protected static final fol.l av = new fol.l(false);
   protected static final fol.c aw = new fol.c(true);
   protected static final fol.c ax = new fol.c(false);
   protected static final fol.d ay = new fol.d("always", 519);
   protected static final fol.d az = new fol.d("==", 514);
   protected static final fol.d aA = new fol.d("<=", 515);
   protected static final fol.d aB = new fol.d(">", 516);
   protected static final fol.q aC = new fol.q(true, true);
   protected static final fol.q aD = new fol.q(true, false);
   protected static final fol.q aE = new fol.q(false, true);
   protected static final fol.f aF = new fol.f("no_layering", () -> {
   }, () -> {
   });
   protected static final fol.f aG = new fol.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final fol.f aH = new fol.f("view_offset_z_layering", () -> {
      elp $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      elp $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final fol.k aI = new fol.k("main_target", () -> {
   }, () -> {
   });
   protected static final fol.k aJ = new fol.k("outline_target", () -> eqv.O().f.s().a(false), () -> eqv.O().g().a(false));
   protected static final fol.k aK = new fol.k("translucent_target", () -> {
      if (eqv.M()) {
         eqv.O().f.t().a(false);
      }
   }, () -> {
      if (eqv.M()) {
         eqv.O().g().a(false);
      }
   });
   protected static final fol.k aL = new fol.k("particles_target", () -> {
      if (eqv.M()) {
         eqv.O().f.v().a(false);
      }
   }, () -> {
      if (eqv.M()) {
         eqv.O().g().a(false);
      }
   });
   protected static final fol.k aM = new fol.k("weather_target", () -> {
      if (eqv.M()) {
         eqv.O().f.w().a(false);
      }
   }, () -> {
      if (eqv.M()) {
         eqv.O().g().a(false);
      }
   });
   protected static final fol.k aN = new fol.k("clouds_target", () -> {
      if (eqv.M()) {
         eqv.O().f.x().a(false);
      }
   }, () -> {
      if (eqv.M()) {
         eqv.O().g().a(false);
      }
   });
   protected static final fol.k aO = new fol.k("item_entity_target", () -> {
      if (eqv.M()) {
         eqv.O().f.u().a(false);
      }
   }, () -> {
      if (eqv.M()) {
         eqv.O().g().a(false);
      }
   });
   protected static final fol.h aP = new fol.h(OptionalDouble.of(1.0));
   protected static final fol.b aQ = new fol.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final fol.b aR = new fol.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public fol(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * eqv.O().m.ai().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends fol {
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

   protected static class b extends fol {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends fol.a {
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

   protected static class d extends fol {
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

   protected static class e extends fol {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<aex> c() {
         return Optional.empty();
      }
   }

   protected static class f extends fol {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends fol.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               eqv.O().j.n().c();
            }
         }, () -> {
            if ($$0) {
               eqv.O().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends fol {
      private final OptionalDouble aS;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)eqv.O().aM().k() / 1920.0F * 2.5F));
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

   protected static class i extends fol.e {
      private final Optional<aex> aS;

      i(ImmutableList<Triple<aex, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<aex, Boolean, Boolean> $$2 = (Triple<aex, Boolean, Boolean>)var2.next();
               fzf $$3 = eqv.O().Y();
               $$3.b((aex)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (aex)$$2.getLeft());
            }
         }, () -> {
         });
         this.aS = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<aex> c() {
         return this.aS;
      }

      public static fol.i.a d() {
         return new fol.i.a();
      }

      public static final class a {
         private final Builder<Triple<aex, Boolean, Boolean>> a = new Builder();

         public fol.i.a a(aex $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public fol.i a() {
            return new fol.i(this.a.build());
         }
      }
   }

   protected static final class j extends fol.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends fol {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends fol.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               eqv.O().j.o().a();
            }
         }, () -> {
            if ($$0) {
               eqv.O().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends fol {
      private final Optional<Supplier<fos>> aS;

      public m(Supplier<fos> $$0) {
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

   protected static class n extends fol.e {
      private final Optional<aex> aS;
      private final boolean aT;
      private final boolean aU;

      public n(aex $$0, boolean $$1, boolean $$2) {
         super(() -> {
            fzf $$3 = eqv.O().Y();
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
      protected Optional<aex> c() {
         return this.aS;
      }
   }

   protected static class o extends fol {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends fol {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends fol {
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
