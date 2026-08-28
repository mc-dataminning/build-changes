import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdb extends gve {
   static final Logger c = LogUtils.getLogger();
   private static final xo B = xo.c("mco.selectServer.create");
   private static final xo C = xo.c("mco.selectServer.create.subtitle");
   private static final xo D = xo.c("mco.configure.world.switch.slot");
   private static final xo E = xo.c("mco.configure.world.switch.slot.subtitle");
   private static final xo F = xo.c("mco.reset.world.title");
   private static final xo G = xo.c("mco.reset.world.warning");
   public static final xo a = xo.c("mco.create.world.reset.title");
   private static final xo H = xo.c("mco.reset.world.resetting.screen.title");
   private static final xo I = xo.c("mco.reset.world.template");
   private static final xo J = xo.c("mco.reset.world.adventure");
   private static final xo K = xo.c("mco.reset.world.experience");
   private static final xo L = xo.c("mco.reset.world.inspiration");
   private final fnb M;
   private final fbd N;
   private final xo O;
   private final int P;
   private final xo Q;
   private static final ale R = new ale("textures/gui/realms/upload.png");
   private static final ale S = new ale("textures/gui/realms/adventure.png");
   private static final ale T = new ale("textures/gui/realms/survival_spawn.png");
   private static final ale U = new ale("textures/gui/realms/new_world.png");
   private static final ale V = new ale("textures/gui/realms/experience.png");
   private static final ale W = new ale("textures/gui/realms/inspiration.png");
   fbv X;
   fbv Y;
   fbv Z;
   fbv aa;
   public final int b;
   @Nullable
   private final fef ab;
   private final Runnable ac;
   private final fkp ad = new fkp(this);

   private fdb(fnb $$0, fbd $$1, int $$2, xo $$3, xo $$4, int $$5, xo $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fdb(fnb $$0, fbd $$1, int $$2, xo $$3, xo $$4, int $$5, xo $$6, @Nullable fef $$7, Runnable $$8) {
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

   public static fdb a(fnb $$0, fbd $$1, fef $$2, Runnable $$3) {
      return new fdb($$0, $$1, $$1.n, B, C, -6250336, a, $$2, $$3);
   }

   public static fdb a(fnb $$0, int $$1, fbd $$2, Runnable $$3) {
      return new fdb($$0, $$2, $$1, D, E, -6250336, a, $$3);
   }

   public static fdb a(fnb $$0, fbd $$1, Runnable $$2) {
      return new fdb($$0, $$1, $$1.n, F, G, -65536, H, $$2);
   }

   @Override
   public void aM_() {
      fkt $$0 = this.ad.a(fkt.d());
      $$0.c().a(9 / 3);
      $$0.a(new fij(this.l, this.p), fks::b);
      $$0.a(new fij(this.O, this.p).b(this.P), fks::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fam $$0 = fam.a();

            try {
               fbv $$1 = $$0.a(1, 10, fbd.d.a);
               fbv $$2 = $$0.a(1, 10, fbd.d.c);
               fbv $$3 = $$0.a(1, 10, fbd.d.d);
               fbv $$4 = $$0.a(1, 10, fbd.d.e);
               fdb.this.m.execute(() -> {
                  fdb.this.X = $$1;
                  fdb.this.Y = $$2;
                  fdb.this.Z = $$3;
                  fdb.this.aa = $$4;
               });
            } catch (fbz var6) {
               fdb.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fko $$1 = this.ad.c(new fko());
      fko.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fdb.a(this.m.h, fda.a, U, $$0x -> this.m.a(new fda(this::a, this.l))));
      $$2.a(new fdb.a(this.m.h, fdc.a, R, $$0x -> this.m.a(new fdc(this.ab, this.N.a, this.b, this))));
      $$2.a(new fdb.a(this.m.h, I, T, $$0x -> this.m.a(new fdd(I, this::a, fbd.d.a, this.X))));
      $$2.a(fku.b(16), 3);
      $$2.a(new fdb.a(this.m.h, J, S, $$0x -> this.m.a(new fdd(J, this::a, fbd.d.c, this.Y))));
      $$2.a(new fdb.a(this.m.h, K, V, $$0x -> this.m.a(new fdd(K, this::a, fbd.d.d, this.Z))));
      $$2.a(new fdb.a(this.m.h, L, W, $$0x -> this.m.a(new fdd(L, this::a, fbd.d.e, this.aa))));
      this.ad.b(fhc.a(xn.k, $$0x -> this.d()).a());
      this.ad.a($$1x -> {
         fha var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.ad.a();
   }

   @Override
   public xo i() {
      return xn.a(this.n(), this.O);
   }

   @Override
   public void d() {
      this.m.a(this.M);
   }

   private void a(@Nullable fbu $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new feh($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(@Nullable fdw $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new feg($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(fed $$0) {
      List<fed> $$1 = new ArrayList<>();
      if (this.ab != null) {
         $$1.add(this.ab);
      }

      if (this.b != this.N.n) {
         $$1.add(new fel(this.N.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fct(this.M, $$1.toArray(new fed[0])));
   }

   class a extends fhc {
      private static final ale b = new ale("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final ale v;

      a(final fgn $$0, final xo $$1, final ale $$2, final fhc.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fgp $$0, int $$1, int $$2, float $$3) {
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
         $$0.a(fdb.this.p, this.y(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}
