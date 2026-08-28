import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdv extends gwo {
   private static final akr a = akr.b("realm_status/expired");
   private static final akr b = akr.b("realm_status/expires_soon");
   private static final akr c = akr.b("realm_status/open");
   private static final akr B = akr.b("realm_status/closed");
   private static final Logger C = LogUtils.getLogger();
   private static final wz D = wz.c("mco.configure.worlds.title");
   private static final wz E = wz.c("mco.configure.world.title");
   private static final wz F = wz.c("mco.selectServer.expired");
   private static final wz G = wz.c("mco.selectServer.expires.soon");
   private static final wz H = wz.c("mco.selectServer.expires.day");
   private static final wz I = wz.c("mco.selectServer.open");
   private static final wz J = wz.c("mco.selectServer.closed");
   private static final int K = 80;
   private static final int L = 5;
   @Nullable
   private wz M;
   private final fbr N;
   @Nullable
   private fcn O;
   private final long P;
   private int Q;
   private int R;
   private fik S;
   private fik T;
   private fik U;
   private fik V;
   private fik W;
   private fik X;
   private fik Y;
   private boolean Z;
   private final List<fdn> aa = Lists.newArrayList();

   public fdv(fbr $$0, long $$1) {
      super(E);
      this.N = $$0;
      this.P = $$1;
   }

   @Override
   public void aT_() {
      if (this.O == null) {
         this.a(this.P);
      }

      this.Q = this.m / 2 - 187;
      this.R = this.m / 2 + 190;
      this.S = this.c(fik.a(wz.c("mco.configure.world.buttons.players"), $$0x -> this.l.a(new feg(this, this.O))).a(this.a(0, 3), g(0), 100, 20).a());
      this.T = this.c(fik.a(wz.c("mco.configure.world.buttons.settings"), $$0x -> this.l.a(new fem(this, this.O.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.U = this.c(
         fik.a(wz.c("mco.configure.world.buttons.subscription"), $$0x -> this.l.a(new feo(this, this.O.g(), this.N))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.aa.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.aa.add(this.a($$0));
      }

      this.Y = this.c(
         fik.a(wz.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.l.a(new fel(wz.c("mco.template.title.minigame"), this::a, fcn.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.V = this.c(
         fik.a(wz.c("mco.configure.world.buttons.options"), $$0x -> this.l.a(new fen(this, this.O.i.get(this.O.n).d(), this.O.m, this.O.n)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.W = this.c(fik.a(wz.c("mco.configure.world.backup"), $$0x -> this.l.a(new fds(this, this.O.g(), this.O.n))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.X = this.c(
         fik.a(wz.c("mco.configure.world.buttons.resetworld"), $$0x -> this.l.a(fej.a(this, this.O.g(), () -> this.l.execute(() -> this.l.a(this.g())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.c(fik.a(wy.k, $$0x -> this.d()).a(this.R - 80 + 8, g(13) - 5, 70, 20).a());
      this.W.j = true;
      if (this.O == null) {
         this.G();
         this.F();
         this.S.j = false;
         this.T.j = false;
         this.U.j = false;
      } else {
         this.C();
         if (this.E()) {
            this.F();
         } else {
            this.G();
         }
      }
   }

   private fdn a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      fdn $$3 = new fdn($$1, $$2, 80, 80, $$0, $$1x -> {
         fdn.b $$2x = ((fdn)$$1x).a();
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
      return this.m / 2 - ($$1 * 105 - 5) / 2 + $$0 * 105;
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.M = null;
      $$0.a(this.o, D, this.m / 2, g(4), -1);
      if (this.O == null) {
         $$0.a(this.o, this.k, this.m / 2, 17, -1);
      } else {
         String $$4 = this.O.b();
         int $$5 = this.o.b($$4);
         int $$6 = this.O.e == fcn.c.a ? -6250336 : 8388479;
         int $$7 = this.o.a(this.k);
         $$0.a(this.o, this.k, this.m / 2, 12, -1);
         $$0.a(this.o, $$4, this.m / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.m / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.b($$0, $$8, 7, $$1, $$2);
         if (this.E()) {
            String $$9 = this.O.c();
            if ($$9 != null) {
               $$0.a(this.o, wz.a("mco.configure.world.minigame", $$9), this.Q + 80 + 20 + 10, g(13), -1, false);
            }
         }
      }
   }

   private int h(int $$0) {
      return this.Q + ($$0 - 1) * 98;
   }

   @Override
   public void d() {
      this.l.a(this.N);
      if (this.Z) {
         this.N.h();
      }
   }

   private void a(long $$0) {
      new Thread(() -> {
         fbw $$1 = fbw.a();

         try {
            fcn $$2 = $$1.a($$0);
            this.l.execute(() -> {
               this.O = $$2;
               this.C();
               if (this.E()) {
                  this.b(this.Y);
               } else {
                  this.b(this.V);
                  this.b(this.W);
                  this.b(this.X);
               }

               for (fdn $$1x : this.aa) {
                  $$1x.a($$2);
               }
            });
         } catch (fdh var5) {
            C.error("Couldn't get own world", var5);
            this.l.execute(() -> this.l.a(new fdz(var5, this.N)));
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

   private void a(fcn $$0) {
      if (this.O.e == fcn.c.b) {
         fbr.a($$0, this);
      } else {
         this.b(true);
      }
   }

   private void D() {
      fel $$0 = new fel(wz.c("mco.template.title.minigame"), this::a, fcn.d.b);
      $$0.a(wz.c("mco.minigame.world.info.line1"), wz.c("mco.minigame.world.info.line2"));
      this.l.a($$0);
   }

   private void a(int $$0, fcn $$1) {
      this.l.a(feh.a(this, wz.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         this.l.a(new feb(this.N, new fft($$1.a, $$0, () -> this.l.execute(() -> this.l.a(this.g())))));
      }));
   }

   private void b(int $$0, fcn $$1) {
      this.l.a(feh.a(this, wz.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         fej $$3 = fej.a(this, $$0, $$1, () -> this.l.execute(() -> this.l.a(this.g())));
         this.l.a($$3);
      }));
   }

   private void b(fhx $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.O.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> F);
      } else if (this.O.e == fcn.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, B, () -> J);
      } else if (this.O.e == fcn.c.b) {
         if (this.O.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.O.l <= 0) {
                  return G;
               } else {
                  return (wz)(this.O.l == 1 ? H : wz.a("mco.selectServer.expires.days", this.O.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> I);
         }
      }
   }

   private void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, akr $$5, Supplier<wz> $$6) {
      $$0.a($$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.d($$6.get());
      }
   }

   private boolean E() {
      return this.O != null && this.O.i();
   }

   private void F() {
      this.a(this.V);
      this.a(this.W);
      this.a(this.X);
   }

   private void a(fik $$0) {
      $$0.k = false;
   }

   private void b(fik $$0) {
      $$0.k = true;
   }

   private void G() {
      this.a(this.Y);
   }

   public void a(fcs $$0) {
      fcs $$1 = this.O.i.get(this.O.n);
      $$0.l = $$1.l;
      $$0.m = $$1.m;
      fbw $$2 = fbw.a();

      try {
         $$2.a(this.O.a, this.O.n, $$0);
         this.O.i.put(this.O.n, $$0);
      } catch (fdh var5) {
         C.error("Couldn't save slot settings", var5);
         this.l.a(new fdz(var5, this));
         return;
      }

      this.l.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = azl.h($$1) ? null : $$1;
      fbw $$3 = fbw.a();

      try {
         $$3.b(this.O.a, $$0, $$2);
         this.O.a($$0);
         this.O.b($$2);
         this.f();
      } catch (fdh var6) {
         C.error("Couldn't save settings", var6);
         this.l.a(new fdz(var6, this));
         return;
      }

      this.l.a(this);
   }

   public void b(boolean $$0) {
      fdv $$1 = this.g();
      this.l.a(new feb($$1, new ffm(this.O, $$1, $$0, this.l)));
   }

   public void b() {
      fdv $$0 = this.g();
      this.l.a(new feb($$0, new ffg(this.O, $$0)));
   }

   public void f() {
      this.Z = true;
   }

   private void a(@Nullable fdc $$0) {
      if ($$0 != null && fdc.a.b == $$0.i) {
         this.f();
         this.l.a(new feb(this.N, new ffs(this.O.a, $$0, this.g())));
      } else {
         this.l.a(this);
      }
   }

   public fdv g() {
      fdv $$0 = new fdv(this.N, this.P);
      $$0.Z = this.Z;
      return $$0;
   }
}
