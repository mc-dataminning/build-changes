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

public abstract class fog {
   private static final float aS = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aT;
   private final Runnable aU;
   protected static final fog.p c = new fog.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final fog.p d = new fog.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fog.p e = new fog.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fog.p f = new fog.p(
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
   protected static final fog.p g = new fog.p(
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
   protected static final fog.p h = new fog.p(
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
   protected static final fog.m i = new fog.m();
   protected static final fog.m j = new fog.m(fns::v);
   protected static final fog.m k = new fog.m(fns::p);
   protected static final fog.m l = new fog.m(fns::r);
   protected static final fog.m m = new fog.m(fns::s);
   protected static final fog.m n = new fog.m(fns::w);
   protected static final fog.m o = new fog.m(fns::q);
   protected static final fog.m p = new fog.m(fns::z);
   protected static final fog.m q = new fog.m(fns::A);
   protected static final fog.m r = new fog.m(fns::B);
   protected static final fog.m s = new fog.m(fns::C);
   protected static final fog.m t = new fog.m(fns::D);
   protected static final fog.m u = new fog.m(fns::E);
   protected static final fog.m v = new fog.m(fns::F);
   protected static final fog.m w = new fog.m(fns::G);
   protected static final fog.m x = new fog.m(fns::H);
   protected static final fog.m y = new fog.m(fns::I);
   protected static final fog.m z = new fog.m(fns::J);
   protected static final fog.m A = new fog.m(fns::K);
   protected static final fog.m B = new fog.m(fns::L);
   protected static final fog.m C = new fog.m(fns::M);
   protected static final fog.m D = new fog.m(fns::N);
   protected static final fog.m E = new fog.m(fns::O);
   protected static final fog.m F = new fog.m(fns::P);
   protected static final fog.m G = new fog.m(fns::Q);
   protected static final fog.m H = new fog.m(fns::R);
   protected static final fog.m I = new fog.m(fns::S);
   protected static final fog.m J = new fog.m(fns::T);
   protected static final fog.m K = new fog.m(fns::U);
   protected static final fog.m L = new fog.m(fns::V);
   protected static final fog.m M = new fog.m(fns::W);
   protected static final fog.m N = new fog.m(fns::X);
   protected static final fog.m O = new fog.m(fns::Y);
   protected static final fog.m P = new fog.m(fns::Z);
   protected static final fog.m Q = new fog.m(fns::aa);
   protected static final fog.m R = new fog.m(fns::ab);
   protected static final fog.m S = new fog.m(fns::ac);
   protected static final fog.m T = new fog.m(fns::ad);
   protected static final fog.m U = new fog.m(fns::ae);
   protected static final fog.m V = new fog.m(fns::af);
   protected static final fog.m W = new fog.m(fns::ar);
   protected static final fog.m X = new fog.m(fns::ag);
   protected static final fog.m Y = new fog.m(fns::ah);
   protected static final fog.m Z = new fog.m(fns::ai);
   protected static final fog.m aa = new fog.m(fns::aj);
   protected static final fog.m ab = new fog.m(fns::ak);
   protected static final fog.m ac = new fog.m(fns::al);
   protected static final fog.m ad = new fog.m(fns::am);
   protected static final fog.m ae = new fog.m(fns::an);
   protected static final fog.m af = new fog.m(fns::ao);
   protected static final fog.m ag = new fog.m(fns::ap);
   protected static final fog.m ah = new fog.m(fns::aq);
   protected static final fog.m ai = new fog.m(fns::as);
   protected static final fog.m aj = new fog.m(fns::at);
   protected static final fog.m ak = new fog.m(fns::au);
   protected static final fog.m al = new fog.m(fns::av);
   protected static final fog.n am = new fog.n(fyy.e, false, true);
   protected static final fog.n an = new fog.n(fyy.e, false, false);
   protected static final fog.e ao = new fog.e();
   protected static final fog.o ap = new fog.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final fog.o aq = new fog.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final fog.o ar = new fog.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final fog.g as = new fog.g(true);
   protected static final fog.g at = new fog.g(false);
   protected static final fog.l au = new fog.l(true);
   protected static final fog.l av = new fog.l(false);
   protected static final fog.c aw = new fog.c(true);
   protected static final fog.c ax = new fog.c(false);
   protected static final fog.d ay = new fog.d("always", 519);
   protected static final fog.d az = new fog.d("==", 514);
   protected static final fog.d aA = new fog.d("<=", 515);
   protected static final fog.d aB = new fog.d(">", 516);
   protected static final fog.q aC = new fog.q(true, true);
   protected static final fog.q aD = new fog.q(true, false);
   protected static final fog.q aE = new fog.q(false, true);
   protected static final fog.f aF = new fog.f("no_layering", () -> {
   }, () -> {
   });
   protected static final fog.f aG = new fog.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final fog.f aH = new fog.f("view_offset_z_layering", () -> {
      elk $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      elk $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final fog.k aI = new fog.k("main_target", () -> {
   }, () -> {
   });
   protected static final fog.k aJ = new fog.k("outline_target", () -> eqq.O().f.s().a(false), () -> eqq.O().g().a(false));
   protected static final fog.k aK = new fog.k("translucent_target", () -> {
      if (eqq.M()) {
         eqq.O().f.t().a(false);
      }
   }, () -> {
      if (eqq.M()) {
         eqq.O().g().a(false);
      }
   });
   protected static final fog.k aL = new fog.k("particles_target", () -> {
      if (eqq.M()) {
         eqq.O().f.v().a(false);
      }
   }, () -> {
      if (eqq.M()) {
         eqq.O().g().a(false);
      }
   });
   protected static final fog.k aM = new fog.k("weather_target", () -> {
      if (eqq.M()) {
         eqq.O().f.w().a(false);
      }
   }, () -> {
      if (eqq.M()) {
         eqq.O().g().a(false);
      }
   });
   protected static final fog.k aN = new fog.k("clouds_target", () -> {
      if (eqq.M()) {
         eqq.O().f.x().a(false);
      }
   }, () -> {
      if (eqq.M()) {
         eqq.O().g().a(false);
      }
   });
   protected static final fog.k aO = new fog.k("item_entity_target", () -> {
      if (eqq.M()) {
         eqq.O().f.u().a(false);
      }
   }, () -> {
      if (eqq.M()) {
         eqq.O().g().a(false);
      }
   });
   protected static final fog.h aP = new fog.h(OptionalDouble.of(1.0));
   protected static final fog.b aQ = new fog.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final fog.b aR = new fog.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public fog(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * eqq.O().m.ai().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends fog {
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

   protected static class b extends fog {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends fog.a {
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

   protected static class d extends fog {
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

   protected static class e extends fog {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<aeu> c() {
         return Optional.empty();
      }
   }

   protected static class f extends fog {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends fog.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               eqq.O().j.n().c();
            }
         }, () -> {
            if ($$0) {
               eqq.O().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends fog {
      private final OptionalDouble aS;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)eqq.O().aM().k() / 1920.0F * 2.5F));
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

   protected static class i extends fog.e {
      private final Optional<aeu> aS;

      i(ImmutableList<Triple<aeu, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<aeu, Boolean, Boolean> $$2 = (Triple<aeu, Boolean, Boolean>)var2.next();
               fza $$3 = eqq.O().Y();
               $$3.b((aeu)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (aeu)$$2.getLeft());
            }
         }, () -> {
         });
         this.aS = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<aeu> c() {
         return this.aS;
      }

      public static fog.i.a d() {
         return new fog.i.a();
      }

      public static final class a {
         private final Builder<Triple<aeu, Boolean, Boolean>> a = new Builder();

         public fog.i.a a(aeu $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public fog.i a() {
            return new fog.i(this.a.build());
         }
      }
   }

   protected static final class j extends fog.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends fog {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends fog.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               eqq.O().j.o().a();
            }
         }, () -> {
            if ($$0) {
               eqq.O().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends fog {
      private final Optional<Supplier<fom>> aS;

      public m(Supplier<fom> $$0) {
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

   protected static class n extends fog.e {
      private final Optional<aeu> aS;
      private final boolean aT;
      private final boolean aU;

      public n(aeu $$0, boolean $$1, boolean $$2) {
         super(() -> {
            fza $$3 = eqq.O().Y();
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
      protected Optional<aeu> c() {
         return this.aS;
      }
   }

   protected static class o extends fog {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends fog {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends fog {
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
