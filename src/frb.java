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

public abstract class frb {
   private static final float aR = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aS;
   private final Runnable aT;
   protected static final frb.p c = new frb.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final frb.p d = new frb.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final frb.p e = new frb.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final frb.p f = new frb.p(
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
   protected static final frb.p g = new frb.p(
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
   protected static final frb.p h = new frb.p(
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
   protected static final frb.m i = new frb.m();
   protected static final frb.m j = new frb.m(fqn::v);
   protected static final frb.m k = new frb.m(fqn::p);
   protected static final frb.m l = new frb.m(fqn::r);
   protected static final frb.m m = new frb.m(fqn::s);
   protected static final frb.m n = new frb.m(fqn::w);
   protected static final frb.m o = new frb.m(fqn::q);
   protected static final frb.m p = new frb.m(fqn::z);
   protected static final frb.m q = new frb.m(fqn::A);
   protected static final frb.m r = new frb.m(fqn::B);
   protected static final frb.m s = new frb.m(fqn::C);
   protected static final frb.m t = new frb.m(fqn::D);
   protected static final frb.m u = new frb.m(fqn::E);
   protected static final frb.m v = new frb.m(fqn::F);
   protected static final frb.m w = new frb.m(fqn::G);
   protected static final frb.m x = new frb.m(fqn::H);
   protected static final frb.m y = new frb.m(fqn::I);
   protected static final frb.m z = new frb.m(fqn::J);
   protected static final frb.m A = new frb.m(fqn::K);
   protected static final frb.m B = new frb.m(fqn::L);
   protected static final frb.m C = new frb.m(fqn::M);
   protected static final frb.m D = new frb.m(fqn::N);
   protected static final frb.m E = new frb.m(fqn::O);
   protected static final frb.m F = new frb.m(fqn::P);
   protected static final frb.m G = new frb.m(fqn::Q);
   protected static final frb.m H = new frb.m(fqn::R);
   protected static final frb.m I = new frb.m(fqn::S);
   protected static final frb.m J = new frb.m(fqn::T);
   protected static final frb.m K = new frb.m(fqn::U);
   protected static final frb.m L = new frb.m(fqn::V);
   protected static final frb.m M = new frb.m(fqn::W);
   protected static final frb.m N = new frb.m(fqn::X);
   protected static final frb.m O = new frb.m(fqn::Y);
   protected static final frb.m P = new frb.m(fqn::Z);
   protected static final frb.m Q = new frb.m(fqn::aa);
   protected static final frb.m R = new frb.m(fqn::ab);
   protected static final frb.m S = new frb.m(fqn::ac);
   protected static final frb.m T = new frb.m(fqn::ad);
   protected static final frb.m U = new frb.m(fqn::ae);
   protected static final frb.m V = new frb.m(fqn::aq);
   protected static final frb.m W = new frb.m(fqn::af);
   protected static final frb.m X = new frb.m(fqn::ag);
   protected static final frb.m Y = new frb.m(fqn::ah);
   protected static final frb.m Z = new frb.m(fqn::ai);
   protected static final frb.m aa = new frb.m(fqn::aj);
   protected static final frb.m ab = new frb.m(fqn::ak);
   protected static final frb.m ac = new frb.m(fqn::al);
   protected static final frb.m ad = new frb.m(fqn::am);
   protected static final frb.m ae = new frb.m(fqn::an);
   protected static final frb.m af = new frb.m(fqn::ao);
   protected static final frb.m ag = new frb.m(fqn::ap);
   protected static final frb.m ah = new frb.m(fqn::ar);
   protected static final frb.m ai = new frb.m(fqn::as);
   protected static final frb.m aj = new frb.m(fqn::at);
   protected static final frb.m ak = new frb.m(fqn::au);
   protected static final frb.n al = new frb.n(gbt.e, false, true);
   protected static final frb.n am = new frb.n(gbt.e, false, false);
   protected static final frb.e an = new frb.e();
   protected static final frb.o ao = new frb.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final frb.o ap = new frb.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final frb.o aq = new frb.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final frb.g ar = new frb.g(true);
   protected static final frb.g as = new frb.g(false);
   protected static final frb.l at = new frb.l(true);
   protected static final frb.l au = new frb.l(false);
   protected static final frb.c av = new frb.c(true);
   protected static final frb.c aw = new frb.c(false);
   protected static final frb.d ax = new frb.d("always", 519);
   protected static final frb.d ay = new frb.d("==", 514);
   protected static final frb.d az = new frb.d("<=", 515);
   protected static final frb.d aA = new frb.d(">", 516);
   protected static final frb.q aB = new frb.q(true, true);
   protected static final frb.q aC = new frb.q(true, false);
   protected static final frb.q aD = new frb.q(false, true);
   protected static final frb.f aE = new frb.f("no_layering", () -> {
   }, () -> {
   });
   protected static final frb.f aF = new frb.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final frb.f aG = new frb.f("view_offset_z_layering", () -> {
      enw $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      enw $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final frb.k aH = new frb.k("main_target", () -> {
   }, () -> {
   });
   protected static final frb.k aI = new frb.k("outline_target", () -> etd.N().f.s().a(false), () -> etd.N().g().a(false));
   protected static final frb.k aJ = new frb.k("translucent_target", () -> {
      if (etd.L()) {
         etd.N().f.t().a(false);
      }
   }, () -> {
      if (etd.L()) {
         etd.N().g().a(false);
      }
   });
   protected static final frb.k aK = new frb.k("particles_target", () -> {
      if (etd.L()) {
         etd.N().f.v().a(false);
      }
   }, () -> {
      if (etd.L()) {
         etd.N().g().a(false);
      }
   });
   protected static final frb.k aL = new frb.k("weather_target", () -> {
      if (etd.L()) {
         etd.N().f.w().a(false);
      }
   }, () -> {
      if (etd.L()) {
         etd.N().g().a(false);
      }
   });
   protected static final frb.k aM = new frb.k("clouds_target", () -> {
      if (etd.L()) {
         etd.N().f.x().a(false);
      }
   }, () -> {
      if (etd.L()) {
         etd.N().g().a(false);
      }
   });
   protected static final frb.k aN = new frb.k("item_entity_target", () -> {
      if (etd.L()) {
         etd.N().f.u().a(false);
      }
   }, () -> {
      if (etd.L()) {
         etd.N().g().a(false);
      }
   });
   protected static final frb.h aO = new frb.h(OptionalDouble.of(1.0));
   protected static final frb.b aP = new frb.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final frb.b aQ = new frb.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public frb(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * etd.N().m.aj().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends frb {
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

   protected static class b extends frb {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends frb.a {
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

   protected static class d extends frb {
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

   protected static class e extends frb {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<agi> c() {
         return Optional.empty();
      }
   }

   protected static class f extends frb {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends frb.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               etd.N().j.n().c();
            }
         }, () -> {
            if ($$0) {
               etd.N().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends frb {
      private final OptionalDouble aR;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)etd.N().aL().k() / 1920.0F * 2.5F));
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

   protected static class i extends frb.e {
      private final Optional<agi> aR;

      i(ImmutableList<Triple<agi, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<agi, Boolean, Boolean> $$2 = (Triple<agi, Boolean, Boolean>)var2.next();
               gbv $$3 = etd.N().X();
               $$3.b((agi)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (agi)$$2.getLeft());
            }
         }, () -> {
         });
         this.aR = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<agi> c() {
         return this.aR;
      }

      public static frb.i.a d() {
         return new frb.i.a();
      }

      public static final class a {
         private final Builder<Triple<agi, Boolean, Boolean>> a = new Builder();

         public frb.i.a a(agi $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public frb.i a() {
            return new frb.i(this.a.build());
         }
      }
   }

   protected static final class j extends frb.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends frb {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends frb.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               etd.N().j.o().a();
            }
         }, () -> {
            if ($$0) {
               etd.N().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends frb {
      private final Optional<Supplier<fri>> aR;

      public m(Supplier<fri> $$0) {
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

   protected static class n extends frb.e {
      private final Optional<agi> aR;
      private final boolean aS;
      private final boolean aT;

      public n(agi $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gbv $$3 = etd.N().X();
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
      protected Optional<agi> c() {
         return this.aR;
      }
   }

   protected static class o extends frb {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends frb {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends frb {
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
