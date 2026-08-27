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

public abstract class fqo {
   private static final float aR = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aS;
   private final Runnable aT;
   protected static final fqo.p c = new fqo.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final fqo.p d = new fqo.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fqo.p e = new fqo.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fqo.p f = new fqo.p(
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
   protected static final fqo.p g = new fqo.p(
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
   protected static final fqo.p h = new fqo.p(
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
   protected static final fqo.m i = new fqo.m();
   protected static final fqo.m j = new fqo.m(fqa::v);
   protected static final fqo.m k = new fqo.m(fqa::p);
   protected static final fqo.m l = new fqo.m(fqa::r);
   protected static final fqo.m m = new fqo.m(fqa::s);
   protected static final fqo.m n = new fqo.m(fqa::w);
   protected static final fqo.m o = new fqo.m(fqa::q);
   protected static final fqo.m p = new fqo.m(fqa::z);
   protected static final fqo.m q = new fqo.m(fqa::A);
   protected static final fqo.m r = new fqo.m(fqa::B);
   protected static final fqo.m s = new fqo.m(fqa::C);
   protected static final fqo.m t = new fqo.m(fqa::D);
   protected static final fqo.m u = new fqo.m(fqa::E);
   protected static final fqo.m v = new fqo.m(fqa::F);
   protected static final fqo.m w = new fqo.m(fqa::G);
   protected static final fqo.m x = new fqo.m(fqa::H);
   protected static final fqo.m y = new fqo.m(fqa::I);
   protected static final fqo.m z = new fqo.m(fqa::J);
   protected static final fqo.m A = new fqo.m(fqa::K);
   protected static final fqo.m B = new fqo.m(fqa::L);
   protected static final fqo.m C = new fqo.m(fqa::M);
   protected static final fqo.m D = new fqo.m(fqa::N);
   protected static final fqo.m E = new fqo.m(fqa::O);
   protected static final fqo.m F = new fqo.m(fqa::P);
   protected static final fqo.m G = new fqo.m(fqa::Q);
   protected static final fqo.m H = new fqo.m(fqa::R);
   protected static final fqo.m I = new fqo.m(fqa::S);
   protected static final fqo.m J = new fqo.m(fqa::T);
   protected static final fqo.m K = new fqo.m(fqa::U);
   protected static final fqo.m L = new fqo.m(fqa::V);
   protected static final fqo.m M = new fqo.m(fqa::W);
   protected static final fqo.m N = new fqo.m(fqa::X);
   protected static final fqo.m O = new fqo.m(fqa::Y);
   protected static final fqo.m P = new fqo.m(fqa::Z);
   protected static final fqo.m Q = new fqo.m(fqa::aa);
   protected static final fqo.m R = new fqo.m(fqa::ab);
   protected static final fqo.m S = new fqo.m(fqa::ac);
   protected static final fqo.m T = new fqo.m(fqa::ad);
   protected static final fqo.m U = new fqo.m(fqa::ae);
   protected static final fqo.m V = new fqo.m(fqa::aq);
   protected static final fqo.m W = new fqo.m(fqa::af);
   protected static final fqo.m X = new fqo.m(fqa::ag);
   protected static final fqo.m Y = new fqo.m(fqa::ah);
   protected static final fqo.m Z = new fqo.m(fqa::ai);
   protected static final fqo.m aa = new fqo.m(fqa::aj);
   protected static final fqo.m ab = new fqo.m(fqa::ak);
   protected static final fqo.m ac = new fqo.m(fqa::al);
   protected static final fqo.m ad = new fqo.m(fqa::am);
   protected static final fqo.m ae = new fqo.m(fqa::an);
   protected static final fqo.m af = new fqo.m(fqa::ao);
   protected static final fqo.m ag = new fqo.m(fqa::ap);
   protected static final fqo.m ah = new fqo.m(fqa::ar);
   protected static final fqo.m ai = new fqo.m(fqa::as);
   protected static final fqo.m aj = new fqo.m(fqa::at);
   protected static final fqo.m ak = new fqo.m(fqa::au);
   protected static final fqo.n al = new fqo.n(gbg.e, false, true);
   protected static final fqo.n am = new fqo.n(gbg.e, false, false);
   protected static final fqo.e an = new fqo.e();
   protected static final fqo.o ao = new fqo.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final fqo.o ap = new fqo.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final fqo.o aq = new fqo.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final fqo.g ar = new fqo.g(true);
   protected static final fqo.g as = new fqo.g(false);
   protected static final fqo.l at = new fqo.l(true);
   protected static final fqo.l au = new fqo.l(false);
   protected static final fqo.c av = new fqo.c(true);
   protected static final fqo.c aw = new fqo.c(false);
   protected static final fqo.d ax = new fqo.d("always", 519);
   protected static final fqo.d ay = new fqo.d("==", 514);
   protected static final fqo.d az = new fqo.d("<=", 515);
   protected static final fqo.d aA = new fqo.d(">", 516);
   protected static final fqo.q aB = new fqo.q(true, true);
   protected static final fqo.q aC = new fqo.q(true, false);
   protected static final fqo.q aD = new fqo.q(false, true);
   protected static final fqo.f aE = new fqo.f("no_layering", () -> {
   }, () -> {
   });
   protected static final fqo.f aF = new fqo.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final fqo.f aG = new fqo.f("view_offset_z_layering", () -> {
      enk $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      enk $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final fqo.k aH = new fqo.k("main_target", () -> {
   }, () -> {
   });
   protected static final fqo.k aI = new fqo.k("outline_target", () -> esr.N().f.s().a(false), () -> esr.N().g().a(false));
   protected static final fqo.k aJ = new fqo.k("translucent_target", () -> {
      if (esr.L()) {
         esr.N().f.t().a(false);
      }
   }, () -> {
      if (esr.L()) {
         esr.N().g().a(false);
      }
   });
   protected static final fqo.k aK = new fqo.k("particles_target", () -> {
      if (esr.L()) {
         esr.N().f.v().a(false);
      }
   }, () -> {
      if (esr.L()) {
         esr.N().g().a(false);
      }
   });
   protected static final fqo.k aL = new fqo.k("weather_target", () -> {
      if (esr.L()) {
         esr.N().f.w().a(false);
      }
   }, () -> {
      if (esr.L()) {
         esr.N().g().a(false);
      }
   });
   protected static final fqo.k aM = new fqo.k("clouds_target", () -> {
      if (esr.L()) {
         esr.N().f.x().a(false);
      }
   }, () -> {
      if (esr.L()) {
         esr.N().g().a(false);
      }
   });
   protected static final fqo.k aN = new fqo.k("item_entity_target", () -> {
      if (esr.L()) {
         esr.N().f.u().a(false);
      }
   }, () -> {
      if (esr.L()) {
         esr.N().g().a(false);
      }
   });
   protected static final fqo.h aO = new fqo.h(OptionalDouble.of(1.0));
   protected static final fqo.b aP = new fqo.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final fqo.b aQ = new fqo.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public fqo(String $$0, Runnable $$1, Runnable $$2) {
      this.b = $$0;
      this.aS = $$1;
      this.aT = $$2;
   }

   public void a() {
      this.aS.run();
   }

   public void b() {
      this.aT.run();
   }

   @Override
   public String toString() {
      return this.b;
   }

   private static void a(float $$0) {
      long $$1 = (long)((double)ac.b() * esr.N().m.aj().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends fqo {
      private final boolean aR;

      public a(String $$0, Runnable $$1, Runnable $$2, boolean $$3) {
         super($$0, $$1, $$2);
         this.aR = $$3;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aR + "]";
      }
   }

   protected static class b extends fqo {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends fqo.a {
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

   protected static class d extends fqo {
      private final String aR;

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
         this.aR = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aR + "]";
      }
   }

   protected static class e extends fqo {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<agg> c() {
         return Optional.empty();
      }
   }

   protected static class f extends fqo {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends fqo.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               esr.N().j.n().c();
            }
         }, () -> {
            if ($$0) {
               esr.N().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends fqo {
      private final OptionalDouble aR;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)esr.N().aL().k() / 1920.0F * 2.5F));
               }
            }
         }, () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               RenderSystem.lineWidth(1.0F);
            }
         });
         this.aR = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + (this.aR.isPresent() ? this.aR.getAsDouble() : "window_scale") + "]";
      }
   }

   protected static class i extends fqo.e {
      private final Optional<agg> aR;

      i(ImmutableList<Triple<agg, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<agg, Boolean, Boolean> $$2 = (Triple<agg, Boolean, Boolean>)var2.next();
               gbi $$3 = esr.N().X();
               $$3.b((agg)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (agg)$$2.getLeft());
            }
         }, () -> {
         });
         this.aR = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<agg> c() {
         return this.aR;
      }

      public static fqo.i.a d() {
         return new fqo.i.a();
      }

      public static final class a {
         private final Builder<Triple<agg, Boolean, Boolean>> a = new Builder();

         public fqo.i.a a(agg $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public fqo.i a() {
            return new fqo.i(this.a.build());
         }
      }
   }

   protected static final class j extends fqo.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends fqo {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends fqo.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               esr.N().j.o().a();
            }
         }, () -> {
            if ($$0) {
               esr.N().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends fqo {
      private final Optional<Supplier<fqv>> aR;

      public m(Supplier<fqv> $$0) {
         super("shader", () -> RenderSystem.setShader($$0), () -> {
         });
         this.aR = Optional.of($$0);
      }

      public m() {
         super("shader", () -> RenderSystem.setShader(() -> null), () -> {
         });
         this.aR = Optional.empty();
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aR + "]";
      }
   }

   protected static class n extends fqo.e {
      private final Optional<agg> aR;
      private final boolean aS;
      private final boolean aT;

      public n(agg $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gbi $$3 = esr.N().X();
            $$3.b($$0).a($$1, $$2);
            RenderSystem.setShaderTexture(0, $$0);
         }, () -> {
         });
         this.aR = Optional.of($$0);
         this.aS = $$1;
         this.aT = $$2;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.aR + "(blur=" + this.aS + ", mipmap=" + this.aT + ")]";
      }

      @Override
      protected Optional<agg> c() {
         return this.aR;
      }
   }

   protected static class o extends fqo {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends fqo {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends fqo {
      private final boolean aR;
      private final boolean aS;

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
         this.aR = $$0;
         this.aS = $$1;
      }

      @Override
      public String toString() {
         return this.b + "[writeColor=" + this.aR + ", writeDepth=" + this.aS + "]";
      }
   }
}
