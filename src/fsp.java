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

public abstract class fsp {
   private static final float aS = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aT;
   private final Runnable aU;
   protected static final fsp.p c = new fsp.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final fsp.p d = new fsp.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fsp.p e = new fsp.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fsp.p f = new fsp.p(
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
   protected static final fsp.p g = new fsp.p(
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
   protected static final fsp.p h = new fsp.p(
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
   protected static final fsp.m i = new fsp.m();
   protected static final fsp.m j = new fsp.m(fsb::v);
   protected static final fsp.m k = new fsp.m(fsb::p);
   protected static final fsp.m l = new fsp.m(fsb::r);
   protected static final fsp.m m = new fsp.m(fsb::s);
   protected static final fsp.m n = new fsp.m(fsb::w);
   protected static final fsp.m o = new fsp.m(fsb::q);
   protected static final fsp.m p = new fsp.m(fsb::z);
   protected static final fsp.m q = new fsp.m(fsb::A);
   protected static final fsp.m r = new fsp.m(fsb::B);
   protected static final fsp.m s = new fsp.m(fsb::C);
   protected static final fsp.m t = new fsp.m(fsb::D);
   protected static final fsp.m u = new fsp.m(fsb::E);
   protected static final fsp.m v = new fsp.m(fsb::F);
   protected static final fsp.m w = new fsp.m(fsb::G);
   protected static final fsp.m x = new fsp.m(fsb::H);
   protected static final fsp.m y = new fsp.m(fsb::I);
   protected static final fsp.m z = new fsp.m(fsb::J);
   protected static final fsp.m A = new fsp.m(fsb::K);
   protected static final fsp.m B = new fsp.m(fsb::L);
   protected static final fsp.m C = new fsp.m(fsb::M);
   protected static final fsp.m D = new fsp.m(fsb::N);
   protected static final fsp.m E = new fsp.m(fsb::O);
   protected static final fsp.m F = new fsp.m(fsb::P);
   protected static final fsp.m G = new fsp.m(fsb::Q);
   protected static final fsp.m H = new fsp.m(fsb::R);
   protected static final fsp.m I = new fsp.m(fsb::S);
   protected static final fsp.m J = new fsp.m(fsb::T);
   protected static final fsp.m K = new fsp.m(fsb::U);
   protected static final fsp.m L = new fsp.m(fsb::W);
   protected static final fsp.m M = new fsp.m(fsb::X);
   protected static final fsp.m N = new fsp.m(fsb::Y);
   protected static final fsp.m O = new fsp.m(fsb::Z);
   protected static final fsp.m P = new fsp.m(fsb::aa);
   protected static final fsp.m Q = new fsp.m(fsb::ab);
   protected static final fsp.m R = new fsp.m(fsb::ac);
   protected static final fsp.m S = new fsp.m(fsb::ad);
   protected static final fsp.m T = new fsp.m(fsb::ae);
   protected static final fsp.m U = new fsp.m(fsb::af);
   protected static final fsp.m V = new fsp.m(fsb::ar);
   protected static final fsp.m W = new fsp.m(fsb::ag);
   protected static final fsp.m X = new fsp.m(fsb::ah);
   protected static final fsp.m Y = new fsp.m(fsb::ai);
   protected static final fsp.m Z = new fsp.m(fsb::aj);
   protected static final fsp.m aa = new fsp.m(fsb::ak);
   protected static final fsp.m ab = new fsp.m(fsb::al);
   protected static final fsp.m ac = new fsp.m(fsb::am);
   protected static final fsp.m ad = new fsp.m(fsb::an);
   protected static final fsp.m ae = new fsp.m(fsb::ao);
   protected static final fsp.m af = new fsp.m(fsb::ap);
   protected static final fsp.m ag = new fsp.m(fsb::aq);
   protected static final fsp.m ah = new fsp.m(fsb::as);
   protected static final fsp.m ai = new fsp.m(fsb::at);
   protected static final fsp.m aj = new fsp.m(fsb::au);
   protected static final fsp.m ak = new fsp.m(fsb::av);
   protected static final fsp.m al = new fsp.m(fsb::V);
   protected static final fsp.n am = new fsp.n(gdn.e, false, true);
   protected static final fsp.n an = new fsp.n(gdn.e, false, false);
   protected static final fsp.e ao = new fsp.e();
   protected static final fsp.o ap = new fsp.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final fsp.o aq = new fsp.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final fsp.o ar = new fsp.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final fsp.g as = new fsp.g(true);
   protected static final fsp.g at = new fsp.g(false);
   protected static final fsp.l au = new fsp.l(true);
   protected static final fsp.l av = new fsp.l(false);
   protected static final fsp.c aw = new fsp.c(true);
   protected static final fsp.c ax = new fsp.c(false);
   protected static final fsp.d ay = new fsp.d("always", 519);
   protected static final fsp.d az = new fsp.d("==", 514);
   protected static final fsp.d aA = new fsp.d("<=", 515);
   protected static final fsp.d aB = new fsp.d(">", 516);
   protected static final fsp.q aC = new fsp.q(true, true);
   protected static final fsp.q aD = new fsp.q(true, false);
   protected static final fsp.q aE = new fsp.q(false, true);
   protected static final fsp.f aF = new fsp.f("no_layering", () -> {
   }, () -> {
   });
   protected static final fsp.f aG = new fsp.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final fsp.f aH = new fsp.f("view_offset_z_layering", () -> {
      epd $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      epd $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final fsp.k aI = new fsp.k("main_target", () -> {
   }, () -> {
   });
   protected static final fsp.k aJ = new fsp.k("outline_target", () -> euk.N().f.s().a(false), () -> euk.N().g().a(false));
   protected static final fsp.k aK = new fsp.k("translucent_target", () -> {
      if (euk.L()) {
         euk.N().f.t().a(false);
      }
   }, () -> {
      if (euk.L()) {
         euk.N().g().a(false);
      }
   });
   protected static final fsp.k aL = new fsp.k("particles_target", () -> {
      if (euk.L()) {
         euk.N().f.v().a(false);
      }
   }, () -> {
      if (euk.L()) {
         euk.N().g().a(false);
      }
   });
   protected static final fsp.k aM = new fsp.k("weather_target", () -> {
      if (euk.L()) {
         euk.N().f.w().a(false);
      }
   }, () -> {
      if (euk.L()) {
         euk.N().g().a(false);
      }
   });
   protected static final fsp.k aN = new fsp.k("clouds_target", () -> {
      if (euk.L()) {
         euk.N().f.x().a(false);
      }
   }, () -> {
      if (euk.L()) {
         euk.N().g().a(false);
      }
   });
   protected static final fsp.k aO = new fsp.k("item_entity_target", () -> {
      if (euk.L()) {
         euk.N().f.u().a(false);
      }
   }, () -> {
      if (euk.L()) {
         euk.N().g().a(false);
      }
   });
   protected static final fsp.h aP = new fsp.h(OptionalDouble.of(1.0));
   protected static final fsp.b aQ = new fsp.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final fsp.b aR = new fsp.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public fsp(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * euk.N().m.aj().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends fsp {
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

   protected static class b extends fsp {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends fsp.a {
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

   protected static class d extends fsp {
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

   protected static class e extends fsp {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<agt> c() {
         return Optional.empty();
      }
   }

   protected static class f extends fsp {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends fsp.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               euk.N().j.n().c();
            }
         }, () -> {
            if ($$0) {
               euk.N().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends fsp {
      private final OptionalDouble aS;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)euk.N().aL().k() / 1920.0F * 2.5F));
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

   protected static class i extends fsp.e {
      private final Optional<agt> aS;

      i(ImmutableList<Triple<agt, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<agt, Boolean, Boolean> $$2 = (Triple<agt, Boolean, Boolean>)var2.next();
               gdp $$3 = euk.N().X();
               $$3.b((agt)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (agt)$$2.getLeft());
            }
         }, () -> {
         });
         this.aS = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<agt> c() {
         return this.aS;
      }

      public static fsp.i.a d() {
         return new fsp.i.a();
      }

      public static final class a {
         private final Builder<Triple<agt, Boolean, Boolean>> a = new Builder();

         public fsp.i.a a(agt $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public fsp.i a() {
            return new fsp.i(this.a.build());
         }
      }
   }

   protected static final class j extends fsp.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends fsp {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends fsp.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               euk.N().j.o().a();
            }
         }, () -> {
            if ($$0) {
               euk.N().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends fsp {
      private final Optional<Supplier<fsw>> aS;

      public m(Supplier<fsw> $$0) {
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

   protected static class n extends fsp.e {
      private final Optional<agt> aS;
      private final boolean aT;
      private final boolean aU;

      public n(agt $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gdp $$3 = euk.N().X();
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
      protected Optional<agt> c() {
         return this.aS;
      }
   }

   protected static class o extends fsp {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends fsp {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends fsp {
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
