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

public abstract class foh {
   private static final float aS = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aT;
   private final Runnable aU;
   protected static final foh.p c = new foh.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final foh.p d = new foh.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final foh.p e = new foh.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final foh.p f = new foh.p(
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
   protected static final foh.p g = new foh.p(
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
   protected static final foh.p h = new foh.p(
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
   protected static final foh.m i = new foh.m();
   protected static final foh.m j = new foh.m(fnt::v);
   protected static final foh.m k = new foh.m(fnt::p);
   protected static final foh.m l = new foh.m(fnt::r);
   protected static final foh.m m = new foh.m(fnt::s);
   protected static final foh.m n = new foh.m(fnt::w);
   protected static final foh.m o = new foh.m(fnt::q);
   protected static final foh.m p = new foh.m(fnt::z);
   protected static final foh.m q = new foh.m(fnt::A);
   protected static final foh.m r = new foh.m(fnt::B);
   protected static final foh.m s = new foh.m(fnt::C);
   protected static final foh.m t = new foh.m(fnt::D);
   protected static final foh.m u = new foh.m(fnt::E);
   protected static final foh.m v = new foh.m(fnt::F);
   protected static final foh.m w = new foh.m(fnt::G);
   protected static final foh.m x = new foh.m(fnt::H);
   protected static final foh.m y = new foh.m(fnt::I);
   protected static final foh.m z = new foh.m(fnt::J);
   protected static final foh.m A = new foh.m(fnt::K);
   protected static final foh.m B = new foh.m(fnt::L);
   protected static final foh.m C = new foh.m(fnt::M);
   protected static final foh.m D = new foh.m(fnt::N);
   protected static final foh.m E = new foh.m(fnt::O);
   protected static final foh.m F = new foh.m(fnt::P);
   protected static final foh.m G = new foh.m(fnt::Q);
   protected static final foh.m H = new foh.m(fnt::R);
   protected static final foh.m I = new foh.m(fnt::S);
   protected static final foh.m J = new foh.m(fnt::T);
   protected static final foh.m K = new foh.m(fnt::U);
   protected static final foh.m L = new foh.m(fnt::V);
   protected static final foh.m M = new foh.m(fnt::W);
   protected static final foh.m N = new foh.m(fnt::X);
   protected static final foh.m O = new foh.m(fnt::Y);
   protected static final foh.m P = new foh.m(fnt::Z);
   protected static final foh.m Q = new foh.m(fnt::aa);
   protected static final foh.m R = new foh.m(fnt::ab);
   protected static final foh.m S = new foh.m(fnt::ac);
   protected static final foh.m T = new foh.m(fnt::ad);
   protected static final foh.m U = new foh.m(fnt::ae);
   protected static final foh.m V = new foh.m(fnt::af);
   protected static final foh.m W = new foh.m(fnt::ar);
   protected static final foh.m X = new foh.m(fnt::ag);
   protected static final foh.m Y = new foh.m(fnt::ah);
   protected static final foh.m Z = new foh.m(fnt::ai);
   protected static final foh.m aa = new foh.m(fnt::aj);
   protected static final foh.m ab = new foh.m(fnt::ak);
   protected static final foh.m ac = new foh.m(fnt::al);
   protected static final foh.m ad = new foh.m(fnt::am);
   protected static final foh.m ae = new foh.m(fnt::an);
   protected static final foh.m af = new foh.m(fnt::ao);
   protected static final foh.m ag = new foh.m(fnt::ap);
   protected static final foh.m ah = new foh.m(fnt::aq);
   protected static final foh.m ai = new foh.m(fnt::as);
   protected static final foh.m aj = new foh.m(fnt::at);
   protected static final foh.m ak = new foh.m(fnt::au);
   protected static final foh.m al = new foh.m(fnt::av);
   protected static final foh.n am = new foh.n(fyz.e, false, true);
   protected static final foh.n an = new foh.n(fyz.e, false, false);
   protected static final foh.e ao = new foh.e();
   protected static final foh.o ap = new foh.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final foh.o aq = new foh.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final foh.o ar = new foh.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final foh.g as = new foh.g(true);
   protected static final foh.g at = new foh.g(false);
   protected static final foh.l au = new foh.l(true);
   protected static final foh.l av = new foh.l(false);
   protected static final foh.c aw = new foh.c(true);
   protected static final foh.c ax = new foh.c(false);
   protected static final foh.d ay = new foh.d("always", 519);
   protected static final foh.d az = new foh.d("==", 514);
   protected static final foh.d aA = new foh.d("<=", 515);
   protected static final foh.d aB = new foh.d(">", 516);
   protected static final foh.q aC = new foh.q(true, true);
   protected static final foh.q aD = new foh.q(true, false);
   protected static final foh.q aE = new foh.q(false, true);
   protected static final foh.f aF = new foh.f("no_layering", () -> {
   }, () -> {
   });
   protected static final foh.f aG = new foh.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final foh.f aH = new foh.f("view_offset_z_layering", () -> {
      elj $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      elj $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final foh.k aI = new foh.k("main_target", () -> {
   }, () -> {
   });
   protected static final foh.k aJ = new foh.k("outline_target", () -> eqp.O().f.s().a(false), () -> eqp.O().g().a(false));
   protected static final foh.k aK = new foh.k("translucent_target", () -> {
      if (eqp.M()) {
         eqp.O().f.t().a(false);
      }
   }, () -> {
      if (eqp.M()) {
         eqp.O().g().a(false);
      }
   });
   protected static final foh.k aL = new foh.k("particles_target", () -> {
      if (eqp.M()) {
         eqp.O().f.v().a(false);
      }
   }, () -> {
      if (eqp.M()) {
         eqp.O().g().a(false);
      }
   });
   protected static final foh.k aM = new foh.k("weather_target", () -> {
      if (eqp.M()) {
         eqp.O().f.w().a(false);
      }
   }, () -> {
      if (eqp.M()) {
         eqp.O().g().a(false);
      }
   });
   protected static final foh.k aN = new foh.k("clouds_target", () -> {
      if (eqp.M()) {
         eqp.O().f.x().a(false);
      }
   }, () -> {
      if (eqp.M()) {
         eqp.O().g().a(false);
      }
   });
   protected static final foh.k aO = new foh.k("item_entity_target", () -> {
      if (eqp.M()) {
         eqp.O().f.u().a(false);
      }
   }, () -> {
      if (eqp.M()) {
         eqp.O().g().a(false);
      }
   });
   protected static final foh.h aP = new foh.h(OptionalDouble.of(1.0));
   protected static final foh.b aQ = new foh.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final foh.b aR = new foh.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public foh(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * eqp.O().m.ai().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends foh {
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

   protected static class b extends foh {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends foh.a {
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

   protected static class d extends foh {
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

   protected static class e extends foh {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<aez> c() {
         return Optional.empty();
      }
   }

   protected static class f extends foh {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends foh.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               eqp.O().j.n().c();
            }
         }, () -> {
            if ($$0) {
               eqp.O().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends foh {
      private final OptionalDouble aS;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)eqp.O().aM().k() / 1920.0F * 2.5F));
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

   protected static class i extends foh.e {
      private final Optional<aez> aS;

      i(ImmutableList<Triple<aez, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<aez, Boolean, Boolean> $$2 = (Triple<aez, Boolean, Boolean>)var2.next();
               fzb $$3 = eqp.O().Y();
               $$3.b((aez)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (aez)$$2.getLeft());
            }
         }, () -> {
         });
         this.aS = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<aez> c() {
         return this.aS;
      }

      public static foh.i.a d() {
         return new foh.i.a();
      }

      public static final class a {
         private final Builder<Triple<aez, Boolean, Boolean>> a = new Builder();

         public foh.i.a a(aez $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public foh.i a() {
            return new foh.i(this.a.build());
         }
      }
   }

   protected static final class j extends foh.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends foh {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends foh.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               eqp.O().j.o().a();
            }
         }, () -> {
            if ($$0) {
               eqp.O().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends foh {
      private final Optional<Supplier<fon>> aS;

      public m(Supplier<fon> $$0) {
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

   protected static class n extends foh.e {
      private final Optional<aez> aS;
      private final boolean aT;
      private final boolean aU;

      public n(aez $$0, boolean $$1, boolean $$2) {
         super(() -> {
            fzb $$3 = eqp.O().Y();
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
      protected Optional<aez> c() {
         return this.aS;
      }
   }

   protected static class o extends foh {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends foh {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends foh {
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
