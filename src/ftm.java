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

public abstract class ftm {
   private static final float aS = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aT;
   private final Runnable aU;
   protected static final ftm.p c = new ftm.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final ftm.p d = new ftm.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final ftm.p e = new ftm.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final ftm.p f = new ftm.p(
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
   protected static final ftm.p g = new ftm.p(
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
   protected static final ftm.p h = new ftm.p(
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
   protected static final ftm.m i = new ftm.m();
   protected static final ftm.m j = new ftm.m(fsy::v);
   protected static final ftm.m k = new ftm.m(fsy::p);
   protected static final ftm.m l = new ftm.m(fsy::r);
   protected static final ftm.m m = new ftm.m(fsy::s);
   protected static final ftm.m n = new ftm.m(fsy::w);
   protected static final ftm.m o = new ftm.m(fsy::q);
   protected static final ftm.m p = new ftm.m(fsy::z);
   protected static final ftm.m q = new ftm.m(fsy::A);
   protected static final ftm.m r = new ftm.m(fsy::B);
   protected static final ftm.m s = new ftm.m(fsy::C);
   protected static final ftm.m t = new ftm.m(fsy::D);
   protected static final ftm.m u = new ftm.m(fsy::E);
   protected static final ftm.m v = new ftm.m(fsy::F);
   protected static final ftm.m w = new ftm.m(fsy::G);
   protected static final ftm.m x = new ftm.m(fsy::H);
   protected static final ftm.m y = new ftm.m(fsy::I);
   protected static final ftm.m z = new ftm.m(fsy::J);
   protected static final ftm.m A = new ftm.m(fsy::K);
   protected static final ftm.m B = new ftm.m(fsy::L);
   protected static final ftm.m C = new ftm.m(fsy::M);
   protected static final ftm.m D = new ftm.m(fsy::N);
   protected static final ftm.m E = new ftm.m(fsy::O);
   protected static final ftm.m F = new ftm.m(fsy::P);
   protected static final ftm.m G = new ftm.m(fsy::Q);
   protected static final ftm.m H = new ftm.m(fsy::R);
   protected static final ftm.m I = new ftm.m(fsy::S);
   protected static final ftm.m J = new ftm.m(fsy::T);
   protected static final ftm.m K = new ftm.m(fsy::U);
   protected static final ftm.m L = new ftm.m(fsy::W);
   protected static final ftm.m M = new ftm.m(fsy::X);
   protected static final ftm.m N = new ftm.m(fsy::Y);
   protected static final ftm.m O = new ftm.m(fsy::Z);
   protected static final ftm.m P = new ftm.m(fsy::aa);
   protected static final ftm.m Q = new ftm.m(fsy::ab);
   protected static final ftm.m R = new ftm.m(fsy::ac);
   protected static final ftm.m S = new ftm.m(fsy::ad);
   protected static final ftm.m T = new ftm.m(fsy::ae);
   protected static final ftm.m U = new ftm.m(fsy::af);
   protected static final ftm.m V = new ftm.m(fsy::ar);
   protected static final ftm.m W = new ftm.m(fsy::ag);
   protected static final ftm.m X = new ftm.m(fsy::ah);
   protected static final ftm.m Y = new ftm.m(fsy::ai);
   protected static final ftm.m Z = new ftm.m(fsy::aj);
   protected static final ftm.m aa = new ftm.m(fsy::ak);
   protected static final ftm.m ab = new ftm.m(fsy::al);
   protected static final ftm.m ac = new ftm.m(fsy::am);
   protected static final ftm.m ad = new ftm.m(fsy::an);
   protected static final ftm.m ae = new ftm.m(fsy::ao);
   protected static final ftm.m af = new ftm.m(fsy::ap);
   protected static final ftm.m ag = new ftm.m(fsy::aq);
   protected static final ftm.m ah = new ftm.m(fsy::as);
   protected static final ftm.m ai = new ftm.m(fsy::at);
   protected static final ftm.m aj = new ftm.m(fsy::au);
   protected static final ftm.m ak = new ftm.m(fsy::av);
   protected static final ftm.m al = new ftm.m(fsy::V);
   protected static final ftm.n am = new ftm.n(gek.e, false, true);
   protected static final ftm.n an = new ftm.n(gek.e, false, false);
   protected static final ftm.e ao = new ftm.e();
   protected static final ftm.o ap = new ftm.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final ftm.o aq = new ftm.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final ftm.o ar = new ftm.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final ftm.g as = new ftm.g(true);
   protected static final ftm.g at = new ftm.g(false);
   protected static final ftm.l au = new ftm.l(true);
   protected static final ftm.l av = new ftm.l(false);
   protected static final ftm.c aw = new ftm.c(true);
   protected static final ftm.c ax = new ftm.c(false);
   protected static final ftm.d ay = new ftm.d("always", 519);
   protected static final ftm.d az = new ftm.d("==", 514);
   protected static final ftm.d aA = new ftm.d("<=", 515);
   protected static final ftm.d aB = new ftm.d(">", 516);
   protected static final ftm.q aC = new ftm.q(true, true);
   protected static final ftm.q aD = new ftm.q(true, false);
   protected static final ftm.q aE = new ftm.q(false, true);
   protected static final ftm.f aF = new ftm.f("no_layering", () -> {
   }, () -> {
   });
   protected static final ftm.f aG = new ftm.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final ftm.f aH = new ftm.f("view_offset_z_layering", () -> {
      epz $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      epz $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final ftm.k aI = new ftm.k("main_target", () -> {
   }, () -> {
   });
   protected static final ftm.k aJ = new ftm.k("outline_target", () -> evg.O().f.s().a(false), () -> evg.O().g().a(false));
   protected static final ftm.k aK = new ftm.k("translucent_target", () -> {
      if (evg.M()) {
         evg.O().f.t().a(false);
      }
   }, () -> {
      if (evg.M()) {
         evg.O().g().a(false);
      }
   });
   protected static final ftm.k aL = new ftm.k("particles_target", () -> {
      if (evg.M()) {
         evg.O().f.v().a(false);
      }
   }, () -> {
      if (evg.M()) {
         evg.O().g().a(false);
      }
   });
   protected static final ftm.k aM = new ftm.k("weather_target", () -> {
      if (evg.M()) {
         evg.O().f.w().a(false);
      }
   }, () -> {
      if (evg.M()) {
         evg.O().g().a(false);
      }
   });
   protected static final ftm.k aN = new ftm.k("clouds_target", () -> {
      if (evg.M()) {
         evg.O().f.x().a(false);
      }
   }, () -> {
      if (evg.M()) {
         evg.O().g().a(false);
      }
   });
   protected static final ftm.k aO = new ftm.k("item_entity_target", () -> {
      if (evg.M()) {
         evg.O().f.u().a(false);
      }
   }, () -> {
      if (evg.M()) {
         evg.O().g().a(false);
      }
   });
   protected static final ftm.h aP = new ftm.h(OptionalDouble.of(1.0));
   protected static final ftm.b aQ = new ftm.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final ftm.b aR = new ftm.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public ftm(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * evg.O().m.aj().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends ftm {
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

   protected static class b extends ftm {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends ftm.a {
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

   protected static class d extends ftm {
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

   protected static class e extends ftm {
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

   protected static class f extends ftm {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends ftm.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               evg.O().j.n().c();
            }
         }, () -> {
            if ($$0) {
               evg.O().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends ftm {
      private final OptionalDouble aS;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)evg.O().aM().k() / 1920.0F * 2.5F));
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

   protected static class i extends ftm.e {
      private final Optional<ahg> aS;

      i(ImmutableList<Triple<ahg, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<ahg, Boolean, Boolean> $$2 = (Triple<ahg, Boolean, Boolean>)var2.next();
               gem $$3 = evg.O().Y();
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

      public static ftm.i.a d() {
         return new ftm.i.a();
      }

      public static final class a {
         private final Builder<Triple<ahg, Boolean, Boolean>> a = new Builder();

         public ftm.i.a a(ahg $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public ftm.i a() {
            return new ftm.i(this.a.build());
         }
      }
   }

   protected static final class j extends ftm.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends ftm {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends ftm.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               evg.O().j.o().a();
            }
         }, () -> {
            if ($$0) {
               evg.O().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends ftm {
      private final Optional<Supplier<ftt>> aS;

      public m(Supplier<ftt> $$0) {
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

   protected static class n extends ftm.e {
      private final Optional<ahg> aS;
      private final boolean aT;
      private final boolean aU;

      public n(ahg $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gem $$3 = evg.O().Y();
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

   protected static class o extends ftm {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends ftm {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends ftm {
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
