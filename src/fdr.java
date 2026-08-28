import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdr extends gwj {
   private static final akq a = akq.b("realm_status/expired");
   private static final akq b = akq.b("realm_status/expires_soon");
   private static final akq c = akq.b("realm_status/open");
   private static final akq A = akq.b("realm_status/closed");
   private static final Logger B = LogUtils.getLogger();
   private static final wy C = wy.c("mco.configure.worlds.title");
   private static final wy D = wy.c("mco.configure.world.title");
   private static final wy E = wy.c("mco.selectServer.expired");
   private static final wy F = wy.c("mco.selectServer.expires.soon");
   private static final wy G = wy.c("mco.selectServer.expires.day");
   private static final wy H = wy.c("mco.selectServer.open");
   private static final wy I = wy.c("mco.selectServer.closed");
   private static final int J = 80;
   private static final int K = 5;
   @Nullable
   private wy L;
   private final fbn M;
   @Nullable
   private fcj N;
   private final long O;
   private int P;
   private int Q;
   private fig R;
   private fig S;
   private fig T;
   private fig U;
   private fig V;
   private fig W;
   private fig X;
   private boolean Y;
   private final List<fdj> Z = Lists.newArrayList();

   public fdr(fbn $$0, long $$1) {
      super(D);
      this.M = $$0;
      this.O = $$1;
   }

   @Override
   public void aP_() {
      if (this.N == null) {
         this.a(this.O);
      }

      this.P = this.m / 2 - 187;
      this.Q = this.m / 2 + 190;
      this.R = this.c(fig.a(wy.c("mco.configure.world.buttons.players"), $$0x -> this.l.a(new fec(this, this.N))).a(this.a(0, 3), g(0), 100, 20).a());
      this.S = this.c(fig.a(wy.c("mco.configure.world.buttons.settings"), $$0x -> this.l.a(new fei(this, this.N.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.T = this.c(
         fig.a(wy.c("mco.configure.world.buttons.subscription"), $$0x -> this.l.a(new fek(this, this.N.g(), this.M))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.Z.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.Z.add(this.a($$0));
      }

      this.X = this.c(
         fig.a(wy.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.l.a(new feh(wy.c("mco.template.title.minigame"), this::a, fcj.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.U = this.c(
         fig.a(wy.c("mco.configure.world.buttons.options"), $$0x -> this.l.a(new fej(this, this.N.i.get(this.N.n).d(), this.N.m, this.N.n)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.V = this.c(fig.a(wy.c("mco.configure.world.backup"), $$0x -> this.l.a(new fdo(this, this.N.g(), this.N.n))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.W = this.c(
         fig.a(wy.c("mco.configure.world.buttons.resetworld"), $$0x -> this.l.a(fef.a(this, this.N.g(), () -> this.l.execute(() -> this.l.a(this.g())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.c(fig.a(wx.k, $$0x -> this.d()).a(this.Q - 80 + 8, g(13) - 5, 70, 20).a());
      this.V.j = true;
      if (this.N == null) {
         this.J();
         this.G();
         this.R.j = false;
         this.S.j = false;
         this.T.j = false;
      } else {
         this.D();
         if (this.F()) {
            this.G();
         } else {
            this.J();
         }
      }
   }

   private fdj a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      fdj $$3 = new fdj($$1, $$2, 80, 80, $$0, $$1x -> {
         fdj.b $$2x = ((fdj)$$1x).a();
         if ($$2x != null) {
            switch ($$2x.c) {
               case a:
                  break;
               case c:
                  this.a(this.N);
                  break;
               case b:
                  if ($$2x.b) {
                     this.E();
                  } else if ($$2x.a) {
                     this.b($$0, this.N);
                  } else {
                     this.a($$0, this.N);
                  }
                  break;
               default:
                  throw new IllegalStateException("Unknown action " + $$2x.c);
            }
         }
      });
      if (this.N != null) {
         $$3.a(this.N);
      }

      return this.c($$3);
   }

   private int b(int $$0) {
      return this.P + $$0 * 95;
   }

   private int a(int $$0, int $$1) {
      return this.m / 2 - ($$1 * 105 - 5) / 2 + $$0 * 105;
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.L = null;
      $$0.a(this.o, C, this.m / 2, g(4), -1);
      if (this.N == null) {
         $$0.a(this.o, this.k, this.m / 2, 17, -1);
      } else {
         String $$4 = this.N.b();
         int $$5 = this.o.b($$4);
         int $$6 = this.N.e == fcj.c.a ? -6250336 : 8388479;
         int $$7 = this.o.a(this.k);
         $$0.a(this.o, this.k, this.m / 2, 12, -1);
         $$0.a(this.o, $$4, this.m / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.m / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.b($$0, $$8, 7, $$1, $$2);
         if (this.F()) {
            String $$9 = this.N.c();
            if ($$9 != null) {
               $$0.a(this.o, wy.a("mco.configure.world.minigame", $$9), this.P + 80 + 20 + 10, g(13), -1, false);
            }
         }
      }
   }

   private int h(int $$0) {
      return this.P + ($$0 - 1) * 98;
   }

   @Override
   public void d() {
      this.l.a(this.M);
      if (this.Y) {
         this.M.h();
      }
   }

   private void a(long $$0) {
      new Thread(() -> {
         fbs $$1 = fbs.a();

         try {
            fcj $$2 = $$1.a($$0);
            this.l.execute(() -> {
               this.N = $$2;
               this.D();
               if (this.F()) {
                  this.b(this.X);
               } else {
                  this.b(this.U);
                  this.b(this.V);
                  this.b(this.W);
               }

               for (fdj $$1x : this.Z) {
                  $$1x.a($$2);
               }
            });
         } catch (fdd var5) {
            B.error("Couldn't get own world", var5);
            this.l.execute(() -> this.l.a(new fdv(var5, this.M)));
         }
      }).start();
   }

   private void D() {
      this.R.j = !this.N.j;
      this.S.j = !this.N.j;
      this.T.j = true;
      this.X.j = !this.N.j;
      this.U.j = !this.N.j;
      this.W.j = !this.N.j;
   }

   private void a(fcj $$0) {
      if (this.N.e == fcj.c.b) {
         fbn.a($$0, this);
      } else {
         this.b(true);
      }
   }

   private void E() {
      feh $$0 = new feh(wy.c("mco.template.title.minigame"), this::a, fcj.d.b);
      $$0.a(wy.c("mco.minigame.world.info.line1"), wy.c("mco.minigame.world.info.line2"));
      this.l.a($$0);
   }

   private void a(int $$0, fcj $$1) {
      this.l.a(fed.a(this, wy.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         this.l.a(new fdx(this.M, new ffp($$1.a, $$0, () -> this.l.execute(() -> this.l.a(this.g())))));
      }));
   }

   private void b(int $$0, fcj $$1) {
      this.l.a(fed.a(this, wy.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         fef $$3 = fef.a(this, $$0, $$1, () -> this.l.execute(() -> this.l.a(this.g())));
         this.l.a($$3);
      }));
   }

   private void b(fht $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.N.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> E);
      } else if (this.N.e == fcj.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, A, () -> I);
      } else if (this.N.e == fcj.c.b) {
         if (this.N.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.N.l <= 0) {
                  return F;
               } else {
                  return (wy)(this.N.l == 1 ? G : wy.a("mco.selectServer.expires.days", this.N.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> H);
         }
      }
   }

   private void a(fht $$0, int $$1, int $$2, int $$3, int $$4, akq $$5, Supplier<wy> $$6) {
      $$0.a($$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.d($$6.get());
      }
   }

   private boolean F() {
      return this.N != null && this.N.i();
   }

   private void G() {
      this.a(this.U);
      this.a(this.V);
      this.a(this.W);
   }

   private void a(fig $$0) {
      $$0.k = false;
   }

   private void b(fig $$0) {
      $$0.k = true;
   }

   private void J() {
      this.a(this.X);
   }

   public void a(fco $$0) {
      fco $$1 = this.N.i.get(this.N.n);
      $$0.l = $$1.l;
      $$0.m = $$1.m;
      fbs $$2 = fbs.a();

      try {
         $$2.a(this.N.a, this.N.n, $$0);
         this.N.i.put(this.N.n, $$0);
      } catch (fdd var5) {
         B.error("Couldn't save slot settings", var5);
         this.l.a(new fdv(var5, this));
         return;
      }

      this.l.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = azk.h($$1) ? null : $$1;
      fbs $$3 = fbs.a();

      try {
         $$3.b(this.N.a, $$0, $$2);
         this.N.a($$0);
         this.N.b($$2);
         this.f();
      } catch (fdd var6) {
         B.error("Couldn't save settings", var6);
         this.l.a(new fdv(var6, this));
         return;
      }

      this.l.a(this);
   }

   public void b(boolean $$0) {
      fdr $$1 = this.g();
      this.l.a(new fdx($$1, new ffi(this.N, $$1, $$0, this.l)));
   }

   public void b() {
      fdr $$0 = this.g();
      this.l.a(new fdx($$0, new ffc(this.N, $$0)));
   }

   public void f() {
      this.Y = true;
   }

   private void a(@Nullable fcy $$0) {
      if ($$0 != null && fcy.a.b == $$0.i) {
         this.f();
         this.l.a(new fdx(this.M, new ffo(this.N.a, $$0, this.g())));
      } else {
         this.l.a(this);
      }
   }

   public fdr g() {
      fdr $$0 = new fdr(this.M, this.O);
      $$0.Y = this.Y;
      return $$0;
   }
}
