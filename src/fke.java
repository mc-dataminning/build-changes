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

public abstract class fke {
   private static final float aS = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aT;
   private final Runnable aU;
   protected static final fke.p c = new fke.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final fke.p d = new fke.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fke.p e = new fke.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final fke.p f = new fke.p(
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
   protected static final fke.p g = new fke.p(
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
   protected static final fke.p h = new fke.p(
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
   protected static final fke.m i = new fke.m();
   protected static final fke.m j = new fke.m(fjq::v);
   protected static final fke.m k = new fke.m(fjq::p);
   protected static final fke.m l = new fke.m(fjq::r);
   protected static final fke.m m = new fke.m(fjq::s);
   protected static final fke.m n = new fke.m(fjq::w);
   protected static final fke.m o = new fke.m(fjq::q);
   protected static final fke.m p = new fke.m(fjq::z);
   protected static final fke.m q = new fke.m(fjq::A);
   protected static final fke.m r = new fke.m(fjq::B);
   protected static final fke.m s = new fke.m(fjq::C);
   protected static final fke.m t = new fke.m(fjq::D);
   protected static final fke.m u = new fke.m(fjq::E);
   protected static final fke.m v = new fke.m(fjq::F);
   protected static final fke.m w = new fke.m(fjq::G);
   protected static final fke.m x = new fke.m(fjq::H);
   protected static final fke.m y = new fke.m(fjq::I);
   protected static final fke.m z = new fke.m(fjq::J);
   protected static final fke.m A = new fke.m(fjq::K);
   protected static final fke.m B = new fke.m(fjq::L);
   protected static final fke.m C = new fke.m(fjq::M);
   protected static final fke.m D = new fke.m(fjq::N);
   protected static final fke.m E = new fke.m(fjq::O);
   protected static final fke.m F = new fke.m(fjq::P);
   protected static final fke.m G = new fke.m(fjq::Q);
   protected static final fke.m H = new fke.m(fjq::R);
   protected static final fke.m I = new fke.m(fjq::S);
   protected static final fke.m J = new fke.m(fjq::T);
   protected static final fke.m K = new fke.m(fjq::U);
   protected static final fke.m L = new fke.m(fjq::V);
   protected static final fke.m M = new fke.m(fjq::W);
   protected static final fke.m N = new fke.m(fjq::X);
   protected static final fke.m O = new fke.m(fjq::Y);
   protected static final fke.m P = new fke.m(fjq::Z);
   protected static final fke.m Q = new fke.m(fjq::aa);
   protected static final fke.m R = new fke.m(fjq::ab);
   protected static final fke.m S = new fke.m(fjq::ac);
   protected static final fke.m T = new fke.m(fjq::ad);
   protected static final fke.m U = new fke.m(fjq::ae);
   protected static final fke.m V = new fke.m(fjq::af);
   protected static final fke.m W = new fke.m(fjq::ar);
   protected static final fke.m X = new fke.m(fjq::ag);
   protected static final fke.m Y = new fke.m(fjq::ah);
   protected static final fke.m Z = new fke.m(fjq::ai);
   protected static final fke.m aa = new fke.m(fjq::aj);
   protected static final fke.m ab = new fke.m(fjq::ak);
   protected static final fke.m ac = new fke.m(fjq::al);
   protected static final fke.m ad = new fke.m(fjq::am);
   protected static final fke.m ae = new fke.m(fjq::an);
   protected static final fke.m af = new fke.m(fjq::ao);
   protected static final fke.m ag = new fke.m(fjq::ap);
   protected static final fke.m ah = new fke.m(fjq::aq);
   protected static final fke.m ai = new fke.m(fjq::as);
   protected static final fke.m aj = new fke.m(fjq::at);
   protected static final fke.m ak = new fke.m(fjq::au);
   protected static final fke.m al = new fke.m(fjq::av);
   protected static final fke.n am = new fke.n(fuu.e, false, true);
   protected static final fke.n an = new fke.n(fuu.e, false, false);
   protected static final fke.e ao = new fke.e();
   protected static final fke.o ap = new fke.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final fke.o aq = new fke.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final fke.o ar = new fke.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final fke.g as = new fke.g(true);
   protected static final fke.g at = new fke.g(false);
   protected static final fke.l au = new fke.l(true);
   protected static final fke.l av = new fke.l(false);
   protected static final fke.c aw = new fke.c(true);
   protected static final fke.c ax = new fke.c(false);
   protected static final fke.d ay = new fke.d("always", 519);
   protected static final fke.d az = new fke.d("==", 514);
   protected static final fke.d aA = new fke.d("<=", 515);
   protected static final fke.d aB = new fke.d(">", 516);
   protected static final fke.q aC = new fke.q(true, true);
   protected static final fke.q aD = new fke.q(true, false);
   protected static final fke.q aE = new fke.q(false, true);
   protected static final fke.f aF = new fke.f("no_layering", () -> {
   }, () -> {
   });
   protected static final fke.f aG = new fke.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final fke.f aH = new fke.f("view_offset_z_layering", () -> {
      eij $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      eij $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final fke.k aI = new fke.k("main_target", () -> {
   }, () -> {
   });
   protected static final fke.k aJ = new fke.k("outline_target", () -> enn.N().f.s().a(false), () -> enn.N().f().a(false));
   protected static final fke.k aK = new fke.k("translucent_target", () -> {
      if (enn.L()) {
         enn.N().f.t().a(false);
      }
   }, () -> {
      if (enn.L()) {
         enn.N().f().a(false);
      }
   });
   protected static final fke.k aL = new fke.k("particles_target", () -> {
      if (enn.L()) {
         enn.N().f.v().a(false);
      }
   }, () -> {
      if (enn.L()) {
         enn.N().f().a(false);
      }
   });
   protected static final fke.k aM = new fke.k("weather_target", () -> {
      if (enn.L()) {
         enn.N().f.w().a(false);
      }
   }, () -> {
      if (enn.L()) {
         enn.N().f().a(false);
      }
   });
   protected static final fke.k aN = new fke.k("clouds_target", () -> {
      if (enn.L()) {
         enn.N().f.x().a(false);
      }
   }, () -> {
      if (enn.L()) {
         enn.N().f().a(false);
      }
   });
   protected static final fke.k aO = new fke.k("item_entity_target", () -> {
      if (enn.L()) {
         enn.N().f.u().a(false);
      }
   }, () -> {
      if (enn.L()) {
         enn.N().f().a(false);
      }
   });
   protected static final fke.h aP = new fke.h(OptionalDouble.of(1.0));
   protected static final fke.b aQ = new fke.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final fke.b aR = new fke.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public fke(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * enn.N().m.ah().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends fke {
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

   protected static class b extends fke {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends fke.a {
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

   protected static class d extends fke {
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

   protected static class e extends fke {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<acq> c() {
         return Optional.empty();
      }
   }

   protected static class f extends fke {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends fke.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               enn.N().j.n().c();
            }
         }, () -> {
            if ($$0) {
               enn.N().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends fke {
      private final OptionalDouble aS;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)enn.N().aM().k() / 1920.0F * 2.5F));
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

   protected static class i extends fke.e {
      private final Optional<acq> aS;

      i(ImmutableList<Triple<acq, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<acq, Boolean, Boolean> $$2 = (Triple<acq, Boolean, Boolean>)var2.next();
               fuw $$3 = enn.N().X();
               $$3.b((acq)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (acq)$$2.getLeft());
            }
         }, () -> {
         });
         this.aS = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<acq> c() {
         return this.aS;
      }

      public static fke.i.a d() {
         return new fke.i.a();
      }

      public static final class a {
         private final Builder<Triple<acq, Boolean, Boolean>> a = new Builder();

         public fke.i.a a(acq $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public fke.i a() {
            return new fke.i(this.a.build());
         }
      }
   }

   protected static final class j extends fke.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends fke {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends fke.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               enn.N().j.o().a();
            }
         }, () -> {
            if ($$0) {
               enn.N().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends fke {
      private final Optional<Supplier<fki>> aS;

      public m(Supplier<fki> $$0) {
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

   protected static class n extends fke.e {
      private final Optional<acq> aS;
      private final boolean aT;
      private final boolean aU;

      public n(acq $$0, boolean $$1, boolean $$2) {
         super(() -> {
            fuw $$3 = enn.N().X();
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
      protected Optional<acq> c() {
         return this.aS;
      }
   }

   protected static class o extends fke {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends fke {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends fke {
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
