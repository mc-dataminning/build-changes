import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhe extends hep {
   static final Logger c = LogUtils.getLogger();
   private static final xi B = xi.c("mco.selectServer.create");
   private static final xi C = xi.c("mco.selectServer.create.subtitle");
   private static final xi D = xi.c("mco.configure.world.switch.slot");
   private static final xi E = xi.c("mco.configure.world.switch.slot.subtitle");
   private static final xi F = xi.c("mco.reset.world.title");
   private static final xi G = xi.c("mco.reset.world.warning");
   public static final xi a = xi.c("mco.create.world.reset.title");
   private static final xi H = xi.c("mco.reset.world.resetting.screen.title");
   private static final xi I = xi.c("mco.reset.world.template");
   private static final xi J = xi.c("mco.reset.world.adventure");
   private static final xi K = xi.c("mco.reset.world.experience");
   private static final xi L = xi.c("mco.reset.world.inspiration");
   private final fra M;
   private final ffi N;
   private final xi O;
   private final int P;
   private final xi Q;
   private static final ali R = ali.b("textures/gui/realms/upload.png");
   private static final ali S = ali.b("textures/gui/realms/adventure.png");
   private static final ali T = ali.b("textures/gui/realms/survival_spawn.png");
   private static final ali U = ali.b("textures/gui/realms/new_world.png");
   private static final ali V = ali.b("textures/gui/realms/experience.png");
   private static final ali W = ali.b("textures/gui/realms/inspiration.png");
   ffy X;
   ffy Y;
   ffy Z;
   ffy aa;
   public final int b;
   @Nullable
   private final fii ab;
   private final Runnable ac;
   private final fow ad = new fow(this);

   private fhe(fra $$0, ffi $$1, int $$2, xi $$3, xi $$4, int $$5, xi $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fhe(fra $$0, ffi $$1, int $$2, xi $$3, xi $$4, int $$5, xi $$6, @Nullable fii $$7, Runnable $$8) {
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

   public static fhe a(fra $$0, ffi $$1, fii $$2, Runnable $$3) {
      return new fhe($$0, $$1, $$1.n, B, C, -6250336, a, $$2, $$3);
   }

   public static fhe a(fra $$0, int $$1, ffi $$2, Runnable $$3) {
      return new fhe($$0, $$2, $$1, D, E, -6250336, a, $$3);
   }

   public static fhe a(fra $$0, ffi $$1, Runnable $$2) {
      return new fhe($$0, $$1, $$1.n, F, G, -65536, H, $$2);
   }

   @Override
   public void aR_() {
      fpa $$0 = this.ad.a(fpa.d());
      $$0.c().a(9 / 3);
      $$0.a(new fmo(this.l, this.p), foz::b);
      $$0.a(new fmo(this.O, this.p).b(this.P), foz::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fer $$0 = fer.a();

            try {
               ffy $$1 = $$0.a(1, 10, ffi.d.a);
               ffy $$2 = $$0.a(1, 10, ffi.d.c);
               ffy $$3 = $$0.a(1, 10, ffi.d.d);
               ffy $$4 = $$0.a(1, 10, ffi.d.e);
               fhe.this.m.execute(() -> {
                  fhe.this.X = $$1;
                  fhe.this.Y = $$2;
                  fhe.this.Z = $$3;
                  fhe.this.aa = $$4;
               });
            } catch (fgc var6) {
               fhe.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fov $$1 = this.ad.c(new fov());
      fov.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fhe.a(this.m.h, fhd.a, U, $$0x -> this.m.a(new fhd(this::a, this.l))));
      $$2.a(new fhe.a(this.m.h, fhf.a, R, $$0x -> this.m.a(new fhf(this.ab, this.N.a, this.b, this))));
      $$2.a(new fhe.a(this.m.h, I, T, $$0x -> this.m.a(new fhg(I, this::a, ffi.d.a, this.X))));
      $$2.a(fpb.b(16), 3);
      $$2.a(new fhe.a(this.m.h, J, S, $$0x -> this.m.a(new fhg(J, this::a, ffi.d.c, this.Y))));
      $$2.a(new fhe.a(this.m.h, K, V, $$0x -> this.m.a(new fhg(K, this::a, ffi.d.d, this.Z))));
      $$2.a(new fhe.a(this.m.h, L, W, $$0x -> this.m.a(new fhg(L, this::a, ffi.d.e, this.aa))));
      this.ad.b(flh.a(xh.k, $$0x -> this.d()).a());
      this.ad.a($$1x -> {
         flf var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.ad.a();
   }

   @Override
   public xi i() {
      return xh.a(this.n(), this.O);
   }

   @Override
   public void d() {
      this.m.a(this.M);
   }

   private void a(@Nullable ffx $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fik($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(@Nullable fhz $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fij($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(fig $$0) {
      List<fig> $$1 = new ArrayList<>();
      if (this.ab != null) {
         $$1.add(this.ab);
      }

      if (this.b != this.N.n) {
         $$1.add(new fio(this.N.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fgw(this.M, $$1.toArray(new fig[0])));
   }

   class a extends flh {
      private static final ali b = ali.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final ali v;

      a(final fks $$0, final xi $$1, final ali $$2, final flh.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fku $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.B();
         int $$5 = -1;
         if ($$4) {
            $$5 = axv.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.D();
         int $$7 = this.E();
         $$0.a(gir::B, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(gir::B, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(fhe.this.p, this.z(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
