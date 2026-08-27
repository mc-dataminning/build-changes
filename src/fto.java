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

public abstract class fto {
   private static final float aS = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aT;
   private final Runnable aU;
   protected static final fto.p c = new fto.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final fto.p d = new fto.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fto.p e = new fto.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fto.p f = new fto.p(
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
   protected static final fto.p g = new fto.p(
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
   protected static final fto.p h = new fto.p(
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
   protected static final fto.m i = new fto.m();
   protected static final fto.m j = new fto.m(fta::v);
   protected static final fto.m k = new fto.m(fta::p);
   protected static final fto.m l = new fto.m(fta::r);
   protected static final fto.m m = new fto.m(fta::s);
   protected static final fto.m n = new fto.m(fta::w);
   protected static final fto.m o = new fto.m(fta::q);
   protected static final fto.m p = new fto.m(fta::z);
   protected static final fto.m q = new fto.m(fta::A);
   protected static final fto.m r = new fto.m(fta::B);
   protected static final fto.m s = new fto.m(fta::C);
   protected static final fto.m t = new fto.m(fta::D);
   protected static final fto.m u = new fto.m(fta::E);
   protected static final fto.m v = new fto.m(fta::F);
   protected static final fto.m w = new fto.m(fta::G);
   protected static final fto.m x = new fto.m(fta::H);
   protected static final fto.m y = new fto.m(fta::I);
   protected static final fto.m z = new fto.m(fta::J);
   protected static final fto.m A = new fto.m(fta::K);
   protected static final fto.m B = new fto.m(fta::L);
   protected static final fto.m C = new fto.m(fta::M);
   protected static final fto.m D = new fto.m(fta::N);
   protected static final fto.m E = new fto.m(fta::O);
   protected static final fto.m F = new fto.m(fta::P);
   protected static final fto.m G = new fto.m(fta::Q);
   protected static final fto.m H = new fto.m(fta::R);
   protected static final fto.m I = new fto.m(fta::S);
   protected static final fto.m J = new fto.m(fta::T);
   protected static final fto.m K = new fto.m(fta::U);
   protected static final fto.m L = new fto.m(fta::W);
   protected static final fto.m M = new fto.m(fta::X);
   protected static final fto.m N = new fto.m(fta::Y);
   protected static final fto.m O = new fto.m(fta::Z);
   protected static final fto.m P = new fto.m(fta::aa);
   protected static final fto.m Q = new fto.m(fta::ab);
   protected static final fto.m R = new fto.m(fta::ac);
   protected static final fto.m S = new fto.m(fta::ad);
   protected static final fto.m T = new fto.m(fta::ae);
   protected static final fto.m U = new fto.m(fta::af);
   protected static final fto.m V = new fto.m(fta::ar);
   protected static final fto.m W = new fto.m(fta::ag);
   protected static final fto.m X = new fto.m(fta::ah);
   protected static final fto.m Y = new fto.m(fta::ai);
   protected static final fto.m Z = new fto.m(fta::aj);
   protected static final fto.m aa = new fto.m(fta::ak);
   protected static final fto.m ab = new fto.m(fta::al);
   protected static final fto.m ac = new fto.m(fta::am);
   protected static final fto.m ad = new fto.m(fta::an);
   protected static final fto.m ae = new fto.m(fta::ao);
   protected static final fto.m af = new fto.m(fta::ap);
   protected static final fto.m ag = new fto.m(fta::aq);
   protected static final fto.m ah = new fto.m(fta::as);
   protected static final fto.m ai = new fto.m(fta::at);
   protected static final fto.m aj = new fto.m(fta::au);
   protected static final fto.m ak = new fto.m(fta::av);
   protected static final fto.m al = new fto.m(fta::V);
   protected static final fto.n am = new fto.n(gem.e, false, true);
   protected static final fto.n an = new fto.n(gem.e, false, false);
   protected static final fto.e ao = new fto.e();
   protected static final fto.o ap = new fto.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final fto.o aq = new fto.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final fto.o ar = new fto.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final fto.g as = new fto.g(true);
   protected static final fto.g at = new fto.g(false);
   protected static final fto.l au = new fto.l(true);
   protected static final fto.l av = new fto.l(false);
   protected static final fto.c aw = new fto.c(true);
   protected static final fto.c ax = new fto.c(false);
   protected static final fto.d ay = new fto.d("always", 519);
   protected static final fto.d az = new fto.d("==", 514);
   protected static final fto.d aA = new fto.d("<=", 515);
   protected static final fto.d aB = new fto.d(">", 516);
   protected static final fto.q aC = new fto.q(true, true);
   protected static final fto.q aD = new fto.q(true, false);
   protected static final fto.q aE = new fto.q(false, true);
   protected static final fto.f aF = new fto.f("no_layering", () -> {
   }, () -> {
   });
   protected static final fto.f aG = new fto.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final fto.f aH = new fto.f("view_offset_z_layering", () -> {
      eqb $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      eqb $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final fto.k aI = new fto.k("main_target", () -> {
   }, () -> {
   });
   protected static final fto.k aJ = new fto.k("outline_target", () -> evi.O().f.s().a(false), () -> evi.O().g().a(false));
   protected static final fto.k aK = new fto.k("translucent_target", () -> {
      if (evi.M()) {
         evi.O().f.t().a(false);
      }
   }, () -> {
      if (evi.M()) {
         evi.O().g().a(false);
      }
   });
   protected static final fto.k aL = new fto.k("particles_target", () -> {
      if (evi.M()) {
         evi.O().f.v().a(false);
      }
   }, () -> {
      if (evi.M()) {
         evi.O().g().a(false);
      }
   });
   protected static final fto.k aM = new fto.k("weather_target", () -> {
      if (evi.M()) {
         evi.O().f.w().a(false);
      }
   }, () -> {
      if (evi.M()) {
         evi.O().g().a(false);
      }
   });
   protected static final fto.k aN = new fto.k("clouds_target", () -> {
      if (evi.M()) {
         evi.O().f.x().a(false);
      }
   }, () -> {
      if (evi.M()) {
         evi.O().g().a(false);
      }
   });
   protected static final fto.k aO = new fto.k("item_entity_target", () -> {
      if (evi.M()) {
         evi.O().f.u().a(false);
      }
   }, () -> {
      if (evi.M()) {
         evi.O().g().a(false);
      }
   });
   protected static final fto.h aP = new fto.h(OptionalDouble.of(1.0));
   protected static final fto.b aQ = new fto.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final fto.b aR = new fto.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public fto(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * evi.O().m.aj().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends fto {
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

   protected static class b extends fto {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends fto.a {
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

   protected static class d extends fto {
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

   protected static class e extends fto {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<ahg> c() {
         return Optional.empty();
      }
   }

   protected static class f extends fto {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends fto.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               evi.O().j.n().c();
            }
         }, () -> {
            if ($$0) {
               evi.O().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends fto {
      private final OptionalDouble aS;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)evi.O().aM().k() / 1920.0F * 2.5F));
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

   protected static class i extends fto.e {
      private final Optional<ahg> aS;

      i(ImmutableList<Triple<ahg, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<ahg, Boolean, Boolean> $$2 = (Triple<ahg, Boolean, Boolean>)var2.next();
               geo $$3 = evi.O().Y();
               $$3.b((ahg)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (ahg)$$2.getLeft());
            }
         }, () -> {
         });
         this.aS = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<ahg> c() {
         return this.aS;
      }

      public static fto.i.a d() {
         return new fto.i.a();
      }

      public static final class a {
         private final Builder<Triple<ahg, Boolean, Boolean>> a = new Builder();

         public fto.i.a a(ahg $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public fto.i a() {
            return new fto.i(this.a.build());
         }
      }
   }

   protected static final class j extends fto.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends fto {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends fto.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               evi.O().j.o().a();
            }
         }, () -> {
            if ($$0) {
               evi.O().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends fto {
      private final Optional<Supplier<ftv>> aS;

      public m(Supplier<ftv> $$0) {
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

   protected static class n extends fto.e {
      private final Optional<ahg> aS;
      private final boolean aT;
      private final boolean aU;

      public n(ahg $$0, boolean $$1, boolean $$2) {
         super(() -> {
            geo $$3 = evi.O().Y();
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
      protected Optional<ahg> c() {
         return this.aS;
      }
   }

   protected static class o extends fto {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends fto {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends fto {
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
