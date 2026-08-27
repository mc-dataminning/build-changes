import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class feh extends gxb {
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
   private final fon M;
   private final fcj N;
   private final xe O;
   private final int P;
   private final xe Q;
   private static final akt R = new akt("textures/gui/realms/upload.png");
   private static final akt S = new akt("textures/gui/realms/adventure.png");
   private static final akt T = new akt("textures/gui/realms/survival_spawn.png");
   private static final akt U = new akt("textures/gui/realms/new_world.png");
   private static final akt V = new akt("textures/gui/realms/experience.png");
   private static final akt W = new akt("textures/gui/realms/inspiration.png");
   fdb X;
   fdb Y;
   fdb Z;
   fdb aa;
   public final int b;
   @Nullable
   private final ffl ab;
   private final Runnable ac;
   private final fma ad = new fma(this);

   private feh(fon $$0, fcj $$1, int $$2, xe $$3, xe $$4, int $$5, xe $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public feh(fon $$0, fcj $$1, int $$2, xe $$3, xe $$4, int $$5, xe $$6, @Nullable ffl $$7, Runnable $$8) {
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

   public static feh a(fon $$0, fcj $$1, ffl $$2, Runnable $$3) {
      return new feh($$0, $$1, $$1.n, B, C, -6250336, a, $$2, $$3);
   }

   public static feh a(fon $$0, int $$1, fcj $$2, Runnable $$3) {
      return new feh($$0, $$2, $$1, D, E, -6250336, a, $$3);
   }

   public static feh a(fon $$0, fcj $$1, Runnable $$2) {
      return new feh($$0, $$1, $$1.n, F, G, -65536, H, $$2);
   }

   @Override
   public void aN_() {
      fme $$0 = this.ad.a(fme.d());
      $$0.c().a(9 / 3);
      $$0.a(new fju(this.l, this.p), fmd::b);
      $$0.a(new fju(this.O, this.p).b(this.P), fmd::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fbs $$0 = fbs.a();

            try {
               fdb $$1 = $$0.a(1, 10, fcj.d.a);
               fdb $$2 = $$0.a(1, 10, fcj.d.c);
               fdb $$3 = $$0.a(1, 10, fcj.d.d);
               fdb $$4 = $$0.a(1, 10, fcj.d.e);
               feh.this.m.execute(() -> {
                  feh.this.X = $$1;
                  feh.this.Y = $$2;
                  feh.this.Z = $$3;
                  feh.this.aa = $$4;
               });
            } catch (fdf var6) {
               feh.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      flz $$1 = this.ad.c(new flz());
      flz.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new feh.a(this.m.h, feg.a, U, $$0x -> this.m.a(new feg(this::a, this.l))));
      $$2.a(new feh.a(this.m.h, fei.a, R, $$0x -> this.m.a(new fei(this.ab, this.N.a, this.b, this))));
      $$2.a(new feh.a(this.m.h, I, T, $$0x -> this.m.a(new fej(I, this::a, fcj.d.a, this.X))));
      $$2.a(fmf.b(16), 3);
      $$2.a(new feh.a(this.m.h, J, S, $$0x -> this.m.a(new fej(J, this::a, fcj.d.c, this.Y))));
      $$2.a(new feh.a(this.m.h, K, V, $$0x -> this.m.a(new fej(K, this::a, fcj.d.d, this.Z))));
      $$2.a(new feh.a(this.m.h, L, W, $$0x -> this.m.a(new fej(L, this::a, fcj.d.e, this.aa))));
      this.ad.b(fin.a(xd.k, $$0x -> this.d()).a());
      this.ad.a($$1x -> {
         fil var10000 = this.c($$1x);
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

   private void a(@Nullable fda $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new ffn($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(@Nullable ffc $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new ffm($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(ffj $$0) {
      List<ffj> $$1 = new ArrayList<>();
      if (this.ab != null) {
         $$1.add(this.ab);
      }

      if (this.b != this.N.n) {
         $$1.add(new ffr(this.N.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fdz(this.M, $$1.toArray(new ffj[0])));
   }

   class a extends fin {
      private static final akt b = new akt("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final akt v;

      a(fhy $$0, xe $$1, akt $$2, fin.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fia $$0, int $$1, int $$2, float $$3) {
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
         $$0.a(feh.this.p, this.y(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}
