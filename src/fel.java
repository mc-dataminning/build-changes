import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fel extends gwq {
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
   private final fod M;
   private final fcp N;
   private final wz O;
   private final int P;
   private final wz Q;
   private static final akr R = akr.b("textures/gui/realms/upload.png");
   private static final akr S = akr.b("textures/gui/realms/adventure.png");
   private static final akr T = akr.b("textures/gui/realms/survival_spawn.png");
   private static final akr U = akr.b("textures/gui/realms/new_world.png");
   private static final akr V = akr.b("textures/gui/realms/experience.png");
   private static final akr W = akr.b("textures/gui/realms/inspiration.png");
   fdf X;
   fdf Y;
   fdf Z;
   fdf aa;
   public final int b;
   @Nullable
   private final ffp ab;
   private final Runnable ac;
   private final flz ad = new flz(this);

   private fel(fod $$0, fcp $$1, int $$2, wz $$3, wz $$4, int $$5, wz $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fel(fod $$0, fcp $$1, int $$2, wz $$3, wz $$4, int $$5, wz $$6, @Nullable ffp $$7, Runnable $$8) {
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

   public static fel a(fod $$0, fcp $$1, ffp $$2, Runnable $$3) {
      return new fel($$0, $$1, $$1.n, B, C, -6250336, a, $$2, $$3);
   }

   public static fel a(fod $$0, int $$1, fcp $$2, Runnable $$3) {
      return new fel($$0, $$2, $$1, D, E, -6250336, a, $$3);
   }

   public static fel a(fod $$0, fcp $$1, Runnable $$2) {
      return new fel($$0, $$1, $$1.n, F, G, -65536, H, $$2);
   }

   @Override
   public void aT_() {
      fmd $$0 = this.ad.a(fmd.d());
      $$0.c().a(9 / 3);
      $$0.a(new fjt(this.k, this.o), fmc::b);
      $$0.a(new fjt(this.O, this.o).b(this.P), fmc::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fby $$0 = fby.a();

            try {
               fdf $$1 = $$0.a(1, 10, fcp.d.a);
               fdf $$2 = $$0.a(1, 10, fcp.d.c);
               fdf $$3 = $$0.a(1, 10, fcp.d.d);
               fdf $$4 = $$0.a(1, 10, fcp.d.e);
               fel.this.l.execute(() -> {
                  fel.this.X = $$1;
                  fel.this.Y = $$2;
                  fel.this.Z = $$3;
                  fel.this.aa = $$4;
               });
            } catch (fdj var6) {
               fel.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fly $$1 = this.ad.c(new fly());
      fly.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fel.a(this.l.h, fek.a, U, $$0x -> this.l.a(new fek(this::a, this.k))));
      $$2.a(new fel.a(this.l.h, fem.a, R, $$0x -> this.l.a(new fem(this.ab, this.N.a, this.b, this))));
      $$2.a(new fel.a(this.l.h, I, T, $$0x -> this.l.a(new fen(I, this::a, fcp.d.a, this.X))));
      $$2.a(fme.b(16), 3);
      $$2.a(new fel.a(this.l.h, J, S, $$0x -> this.l.a(new fen(J, this::a, fcp.d.c, this.Y))));
      $$2.a(new fel.a(this.l.h, K, V, $$0x -> this.l.a(new fen(K, this::a, fcp.d.d, this.Z))));
      $$2.a(new fel.a(this.l.h, L, W, $$0x -> this.l.a(new fen(L, this::a, fcp.d.e, this.aa))));
      this.ad.b(fim.a(wy.k, $$0x -> this.d()).a());
      this.ad.a($$1x -> {
         fik var10000 = this.c($$1x);
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

   private void a(@Nullable fde $$0) {
      this.l.a(this);
      if ($$0 != null) {
         this.a(new ffr($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(@Nullable ffg $$0) {
      this.l.a(this);
      if ($$0 != null) {
         this.a(new ffq($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(ffn $$0) {
      List<ffn> $$1 = new ArrayList<>();
      if (this.ab != null) {
         $$1.add(this.ab);
      }

      if (this.b != this.N.n) {
         $$1.add(new ffv(this.N.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.l.a(new fed(this.M, $$1.toArray(new ffn[0])));
   }

   class a extends fim {
      private static final akr b = akr.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final akr v;

      a(final fhx $$0, final wz $$1, final akr $$2, final fim.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fhz $$0, int $$1, int $$2, float $$3) {
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
         $$0.a(fel.this.o, this.z(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}
