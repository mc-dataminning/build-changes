import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjh extends hle {
   static final Logger c = LogUtils.getLogger();
   private static final wp C = wp.c("mco.selectServer.create");
   private static final wp D = wp.c("mco.selectServer.create.subtitle");
   private static final wp E = wp.c("mco.configure.world.switch.slot");
   private static final wp F = wp.c("mco.configure.world.switch.slot.subtitle");
   private static final wp G = wp.c("mco.reset.world.generate");
   private static final wp H = wp.c("mco.reset.world.title");
   private static final wp I = wp.c("mco.reset.world.warning");
   public static final wp a = wp.c("mco.create.world.reset.title");
   private static final wp J = wp.c("mco.reset.world.resetting.screen.title");
   private static final wp K = wp.c("mco.reset.world.template");
   private static final wp L = wp.c("mco.reset.world.adventure");
   private static final wp M = wp.c("mco.reset.world.experience");
   private static final wp N = wp.c("mco.reset.world.inspiration");
   private final ful O;
   private final fhl P;
   private final wp Q;
   private final int R;
   private final wp S;
   private static final akv T = akv.b("textures/gui/realms/upload.png");
   private static final akv U = akv.b("textures/gui/realms/adventure.png");
   private static final akv V = akv.b("textures/gui/realms/survival_spawn.png");
   private static final akv W = akv.b("textures/gui/realms/new_world.png");
   private static final akv X = akv.b("textures/gui/realms/experience.png");
   private static final akv Y = akv.b("textures/gui/realms/inspiration.png");
   fic Z;
   fic aa;
   fic ab;
   fic ac;
   public final int b;
   @Nullable
   private final fkj ad;
   private final Runnable ae;
   private final fsh af = new fsh(this);

   private fjh(ful $$0, fhl $$1, int $$2, wp $$3, wp $$4, int $$5, wp $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fjh(ful $$0, fhl $$1, int $$2, wp $$3, wp $$4, int $$5, wp $$6, @Nullable fkj $$7, Runnable $$8) {
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

   public static fjh a(ful $$0, fhl $$1, fkj $$2, Runnable $$3) {
      return new fjh($$0, $$1, $$1.p, C, D, -6250336, a, $$2, $$3);
   }

   public static fjh a(ful $$0, int $$1, fhl $$2, Runnable $$3) {
      return new fjh($$0, $$2, $$1, E, F, -6250336, a, $$3);
   }

   public static fjh a(ful $$0, fhl $$1, Runnable $$2) {
      return new fjh($$0, $$1, $$1.p, H, I, -65536, J, $$2);
   }

   @Override
   public void aR_() {
      fsl $$0 = this.af.a(fsl.d());
      $$0.c().a(9 / 3);
      $$0.a(new fqa(this.l, this.p), fsk::b);
      $$0.a(new fqa(this.Q, this.p).b(this.R), fsk::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fgk $$0 = fgk.a();

            try {
               fic $$1 = $$0.a(1, 10, fhl.d.a);
               fic $$2 = $$0.a(1, 10, fhl.d.c);
               fic $$3 = $$0.a(1, 10, fhl.d.d);
               fic $$4 = $$0.a(1, 10, fhl.d.e);
               fjh.this.m.execute(() -> {
                  fjh.this.Z = $$1;
                  fjh.this.aa = $$2;
                  fjh.this.ab = $$3;
                  fjh.this.ac = $$4;
               });
            } catch (fig var6) {
               fjh.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fsg $$1 = this.af.c(new fsg());
      fsg.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fjh.a(this.m.h, G, W, $$0x -> fgq.a(this.m, this.O, this, this.b, this.P, this.ad)));
      $$2.a(new fjh.a(this.m.h, fji.a, T, $$0x -> this.m.a(new fji(this.ad, this.P.a, this.b, this))));
      $$2.a(new fjh.a(this.m.h, K, V, $$0x -> this.m.a(new fjj(K, this::a, fhl.d.a, this.Z))));
      $$2.a(fsm.b(16), 3);
      $$2.a(new fjh.a(this.m.h, L, U, $$0x -> this.m.a(new fjj(L, this::a, fhl.d.c, this.aa))));
      $$2.a(new fjh.a(this.m.h, M, X, $$0x -> this.m.a(new fjj(M, this::a, fhl.d.d, this.ab))));
      $$2.a(new fjh.a(this.m.h, N, Y, $$0x -> this.m.a(new fjj(N, this::a, fhl.d.e, this.ac))));
      this.af.b(fot.a(wo.k, $$0x -> this.aO_()).a());
      this.af.a($$1x -> {
         foq var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.af.a();
   }

   @Override
   public wp i() {
      return wo.a(this.n(), this.Q);
   }

   @Override
   public void aO_() {
      this.m.a(this.O);
   }

   private void a(@Nullable fib $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fkk($$0, this.P.a, this.S, this.ae));
      }

      fgf.g();
   }

   private void a(fkh $$0) {
      List<fkh> $$1 = new ArrayList<>();
      if (this.ad != null) {
         $$1.add(this.ad);
      }

      if (this.b != this.P.p) {
         $$1.add(new fko(this.P.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fja(this.O, $$1.toArray(new fkh[0])));
   }

   class a extends fot {
      private static final akv b = akv.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final akv v;

      a(final foc $$0, final wp $$1, final akv $$2, final fot.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(foe $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.D();
         int $$5 = -1;
         if ($$4) {
            $$5 = axk.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.F();
         int $$7 = this.G();
         $$0.a(gmi::H, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(gmi::H, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(fjh.this.p, this.B(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
