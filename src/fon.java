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

public abstract class fon {
   private static final float aS = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aT;
   private final Runnable aU;
   protected static final fon.p c = new fon.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final fon.p d = new fon.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fon.p e = new fon.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fon.p f = new fon.p(
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
   protected static final fon.p g = new fon.p(
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
   protected static final fon.p h = new fon.p(
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
   protected static final fon.m i = new fon.m();
   protected static final fon.m j = new fon.m(fnz::v);
   protected static final fon.m k = new fon.m(fnz::p);
   protected static final fon.m l = new fon.m(fnz::r);
   protected static final fon.m m = new fon.m(fnz::s);
   protected static final fon.m n = new fon.m(fnz::w);
   protected static final fon.m o = new fon.m(fnz::q);
   protected static final fon.m p = new fon.m(fnz::z);
   protected static final fon.m q = new fon.m(fnz::A);
   protected static final fon.m r = new fon.m(fnz::B);
   protected static final fon.m s = new fon.m(fnz::C);
   protected static final fon.m t = new fon.m(fnz::D);
   protected static final fon.m u = new fon.m(fnz::E);
   protected static final fon.m v = new fon.m(fnz::F);
   protected static final fon.m w = new fon.m(fnz::G);
   protected static final fon.m x = new fon.m(fnz::H);
   protected static final fon.m y = new fon.m(fnz::I);
   protected static final fon.m z = new fon.m(fnz::J);
   protected static final fon.m A = new fon.m(fnz::K);
   protected static final fon.m B = new fon.m(fnz::L);
   protected static final fon.m C = new fon.m(fnz::M);
   protected static final fon.m D = new fon.m(fnz::N);
   protected static final fon.m E = new fon.m(fnz::O);
   protected static final fon.m F = new fon.m(fnz::P);
   protected static final fon.m G = new fon.m(fnz::Q);
   protected static final fon.m H = new fon.m(fnz::R);
   protected static final fon.m I = new fon.m(fnz::S);
   protected static final fon.m J = new fon.m(fnz::T);
   protected static final fon.m K = new fon.m(fnz::U);
   protected static final fon.m L = new fon.m(fnz::V);
   protected static final fon.m M = new fon.m(fnz::W);
   protected static final fon.m N = new fon.m(fnz::X);
   protected static final fon.m O = new fon.m(fnz::Y);
   protected static final fon.m P = new fon.m(fnz::Z);
   protected static final fon.m Q = new fon.m(fnz::aa);
   protected static final fon.m R = new fon.m(fnz::ab);
   protected static final fon.m S = new fon.m(fnz::ac);
   protected static final fon.m T = new fon.m(fnz::ad);
   protected static final fon.m U = new fon.m(fnz::ae);
   protected static final fon.m V = new fon.m(fnz::af);
   protected static final fon.m W = new fon.m(fnz::ar);
   protected static final fon.m X = new fon.m(fnz::ag);
   protected static final fon.m Y = new fon.m(fnz::ah);
   protected static final fon.m Z = new fon.m(fnz::ai);
   protected static final fon.m aa = new fon.m(fnz::aj);
   protected static final fon.m ab = new fon.m(fnz::ak);
   protected static final fon.m ac = new fon.m(fnz::al);
   protected static final fon.m ad = new fon.m(fnz::am);
   protected static final fon.m ae = new fon.m(fnz::an);
   protected static final fon.m af = new fon.m(fnz::ao);
   protected static final fon.m ag = new fon.m(fnz::ap);
   protected static final fon.m ah = new fon.m(fnz::aq);
   protected static final fon.m ai = new fon.m(fnz::as);
   protected static final fon.m aj = new fon.m(fnz::at);
   protected static final fon.m ak = new fon.m(fnz::au);
   protected static final fon.m al = new fon.m(fnz::av);
   protected static final fon.n am = new fon.n(fzf.e, false, true);
   protected static final fon.n an = new fon.n(fzf.e, false, false);
   protected static final fon.e ao = new fon.e();
   protected static final fon.o ap = new fon.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final fon.o aq = new fon.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final fon.o ar = new fon.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final fon.g as = new fon.g(true);
   protected static final fon.g at = new fon.g(false);
   protected static final fon.l au = new fon.l(true);
   protected static final fon.l av = new fon.l(false);
   protected static final fon.c aw = new fon.c(true);
   protected static final fon.c ax = new fon.c(false);
   protected static final fon.d ay = new fon.d("always", 519);
   protected static final fon.d az = new fon.d("==", 514);
   protected static final fon.d aA = new fon.d("<=", 515);
   protected static final fon.d aB = new fon.d(">", 516);
   protected static final fon.q aC = new fon.q(true, true);
   protected static final fon.q aD = new fon.q(true, false);
   protected static final fon.q aE = new fon.q(false, true);
   protected static final fon.f aF = new fon.f("no_layering", () -> {
   }, () -> {
   });
   protected static final fon.f aG = new fon.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final fon.f aH = new fon.f("view_offset_z_layering", () -> {
      elr $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      elr $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final fon.k aI = new fon.k("main_target", () -> {
   }, () -> {
   });
   protected static final fon.k aJ = new fon.k("outline_target", () -> eqx.O().f.s().a(false), () -> eqx.O().g().a(false));
   protected static final fon.k aK = new fon.k("translucent_target", () -> {
      if (eqx.M()) {
         eqx.O().f.t().a(false);
      }
   }, () -> {
      if (eqx.M()) {
         eqx.O().g().a(false);
      }
   });
   protected static final fon.k aL = new fon.k("particles_target", () -> {
      if (eqx.M()) {
         eqx.O().f.v().a(false);
      }
   }, () -> {
      if (eqx.M()) {
         eqx.O().g().a(false);
      }
   });
   protected static final fon.k aM = new fon.k("weather_target", () -> {
      if (eqx.M()) {
         eqx.O().f.w().a(false);
      }
   }, () -> {
      if (eqx.M()) {
         eqx.O().g().a(false);
      }
   });
   protected static final fon.k aN = new fon.k("clouds_target", () -> {
      if (eqx.M()) {
         eqx.O().f.x().a(false);
      }
   }, () -> {
      if (eqx.M()) {
         eqx.O().g().a(false);
      }
   });
   protected static final fon.k aO = new fon.k("item_entity_target", () -> {
      if (eqx.M()) {
         eqx.O().f.u().a(false);
      }
   }, () -> {
      if (eqx.M()) {
         eqx.O().g().a(false);
      }
   });
   protected static final fon.h aP = new fon.h(OptionalDouble.of(1.0));
   protected static final fon.b aQ = new fon.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final fon.b aR = new fon.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public fon(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * eqx.O().m.ai().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends fon {
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

   protected static class b extends fon {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends fon.a {
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

   protected static class d extends fon {
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

   protected static class e extends fon {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<aey> c() {
         return Optional.empty();
      }
   }

   protected static class f extends fon {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends fon.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               eqx.O().j.n().c();
            }
         }, () -> {
            if ($$0) {
               eqx.O().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends fon {
      private final OptionalDouble aS;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)eqx.O().aM().k() / 1920.0F * 2.5F));
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

   protected static class i extends fon.e {
      private final Optional<aey> aS;

      i(ImmutableList<Triple<aey, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<aey, Boolean, Boolean> $$2 = (Triple<aey, Boolean, Boolean>)var2.next();
               fzh $$3 = eqx.O().Y();
               $$3.b((aey)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (aey)$$2.getLeft());
            }
         }, () -> {
         });
         this.aS = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<aey> c() {
         return this.aS;
      }

      public static fon.i.a d() {
         return new fon.i.a();
      }

      public static final class a {
         private final Builder<Triple<aey, Boolean, Boolean>> a = new Builder();

         public fon.i.a a(aey $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public fon.i a() {
            return new fon.i(this.a.build());
         }
      }
   }

   protected static final class j extends fon.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends fon {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends fon.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               eqx.O().j.o().a();
            }
         }, () -> {
            if ($$0) {
               eqx.O().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends fon {
      private final Optional<Supplier<fou>> aS;

      public m(Supplier<fou> $$0) {
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

   protected static class n extends fon.e {
      private final Optional<aey> aS;
      private final boolean aT;
      private final boolean aU;

      public n(aey $$0, boolean $$1, boolean $$2) {
         super(() -> {
            fzh $$3 = eqx.O().Y();
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
      protected Optional<aey> c() {
         return this.aS;
      }
   }

   protected static class o extends fon {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends fon {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends fon {
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
