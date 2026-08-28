import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnl extends hpw {
   static final Logger c = LogUtils.getLogger();
   private static final wy C = wy.c("mco.selectServer.create");
   private static final wy D = wy.c("mco.selectServer.create.subtitle");
   private static final wy E = wy.c("mco.configure.world.switch.slot");
   private static final wy F = wy.c("mco.configure.world.switch.slot.subtitle");
   private static final wy G = wy.c("mco.reset.world.generate");
   private static final wy H = wy.c("mco.reset.world.title");
   private static final wy I = wy.c("mco.reset.world.warning");
   public static final wy a = wy.c("mco.create.world.reset.title");
   private static final wy J = wy.c("mco.reset.world.resetting.screen.title");
   private static final wy K = wy.c("mco.reset.world.template");
   private static final wy L = wy.c("mco.reset.world.adventure");
   private static final wy M = wy.c("mco.reset.world.experience");
   private static final wy N = wy.c("mco.reset.world.inspiration");
   private final fyn O;
   private final flp P;
   private final wy Q;
   private final int R;
   private final wy S;
   private static final alg T = alg.b("textures/gui/realms/upload.png");
   private static final alg U = alg.b("textures/gui/realms/adventure.png");
   private static final alg V = alg.b("textures/gui/realms/survival_spawn.png");
   private static final alg W = alg.b("textures/gui/realms/new_world.png");
   private static final alg X = alg.b("textures/gui/realms/experience.png");
   private static final alg Y = alg.b("textures/gui/realms/inspiration.png");
   fmg Z;
   fmg aa;
   fmg ab;
   fmg ac;
   public final int b;
   @Nullable
   private final fon ad;
   private final Runnable ae;
   private final fwj af = new fwj(this);

   private fnl(fyn $$0, flp $$1, int $$2, wy $$3, wy $$4, int $$5, wy $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fnl(fyn $$0, flp $$1, int $$2, wy $$3, wy $$4, int $$5, wy $$6, @Nullable fon $$7, Runnable $$8) {
      super($$3);
      this.O = $$0;
      this.P = $$1;
      this.b = $$2;
      this.Q = $$4;
      this.R = $$5;
      this.S = $$6;
      this.ad = $$7;
      this.ae = $$8;
   }

   public static fnl a(fyn $$0, flp $$1, fon $$2, Runnable $$3) {
      return new fnl($$0, $$1, $$1.p, C, D, -6250336, a, $$2, $$3);
   }

   public static fnl a(fyn $$0, int $$1, flp $$2, Runnable $$3) {
      return new fnl($$0, $$2, $$1, E, F, -6250336, a, $$3);
   }

   public static fnl a(fyn $$0, flp $$1, Runnable $$2) {
      return new fnl($$0, $$1, $$1.p, H, I, -65536, J, $$2);
   }

   @Override
   public void aO_() {
      fwn $$0 = this.af.a(fwn.d());
      $$0.c().a(9 / 3);
      $$0.a(new fuc(this.l, this.p), fwm::b);
      $$0.a(new fuc(this.Q, this.p).b(this.R), fwm::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fko $$0 = fko.a();

            try {
               fmg $$1 = $$0.a(1, 10, flp.d.a);
               fmg $$2 = $$0.a(1, 10, flp.d.c);
               fmg $$3 = $$0.a(1, 10, flp.d.d);
               fmg $$4 = $$0.a(1, 10, flp.d.e);
               fnl.this.m.execute(() -> {
                  fnl.this.Z = $$1;
                  fnl.this.aa = $$2;
                  fnl.this.ab = $$3;
                  fnl.this.ac = $$4;
               });
            } catch (fmk var6) {
               fnl.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fwi $$1 = this.af.c(new fwi());
      fwi.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fnl.a(this.m.h, G, W, $$0x -> fku.a(this.m, this.O, this, this.b, this.P, this.ad)));
      $$2.a(new fnl.a(this.m.h, fnm.a, T, $$0x -> this.m.a(new fnm(this.ad, this.P.a, this.b, this))));
      $$2.a(new fnl.a(this.m.h, K, V, $$0x -> this.m.a(new fnn(K, this::a, flp.d.a, this.Z))));
      $$2.a(fwo.b(16), 3);
      $$2.a(new fnl.a(this.m.h, L, U, $$0x -> this.m.a(new fnn(L, this::a, flp.d.c, this.aa))));
      $$2.a(new fnl.a(this.m.h, M, X, $$0x -> this.m.a(new fnn(M, this::a, flp.d.d, this.ab))));
      $$2.a(new fnl.a(this.m.h, N, Y, $$0x -> this.m.a(new fnn(N, this::a, flp.d.e, this.ac))));
      this.af.b(fsv.a(wx.k, $$0x -> this.aL_()).a());
      this.af.a($$1x -> {
         fst var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.af.a();
   }

   @Override
   public wy i() {
      return wx.a(this.n(), this.Q);
   }

   @Override
   public void aL_() {
      this.m.a(this.O);
   }

   private void a(@Nullable fmf $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new foo($$0, this.P.a, this.S, this.ae));
      }

      fkj.g();
   }

   private void a(fol $$0) {
      List<fol> $$1 = new ArrayList<>();
      if (this.ad != null) {
         $$1.add(this.ad);
      }

      if (this.b != this.P.p) {
         $$1.add(new fot(this.P.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fne(this.O, $$1.toArray(new fol[0])));
   }

   class a extends fsv {
      private static final alg b = alg.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final alg v;

      a(final fsf $$0, final wy $$1, final alg $$2, final fsv.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fsh $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.D();
         int $$5 = -1;
         if ($$4) {
            $$5 = axw.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.F();
         int $$7 = this.G();
         $$0.a(gqx::H, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(gqx::H, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(fnl.this.p, this.B(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
