import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcm extends gve {
   private static final ale a = new ale("realm_status/expired");
   private static final ale b = new ale("realm_status/expires_soon");
   private static final ale c = new ale("realm_status/open");
   private static final ale B = new ale("realm_status/closed");
   private static final Logger C = LogUtils.getLogger();
   private static final xo D = xo.c("mco.configure.worlds.title");
   private static final xo E = xo.c("mco.configure.world.title");
   private static final xo F = xo.c("mco.selectServer.expired");
   private static final xo G = xo.c("mco.selectServer.expires.soon");
   private static final xo H = xo.c("mco.selectServer.expires.day");
   private static final xo I = xo.c("mco.selectServer.open");
   private static final xo J = xo.c("mco.selectServer.closed");
   private static final int K = 80;
   private static final int L = 5;
   @Nullable
   private xo M;
   private final fah N;
   @Nullable
   private fbd O;
   private final long P;
   private int Q;
   private int R;
   private fhc S;
   private fhc T;
   private fhc U;
   private fhc V;
   private fhc W;
   private fhc X;
   private fhc Y;
   private boolean Z;
   private final List<fcf> aa = Lists.newArrayList();

   public fcm(fah $$0, long $$1) {
      super(E);
      this.N = $$0;
      this.P = $$1;
   }

   @Override
   public void aM_() {
      if (this.O == null) {
         this.a(this.P);
      }

      this.Q = this.n / 2 - 187;
      this.R = this.n / 2 + 190;
      this.S = this.c(fhc.a(xo.c("mco.configure.world.buttons.players"), $$0x -> this.m.a(new fcy(this, this.O))).a(this.a(0, 3), g(0), 100, 20).a());
      this.T = this.c(fhc.a(xo.c("mco.configure.world.buttons.settings"), $$0x -> this.m.a(new fde(this, this.O.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.U = this.c(
         fhc.a(xo.c("mco.configure.world.buttons.subscription"), $$0x -> this.m.a(new fdg(this, this.O.g(), this.N))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.aa.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.aa.add(this.a($$0));
      }

      this.Y = this.c(
         fhc.a(xo.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.m.a(new fdd(xo.c("mco.template.title.minigame"), this::a, fbd.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.V = this.c(
         fhc.a(xo.c("mco.configure.world.buttons.options"), $$0x -> this.m.a(new fdf(this, this.O.i.get(this.O.n).d(), this.O.m, this.O.n)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.W = this.c(fhc.a(xo.c("mco.configure.world.backup"), $$0x -> this.m.a(new fcj(this, this.O.g(), this.O.n))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.X = this.c(
         fhc.a(xo.c("mco.configure.world.buttons.resetworld"), $$0x -> this.m.a(fdb.a(this, this.O.g(), () -> this.m.execute(() -> this.m.a(this.f())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.c(fhc.a(xn.k, $$0x -> this.d()).a(this.R - 80 + 8, g(13) - 5, 70, 20).a());
      this.W.j = true;
      if (this.O == null) {
         this.J();
         this.I();
         this.S.j = false;
         this.T.j = false;
         this.U.j = false;
      } else {
         this.D();
         if (this.F()) {
            this.I();
         } else {
            this.J();
         }
      }
   }

   private fcf a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      fcf $$3 = new fcf($$1, $$2, 80, 80, $$0, $$1x -> {
         fcf.b $$2x = ((fcf)$$1x).a();
         if ($$2x != null) {
            switch ($$2x.c) {
               case a:
                  break;
               case c:
                  this.a(this.O);
                  break;
               case b:
                  if ($$2x.b) {
                     this.E();
                  } else if ($$2x.a) {
                     this.b($$0, this.O);
                  } else {
                     this.a($$0, this.O);
                  }
                  break;
               default:
                  throw new IllegalStateException("Unknown action " + $$2x.c);
            }
         }
      });
      if (this.O != null) {
         $$3.a(this.O);
      }

      return this.c($$3);
   }

   private int b(int $$0) {
      return this.Q + $$0 * 95;
   }

   private int a(int $$0, int $$1) {
      return this.n / 2 - ($$1 * 105 - 5) / 2 + $$0 * 105;
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.M = null;
      $$0.a(this.p, D, this.n / 2, g(4), -1);
      if (this.O == null) {
         $$0.a(this.p, this.l, this.n / 2, 17, -1);
      } else {
         String $$4 = this.O.b();
         int $$5 = this.p.b($$4);
         int $$6 = this.O.e == fbd.c.a ? -6250336 : 8388479;
         int $$7 = this.p.a(this.l);
         $$0.a(this.p, this.l, this.n / 2, 12, -1);
         $$0.a(this.p, $$4, this.n / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.n / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.b($$0, $$8, 7, $$1, $$2);
         if (this.F()) {
            String $$9 = this.O.c();
            if ($$9 != null) {
               $$0.a(this.p, xo.a("mco.configure.world.minigame", $$9), this.Q + 80 + 20 + 10, g(13), -1, false);
            }
         }
      }
   }

   private int h(int $$0) {
      return this.Q + ($$0 - 1) * 98;
   }

   @Override
   public void d() {
      this.m.a(this.N);
      if (this.Z) {
         this.N.h();
      }
   }

   private void a(long $$0) {
      new Thread(() -> {
         fam $$1 = fam.a();

         try {
            fbd $$2 = $$1.a($$0);
            this.m.execute(() -> {
               this.O = $$2;
               this.D();
               if (this.F()) {
                  this.b(this.Y);
               } else {
                  this.b(this.V);
                  this.b(this.W);
                  this.b(this.X);
               }

               for (fcf $$1x : this.aa) {
                  $$1x.a($$2);
               }
            });
         } catch (fbz var5) {
            C.error("Couldn't get own world", var5);
            this.m.execute(() -> this.m.a(new fcq(var5, this.N)));
         }
      }).start();
   }

   private void D() {
      this.S.j = !this.O.j;
      this.T.j = !this.O.j;
      this.U.j = true;
      this.Y.j = !this.O.j;
      this.V.j = !this.O.j;
      this.X.j = !this.O.j;
   }

   private void a(fbd $$0) {
      if (this.O.e == fbd.c.b) {
         fah.a($$0, new fcm(this.N, this.P));
      } else {
         this.a(true, new fcm(this.N, this.P));
      }
   }

   private void E() {
      fdd $$0 = new fdd(xo.c("mco.template.title.minigame"), this::a, fbd.d.b);
      $$0.a(xo.c("mco.minigame.world.info.line1"), xo.c("mco.minigame.world.info.line2"));
      this.m.a($$0);
   }

   private void a(int $$0, fbd $$1) {
      xo $$2 = xo.c("mco.configure.world.slot.switch.question.line1");
      xo $$3 = xo.c("mco.configure.world.slot.switch.question.line2");
      this.m.a(new fcs($$2x -> {
         if ($$2x) {
            this.b();
            this.m.a(new fct(this.N, new fel($$1.a, $$0, () -> this.m.execute(() -> this.m.a(this.f())))));
         } else {
            this.m.a(this);
         }
      }, fcs.a.b, $$2, $$3, true));
   }

   private void b(int $$0, fbd $$1) {
      xo $$2 = xo.c("mco.configure.world.slot.switch.question.line1");
      xo $$3 = xo.c("mco.configure.world.slot.switch.question.line2");
      this.m.a(new fcs($$2x -> {
         if ($$2x) {
            this.b();
            fdb $$3x = fdb.a(this, $$0, $$1, () -> this.m.execute(() -> this.m.a(this.f())));
            this.m.a($$3x);
         } else {
            this.m.a(this);
         }
      }, fcs.a.b, $$2, $$3, true));
   }

   private void b(fgp $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.O.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> F);
      } else if (this.O.e == fbd.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, B, () -> J);
      } else if (this.O.e == fbd.c.b) {
         if (this.O.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.O.l <= 0) {
                  return G;
               } else {
                  return (xo)(this.O.l == 1 ? H : xo.a("mco.selectServer.expires.days", this.O.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> I);
         }
      }
   }

   private void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, ale $$5, Supplier<xo> $$6) {
      $$0.a($$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.d($$6.get());
      }
   }

   private boolean F() {
      return this.O != null && this.O.m == fbd.d.b;
   }

   private void I() {
      this.a(this.V);
      this.a(this.W);
      this.a(this.X);
   }

   private void a(fhc $$0) {
      $$0.k = false;
   }

   private void b(fhc $$0) {
      $$0.k = true;
   }

   private void J() {
      this.a(this.Y);
   }

   public void a(fbk $$0) {
      fbk $$1 = this.O.i.get(this.O.n);
      $$0.l = $$1.l;
      $$0.m = $$1.m;
      fam $$2 = fam.a();

      try {
         $$2.a(this.O.a, this.O.n, $$0);
         this.O.i.put(this.O.n, $$0);
      } catch (fbz var5) {
         C.error("Couldn't save slot settings", var5);
         this.m.a(new fcq(var5, this));
         return;
      }

      this.m.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = azt.h($$1) ? null : $$1;
      fam $$3 = fam.a();

      try {
         $$3.b(this.O.a, $$0, $$2);
         this.O.a($$0);
         this.O.b($$2);
         this.b();
      } catch (fbz var6) {
         C.error("Couldn't save settings", var6);
         this.m.a(new fcq(var6, this));
         return;
      }

      this.m.a(this);
   }

   public void a(boolean $$0, fnb $$1) {
      this.m.a(new fct($$1, new fee(this.O, this, $$0, this.m)));
   }

   public void a(fnb $$0) {
      this.m.a(new fct($$0, new fdy(this.O, this)));
   }

   public void b() {
      this.Z = true;
   }

   private void a(@Nullable fbu $$0) {
      if ($$0 != null && fbu.a.b == $$0.i) {
         this.b();
         this.m.a(new fct(this.N, new fek(this.O.a, $$0, this.f())));
      } else {
         this.m.a(this);
      }
   }

   public fcm f() {
      fcm $$0 = new fcm(this.N, this.P);
      $$0.Z = this.Z;
      return $$0;
   }
}
