import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgw extends hee {
   static final Logger c = LogUtils.getLogger();
   private static final xh B = xh.c("mco.selectServer.create");
   private static final xh C = xh.c("mco.selectServer.create.subtitle");
   private static final xh D = xh.c("mco.configure.world.switch.slot");
   private static final xh E = xh.c("mco.configure.world.switch.slot.subtitle");
   private static final xh F = xh.c("mco.reset.world.title");
   private static final xh G = xh.c("mco.reset.world.warning");
   public static final xh a = xh.c("mco.create.world.reset.title");
   private static final xh H = xh.c("mco.reset.world.resetting.screen.title");
   private static final xh I = xh.c("mco.reset.world.template");
   private static final xh J = xh.c("mco.reset.world.adventure");
   private static final xh K = xh.c("mco.reset.world.experience");
   private static final xh L = xh.c("mco.reset.world.inspiration");
   private final fqs M;
   private final ffa N;
   private final xh O;
   private final int P;
   private final xh Q;
   private static final alh R = alh.b("textures/gui/realms/upload.png");
   private static final alh S = alh.b("textures/gui/realms/adventure.png");
   private static final alh T = alh.b("textures/gui/realms/survival_spawn.png");
   private static final alh U = alh.b("textures/gui/realms/new_world.png");
   private static final alh V = alh.b("textures/gui/realms/experience.png");
   private static final alh W = alh.b("textures/gui/realms/inspiration.png");
   ffq X;
   ffq Y;
   ffq Z;
   ffq aa;
   public final int b;
   @Nullable
   private final fia ab;
   private final Runnable ac;
   private final fon ad = new fon(this);

   private fgw(fqs $$0, ffa $$1, int $$2, xh $$3, xh $$4, int $$5, xh $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fgw(fqs $$0, ffa $$1, int $$2, xh $$3, xh $$4, int $$5, xh $$6, @Nullable fia $$7, Runnable $$8) {
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

   public static fgw a(fqs $$0, ffa $$1, fia $$2, Runnable $$3) {
      return new fgw($$0, $$1, $$1.n, B, C, -6250336, a, $$2, $$3);
   }

   public static fgw a(fqs $$0, int $$1, ffa $$2, Runnable $$3) {
      return new fgw($$0, $$2, $$1, D, E, -6250336, a, $$3);
   }

   public static fgw a(fqs $$0, ffa $$1, Runnable $$2) {
      return new fgw($$0, $$1, $$1.n, F, G, -65536, H, $$2);
   }

   @Override
   public void aS_() {
      fos $$0 = this.ad.a(fos.d());
      $$0.c().a(9 / 3);
      $$0.a(new fmg(this.l, this.p), foq::b);
      $$0.a(new fmg(this.O, this.p).b(this.P), foq::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fej $$0 = fej.a();

            try {
               ffq $$1 = $$0.a(1, 10, ffa.d.a);
               ffq $$2 = $$0.a(1, 10, ffa.d.c);
               ffq $$3 = $$0.a(1, 10, ffa.d.d);
               ffq $$4 = $$0.a(1, 10, ffa.d.e);
               fgw.this.m.execute(() -> {
                  fgw.this.X = $$1;
                  fgw.this.Y = $$2;
                  fgw.this.Z = $$3;
                  fgw.this.aa = $$4;
               });
            } catch (ffu var6) {
               fgw.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fom $$1 = this.ad.c(new fom());
      fom.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fgw.a(this.m.h, fgv.a, U, $$0x -> this.m.a(new fgv(this::a, this.l))));
      $$2.a(new fgw.a(this.m.h, fgx.a, R, $$0x -> this.m.a(new fgx(this.ab, this.N.a, this.b, this))));
      $$2.a(new fgw.a(this.m.h, I, T, $$0x -> this.m.a(new fgy(I, this::a, ffa.d.a, this.X))));
      $$2.a(fot.b(16), 3);
      $$2.a(new fgw.a(this.m.h, J, S, $$0x -> this.m.a(new fgy(J, this::a, ffa.d.c, this.Y))));
      $$2.a(new fgw.a(this.m.h, K, V, $$0x -> this.m.a(new fgy(K, this::a, ffa.d.d, this.Z))));
      $$2.a(new fgw.a(this.m.h, L, W, $$0x -> this.m.a(new fgy(L, this::a, ffa.d.e, this.aa))));
      this.ad.b(fkz.a(xg.k, $$0x -> this.d()).a());
      this.ad.a($$1x -> {
         fkx var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.ad.a();
   }

   @Override
   public xh i() {
      return xg.a(this.n(), this.O);
   }

   @Override
   public void d() {
      this.m.a(this.M);
   }

   private void a(@Nullable ffp $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fic($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(@Nullable fhr $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fib($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(fhy $$0) {
      List<fhy> $$1 = new ArrayList<>();
      if (this.ab != null) {
         $$1.add(this.ab);
      }

      if (this.b != this.N.n) {
         $$1.add(new fig(this.N.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fgo(this.M, $$1.toArray(new fhy[0])));
   }

   class a extends fkz {
      private static final alh b = alh.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final alh v;

      a(final fkk $$0, final xh $$1, final alh $$2, final fkz.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fkm $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.B();
         int $$5 = -1;
         if ($$4) {
            $$5 = axu.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.D();
         int $$7 = this.E();
         $$0.a(gig::B, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(gig::B, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(fgw.this.p, this.z(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
