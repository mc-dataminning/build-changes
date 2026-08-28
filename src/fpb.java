import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpb extends hrm {
   static final Logger c = LogUtils.getLogger();
   private static final xa C = xa.c("mco.selectServer.create");
   private static final xa D = xa.c("mco.selectServer.create.subtitle");
   private static final xa E = xa.c("mco.configure.world.switch.slot");
   private static final xa F = xa.c("mco.configure.world.switch.slot.subtitle");
   private static final xa G = xa.c("mco.reset.world.generate");
   private static final xa H = xa.c("mco.reset.world.title");
   private static final xa I = xa.c("mco.reset.world.warning");
   public static final xa a = xa.c("mco.create.world.reset.title");
   private static final xa J = xa.c("mco.reset.world.resetting.screen.title");
   private static final xa K = xa.c("mco.reset.world.template");
   private static final xa L = xa.c("mco.reset.world.adventure");
   private static final xa M = xa.c("mco.reset.world.experience");
   private static final xa N = xa.c("mco.reset.world.inspiration");
   private final gad O;
   private final fne P;
   private final xa Q;
   private final int R;
   private final xa S;
   private static final ali T = ali.b("textures/gui/realms/upload.png");
   private static final ali U = ali.b("textures/gui/realms/adventure.png");
   private static final ali V = ali.b("textures/gui/realms/survival_spawn.png");
   private static final ali W = ali.b("textures/gui/realms/new_world.png");
   private static final ali X = ali.b("textures/gui/realms/experience.png");
   private static final ali Y = ali.b("textures/gui/realms/inspiration.png");
   fnv Z;
   fnv aa;
   fnv ab;
   fnv ac;
   public final int b;
   @Nullable
   private final fqd ad;
   private final Runnable ae;
   private final fxz af = new fxz(this);

   private fpb(gad $$0, fne $$1, int $$2, xa $$3, xa $$4, int $$5, xa $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fpb(gad $$0, fne $$1, int $$2, xa $$3, xa $$4, int $$5, xa $$6, @Nullable fqd $$7, Runnable $$8) {
      super($$3);
      this.O = $$0;
      this.P = $$1;
      this.b = $$2;
      this.Q = $$4;
      this.R = $$5;
      this.S = $$6;
      this.ad = $$7;
      this.ae = $$8;
   }

   public static fpb a(gad $$0, fne $$1, fqd $$2, Runnable $$3) {
      return new fpb($$0, $$1, $$1.p, C, D, -6250336, a, $$2, $$3);
   }

   public static fpb a(gad $$0, int $$1, fne $$2, Runnable $$3) {
      return new fpb($$0, $$2, $$1, E, F, -6250336, a, $$3);
   }

   public static fpb a(gad $$0, fne $$1, Runnable $$2) {
      return new fpb($$0, $$1, $$1.p, H, I, -65536, J, $$2);
   }

   @Override
   public void aS_() {
      fyd $$0 = this.af.a(fyd.d());
      $$0.c().a(9 / 3);
      $$0.a(new fvs(this.l, this.p), fyc::b);
      $$0.a(new fvs(this.Q, this.p).b(this.R), fyc::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fmd $$0 = fmd.a();

            try {
               fnv $$1 = $$0.a(1, 10, fne.d.a);
               fnv $$2 = $$0.a(1, 10, fne.d.c);
               fnv $$3 = $$0.a(1, 10, fne.d.d);
               fnv $$4 = $$0.a(1, 10, fne.d.e);
               fpb.this.m.execute(() -> {
                  fpb.this.Z = $$1;
                  fpb.this.aa = $$2;
                  fpb.this.ab = $$3;
                  fpb.this.ac = $$4;
               });
            } catch (fnz var6) {
               fpb.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fxy $$1 = this.af.c(new fxy());
      fxy.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fpb.a(this.m.h, G, W, $$0x -> fmj.a(this.m, this.O, this, this.b, this.P, this.ad)));
      $$2.a(new fpb.a(this.m.h, fpc.a, T, $$0x -> this.m.a(new fpc(this.ad, this.P.a, this.b, this))));
      $$2.a(new fpb.a(this.m.h, K, V, $$0x -> this.m.a(new fpd(K, this::a, fne.d.a, this.Z))));
      $$2.a(fye.b(16), 3);
      $$2.a(new fpb.a(this.m.h, L, U, $$0x -> this.m.a(new fpd(L, this::a, fne.d.c, this.aa))));
      $$2.a(new fpb.a(this.m.h, M, X, $$0x -> this.m.a(new fpd(M, this::a, fne.d.d, this.ab))));
      $$2.a(new fpb.a(this.m.h, N, Y, $$0x -> this.m.a(new fpd(N, this::a, fne.d.e, this.ac))));
      this.af.b(ful.a(wz.k, $$0x -> this.aP_()).a());
      this.af.a($$1x -> {
         fuj var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.af.a();
   }

   @Override
   public xa i() {
      return wz.a(this.n(), this.Q);
   }

   @Override
   public void aP_() {
      this.m.a(this.O);
   }

   private void a(@Nullable fnu $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fqe($$0, this.P.a, this.S, this.ae));
      }

      fly.g();
   }

   private void a(fqb $$0) {
      List<fqb> $$1 = new ArrayList<>();
      if (this.ad != null) {
         $$1.add(this.ad);
      }

      if (this.b != this.P.p) {
         $$1.add(new fqi(this.P.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fou(this.O, $$1.toArray(new fqb[0])));
   }

   class a extends ful {
      private static final ali b = ali.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final ali v;

      a(final ftv $$0, final xa $$1, final ali $$2, final ful.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(ftx $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.D();
         int $$5 = -1;
         if ($$4) {
            $$5 = axy.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.F();
         int $$7 = this.G();
         $$0.a(gsl::H, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(gsl::H, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(fpb.this.p, this.B(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
