import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fds extends gxb {
   private static final akt a = new akt("realm_status/expired");
   private static final akt b = new akt("realm_status/expires_soon");
   private static final akt c = new akt("realm_status/open");
   private static final akt B = new akt("realm_status/closed");
   private static final Logger C = LogUtils.getLogger();
   private static final xe D = xe.c("mco.configure.worlds.title");
   private static final xe E = xe.c("mco.configure.world.title");
   private static final xe F = xe.c("mco.selectServer.expired");
   private static final xe G = xe.c("mco.selectServer.expires.soon");
   private static final xe H = xe.c("mco.selectServer.expires.day");
   private static final xe I = xe.c("mco.selectServer.open");
   private static final xe J = xe.c("mco.selectServer.closed");
   private static final int K = 80;
   private static final int L = 5;
   @Nullable
   private xe M;
   private final fbn N;
   @Nullable
   private fcj O;
   private final long P;
   private int Q;
   private int R;
   private fin S;
   private fin T;
   private fin U;
   private fin V;
   private fin W;
   private fin X;
   private fin Y;
   private boolean Z;
   private final List<fdl> aa = Lists.newArrayList();

   public fds(fbn $$0, long $$1) {
      super(E);
      this.N = $$0;
      this.P = $$1;
   }

   @Override
   public void aN_() {
      if (this.O == null) {
         this.a(this.P);
      }

      this.Q = this.n / 2 - 187;
      this.R = this.n / 2 + 190;
      this.S = this.c(fin.a(xe.c("mco.configure.world.buttons.players"), $$0x -> this.m.a(new fee(this, this.O))).a(this.a(0, 3), g(0), 100, 20).a());
      this.T = this.c(fin.a(xe.c("mco.configure.world.buttons.settings"), $$0x -> this.m.a(new fek(this, this.O.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.U = this.c(
         fin.a(xe.c("mco.configure.world.buttons.subscription"), $$0x -> this.m.a(new fem(this, this.O.g(), this.N))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.aa.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.aa.add(this.a($$0));
      }

      this.Y = this.c(
         fin.a(xe.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.m.a(new fej(xe.c("mco.template.title.minigame"), this::a, fcj.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.V = this.c(
         fin.a(xe.c("mco.configure.world.buttons.options"), $$0x -> this.m.a(new fel(this, this.O.i.get(this.O.n).d(), this.O.m, this.O.n)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.W = this.c(fin.a(xe.c("mco.configure.world.backup"), $$0x -> this.m.a(new fdp(this, this.O.g(), this.O.n))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.X = this.c(
         fin.a(xe.c("mco.configure.world.buttons.resetworld"), $$0x -> this.m.a(feh.a(this, this.O.g(), () -> this.m.execute(() -> this.m.a(this.f())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.c(fin.a(xd.k, $$0x -> this.d()).a(this.R - 80 + 8, g(13) - 5, 70, 20).a());
      this.W.j = true;
      if (this.O == null) {
         this.I();
         this.F();
         this.S.j = false;
         this.T.j = false;
         this.U.j = false;
      } else {
         this.C();
         if (this.E()) {
            this.F();
         } else {
            this.I();
         }
      }
   }

   private fdl a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      fdl $$3 = new fdl($$1, $$2, 80, 80, $$0, $$1x -> {
         fdl.b $$2x = ((fdl)$$1x).a();
         if ($$2x != null) {
            switch ($$2x.c) {
               case a:
                  break;
               case c:
                  this.a(this.O);
                  break;
               case b:
                  if ($$2x.b) {
                     this.D();
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
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.M = null;
      $$0.a(this.p, D, this.n / 2, g(4), -1);
      if (this.O == null) {
         $$0.a(this.p, this.l, this.n / 2, 17, -1);
      } else {
         String $$4 = this.O.b();
         int $$5 = this.p.b($$4);
         int $$6 = this.O.e == fcj.c.a ? -6250336 : 8388479;
         int $$7 = this.p.a(this.l);
         $$0.a(this.p, this.l, this.n / 2, 12, -1);
         $$0.a(this.p, $$4, this.n / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.n / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.b($$0, $$8, 7, $$1, $$2);
         if (this.E()) {
            String $$9 = this.O.c();
            if ($$9 != null) {
               $$0.a(this.p, xe.a("mco.configure.world.minigame", $$9), this.Q + 80 + 20 + 10, g(13), -1, false);
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
         fbs $$1 = fbs.a();

         try {
            fcj $$2 = $$1.a($$0);
            this.m.execute(() -> {
               this.O = $$2;
               this.C();
               if (this.E()) {
                  this.b(this.Y);
               } else {
                  this.b(this.V);
                  this.b(this.W);
                  this.b(this.X);
               }

               for (fdl $$1x : this.aa) {
                  $$1x.a($$2);
               }
            });
         } catch (fdf var5) {
            C.error("Couldn't get own world", var5);
            this.m.execute(() -> this.m.a(new fdw(var5, this.N)));
         }
      }).start();
   }

   private void C() {
      this.S.j = !this.O.j;
      this.T.j = !this.O.j;
      this.U.j = true;
      this.Y.j = !this.O.j;
      this.V.j = !this.O.j;
      this.X.j = !this.O.j;
   }

   private void a(fcj $$0) {
      if (this.O.e == fcj.c.b) {
         fbn.a($$0, new fds(this.N, this.P));
      } else {
         this.a(true, new fds(this.N, this.P));
      }
   }

   private void D() {
      fej $$0 = new fej(xe.c("mco.template.title.minigame"), this::a, fcj.d.b);
      $$0.a(xe.c("mco.minigame.world.info.line1"), xe.c("mco.minigame.world.info.line2"));
      this.m.a($$0);
   }

   private void a(int $$0, fcj $$1) {
      xe $$2 = xe.c("mco.configure.world.slot.switch.question.line1");
      xe $$3 = xe.c("mco.configure.world.slot.switch.question.line2");
      this.m.a(new fdy($$2x -> {
         if ($$2x) {
            this.b();
            this.m.a(new fdz(this.N, new ffr($$1.a, $$0, () -> this.m.execute(() -> this.m.a(this.f())))));
         } else {
            this.m.a(this);
         }
      }, fdy.a.b, $$2, $$3, true));
   }

   private void b(int $$0, fcj $$1) {
      xe $$2 = xe.c("mco.configure.world.slot.switch.question.line1");
      xe $$3 = xe.c("mco.configure.world.slot.switch.question.line2");
      this.m.a(new fdy($$2x -> {
         if ($$2x) {
            this.b();
            feh $$3x = feh.a(this, $$0, $$1, () -> this.m.execute(() -> this.m.a(this.f())));
            this.m.a($$3x);
         } else {
            this.m.a(this);
         }
      }, fdy.a.b, $$2, $$3, true));
   }

   private void b(fia $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.O.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> F);
      } else if (this.O.e == fcj.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, B, () -> J);
      } else if (this.O.e == fcj.c.b) {
         if (this.O.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.O.l <= 0) {
                  return G;
               } else {
                  return (xe)(this.O.l == 1 ? H : xe.a("mco.selectServer.expires.days", this.O.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> I);
         }
      }
   }

   private void a(fia $$0, int $$1, int $$2, int $$3, int $$4, akt $$5, Supplier<xe> $$6) {
      $$0.a($$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.d($$6.get());
      }
   }

   private boolean E() {
      return this.O != null && this.O.m == fcj.d.b;
   }

   private void F() {
      this.a(this.V);
      this.a(this.W);
      this.a(this.X);
   }

   private void a(fin $$0) {
      $$0.k = false;
   }

   private void b(fin $$0) {
      $$0.k = true;
   }

   private void I() {
      this.a(this.Y);
   }

   public void a(fcq $$0) {
      fcq $$1 = this.O.i.get(this.O.n);
      $$0.l = $$1.l;
      $$0.m = $$1.m;
      fbs $$2 = fbs.a();

      try {
         $$2.a(this.O.a, this.O.n, $$0);
         this.O.i.put(this.O.n, $$0);
      } catch (fdf var5) {
         C.error("Couldn't save slot settings", var5);
         this.m.a(new fdw(var5, this));
         return;
      }

      this.m.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = azh.h($$1) ? null : $$1;
      fbs $$3 = fbs.a();

      try {
         $$3.b(this.O.a, $$0, $$2);
         this.O.a($$0);
         this.O.b($$2);
         this.b();
      } catch (fdf var6) {
         C.error("Couldn't save settings", var6);
         this.m.a(new fdw(var6, this));
         return;
      }

      this.m.a(this);
   }

   public void a(boolean $$0, fon $$1) {
      this.m.a(new fdz($$1, new ffk(this.O, this, $$0, this.m)));
   }

   public void a(fon $$0) {
      this.m.a(new fdz($$0, new ffe(this.O, this)));
   }

   public void b() {
      this.Z = true;
   }

   private void a(@Nullable fda $$0) {
      if ($$0 != null && fda.a.b == $$0.i) {
         this.b();
         this.m.a(new fdz(this.N, new ffq(this.O.a, $$0, this.f())));
      } else {
         this.m.a(this);
      }
   }

   public fds f() {
      fds $$0 = new fds(this.N, this.P);
      $$0.Z = this.Z;
      return $$0;
   }
}
