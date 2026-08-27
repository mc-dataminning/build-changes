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

public abstract class fob {
   private static final float aS = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aT;
   private final Runnable aU;
   protected static final fob.p c = new fob.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final fob.p d = new fob.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fob.p e = new fob.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fob.p f = new fob.p(
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
   protected static final fob.p g = new fob.p(
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
   protected static final fob.p h = new fob.p(
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
   protected static final fob.m i = new fob.m();
   protected static final fob.m j = new fob.m(fnn::v);
   protected static final fob.m k = new fob.m(fnn::p);
   protected static final fob.m l = new fob.m(fnn::r);
   protected static final fob.m m = new fob.m(fnn::s);
   protected static final fob.m n = new fob.m(fnn::w);
   protected static final fob.m o = new fob.m(fnn::q);
   protected static final fob.m p = new fob.m(fnn::z);
   protected static final fob.m q = new fob.m(fnn::A);
   protected static final fob.m r = new fob.m(fnn::B);
   protected static final fob.m s = new fob.m(fnn::C);
   protected static final fob.m t = new fob.m(fnn::D);
   protected static final fob.m u = new fob.m(fnn::E);
   protected static final fob.m v = new fob.m(fnn::F);
   protected static final fob.m w = new fob.m(fnn::G);
   protected static final fob.m x = new fob.m(fnn::H);
   protected static final fob.m y = new fob.m(fnn::I);
   protected static final fob.m z = new fob.m(fnn::J);
   protected static final fob.m A = new fob.m(fnn::K);
   protected static final fob.m B = new fob.m(fnn::L);
   protected static final fob.m C = new fob.m(fnn::M);
   protected static final fob.m D = new fob.m(fnn::N);
   protected static final fob.m E = new fob.m(fnn::O);
   protected static final fob.m F = new fob.m(fnn::P);
   protected static final fob.m G = new fob.m(fnn::Q);
   protected static final fob.m H = new fob.m(fnn::R);
   protected static final fob.m I = new fob.m(fnn::S);
   protected static final fob.m J = new fob.m(fnn::T);
   protected static final fob.m K = new fob.m(fnn::U);
   protected static final fob.m L = new fob.m(fnn::V);
   protected static final fob.m M = new fob.m(fnn::W);
   protected static final fob.m N = new fob.m(fnn::X);
   protected static final fob.m O = new fob.m(fnn::Y);
   protected static final fob.m P = new fob.m(fnn::Z);
   protected static final fob.m Q = new fob.m(fnn::aa);
   protected static final fob.m R = new fob.m(fnn::ab);
   protected static final fob.m S = new fob.m(fnn::ac);
   protected static final fob.m T = new fob.m(fnn::ad);
   protected static final fob.m U = new fob.m(fnn::ae);
   protected static final fob.m V = new fob.m(fnn::af);
   protected static final fob.m W = new fob.m(fnn::ar);
   protected static final fob.m X = new fob.m(fnn::ag);
   protected static final fob.m Y = new fob.m(fnn::ah);
   protected static final fob.m Z = new fob.m(fnn::ai);
   protected static final fob.m aa = new fob.m(fnn::aj);
   protected static final fob.m ab = new fob.m(fnn::ak);
   protected static final fob.m ac = new fob.m(fnn::al);
   protected static final fob.m ad = new fob.m(fnn::am);
   protected static final fob.m ae = new fob.m(fnn::an);
   protected static final fob.m af = new fob.m(fnn::ao);
   protected static final fob.m ag = new fob.m(fnn::ap);
   protected static final fob.m ah = new fob.m(fnn::aq);
   protected static final fob.m ai = new fob.m(fnn::as);
   protected static final fob.m aj = new fob.m(fnn::at);
   protected static final fob.m ak = new fob.m(fnn::au);
   protected static final fob.m al = new fob.m(fnn::av);
   protected static final fob.n am = new fob.n(fyt.e, false, true);
   protected static final fob.n an = new fob.n(fyt.e, false, false);
   protected static final fob.e ao = new fob.e();
   protected static final fob.o ap = new fob.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final fob.o aq = new fob.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final fob.o ar = new fob.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final fob.g as = new fob.g(true);
   protected static final fob.g at = new fob.g(false);
   protected static final fob.l au = new fob.l(true);
   protected static final fob.l av = new fob.l(false);
   protected static final fob.c aw = new fob.c(true);
   protected static final fob.c ax = new fob.c(false);
   protected static final fob.d ay = new fob.d("always", 519);
   protected static final fob.d az = new fob.d("==", 514);
   protected static final fob.d aA = new fob.d("<=", 515);
   protected static final fob.d aB = new fob.d(">", 516);
   protected static final fob.q aC = new fob.q(true, true);
   protected static final fob.q aD = new fob.q(true, false);
   protected static final fob.q aE = new fob.q(false, true);
   protected static final fob.f aF = new fob.f("no_layering", () -> {
   }, () -> {
   });
   protected static final fob.f aG = new fob.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final fob.f aH = new fob.f("view_offset_z_layering", () -> {
      elf $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      elf $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final fob.k aI = new fob.k("main_target", () -> {
   }, () -> {
   });
   protected static final fob.k aJ = new fob.k("outline_target", () -> eql.O().f.s().a(false), () -> eql.O().g().a(false));
   protected static final fob.k aK = new fob.k("translucent_target", () -> {
      if (eql.M()) {
         eql.O().f.t().a(false);
      }
   }, () -> {
      if (eql.M()) {
         eql.O().g().a(false);
      }
   });
   protected static final fob.k aL = new fob.k("particles_target", () -> {
      if (eql.M()) {
         eql.O().f.v().a(false);
      }
   }, () -> {
      if (eql.M()) {
         eql.O().g().a(false);
      }
   });
   protected static final fob.k aM = new fob.k("weather_target", () -> {
      if (eql.M()) {
         eql.O().f.w().a(false);
      }
   }, () -> {
      if (eql.M()) {
         eql.O().g().a(false);
      }
   });
   protected static final fob.k aN = new fob.k("clouds_target", () -> {
      if (eql.M()) {
         eql.O().f.x().a(false);
      }
   }, () -> {
      if (eql.M()) {
         eql.O().g().a(false);
      }
   });
   protected static final fob.k aO = new fob.k("item_entity_target", () -> {
      if (eql.M()) {
         eql.O().f.u().a(false);
      }
   }, () -> {
      if (eql.M()) {
         eql.O().g().a(false);
      }
   });
   protected static final fob.h aP = new fob.h(OptionalDouble.of(1.0));
   protected static final fob.b aQ = new fob.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final fob.b aR = new fob.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public fob(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * eql.O().m.ai().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends fob {
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

   protected static class b extends fob {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends fob.a {
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

   protected static class d extends fob {
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

   protected static class e extends fob {
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

   protected static class f extends fob {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends fob.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               eql.O().j.n().c();
            }
         }, () -> {
            if ($$0) {
               eql.O().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends fob {
      private final OptionalDouble aS;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)eql.O().aM().k() / 1920.0F * 2.5F));
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

   protected static class i extends fob.e {
      private final Optional<aer> aS;

      i(ImmutableList<Triple<aer, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<aer, Boolean, Boolean> $$2 = (Triple<aer, Boolean, Boolean>)var2.next();
               fyv $$3 = eql.O().Y();
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

      public static fob.i.a d() {
         return new fob.i.a();
      }

      public static final class a {
         private final Builder<Triple<aer, Boolean, Boolean>> a = new Builder();

         public fob.i.a a(aer $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public fob.i a() {
            return new fob.i(this.a.build());
         }
      }
   }

   protected static final class j extends fob.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends fob {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends fob.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               eql.O().j.o().a();
            }
         }, () -> {
            if ($$0) {
               eql.O().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends fob {
      private final Optional<Supplier<foh>> aS;

      public m(Supplier<foh> $$0) {
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

   protected static class n extends fob.e {
      private final Optional<aer> aS;
      private final boolean aT;
      private final boolean aU;

      public n(aer $$0, boolean $$1, boolean $$2) {
         super(() -> {
            fyv $$3 = eql.O().Y();
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

   protected static class o extends fob {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends fob {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends fob {
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
