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

public abstract class frg {
   private static final float aR = 0.99975586F;
   public static final double a = 8.0;
   protected final String b;
   private final Runnable aS;
   private final Runnable aT;
   protected static final frg.p c = new frg.p("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   protected static final frg.p d = new frg.p("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final frg.p e = new frg.p("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   });
   protected static final frg.p f = new frg.p(
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
   protected static final frg.p g = new frg.p(
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
   protected static final frg.p h = new frg.p(
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
   protected static final frg.m i = new frg.m();
   protected static final frg.m j = new frg.m(fqs::v);
   protected static final frg.m k = new frg.m(fqs::p);
   protected static final frg.m l = new frg.m(fqs::r);
   protected static final frg.m m = new frg.m(fqs::s);
   protected static final frg.m n = new frg.m(fqs::w);
   protected static final frg.m o = new frg.m(fqs::q);
   protected static final frg.m p = new frg.m(fqs::z);
   protected static final frg.m q = new frg.m(fqs::A);
   protected static final frg.m r = new frg.m(fqs::B);
   protected static final frg.m s = new frg.m(fqs::C);
   protected static final frg.m t = new frg.m(fqs::D);
   protected static final frg.m u = new frg.m(fqs::E);
   protected static final frg.m v = new frg.m(fqs::F);
   protected static final frg.m w = new frg.m(fqs::G);
   protected static final frg.m x = new frg.m(fqs::H);
   protected static final frg.m y = new frg.m(fqs::I);
   protected static final frg.m z = new frg.m(fqs::J);
   protected static final frg.m A = new frg.m(fqs::K);
   protected static final frg.m B = new frg.m(fqs::L);
   protected static final frg.m C = new frg.m(fqs::M);
   protected static final frg.m D = new frg.m(fqs::N);
   protected static final frg.m E = new frg.m(fqs::O);
   protected static final frg.m F = new frg.m(fqs::P);
   protected static final frg.m G = new frg.m(fqs::Q);
   protected static final frg.m H = new frg.m(fqs::R);
   protected static final frg.m I = new frg.m(fqs::S);
   protected static final frg.m J = new frg.m(fqs::T);
   protected static final frg.m K = new frg.m(fqs::U);
   protected static final frg.m L = new frg.m(fqs::V);
   protected static final frg.m M = new frg.m(fqs::W);
   protected static final frg.m N = new frg.m(fqs::X);
   protected static final frg.m O = new frg.m(fqs::Y);
   protected static final frg.m P = new frg.m(fqs::Z);
   protected static final frg.m Q = new frg.m(fqs::aa);
   protected static final frg.m R = new frg.m(fqs::ab);
   protected static final frg.m S = new frg.m(fqs::ac);
   protected static final frg.m T = new frg.m(fqs::ad);
   protected static final frg.m U = new frg.m(fqs::ae);
   protected static final frg.m V = new frg.m(fqs::aq);
   protected static final frg.m W = new frg.m(fqs::af);
   protected static final frg.m X = new frg.m(fqs::ag);
   protected static final frg.m Y = new frg.m(fqs::ah);
   protected static final frg.m Z = new frg.m(fqs::ai);
   protected static final frg.m aa = new frg.m(fqs::aj);
   protected static final frg.m ab = new frg.m(fqs::ak);
   protected static final frg.m ac = new frg.m(fqs::al);
   protected static final frg.m ad = new frg.m(fqs::am);
   protected static final frg.m ae = new frg.m(fqs::an);
   protected static final frg.m af = new frg.m(fqs::ao);
   protected static final frg.m ag = new frg.m(fqs::ap);
   protected static final frg.m ah = new frg.m(fqs::ar);
   protected static final frg.m ai = new frg.m(fqs::as);
   protected static final frg.m aj = new frg.m(fqs::at);
   protected static final frg.m ak = new frg.m(fqs::au);
   protected static final frg.n al = new frg.n(gby.e, false, true);
   protected static final frg.n am = new frg.n(gby.e, false, false);
   protected static final frg.e an = new frg.e();
   protected static final frg.o ao = new frg.o("default_texturing", () -> {
   }, () -> {
   });
   protected static final frg.o ap = new frg.o("glint_texturing", () -> a(8.0F), () -> RenderSystem.resetTextureMatrix());
   protected static final frg.o aq = new frg.o("entity_glint_texturing", () -> a(0.16F), () -> RenderSystem.resetTextureMatrix());
   protected static final frg.g ar = new frg.g(true);
   protected static final frg.g as = new frg.g(false);
   protected static final frg.l at = new frg.l(true);
   protected static final frg.l au = new frg.l(false);
   protected static final frg.c av = new frg.c(true);
   protected static final frg.c aw = new frg.c(false);
   protected static final frg.d ax = new frg.d("always", 519);
   protected static final frg.d ay = new frg.d("==", 514);
   protected static final frg.d az = new frg.d("<=", 515);
   protected static final frg.d aA = new frg.d(">", 516);
   protected static final frg.q aB = new frg.q(true, true);
   protected static final frg.q aC = new frg.q(true, false);
   protected static final frg.q aD = new frg.q(false, true);
   protected static final frg.f aE = new frg.f("no_layering", () -> {
   }, () -> {
   });
   protected static final frg.f aF = new frg.f("polygon_offset_layering", () -> {
      RenderSystem.polygonOffset(-1.0F, -10.0F);
      RenderSystem.enablePolygonOffset();
   }, () -> {
      RenderSystem.polygonOffset(0.0F, 0.0F);
      RenderSystem.disablePolygonOffset();
   });
   protected static final frg.f aG = new frg.f("view_offset_z_layering", () -> {
      eob $$0 = RenderSystem.getModelViewStack();
      $$0.a();
      $$0.b(0.99975586F, 0.99975586F, 0.99975586F);
      RenderSystem.applyModelViewMatrix();
   }, () -> {
      eob $$0 = RenderSystem.getModelViewStack();
      $$0.b();
      RenderSystem.applyModelViewMatrix();
   });
   protected static final frg.k aH = new frg.k("main_target", () -> {
   }, () -> {
   });
   protected static final frg.k aI = new frg.k("outline_target", () -> eti.N().f.s().a(false), () -> eti.N().g().a(false));
   protected static final frg.k aJ = new frg.k("translucent_target", () -> {
      if (eti.L()) {
         eti.N().f.t().a(false);
      }
   }, () -> {
      if (eti.L()) {
         eti.N().g().a(false);
      }
   });
   protected static final frg.k aK = new frg.k("particles_target", () -> {
      if (eti.L()) {
         eti.N().f.v().a(false);
      }
   }, () -> {
      if (eti.L()) {
         eti.N().g().a(false);
      }
   });
   protected static final frg.k aL = new frg.k("weather_target", () -> {
      if (eti.L()) {
         eti.N().f.w().a(false);
      }
   }, () -> {
      if (eti.L()) {
         eti.N().g().a(false);
      }
   });
   protected static final frg.k aM = new frg.k("clouds_target", () -> {
      if (eti.L()) {
         eti.N().f.x().a(false);
      }
   }, () -> {
      if (eti.L()) {
         eti.N().g().a(false);
      }
   });
   protected static final frg.k aN = new frg.k("item_entity_target", () -> {
      if (eti.L()) {
         eti.N().f.u().a(false);
      }
   }, () -> {
      if (eti.L()) {
         eti.N().g().a(false);
      }
   });
   protected static final frg.h aO = new frg.h(OptionalDouble.of(1.0));
   protected static final frg.b aP = new frg.b("no_color_logic", () -> RenderSystem.disableColorLogicOp(), () -> {
   });
   protected static final frg.b aQ = new frg.b("or_reverse", () -> {
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(GlStateManager.g.n);
   }, () -> RenderSystem.disableColorLogicOp());

   public frg(String $$0, Runnable $$1, Runnable $$2) {
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
      long $$1 = (long)((double)ac.b() * eti.N().m.aj().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends frg {
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

   protected static class b extends frg {
      public b(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class c extends frg.a {
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

   protected static class d extends frg {
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

   protected static class e extends frg {
      public e(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      e() {
         super("texture", () -> {
         }, () -> {
         });
      }

      protected Optional<agm> c() {
         return Optional.empty();
      }
   }

   protected static class f extends frg {
      public f(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class g extends frg.a {
      public g(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               eti.N().j.n().c();
            }
         }, () -> {
            if ($$0) {
               eti.N().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class h extends frg {
      private final OptionalDouble aR;

      public h(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, (float)eti.N().aL().k() / 1920.0F * 2.5F));
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

   protected static class i extends frg.e {
      private final Optional<agm> aR;

      i(ImmutableList<Triple<agm, Boolean, Boolean>> $$0) {
         super(() -> {
            int $$1 = 0;
            UnmodifiableIterator var2 = $$0.iterator();

            while (var2.hasNext()) {
               Triple<agm, Boolean, Boolean> $$2 = (Triple<agm, Boolean, Boolean>)var2.next();
               gca $$3 = eti.N().X();
               $$3.b((agm)$$2.getLeft()).a((Boolean)$$2.getMiddle(), (Boolean)$$2.getRight());
               RenderSystem.setShaderTexture($$1++, (agm)$$2.getLeft());
            }
         }, () -> {
         });
         this.aR = $$0.stream().findFirst().map(Triple::getLeft);
      }

      @Override
      protected Optional<agm> c() {
         return this.aR;
      }

      public static frg.i.a d() {
         return new frg.i.a();
      }

      public static final class a {
         private final Builder<Triple<agm, Boolean, Boolean>> a = new Builder();

         public frg.i.a a(agm $$0, boolean $$1, boolean $$2) {
            this.a.add(Triple.of($$0, $$1, $$2));
            return this;
         }

         public frg.i a() {
            return new frg.i(this.a.build());
         }
      }
   }

   protected static final class j extends frg.o {
      public j(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class k extends frg {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class l extends frg.a {
      public l(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               eti.N().j.o().a();
            }
         }, () -> {
            if ($$0) {
               eti.N().j.o().b();
            }
         }, $$0);
      }
   }

   protected static class m extends frg {
      private final Optional<Supplier<frn>> aR;

      public m(Supplier<frn> $$0) {
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

   protected static class n extends frg.e {
      private final Optional<agm> aR;
      private final boolean aS;
      private final boolean aT;

      public n(agm $$0, boolean $$1, boolean $$2) {
         super(() -> {
            gca $$3 = eti.N().X();
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
      protected Optional<agm> c() {
         return this.aR;
      }
   }

   protected static class o extends frg {
      public o(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class p extends frg {
      public p(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class q extends frg {
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
