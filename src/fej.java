import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fej extends gwo {
   static final Logger c = LogUtils.getLogger();
   private static final wz B = wz.c("mco.selectServer.create");
   private static final wz C = wz.c("mco.selectServer.create.subtitle");
   private static final wz D = wz.c("mco.configure.world.switch.slot");
   private static final wz E = wz.c("mco.configure.world.switch.slot.subtitle");
   private static final wz F = wz.c("mco.reset.world.title");
   private static final wz G = wz.c("mco.reset.world.warning");
   public static final wz a = wz.c("mco.create.world.reset.title");
   private static final wz H = wz.c("mco.reset.world.resetting.screen.title");
   private static final wz I = wz.c("mco.reset.world.template");
   private static final wz J = wz.c("mco.reset.world.adventure");
   private static final wz K = wz.c("mco.reset.world.experience");
   private static final wz L = wz.c("mco.reset.world.inspiration");
   private final fob M;
   private final fcn N;
   private final wz O;
   private final int P;
   private final wz Q;
   private static final akr R = akr.b("textures/gui/realms/upload.png");
   private static final akr S = akr.b("textures/gui/realms/adventure.png");
   private static final akr T = akr.b("textures/gui/realms/survival_spawn.png");
   private static final akr U = akr.b("textures/gui/realms/new_world.png");
   private static final akr V = akr.b("textures/gui/realms/experience.png");
   private static final akr W = akr.b("textures/gui/realms/inspiration.png");
   fdd X;
   fdd Y;
   fdd Z;
   fdd aa;
   public final int b;
   @Nullable
   private final ffn ab;
   private final Runnable ac;
   private final flx ad = new flx(this);

   private fej(fob $$0, fcn $$1, int $$2, wz $$3, wz $$4, int $$5, wz $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fej(fob $$0, fcn $$1, int $$2, wz $$3, wz $$4, int $$5, wz $$6, @Nullable ffn $$7, Runnable $$8) {
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

   public static fej a(fob $$0, fcn $$1, ffn $$2, Runnable $$3) {
      return new fej($$0, $$1, $$1.n, B, C, -6250336, a, $$2, $$3);
   }

   public static fej a(fob $$0, int $$1, fcn $$2, Runnable $$3) {
      return new fej($$0, $$2, $$1, D, E, -6250336, a, $$3);
   }

   public static fej a(fob $$0, fcn $$1, Runnable $$2) {
      return new fej($$0, $$1, $$1.n, F, G, -65536, H, $$2);
   }

   @Override
   public void aT_() {
      fmb $$0 = this.ad.a(fmb.d());
      $$0.c().a(9 / 3);
      $$0.a(new fjr(this.k, this.o), fma::b);
      $$0.a(new fjr(this.O, this.o).b(this.P), fma::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fbw $$0 = fbw.a();

            try {
               fdd $$1 = $$0.a(1, 10, fcn.d.a);
               fdd $$2 = $$0.a(1, 10, fcn.d.c);
               fdd $$3 = $$0.a(1, 10, fcn.d.d);
               fdd $$4 = $$0.a(1, 10, fcn.d.e);
               fej.this.l.execute(() -> {
                  fej.this.X = $$1;
                  fej.this.Y = $$2;
                  fej.this.Z = $$3;
                  fej.this.aa = $$4;
               });
            } catch (fdh var6) {
               fej.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      flw $$1 = this.ad.c(new flw());
      flw.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fej.a(this.l.h, fei.a, U, $$0x -> this.l.a(new fei(this::a, this.k))));
      $$2.a(new fej.a(this.l.h, fek.a, R, $$0x -> this.l.a(new fek(this.ab, this.N.a, this.b, this))));
      $$2.a(new fej.a(this.l.h, I, T, $$0x -> this.l.a(new fel(I, this::a, fcn.d.a, this.X))));
      $$2.a(fmc.b(16), 3);
      $$2.a(new fej.a(this.l.h, J, S, $$0x -> this.l.a(new fel(J, this::a, fcn.d.c, this.Y))));
      $$2.a(new fej.a(this.l.h, K, V, $$0x -> this.l.a(new fel(K, this::a, fcn.d.d, this.Z))));
      $$2.a(new fej.a(this.l.h, L, W, $$0x -> this.l.a(new fel(L, this::a, fcn.d.e, this.aa))));
      this.ad.b(fik.a(wy.k, $$0x -> this.d()).a());
      this.ad.a($$1x -> {
         fii var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.ad.a();
   }

   @Override
   public wz i() {
      return wy.a(this.n(), this.O);
   }

   @Override
   public void d() {
      this.l.a(this.M);
   }

   private void a(@Nullable fdc $$0) {
      this.l.a(this);
      if ($$0 != null) {
         this.a(new ffp($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(@Nullable ffe $$0) {
      this.l.a(this);
      if ($$0 != null) {
         this.a(new ffo($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(ffl $$0) {
      List<ffl> $$1 = new ArrayList<>();
      if (this.ab != null) {
         $$1.add(this.ab);
      }

      if (this.b != this.N.n) {
         $$1.add(new fft(this.N.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.l.a(new feb(this.M, $$1.toArray(new ffl[0])));
   }

   class a extends fik {
      private static final akr b = akr.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final akr v;

      a(final fhv $$0, final wz $$1, final akr $$2, final fik.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fhx $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.B();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.D();
         int $$6 = this.E();
         $$0.a(this.v, $$5 + 2, $$6 + 2, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(b, $$5, $$6, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(fej.this.o, this.z(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}
