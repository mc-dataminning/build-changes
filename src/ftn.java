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

public abstract class ftn {
   private static final float aS = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aT;
   private final Runnable aU;
   protected static final ftn.p c = new ftn.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final ftn.p d = new ftn.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final ftn.p e = new ftn.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final ftn.p f = new ftn.p(
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
   protected static final ftn.p g = new ftn.p(
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
   protected static final ftn.p h = new ftn.p(
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
   protected static final ftn.m i = new ftn.m();
   protected static final ftn.m j = new ftn.m(fsz::v);
   protected static final ftn.m k = new ftn.m(fsz::p);
   protected static final ftn.m l = new ftn.m(fsz::r);
   protected static final ftn.m m = new ftn.m(fsz::s);
   protected static final ftn.m n = new ftn.m(fsz::w);
   protected static final ftn.m o = new ftn.m(fsz::q);
   protected static final ftn.m p = new ftn.m(fsz::z);
   protected static final ftn.m q = new ftn.m(fsz::A);
   protected static final ftn.m r = new ftn.m(fsz::B);
   protected static final ftn.m s = new ftn.m(fsz::C);
   protected static final ftn.m t = new ftn.m(fsz::D);
   protected static final ftn.m u = new ftn.m(fsz::E);
   protected static final ftn.m v = new ftn.m(fsz::F);
   protected static final ftn.m w = new ftn.m(fsz::G);
   protected static final ftn.m x = new ftn.m(fsz::H);
   protected static final ftn.m y = new ftn.m(fsz::I);
   protected static final ftn.m z = new ftn.m(fsz::J);
   protected static final ftn.m A = new ftn.m(fsz::K);
   protected static final ftn.m B = new ftn.m(fsz::L);
   protected static final ftn.m C = new ftn.m(fsz::M);
   protected static final ftn.m D = new ftn.m(fsz::N);
   protected static final ftn.m E = new ftn.m(fsz::O);
   protected static final ftn.m F = new ftn.m(fsz::P);
   protected static final ftn.m G = new ftn.m(fsz::Q);
   protected static final ftn.m H = new ftn.m(fsz::R);
   protected static final ftn.m I = new ftn.m(fsz::S);
   protected static final ftn.m J = new ftn.m(fsz::T);
   protected static final ftn.m K = new ftn.m(fsz::U);
   protected static final ftn.m L = new ftn.m(fsz::W);
   protected static final ftn.m M = new ftn.m(fsz::X);
   protected static final ftn.m N = new ftn.m(fsz::Y);
   protected static final ftn.m O = new ftn.m(fsz::Z);
   protected static final ftn.m P = new ftn.m(fsz::aa);
   protected static final ftn.m Q = new ftn.m(fsz::ab);
   protected static final ftn.m R = new ftn.m(fsz::ac);
   protected static final ftn.m S = new ftn.m(fsz::ad);
   protected static final ftn.m T = new ftn.m(fsz::ae);
   protected static final ftn.m U = new ftn.m(fsz::af);
   protected static final ftn.m V = new ftn.m(fsz::ar);
   protected static final ftn.m W = new ftn.m(fsz::ag);
   protected static final ftn.m X = new ftn.m(fsz::ah);
   protected static final ftn.m Y = new ftn.m(fsz::ai);
   protected static final ftn.m Z = new ftn.m(fsz::aj);
   protected static final ftn.m aa = new ftn.m(fsz::ak);
   protected static final ftn.m ab = new ftn.m(fsz::al);
   protected static final ftn.m ac = new ftn.m(fsz::am);
   protected static final ftn.m ad = new ftn.m(fsz::an);
   protected static final ftn.m ae = new ftn.m(fsz::ao);
   protected static final ftn.m af = new ftn.m(fsz::ap);
   protected static final ftn.m ag = new ftn.m(fsz::aq);
   protected static final ftn.m ah = new ftn.m(fsz::as);
   protected static final ftn.m ai = new ftn.m(fsz::at);
   protected static final ftn.m aj = new ftn.m(fsz::au);
   protected static final ftn.m ak = new ftn.m(fsz::av);
   protected static final ftn.m al = new ftn.m(fsz::V);
   protected static final ftn.n am = new ftn.n(gel.e, false, true);
   protected static final ftn.n an = new ftn.n(gel.e, false, false);
   protected static final ftn.e ao = new ftn.e();
   protected static final ftn.o ap = new ftn.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final ftn.o aq = new ftn.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final ftn.o ar = new ftn.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final ftn.g as = new ftn.g(true);
   protected static final ftn.g at = new ftn.g(false);
   protected static final ftn.l au = new ftn.l(true);
   protected static final ftn.l av = new ftn.l(false);
   protected static final ftn.c aw = new ftn.c(true);
   protected static final ftn.c ax = new ftn.c(false);
   protected static final ftn.d ay = new ftn.d("always", 519);
   protected static final ftn.d az = new ftn.d("==", 514);
   protected static final ftn.d aA = new ftn.d("<=", 515);
   protected static final ftn.d aB = new ftn.d(">", 516);
   protected static final ftn.q aC = new ftn.q(true, true);
   protected static final ftn.q aD = new ftn.q(true, false);
   protected static final ftn.q aE = new ftn.q(false, true);
   protected static final ftn.f aF = new ftn.f("no_layering", () -> {
   }, () -> {
   });
   protected static final ftn.f aG = new ftn.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final ftn.f aH = new ftn.f("view_offset_z_layering", () -> {
      eqa $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      eqa $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final ftn.k aI = new ftn.k("main_target", () -> {
   }, () -> {
   });
   protected static final ftn.k aJ = new ftn.k("outline_target", () -> evh.O().f.s().a(false), () -> evh.O().g().a(false));
   protected static final ftn.k aK = new ftn.k("translucent_target", () -> {
      if (evh.M()) {
         evh.O().f.t().a(false);
      }
   }, () -> {
      if (evh.M()) {
         evh.O().g().a(false);
      }
   });
   protected static final ftn.k aL = new ftn.k("particles_target", () -> {
      if (evh.M()) {
         evh.O().f.v().a(false);
      }
   }, () -> {
      if (evh.M()) {
         evh.O().g().a(false);
      }
   });
   protected static final ftn.k aM = new ftn.k("weather_target", () -> {
      if (evh.M()) {
         evh.O().f.w().a(false);
      }
   }, () -> {
      if (evh.M()) {
         evh.O().g().a(false);
      }
   });
   protected static final ftn.k aN = new ftn.k("clouds_target", () -> {
      if (evh.M()) {
         evh.O().f.x().a(false);
      }
   }, () -> {
      if (evh.M()) {
         evh.O().g().a(false);
      }
   });
   protected static final ftn.k aO = new ftn.k("item_entity_target", () -> {
      if (evh.M()) {
         evh.O().f.u().a(false);
      }
   }, () -> {
      if (evh.M()) {
         evh.O().g().a(false);
      }
   });
   protected static final ftn.h aP = new ftn.h(OptionalDouble.of(1.0));
   protected static final ftn.b aQ = new ftn.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final ftn.b aR = new ftn.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public ftn(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * evh.O().m.aj().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends ftn {
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

   protected static class b extends ftn {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends ftn.a {
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

   protected static class d extends ftn {
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

   protected static class e extends ftn {
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

   protected static class f extends ftn {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends ftn.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               evh.O().j.n().c();
            }
         }, () -> {
            if ($$0) {
               evh.O().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends ftn {
      private final OptionalDouble aS;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)evh.O().aM().k() / 1920.0F * 2.5F));
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

   protected static class i extends ftn.e {
      private final Optional<ahg> aS;

      i(ImmutableList<Triple<ahg, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<ahg, Boolean, Boolean> $$2 = (Triple<ahg, Boolean, Boolean>)var2.next();
               gen $$3 = evh.O().Y();
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

      public static ftn.i.a d() {
         return new ftn.i.a();
      }

      public static final class a {
         private final Builder<Triple<ahg, Boolean, Boolean>> a = new Builder();

         public ftn.i.a a(ahg $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public ftn.i a() {
            return new ftn.i(this.a.build());
         }
      }
   }

   protected static final class j extends ftn.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends ftn {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends ftn.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               evh.O().j.o().a();
            }
         }, () -> {
            if ($$0) {
               evh.O().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends ftn {
      private final Optional<Supplier<ftu>> aS;

      public m(Supplier<ftu> $$0) {
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

   protected static class n extends ftn.e {
      private final Optional<ahg> aS;
      private final boolean aT;
      private final boolean aU;

      public n(ahg $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gen $$3 = evh.O().Y();
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

   protected static class o extends ftn {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends ftn {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends ftn {
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
