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

public abstract class fns {
   private static final float aS = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aT;
   private final Runnable aU;
   protected static final fns.p c = new fns.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final fns.p d = new fns.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fns.p e = new fns.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fns.p f = new fns.p(
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
   protected static final fns.p g = new fns.p(
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
   protected static final fns.p h = new fns.p(
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
   protected static final fns.m i = new fns.m();
   protected static final fns.m j = new fns.m(fne::v);
   protected static final fns.m k = new fns.m(fne::p);
   protected static final fns.m l = new fns.m(fne::r);
   protected static final fns.m m = new fns.m(fne::s);
   protected static final fns.m n = new fns.m(fne::w);
   protected static final fns.m o = new fns.m(fne::q);
   protected static final fns.m p = new fns.m(fne::z);
   protected static final fns.m q = new fns.m(fne::A);
   protected static final fns.m r = new fns.m(fne::B);
   protected static final fns.m s = new fns.m(fne::C);
   protected static final fns.m t = new fns.m(fne::D);
   protected static final fns.m u = new fns.m(fne::E);
   protected static final fns.m v = new fns.m(fne::F);
   protected static final fns.m w = new fns.m(fne::G);
   protected static final fns.m x = new fns.m(fne::H);
   protected static final fns.m y = new fns.m(fne::I);
   protected static final fns.m z = new fns.m(fne::J);
   protected static final fns.m A = new fns.m(fne::K);
   protected static final fns.m B = new fns.m(fne::L);
   protected static final fns.m C = new fns.m(fne::M);
   protected static final fns.m D = new fns.m(fne::N);
   protected static final fns.m E = new fns.m(fne::O);
   protected static final fns.m F = new fns.m(fne::P);
   protected static final fns.m G = new fns.m(fne::Q);
   protected static final fns.m H = new fns.m(fne::R);
   protected static final fns.m I = new fns.m(fne::S);
   protected static final fns.m J = new fns.m(fne::T);
   protected static final fns.m K = new fns.m(fne::U);
   protected static final fns.m L = new fns.m(fne::V);
   protected static final fns.m M = new fns.m(fne::W);
   protected static final fns.m N = new fns.m(fne::X);
   protected static final fns.m O = new fns.m(fne::Y);
   protected static final fns.m P = new fns.m(fne::Z);
   protected static final fns.m Q = new fns.m(fne::aa);
   protected static final fns.m R = new fns.m(fne::ab);
   protected static final fns.m S = new fns.m(fne::ac);
   protected static final fns.m T = new fns.m(fne::ad);
   protected static final fns.m U = new fns.m(fne::ae);
   protected static final fns.m V = new fns.m(fne::af);
   protected static final fns.m W = new fns.m(fne::ar);
   protected static final fns.m X = new fns.m(fne::ag);
   protected static final fns.m Y = new fns.m(fne::ah);
   protected static final fns.m Z = new fns.m(fne::ai);
   protected static final fns.m aa = new fns.m(fne::aj);
   protected static final fns.m ab = new fns.m(fne::ak);
   protected static final fns.m ac = new fns.m(fne::al);
   protected static final fns.m ad = new fns.m(fne::am);
   protected static final fns.m ae = new fns.m(fne::an);
   protected static final fns.m af = new fns.m(fne::ao);
   protected static final fns.m ag = new fns.m(fne::ap);
   protected static final fns.m ah = new fns.m(fne::aq);
   protected static final fns.m ai = new fns.m(fne::as);
   protected static final fns.m aj = new fns.m(fne::at);
   protected static final fns.m ak = new fns.m(fne::au);
   protected static final fns.m al = new fns.m(fne::av);
   protected static final fns.n am = new fns.n(fyk.e, false, true);
   protected static final fns.n an = new fns.n(fyk.e, false, false);
   protected static final fns.e ao = new fns.e();
   protected static final fns.o ap = new fns.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final fns.o aq = new fns.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final fns.o ar = new fns.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final fns.g as = new fns.g(true);
   protected static final fns.g at = new fns.g(false);
   protected static final fns.l au = new fns.l(true);
   protected static final fns.l av = new fns.l(false);
   protected static final fns.c aw = new fns.c(true);
   protected static final fns.c ax = new fns.c(false);
   protected static final fns.d ay = new fns.d("always", 519);
   protected static final fns.d az = new fns.d("==", 514);
   protected static final fns.d aA = new fns.d("<=", 515);
   protected static final fns.d aB = new fns.d(">", 516);
   protected static final fns.q aC = new fns.q(true, true);
   protected static final fns.q aD = new fns.q(true, false);
   protected static final fns.q aE = new fns.q(false, true);
   protected static final fns.f aF = new fns.f("no_layering", () -> {
   }, () -> {
   });
   protected static final fns.f aG = new fns.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final fns.f aH = new fns.f("view_offset_z_layering", () -> {
      elg $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      elg $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final fns.k aI = new fns.k("main_target", () -> {
   }, () -> {
   });
   protected static final fns.k aJ = new fns.k("outline_target", () -> eqm.O().f.s().a(false), () -> eqm.O().g().a(false));
   protected static final fns.k aK = new fns.k("translucent_target", () -> {
      if (eqm.M()) {
         eqm.O().f.t().a(false);
      }
   }, () -> {
      if (eqm.M()) {
         eqm.O().g().a(false);
      }
   });
   protected static final fns.k aL = new fns.k("particles_target", () -> {
      if (eqm.M()) {
         eqm.O().f.v().a(false);
      }
   }, () -> {
      if (eqm.M()) {
         eqm.O().g().a(false);
      }
   });
   protected static final fns.k aM = new fns.k("weather_target", () -> {
      if (eqm.M()) {
         eqm.O().f.w().a(false);
      }
   }, () -> {
      if (eqm.M()) {
         eqm.O().g().a(false);
      }
   });
   protected static final fns.k aN = new fns.k("clouds_target", () -> {
      if (eqm.M()) {
         eqm.O().f.x().a(false);
      }
   }, () -> {
      if (eqm.M()) {
         eqm.O().g().a(false);
      }
   });
   protected static final fns.k aO = new fns.k("item_entity_target", () -> {
      if (eqm.M()) {
         eqm.O().f.u().a(false);
      }
   }, () -> {
      if (eqm.M()) {
         eqm.O().g().a(false);
      }
   });
   protected static final fns.h aP = new fns.h(OptionalDouble.of(1.0));
   protected static final fns.b aQ = new fns.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final fns.b aR = new fns.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public fns(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * eqm.O().m.ah().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends fns {
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

   protected static class b extends fns {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends fns.a {
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

   protected static class d extends fns {
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

   protected static class e extends fns {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<aer> c() {
         return Optional.empty();
      }
   }

   protected static class f extends fns {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends fns.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               eqm.O().j.n().c();
            }
         }, () -> {
            if ($$0) {
               eqm.O().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends fns {
      private final OptionalDouble aS;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)eqm.O().aN().k() / 1920.0F * 2.5F));
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

   protected static class i extends fns.e {
      private final Optional<aer> aS;

      i(ImmutableList<Triple<aer, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<aer, Boolean, Boolean> $$2 = (Triple<aer, Boolean, Boolean>)var2.next();
               fym $$3 = eqm.O().Y();
               $$3.b((aer)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (aer)$$2.getLeft());
            }
         }, () -> {
         });
         this.aS = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<aer> c() {
         return this.aS;
      }

      public static fns.i.a d() {
         return new fns.i.a();
      }

      public static final class a {
         private final Builder<Triple<aer, Boolean, Boolean>> a = new Builder();

         public fns.i.a a(aer $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public fns.i a() {
            return new fns.i(this.a.build());
         }
      }
   }

   protected static final class j extends fns.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends fns {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends fns.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               eqm.O().j.o().a();
            }
         }, () -> {
            if ($$0) {
               eqm.O().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends fns {
      private final Optional<Supplier<fny>> aS;

      public m(Supplier<fny> $$0) {
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

   protected static class n extends fns.e {
      private final Optional<aer> aS;
      private final boolean aT;
      private final boolean aU;

      public n(aer $$0, boolean $$1, boolean $$2) {
         super(() -> {
            fym $$3 = eqm.O().Y();
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
      protected Optional<aer> c() {
         return this.aS;
      }
   }

   protected static class o extends fns {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends fns {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends fns {
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
