import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhw extends hff {
   static final Logger c = LogUtils.getLogger();
   private static final xl B = xl.c("mco.selectServer.create");
   private static final xl C = xl.c("mco.selectServer.create.subtitle");
   private static final xl D = xl.c("mco.configure.world.switch.slot");
   private static final xl E = xl.c("mco.configure.world.switch.slot.subtitle");
   private static final xl F = xl.c("mco.reset.world.generate");
   private static final xl G = xl.c("mco.reset.world.title");
   private static final xl H = xl.c("mco.reset.world.warning");
   public static final xl a = xl.c("mco.create.world.reset.title");
   private static final xl I = xl.c("mco.reset.world.resetting.screen.title");
   private static final xl J = xl.c("mco.reset.world.template");
   private static final xl K = xl.c("mco.reset.world.adventure");
   private static final xl L = xl.c("mco.reset.world.experience");
   private static final xl M = xl.c("mco.reset.world.inspiration");
   private final frp N;
   private final fgb O;
   private final xl P;
   private final int Q;
   private final xl R;
   private static final all S = all.b("textures/gui/realms/upload.png");
   private static final all T = all.b("textures/gui/realms/adventure.png");
   private static final all U = all.b("textures/gui/realms/survival_spawn.png");
   private static final all V = all.b("textures/gui/realms/new_world.png");
   private static final all W = all.b("textures/gui/realms/experience.png");
   private static final all X = all.b("textures/gui/realms/inspiration.png");
   fgr Y;
   fgr Z;
   fgr aa;
   fgr ab;
   public final int b;
   @Nullable
   private final fiy ac;
   private final Runnable ad;
   private final fpl ae = new fpl(this);

   private fhw(frp $$0, fgb $$1, int $$2, xl $$3, xl $$4, int $$5, xl $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fhw(frp $$0, fgb $$1, int $$2, xl $$3, xl $$4, int $$5, xl $$6, @Nullable fiy $$7, Runnable $$8) {
      super($$3);
      this.N = $$0;
      this.O = $$1;
      this.b = $$2;
      this.P = $$4;
      this.Q = $$5;
      this.R = $$6;
      this.ac = $$7;
      this.ad = $$8;
   }

   public static fhw a(frp $$0, fgb $$1, fiy $$2, Runnable $$3) {
      return new fhw($$0, $$1, $$1.n, B, C, -6250336, a, $$2, $$3);
   }

   public static fhw a(frp $$0, int $$1, fgb $$2, Runnable $$3) {
      return new fhw($$0, $$2, $$1, D, E, -6250336, a, $$3);
   }

   public static fhw a(frp $$0, fgb $$1, Runnable $$2) {
      return new fhw($$0, $$1, $$1.n, G, H, -65536, I, $$2);
   }

   @Override
   public void aS_() {
      fpp $$0 = this.ae.a(fpp.d());
      $$0.c().a(9 / 3);
      $$0.a(new fnd(this.l, this.p), fpo::b);
      $$0.a(new fnd(this.P, this.p).b(this.Q), fpo::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            ffa $$0 = ffa.a();

            try {
               fgr $$1 = $$0.a(1, 10, fgb.d.a);
               fgr $$2 = $$0.a(1, 10, fgb.d.c);
               fgr $$3 = $$0.a(1, 10, fgb.d.d);
               fgr $$4 = $$0.a(1, 10, fgb.d.e);
               fhw.this.m.execute(() -> {
                  fhw.this.Y = $$1;
                  fhw.this.Z = $$2;
                  fhw.this.aa = $$3;
                  fhw.this.ab = $$4;
               });
            } catch (fgv var6) {
               fhw.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fpk $$1 = this.ae.c(new fpk());
      fpk.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fhw.a(this.m.h, F, V, $$0x -> ffg.a(this.m, this.N, this, this.O, this.ac)));
      $$2.a(new fhw.a(this.m.h, fhx.a, S, $$0x -> this.m.a(new fhx(this.ac, this.O.a, this.b, this))));
      $$2.a(new fhw.a(this.m.h, J, U, $$0x -> this.m.a(new fhy(J, this::a, fgb.d.a, this.Y))));
      $$2.a(fpq.b(16), 3);
      $$2.a(new fhw.a(this.m.h, K, T, $$0x -> this.m.a(new fhy(K, this::a, fgb.d.c, this.Z))));
      $$2.a(new fhw.a(this.m.h, L, W, $$0x -> this.m.a(new fhy(L, this::a, fgb.d.d, this.aa))));
      $$2.a(new fhw.a(this.m.h, M, X, $$0x -> this.m.a(new fhy(M, this::a, fgb.d.e, this.ab))));
      this.ae.b(flw.a(xk.k, $$0x -> this.aP_()).a());
      this.ae.a($$1x -> {
         flu var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.ae.a();
   }

   @Override
   public xl i() {
      return xk.a(this.n(), this.P);
   }

   @Override
   public void aP_() {
      this.m.a(this.N);
   }

   private void a(@Nullable fgq $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fiz($$0, this.O.a, this.R, this.ad));
      }
   }

   private void a(fiw $$0) {
      List<fiw> $$1 = new ArrayList<>();
      if (this.ac != null) {
         $$1.add(this.ac);
      }

      if (this.b != this.O.n) {
         $$1.add(new fjd(this.O.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fhp(this.N, $$1.toArray(new fiw[0])));
   }

   class a extends flw {
      private static final all b = all.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final all v;

      a(final flh $$0, final xl $$1, final all $$2, final flw.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(flj $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.B();
         int $$5 = -1;
         if ($$4) {
            $$5 = axy.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.D();
         int $$7 = this.E();
         $$0.a(gjh::B, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(gjh::B, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(fhw.this.p, this.z(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
