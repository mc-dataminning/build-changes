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

public abstract class fnn {
   private static final float aS = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aT;
   private final Runnable aU;
   protected static final fnn.p c = new fnn.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final fnn.p d = new fnn.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fnn.p e = new fnn.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fnn.p f = new fnn.p(
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
   protected static final fnn.p g = new fnn.p(
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
   protected static final fnn.p h = new fnn.p(
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
   protected static final fnn.m i = new fnn.m();
   protected static final fnn.m j = new fnn.m(fmz::v);
   protected static final fnn.m k = new fnn.m(fmz::p);
   protected static final fnn.m l = new fnn.m(fmz::r);
   protected static final fnn.m m = new fnn.m(fmz::s);
   protected static final fnn.m n = new fnn.m(fmz::w);
   protected static final fnn.m o = new fnn.m(fmz::q);
   protected static final fnn.m p = new fnn.m(fmz::z);
   protected static final fnn.m q = new fnn.m(fmz::A);
   protected static final fnn.m r = new fnn.m(fmz::B);
   protected static final fnn.m s = new fnn.m(fmz::C);
   protected static final fnn.m t = new fnn.m(fmz::D);
   protected static final fnn.m u = new fnn.m(fmz::E);
   protected static final fnn.m v = new fnn.m(fmz::F);
   protected static final fnn.m w = new fnn.m(fmz::G);
   protected static final fnn.m x = new fnn.m(fmz::H);
   protected static final fnn.m y = new fnn.m(fmz::I);
   protected static final fnn.m z = new fnn.m(fmz::J);
   protected static final fnn.m A = new fnn.m(fmz::K);
   protected static final fnn.m B = new fnn.m(fmz::L);
   protected static final fnn.m C = new fnn.m(fmz::M);
   protected static final fnn.m D = new fnn.m(fmz::N);
   protected static final fnn.m E = new fnn.m(fmz::O);
   protected static final fnn.m F = new fnn.m(fmz::P);
   protected static final fnn.m G = new fnn.m(fmz::Q);
   protected static final fnn.m H = new fnn.m(fmz::R);
   protected static final fnn.m I = new fnn.m(fmz::S);
   protected static final fnn.m J = new fnn.m(fmz::T);
   protected static final fnn.m K = new fnn.m(fmz::U);
   protected static final fnn.m L = new fnn.m(fmz::V);
   protected static final fnn.m M = new fnn.m(fmz::W);
   protected static final fnn.m N = new fnn.m(fmz::X);
   protected static final fnn.m O = new fnn.m(fmz::Y);
   protected static final fnn.m P = new fnn.m(fmz::Z);
   protected static final fnn.m Q = new fnn.m(fmz::aa);
   protected static final fnn.m R = new fnn.m(fmz::ab);
   protected static final fnn.m S = new fnn.m(fmz::ac);
   protected static final fnn.m T = new fnn.m(fmz::ad);
   protected static final fnn.m U = new fnn.m(fmz::ae);
   protected static final fnn.m V = new fnn.m(fmz::af);
   protected static final fnn.m W = new fnn.m(fmz::ar);
   protected static final fnn.m X = new fnn.m(fmz::ag);
   protected static final fnn.m Y = new fnn.m(fmz::ah);
   protected static final fnn.m Z = new fnn.m(fmz::ai);
   protected static final fnn.m aa = new fnn.m(fmz::aj);
   protected static final fnn.m ab = new fnn.m(fmz::ak);
   protected static final fnn.m ac = new fnn.m(fmz::al);
   protected static final fnn.m ad = new fnn.m(fmz::am);
   protected static final fnn.m ae = new fnn.m(fmz::an);
   protected static final fnn.m af = new fnn.m(fmz::ao);
   protected static final fnn.m ag = new fnn.m(fmz::ap);
   protected static final fnn.m ah = new fnn.m(fmz::aq);
   protected static final fnn.m ai = new fnn.m(fmz::as);
   protected static final fnn.m aj = new fnn.m(fmz::at);
   protected static final fnn.m ak = new fnn.m(fmz::au);
   protected static final fnn.m al = new fnn.m(fmz::av);
   protected static final fnn.n am = new fnn.n(fyf.e, false, true);
   protected static final fnn.n an = new fnn.n(fyf.e, false, false);
   protected static final fnn.e ao = new fnn.e();
   protected static final fnn.o ap = new fnn.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final fnn.o aq = new fnn.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final fnn.o ar = new fnn.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final fnn.g as = new fnn.g(true);
   protected static final fnn.g at = new fnn.g(false);
   protected static final fnn.l au = new fnn.l(true);
   protected static final fnn.l av = new fnn.l(false);
   protected static final fnn.c aw = new fnn.c(true);
   protected static final fnn.c ax = new fnn.c(false);
   protected static final fnn.d ay = new fnn.d("always", 519);
   protected static final fnn.d az = new fnn.d("==", 514);
   protected static final fnn.d aA = new fnn.d("<=", 515);
   protected static final fnn.d aB = new fnn.d(">", 516);
   protected static final fnn.q aC = new fnn.q(true, true);
   protected static final fnn.q aD = new fnn.q(true, false);
   protected static final fnn.q aE = new fnn.q(false, true);
   protected static final fnn.f aF = new fnn.f("no_layering", () -> {
   }, () -> {
   });
   protected static final fnn.f aG = new fnn.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final fnn.f aH = new fnn.f("view_offset_z_layering", () -> {
      elh $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      elh $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final fnn.k aI = new fnn.k("main_target", () -> {
   }, () -> {
   });
   protected static final fnn.k aJ = new fnn.k("outline_target", () -> eqn.N().f.s().a(false), () -> eqn.N().f().a(false));
   protected static final fnn.k aK = new fnn.k("translucent_target", () -> {
      if (eqn.L()) {
         eqn.N().f.t().a(false);
      }
   }, () -> {
      if (eqn.L()) {
         eqn.N().f().a(false);
      }
   });
   protected static final fnn.k aL = new fnn.k("particles_target", () -> {
      if (eqn.L()) {
         eqn.N().f.v().a(false);
      }
   }, () -> {
      if (eqn.L()) {
         eqn.N().f().a(false);
      }
   });
   protected static final fnn.k aM = new fnn.k("weather_target", () -> {
      if (eqn.L()) {
         eqn.N().f.w().a(false);
      }
   }, () -> {
      if (eqn.L()) {
         eqn.N().f().a(false);
      }
   });
   protected static final fnn.k aN = new fnn.k("clouds_target", () -> {
      if (eqn.L()) {
         eqn.N().f.x().a(false);
      }
   }, () -> {
      if (eqn.L()) {
         eqn.N().f().a(false);
      }
   });
   protected static final fnn.k aO = new fnn.k("item_entity_target", () -> {
      if (eqn.L()) {
         eqn.N().f.u().a(false);
      }
   }, () -> {
      if (eqn.L()) {
         eqn.N().f().a(false);
      }
   });
   protected static final fnn.h aP = new fnn.h(OptionalDouble.of(1.0));
   protected static final fnn.b aQ = new fnn.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final fnn.b aR = new fnn.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public fnn(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * eqn.N().m.ah().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends fnn {
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

   protected static class b extends fnn {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends fnn.a {
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

   protected static class d extends fnn {
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

   protected static class e extends fnn {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<aep> c() {
         return Optional.empty();
      }
   }

   protected static class f extends fnn {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends fnn.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               eqn.N().j.n().c();
            }
         }, () -> {
            if ($$0) {
               eqn.N().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends fnn {
      private final OptionalDouble aS;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)eqn.N().aM().k() / 1920.0F * 2.5F));
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

   protected static class i extends fnn.e {
      private final Optional<aep> aS;

      i(ImmutableList<Triple<aep, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<aep, Boolean, Boolean> $$2 = (Triple<aep, Boolean, Boolean>)var2.next();
               fyh $$3 = eqn.N().X();
               $$3.b((aep)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (aep)$$2.getLeft());
            }
         }, () -> {
         });
         this.aS = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<aep> c() {
         return this.aS;
      }

      public static fnn.i.a d() {
         return new fnn.i.a();
      }

      public static final class a {
         private final Builder<Triple<aep, Boolean, Boolean>> a = new Builder();

         public fnn.i.a a(aep $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public fnn.i a() {
            return new fnn.i(this.a.build());
         }
      }
   }

   protected static final class j extends fnn.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends fnn {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends fnn.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               eqn.N().j.o().a();
            }
         }, () -> {
            if ($$0) {
               eqn.N().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends fnn {
      private final Optional<Supplier<fnt>> aS;

      public m(Supplier<fnt> $$0) {
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

   protected static class n extends fnn.e {
      private final Optional<aep> aS;
      private final boolean aT;
      private final boolean aU;

      public n(aep $$0, boolean $$1, boolean $$2) {
         super(() -> {
            fyh $$3 = eqn.N().X();
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
      protected Optional<aep> c() {
         return this.aS;
      }
   }

   protected static class o extends fnn {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends fnn {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends fnn {
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
