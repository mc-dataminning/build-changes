import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbz extends gty {
   static final Logger c = LogUtils.getLogger();
   private static final wx B = wx.c("mco.selectServer.create");
   private static final wx C = wx.c("mco.selectServer.create.subtitle");
   private static final wx D = wx.c("mco.configure.world.switch.slot");
   private static final wx E = wx.c("mco.configure.world.switch.slot.subtitle");
   private static final wx F = wx.c("mco.reset.world.title");
   private static final wx G = wx.c("mco.reset.world.warning");
   public static final wx a = wx.c("mco.create.world.reset.title");
   private static final wx H = wx.c("mco.reset.world.resetting.screen.title");
   private static final wx I = wx.c("mco.reset.world.template");
   private static final wx J = wx.c("mco.reset.world.adventure");
   private static final wx K = wx.c("mco.reset.world.experience");
   private static final wx L = wx.c("mco.reset.world.inspiration");
   private final flz M;
   private final fab N;
   private final wx O;
   private final int P;
   private final wx Q;
   private static final akn R = new akn("textures/gui/realms/upload.png");
   private static final akn S = new akn("textures/gui/realms/adventure.png");
   private static final akn T = new akn("textures/gui/realms/survival_spawn.png");
   private static final akn U = new akn("textures/gui/realms/new_world.png");
   private static final akn V = new akn("textures/gui/realms/experience.png");
   private static final akn W = new akn("textures/gui/realms/inspiration.png");
   fat X;
   fat Y;
   fat Z;
   fat aa;
   public final int b;
   @Nullable
   private final fdd ab;
   private final Runnable ac;
   private final fjn ad = new fjn(this);

   private fbz(flz $$0, fab $$1, int $$2, wx $$3, wx $$4, int $$5, wx $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fbz(flz $$0, fab $$1, int $$2, wx $$3, wx $$4, int $$5, wx $$6, @Nullable fdd $$7, Runnable $$8) {
      super($$3);
      this.M = $$0;
      this.N = $$1;
      this.b = $$2;
      this.O = $$4;
      this.P = $$5;
      this.Q = $$6;
      this.ab = $$7;
      this.ac = $$8;
   }

   public static fbz a(flz $$0, fab $$1, fdd $$2, Runnable $$3) {
      return new fbz($$0, $$1, $$1.n, B, C, -6250336, a, $$2, $$3);
   }

   public static fbz a(flz $$0, int $$1, fab $$2, Runnable $$3) {
      return new fbz($$0, $$2, $$1, D, E, -6250336, a, $$3);
   }

   public static fbz a(flz $$0, fab $$1, Runnable $$2) {
      return new fbz($$0, $$1, $$1.n, F, G, -65536, H, $$2);
   }

   @Override
   public void aN_() {
      fjr $$0 = this.ad.a(fjr.d());
      $$0.c().a(9 / 3);
      $$0.a(new fhh(this.l, this.p), fjq::b);
      $$0.a(new fhh(this.O, this.p).b(this.P), fjq::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            ezk $$0 = ezk.a();

            try {
               fat $$1 = $$0.a(1, 10, fab.d.a);
               fat $$2 = $$0.a(1, 10, fab.d.c);
               fat $$3 = $$0.a(1, 10, fab.d.d);
               fat $$4 = $$0.a(1, 10, fab.d.e);
               fbz.this.m.execute(() -> {
                  fbz.this.X = $$1;
                  fbz.this.Y = $$2;
                  fbz.this.Z = $$3;
                  fbz.this.aa = $$4;
               });
            } catch (fax var6) {
               fbz.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fjm $$1 = this.ad.c(new fjm());
      fjm.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fbz.a(this.m.h, fby.a, U, $$0x -> this.m.a(new fby(this::a, this.l))));
      $$2.a(new fbz.a(this.m.h, fca.a, R, $$0x -> this.m.a(new fca(this.ab, this.N.a, this.b, this))));
      $$2.a(new fbz.a(this.m.h, I, T, $$0x -> this.m.a(new fcb(I, this::a, fab.d.a, this.X))));
      $$2.a(fjs.b(16), 3);
      $$2.a(new fbz.a(this.m.h, J, S, $$0x -> this.m.a(new fcb(J, this::a, fab.d.c, this.Y))));
      $$2.a(new fbz.a(this.m.h, K, V, $$0x -> this.m.a(new fcb(K, this::a, fab.d.d, this.Z))));
      $$2.a(new fbz.a(this.m.h, L, W, $$0x -> this.m.a(new fcb(L, this::a, fab.d.e, this.aa))));
      this.ad.b(fga.a(ww.k, $$0x -> this.d()).a());
      this.ad.a($$1x -> {
         ffy var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.ad.a();
   }

   @Override
   public wx i() {
      return ww.a(this.n(), this.O);
   }

   @Override
   public void d() {
      this.m.a(this.M);
   }

   private void a(@Nullable fas $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fdf($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(@Nullable fcu $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fde($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(fdb $$0) {
      List<fdb> $$1 = new ArrayList<>();
      if (this.ab != null) {
         $$1.add(this.ab);
      }

      if (this.b != this.N.n) {
         $$1.add(new fdj(this.N.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fbr(this.M, $$1.toArray(new fdb[0])));
   }

   class a extends fga {
      private static final akn b = new akn("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final akn v;

      a(ffl $$0, wx $$1, akn $$2, fga.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(ffn $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.A();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.C();
         int $$6 = this.D();
         $$0.a(this.v, $$5 + 2, $$6 + 2, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(b, $$5, $$6, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(fbz.this.p, this.y(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}
