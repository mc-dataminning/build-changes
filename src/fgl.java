import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgl extends hdp {
   static final Logger c = LogUtils.getLogger();
   private static final xe B = xe.c("mco.selectServer.create");
   private static final xe C = xe.c("mco.selectServer.create.subtitle");
   private static final xe D = xe.c("mco.configure.world.switch.slot");
   private static final xe E = xe.c("mco.configure.world.switch.slot.subtitle");
   private static final xe F = xe.c("mco.reset.world.title");
   private static final xe G = xe.c("mco.reset.world.warning");
   public static final xe a = xe.c("mco.create.world.reset.title");
   private static final xe H = xe.c("mco.reset.world.resetting.screen.title");
   private static final xe I = xe.c("mco.reset.world.template");
   private static final xe J = xe.c("mco.reset.world.adventure");
   private static final xe K = xe.c("mco.reset.world.experience");
   private static final xe L = xe.c("mco.reset.world.inspiration");
   private final fqh M;
   private final fep N;
   private final xe O;
   private final int P;
   private final xe Q;
   private static final ale R = ale.b("textures/gui/realms/upload.png");
   private static final ale S = ale.b("textures/gui/realms/adventure.png");
   private static final ale T = ale.b("textures/gui/realms/survival_spawn.png");
   private static final ale U = ale.b("textures/gui/realms/new_world.png");
   private static final ale V = ale.b("textures/gui/realms/experience.png");
   private static final ale W = ale.b("textures/gui/realms/inspiration.png");
   fff X;
   fff Y;
   fff Z;
   fff aa;
   public final int b;
   @Nullable
   private final fhp ab;
   private final Runnable ac;
   private final foc ad = new foc(this);

   private fgl(fqh $$0, fep $$1, int $$2, xe $$3, xe $$4, int $$5, xe $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fgl(fqh $$0, fep $$1, int $$2, xe $$3, xe $$4, int $$5, xe $$6, @Nullable fhp $$7, Runnable $$8) {
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

   public static fgl a(fqh $$0, fep $$1, fhp $$2, Runnable $$3) {
      return new fgl($$0, $$1, $$1.n, B, C, -6250336, a, $$2, $$3);
   }

   public static fgl a(fqh $$0, int $$1, fep $$2, Runnable $$3) {
      return new fgl($$0, $$2, $$1, D, E, -6250336, a, $$3);
   }

   public static fgl a(fqh $$0, fep $$1, Runnable $$2) {
      return new fgl($$0, $$1, $$1.n, F, G, -65536, H, $$2);
   }

   @Override
   public void aS_() {
      fog $$0 = this.ad.a(fog.d());
      $$0.c().a(9 / 3);
      $$0.a(new flv(this.l, this.p), fof::b);
      $$0.a(new flv(this.O, this.p).b(this.P), fof::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fdy $$0 = fdy.a();

            try {
               fff $$1 = $$0.a(1, 10, fep.d.a);
               fff $$2 = $$0.a(1, 10, fep.d.c);
               fff $$3 = $$0.a(1, 10, fep.d.d);
               fff $$4 = $$0.a(1, 10, fep.d.e);
               fgl.this.m.execute(() -> {
                  fgl.this.X = $$1;
                  fgl.this.Y = $$2;
                  fgl.this.Z = $$3;
                  fgl.this.aa = $$4;
               });
            } catch (ffj var6) {
               fgl.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fob $$1 = this.ad.c(new fob());
      fob.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fgl.a(this.m.h, fgk.a, U, $$0x -> this.m.a(new fgk(this::a, this.l))));
      $$2.a(new fgl.a(this.m.h, fgm.a, R, $$0x -> this.m.a(new fgm(this.ab, this.N.a, this.b, this))));
      $$2.a(new fgl.a(this.m.h, I, T, $$0x -> this.m.a(new fgn(I, this::a, fep.d.a, this.X))));
      $$2.a(foh.b(16), 3);
      $$2.a(new fgl.a(this.m.h, J, S, $$0x -> this.m.a(new fgn(J, this::a, fep.d.c, this.Y))));
      $$2.a(new fgl.a(this.m.h, K, V, $$0x -> this.m.a(new fgn(K, this::a, fep.d.d, this.Z))));
      $$2.a(new fgl.a(this.m.h, L, W, $$0x -> this.m.a(new fgn(L, this::a, fep.d.e, this.aa))));
      this.ad.b(fko.a(xd.k, $$0x -> this.d()).a());
      this.ad.a($$1x -> {
         fkm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.ad.a();
   }

   @Override
   public xe i() {
      return xd.a(this.n(), this.O);
   }

   @Override
   public void d() {
      this.m.a(this.M);
   }

   private void a(@Nullable ffe $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fhr($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(@Nullable fhg $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fhq($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(fhn $$0) {
      List<fhn> $$1 = new ArrayList<>();
      if (this.ab != null) {
         $$1.add(this.ab);
      }

      if (this.b != this.N.n) {
         $$1.add(new fhv(this.N.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fgd(this.M, $$1.toArray(new fhn[0])));
   }

   class a extends fko {
      private static final ale b = ale.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final ale v;

      a(final fjz $$0, final xe $$1, final ale $$2, final fko.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fkb $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.B();
         int $$5 = -1;
         if ($$4) {
            $$5 = axq.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.D();
         int $$7 = this.E();
         $$0.a(ghv::B, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(ghv::B, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(fgl.this.p, this.z(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
