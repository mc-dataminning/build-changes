import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgi extends hee {
   private static final alh a = alh.b("realm_status/expired");
   private static final alh b = alh.b("realm_status/expires_soon");
   private static final alh c = alh.b("realm_status/open");
   private static final alh B = alh.b("realm_status/closed");
   private static final Logger C = LogUtils.getLogger();
   private static final xh D = xh.c("mco.configure.worlds.title");
   private static final xh E = xh.c("mco.configure.world.title");
   private static final xh F = xh.c("mco.selectServer.expired");
   private static final xh G = xh.c("mco.selectServer.expires.soon");
   private static final xh H = xh.c("mco.selectServer.expires.day");
   private static final xh I = xh.c("mco.selectServer.open");
   private static final xh J = xh.c("mco.selectServer.closed");
   private static final int K = 80;
   private static final int L = 5;
   @Nullable
   private xh M;
   private final fee N;
   @Nullable
   private ffa O;
   private final long P;
   private int Q;
   private int R;
   private fkz S;
   private fkz T;
   private fkz U;
   private fkz V;
   private fkz W;
   private fkz X;
   private fkz Y;
   private boolean Z;
   private final List<fga> aa = Lists.newArrayList();

   public fgi(fee $$0, long $$1) {
      super(E);
      this.N = $$0;
      this.P = $$1;
   }

   @Override
   public void aS_() {
      if (this.O == null) {
         this.a(this.P);
      }

      this.Q = this.n / 2 - 187;
      this.R = this.n / 2 + 190;
      this.S = this.c(fkz.a(xh.c("mco.configure.world.buttons.players"), $$0x -> this.m.a(new fgt(this, this.O))).a(this.a(0, 3), g(0), 100, 20).a());
      this.T = this.c(fkz.a(xh.c("mco.configure.world.buttons.settings"), $$0x -> this.m.a(new fgz(this, this.O.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.U = this.c(
         fkz.a(xh.c("mco.configure.world.buttons.subscription"), $$0x -> this.m.a(new fhb(this, this.O.g(), this.N))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.aa.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.aa.add(this.a($$0));
      }

      this.Y = this.c(
         fkz.a(xh.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.m.a(new fgy(xh.c("mco.template.title.minigame"), this::a, ffa.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.V = this.c(
         fkz.a(xh.c("mco.configure.world.buttons.options"), $$0x -> this.m.a(new fha(this, this.O.i.get(this.O.n).d(), this.O.m, this.O.n)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.W = this.c(fkz.a(xh.c("mco.configure.world.backup"), $$0x -> this.m.a(new fgf(this, this.O.g(), this.O.n))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.X = this.c(
         fkz.a(xh.c("mco.configure.world.buttons.resetworld"), $$0x -> this.m.a(fgw.a(this, this.O.g(), () -> this.m.execute(() -> this.m.a(this.g())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.c(fkz.a(xg.k, $$0x -> this.d()).a(this.R - 80 + 8, g(13) - 5, 70, 20).a());
      this.W.j = true;
      if (this.O == null) {
         this.J();
         this.G();
         this.S.j = false;
         this.T.j = false;
         this.U.j = false;
      } else {
         this.D();
         if (this.F()) {
            this.G();
         } else {
            this.J();
         }
      }
   }

   private fga a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      fga $$3 = new fga($$1, $$2, 80, 80, $$0, $$1x -> {
         fga.b $$2x = ((fga)$$1x).a();
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
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.M = null;
      $$0.a(this.p, D, this.n / 2, g(4), -1);
      if (this.O == null) {
         $$0.a(this.p, this.l, this.n / 2, 17, -1);
      } else {
         String $$4 = this.O.b();
         int $$5 = this.p.b($$4);
         int $$6 = this.O.e == ffa.c.a ? -6250336 : 8388479;
         int $$7 = this.p.a(this.l);
         $$0.a(this.p, this.l, this.n / 2, 12, -1);
         $$0.a(this.p, $$4, this.n / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.n / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.b($$0, $$8, 7, $$1, $$2);
         if (this.F()) {
            String $$9 = this.O.c();
            if ($$9 != null) {
               $$0.a(this.p, xh.a("mco.configure.world.minigame", $$9), this.Q + 80 + 20 + 10, g(13), -1, false);
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
         fej $$1 = fej.a();

         try {
            ffa $$2 = $$1.a($$0);
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

               for (fga $$1x : this.aa) {
                  $$1x.a($$2);
               }
            });
         } catch (ffu var5) {
            C.error("Couldn't get own world", var5);
            this.m.execute(() -> this.m.a(new fgm(var5, this.N)));
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

   private void a(ffa $$0) {
      if (this.O.e == ffa.c.b) {
         fee.a($$0, this);
      } else {
         this.b(true);
      }
   }

   private void E() {
      fgy $$0 = new fgy(xh.c("mco.template.title.minigame"), this::a, ffa.d.b);
      $$0.a(xh.c("mco.minigame.world.info.line1"), xh.c("mco.minigame.world.info.line2"));
      this.m.a($$0);
   }

   private void a(int $$0, ffa $$1) {
      this.m.a(fgu.a(this, xh.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         this.m.a(new fgo(this.N, new fig($$1.a, $$0, () -> this.m.execute(() -> this.m.a(this.g())))));
      }));
   }

   private void b(int $$0, ffa $$1) {
      this.m.a(fgu.a(this, xh.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         fgw $$3 = fgw.a(this, $$0, $$1, () -> this.m.execute(() -> this.m.a(this.g())));
         this.m.a($$3);
      }));
   }

   private void b(fkm $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.O.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> F);
      } else if (this.O.e == ffa.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, B, () -> J);
      } else if (this.O.e == ffa.c.b) {
         if (this.O.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.O.l <= 0) {
                  return G;
               } else {
                  return (xh)(this.O.l == 1 ? H : xh.a("mco.selectServer.expires.days", this.O.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> I);
         }
      }
   }

   private void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, alh $$5, Supplier<xh> $$6) {
      $$0.a(gig::B, $$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.d($$6.get());
      }
   }

   private boolean F() {
      return this.O != null && this.O.i();
   }

   private void G() {
      this.a(this.V);
      this.a(this.W);
      this.a(this.X);
   }

   private void a(fkz $$0) {
      $$0.k = false;
   }

   private void b(fkz $$0) {
      $$0.k = true;
   }

   private void J() {
      this.a(this.Y);
   }

   public void a(fff $$0) {
      fff $$1 = this.O.i.get(this.O.n);
      $$0.j = $$1.j;
      $$0.k = $$1.k;
      fej $$2 = fej.a();

      try {
         $$2.a(this.O.a, this.O.n, $$0);
         this.O.i.put(this.O.n, $$0);
      } catch (ffu var5) {
         C.error("Couldn't save slot settings", var5);
         this.m.a(new fgm(var5, this));
         return;
      }

      this.m.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = bag.h($$1) ? null : $$1;
      fej $$3 = fej.a();

      try {
         $$3.b(this.O.a, $$0, $$2);
         this.O.a($$0);
         this.O.b($$2);
         this.f();
      } catch (ffu var6) {
         C.error("Couldn't save settings", var6);
         this.m.a(new fgm(var6, this));
         return;
      }

      this.m.a(this);
   }

   public void b(boolean $$0) {
      fgi $$1 = this.g();
      this.m.a(new fgo($$1, new fhz(this.O, $$1, $$0, this.m)));
   }

   public void b() {
      fgi $$0 = this.g();
      this.m.a(new fgo($$0, new fht(this.O, $$0)));
   }

   public void f() {
      this.Z = true;
   }

   private void a(@Nullable ffp $$0) {
      if ($$0 != null && ffp.a.b == $$0.i) {
         this.f();
         this.m.a(new fgo(this.N, new fif(this.O.a, $$0, this.g())));
      } else {
         this.m.a(this);
      }
   }

   public fgi g() {
      fgi $$0 = new fgi(this.N, this.P);
      $$0.Z = this.Z;
      return $$0;
   }
}
