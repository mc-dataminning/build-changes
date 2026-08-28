import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmd extends hol {
   static final Logger c = LogUtils.getLogger();
   private static final ww C = ww.c("mco.selectServer.create");
   private static final ww D = ww.c("mco.selectServer.create.subtitle");
   private static final ww E = ww.c("mco.configure.world.switch.slot");
   private static final ww F = ww.c("mco.configure.world.switch.slot.subtitle");
   private static final ww G = ww.c("mco.reset.world.generate");
   private static final ww H = ww.c("mco.reset.world.title");
   private static final ww I = ww.c("mco.reset.world.warning");
   public static final ww a = ww.c("mco.create.world.reset.title");
   private static final ww J = ww.c("mco.reset.world.resetting.screen.title");
   private static final ww K = ww.c("mco.reset.world.template");
   private static final ww L = ww.c("mco.reset.world.adventure");
   private static final ww M = ww.c("mco.reset.world.experience");
   private static final ww N = ww.c("mco.reset.world.inspiration");
   private final fxi O;
   private final fkh P;
   private final ww Q;
   private final int R;
   private final ww S;
   private static final ale T = ale.b("textures/gui/realms/upload.png");
   private static final ale U = ale.b("textures/gui/realms/adventure.png");
   private static final ale V = ale.b("textures/gui/realms/survival_spawn.png");
   private static final ale W = ale.b("textures/gui/realms/new_world.png");
   private static final ale X = ale.b("textures/gui/realms/experience.png");
   private static final ale Y = ale.b("textures/gui/realms/inspiration.png");
   fky Z;
   fky aa;
   fky ab;
   fky ac;
   public final int b;
   @Nullable
   private final fnf ad;
   private final Runnable ae;
   private final fve af = new fve(this);

   private fmd(fxi $$0, fkh $$1, int $$2, ww $$3, ww $$4, int $$5, ww $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fmd(fxi $$0, fkh $$1, int $$2, ww $$3, ww $$4, int $$5, ww $$6, @Nullable fnf $$7, Runnable $$8) {
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

   public static fmd a(fxi $$0, fkh $$1, fnf $$2, Runnable $$3) {
      return new fmd($$0, $$1, $$1.p, C, D, -6250336, a, $$2, $$3);
   }

   public static fmd a(fxi $$0, int $$1, fkh $$2, Runnable $$3) {
      return new fmd($$0, $$2, $$1, E, F, -6250336, a, $$3);
   }

   public static fmd a(fxi $$0, fkh $$1, Runnable $$2) {
      return new fmd($$0, $$1, $$1.p, H, I, -65536, J, $$2);
   }

   @Override
   public void aN_() {
      fvi $$0 = this.af.a(fvi.d());
      $$0.c().a(9 / 3);
      $$0.a(new fsx(this.l, this.p), fvh::b);
      $$0.a(new fsx(this.Q, this.p).b(this.R), fvh::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fjg $$0 = fjg.a();

            try {
               fky $$1 = $$0.a(1, 10, fkh.d.a);
               fky $$2 = $$0.a(1, 10, fkh.d.c);
               fky $$3 = $$0.a(1, 10, fkh.d.d);
               fky $$4 = $$0.a(1, 10, fkh.d.e);
               fmd.this.m.execute(() -> {
                  fmd.this.Z = $$1;
                  fmd.this.aa = $$2;
                  fmd.this.ab = $$3;
                  fmd.this.ac = $$4;
               });
            } catch (flc var6) {
               fmd.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fvd $$1 = this.af.c(new fvd());
      fvd.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fmd.a(this.m.h, G, W, $$0x -> fjm.a(this.m, this.O, this, this.b, this.P, this.ad)));
      $$2.a(new fmd.a(this.m.h, fme.a, T, $$0x -> this.m.a(new fme(this.ad, this.P.a, this.b, this))));
      $$2.a(new fmd.a(this.m.h, K, V, $$0x -> this.m.a(new fmf(K, this::a, fkh.d.a, this.Z))));
      $$2.a(fvj.b(16), 3);
      $$2.a(new fmd.a(this.m.h, L, U, $$0x -> this.m.a(new fmf(L, this::a, fkh.d.c, this.aa))));
      $$2.a(new fmd.a(this.m.h, M, X, $$0x -> this.m.a(new fmf(M, this::a, fkh.d.d, this.ab))));
      $$2.a(new fmd.a(this.m.h, N, Y, $$0x -> this.m.a(new fmf(N, this::a, fkh.d.e, this.ac))));
      this.af.b(frq.a(wv.k, $$0x -> this.aK_()).a());
      this.af.a($$1x -> {
         fro var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.af.a();
   }

   @Override
   public ww i() {
      return wv.a(this.n(), this.Q);
   }

   @Override
   public void aK_() {
      this.m.a(this.O);
   }

   private void a(@Nullable fkx $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fng($$0, this.P.a, this.S, this.ae));
      }

      fjb.g();
   }

   private void a(fnd $$0) {
      List<fnd> $$1 = new ArrayList<>();
      if (this.ad != null) {
         $$1.add(this.ad);
      }

      if (this.b != this.P.p) {
         $$1.add(new fnk(this.P.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new flw(this.O, $$1.toArray(new fnd[0])));
   }

   class a extends frq {
      private static final ale b = ale.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final ale v;

      a(final fra $$0, final ww $$1, final ale $$2, final frq.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(frc $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.D();
         int $$5 = -1;
         if ($$4) {
            $$5 = axu.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.F();
         int $$7 = this.G();
         $$0.a(gpn::H, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(gpn::H, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(fmd.this.p, this.B(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
