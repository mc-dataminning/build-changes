import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcy extends gvb {
   static final Logger c = LogUtils.getLogger();
   private static final xl B = xl.c("mco.selectServer.create");
   private static final xl C = xl.c("mco.selectServer.create.subtitle");
   private static final xl D = xl.c("mco.configure.world.switch.slot");
   private static final xl E = xl.c("mco.configure.world.switch.slot.subtitle");
   private static final xl F = xl.c("mco.reset.world.title");
   private static final xl G = xl.c("mco.reset.world.warning");
   public static final xl a = xl.c("mco.create.world.reset.title");
   private static final xl H = xl.c("mco.reset.world.resetting.screen.title");
   private static final xl I = xl.c("mco.reset.world.template");
   private static final xl J = xl.c("mco.reset.world.adventure");
   private static final xl K = xl.c("mco.reset.world.experience");
   private static final xl L = xl.c("mco.reset.world.inspiration");
   private final fmy M;
   private final fba N;
   private final xl O;
   private final int P;
   private final xl Q;
   private static final alb R = new alb("textures/gui/realms/upload.png");
   private static final alb S = new alb("textures/gui/realms/adventure.png");
   private static final alb T = new alb("textures/gui/realms/survival_spawn.png");
   private static final alb U = new alb("textures/gui/realms/new_world.png");
   private static final alb V = new alb("textures/gui/realms/experience.png");
   private static final alb W = new alb("textures/gui/realms/inspiration.png");
   fbs X;
   fbs Y;
   fbs Z;
   fbs aa;
   public final int b;
   @Nullable
   private final fec ab;
   private final Runnable ac;
   private final fkm ad = new fkm(this);

   private fcy(fmy $$0, fba $$1, int $$2, xl $$3, xl $$4, int $$5, xl $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fcy(fmy $$0, fba $$1, int $$2, xl $$3, xl $$4, int $$5, xl $$6, @Nullable fec $$7, Runnable $$8) {
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

   public static fcy a(fmy $$0, fba $$1, fec $$2, Runnable $$3) {
      return new fcy($$0, $$1, $$1.n, B, C, -6250336, a, $$2, $$3);
   }

   public static fcy a(fmy $$0, int $$1, fba $$2, Runnable $$3) {
      return new fcy($$0, $$2, $$1, D, E, -6250336, a, $$3);
   }

   public static fcy a(fmy $$0, fba $$1, Runnable $$2) {
      return new fcy($$0, $$1, $$1.n, F, G, -65536, H, $$2);
   }

   @Override
   public void aN_() {
      fkq $$0 = this.ad.a(fkq.d());
      $$0.c().a(9 / 3);
      $$0.a(new fig(this.l, this.p), fkp::b);
      $$0.a(new fig(this.O, this.p).b(this.P), fkp::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            faj $$0 = faj.a();

            try {
               fbs $$1 = $$0.a(1, 10, fba.d.a);
               fbs $$2 = $$0.a(1, 10, fba.d.c);
               fbs $$3 = $$0.a(1, 10, fba.d.d);
               fbs $$4 = $$0.a(1, 10, fba.d.e);
               fcy.this.m.execute(() -> {
                  fcy.this.X = $$1;
                  fcy.this.Y = $$2;
                  fcy.this.Z = $$3;
                  fcy.this.aa = $$4;
               });
            } catch (fbw var6) {
               fcy.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fkl $$1 = this.ad.c(new fkl());
      fkl.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fcy.a(this.m.h, fcx.a, U, $$0x -> this.m.a(new fcx(this::a, this.l))));
      $$2.a(new fcy.a(this.m.h, fcz.a, R, $$0x -> this.m.a(new fcz(this.ab, this.N.a, this.b, this))));
      $$2.a(new fcy.a(this.m.h, I, T, $$0x -> this.m.a(new fda(I, this::a, fba.d.a, this.X))));
      $$2.a(fkr.b(16), 3);
      $$2.a(new fcy.a(this.m.h, J, S, $$0x -> this.m.a(new fda(J, this::a, fba.d.c, this.Y))));
      $$2.a(new fcy.a(this.m.h, K, V, $$0x -> this.m.a(new fda(K, this::a, fba.d.d, this.Z))));
      $$2.a(new fcy.a(this.m.h, L, W, $$0x -> this.m.a(new fda(L, this::a, fba.d.e, this.aa))));
      this.ad.b(fgz.a(xk.k, $$0x -> this.d()).a());
      this.ad.a($$1x -> {
         fgx var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.ad.a();
   }

   @Override
   public xl i() {
      return xk.a(this.n(), this.O);
   }

   @Override
   public void d() {
      this.m.a(this.M);
   }

   private void a(@Nullable fbr $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fee($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(@Nullable fdt $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fed($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(fea $$0) {
      List<fea> $$1 = new ArrayList<>();
      if (this.ab != null) {
         $$1.add(this.ab);
      }

      if (this.b != this.N.n) {
         $$1.add(new fei(this.N.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fcq(this.M, $$1.toArray(new fea[0])));
   }

   class a extends fgz {
      private static final alb b = new alb("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final alb v;

      a(final fgk $$0, final xl $$1, final alb $$2, final fgz.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fgm $$0, int $$1, int $$2, float $$3) {
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
         $$0.a(fcy.this.p, this.y(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}
