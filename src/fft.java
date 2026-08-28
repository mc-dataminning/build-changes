import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fft extends hdk {
   private static final alc a = alc.b("realm_status/expired");
   private static final alc b = alc.b("realm_status/expires_soon");
   private static final alc c = alc.b("realm_status/open");
   private static final alc B = alc.b("realm_status/closed");
   private static final Logger C = LogUtils.getLogger();
   private static final xd D = xd.c("mco.configure.worlds.title");
   private static final xd E = xd.c("mco.configure.world.title");
   private static final xd F = xd.c("mco.selectServer.expired");
   private static final xd G = xd.c("mco.selectServer.expires.soon");
   private static final xd H = xd.c("mco.selectServer.expires.day");
   private static final xd I = xd.c("mco.selectServer.open");
   private static final xd J = xd.c("mco.selectServer.closed");
   private static final int K = 80;
   private static final int L = 5;
   @Nullable
   private xd M;
   private final fdp N;
   @Nullable
   private fel O;
   private final long P;
   private int Q;
   private int R;
   private fkk S;
   private fkk T;
   private fkk U;
   private fkk V;
   private fkk W;
   private fkk X;
   private fkk Y;
   private boolean Z;
   private final List<ffl> aa = Lists.newArrayList();

   public fft(fdp $$0, long $$1) {
      super(E);
      this.N = $$0;
      this.P = $$1;
   }

   @Override
   public void aR_() {
      if (this.O == null) {
         this.a(this.P);
      }

      this.Q = this.n / 2 - 187;
      this.R = this.n / 2 + 190;
      this.S = this.c(fkk.a(xd.c("mco.configure.world.buttons.players"), $$0x -> this.m.a(new fge(this, this.O))).a(this.a(0, 3), g(0), 100, 20).a());
      this.T = this.c(fkk.a(xd.c("mco.configure.world.buttons.settings"), $$0x -> this.m.a(new fgk(this, this.O.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.U = this.c(
         fkk.a(xd.c("mco.configure.world.buttons.subscription"), $$0x -> this.m.a(new fgm(this, this.O.g(), this.N))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.aa.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.aa.add(this.a($$0));
      }

      this.Y = this.c(
         fkk.a(xd.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.m.a(new fgj(xd.c("mco.template.title.minigame"), this::a, fel.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.V = this.c(
         fkk.a(xd.c("mco.configure.world.buttons.options"), $$0x -> this.m.a(new fgl(this, this.O.i.get(this.O.n).d(), this.O.m, this.O.n)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.W = this.c(fkk.a(xd.c("mco.configure.world.backup"), $$0x -> this.m.a(new ffq(this, this.O.g(), this.O.n))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.X = this.c(
         fkk.a(xd.c("mco.configure.world.buttons.resetworld"), $$0x -> this.m.a(fgh.a(this, this.O.g(), () -> this.m.execute(() -> this.m.a(this.g())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.c(fkk.a(xc.k, $$0x -> this.d()).a(this.R - 80 + 8, g(13) - 5, 70, 20).a());
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

   private ffl a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      ffl $$3 = new ffl($$1, $$2, 80, 80, $$0, $$1x -> {
         ffl.b $$2x = ((ffl)$$1x).a();
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
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.M = null;
      $$0.a(this.p, D, this.n / 2, g(4), -1);
      if (this.O == null) {
         $$0.a(this.p, this.l, this.n / 2, 17, -1);
      } else {
         String $$4 = this.O.b();
         int $$5 = this.p.b($$4);
         int $$6 = this.O.e == fel.c.a ? -6250336 : 8388479;
         int $$7 = this.p.a(this.l);
         $$0.a(this.p, this.l, this.n / 2, 12, -1);
         $$0.a(this.p, $$4, this.n / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.n / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.b($$0, $$8, 7, $$1, $$2);
         if (this.F()) {
            String $$9 = this.O.c();
            if ($$9 != null) {
               $$0.a(this.p, xd.a("mco.configure.world.minigame", $$9), this.Q + 80 + 20 + 10, g(13), -1, false);
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
         fdu $$1 = fdu.a();

         try {
            fel $$2 = $$1.a($$0);
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

               for (ffl $$1x : this.aa) {
                  $$1x.a($$2);
               }
            });
         } catch (fff var5) {
            C.error("Couldn't get own world", var5);
            this.m.execute(() -> this.m.a(new ffx(var5, this.N)));
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

   private void a(fel $$0) {
      if (this.O.e == fel.c.b) {
         fdp.a($$0, this);
      } else {
         this.b(true);
      }
   }

   private void E() {
      fgj $$0 = new fgj(xd.c("mco.template.title.minigame"), this::a, fel.d.b);
      $$0.a(xd.c("mco.minigame.world.info.line1"), xd.c("mco.minigame.world.info.line2"));
      this.m.a($$0);
   }

   private void a(int $$0, fel $$1) {
      this.m.a(fgf.a(this, xd.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         this.m.a(new ffz(this.N, new fhr($$1.a, $$0, () -> this.m.execute(() -> this.m.a(this.g())))));
      }));
   }

   private void b(int $$0, fel $$1) {
      this.m.a(fgf.a(this, xd.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         fgh $$3 = fgh.a(this, $$0, $$1, () -> this.m.execute(() -> this.m.a(this.g())));
         this.m.a($$3);
      }));
   }

   private void b(fjx $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.O.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> F);
      } else if (this.O.e == fel.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, B, () -> J);
      } else if (this.O.e == fel.c.b) {
         if (this.O.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.O.l <= 0) {
                  return G;
               } else {
                  return (xd)(this.O.l == 1 ? H : xd.a("mco.selectServer.expires.days", this.O.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> I);
         }
      }
   }

   private void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, alc $$5, Supplier<xd> $$6) {
      $$0.a(ghq::B, $$5, $$1, $$2, 10, 28);
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

   private void a(fkk $$0) {
      $$0.k = false;
   }

   private void b(fkk $$0) {
      $$0.k = true;
   }

   private void J() {
      this.a(this.Y);
   }

   public void a(feq $$0) {
      feq $$1 = this.O.i.get(this.O.n);
      $$0.j = $$1.j;
      $$0.k = $$1.k;
      fdu $$2 = fdu.a();

      try {
         $$2.a(this.O.a, this.O.n, $$0);
         this.O.i.put(this.O.n, $$0);
      } catch (fff var5) {
         C.error("Couldn't save slot settings", var5);
         this.m.a(new ffx(var5, this));
         return;
      }

      this.m.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = baa.h($$1) ? null : $$1;
      fdu $$3 = fdu.a();

      try {
         $$3.b(this.O.a, $$0, $$2);
         this.O.a($$0);
         this.O.b($$2);
         this.f();
      } catch (fff var6) {
         C.error("Couldn't save settings", var6);
         this.m.a(new ffx(var6, this));
         return;
      }

      this.m.a(this);
   }

   public void b(boolean $$0) {
      fft $$1 = this.g();
      this.m.a(new ffz($$1, new fhk(this.O, $$1, $$0, this.m)));
   }

   public void b() {
      fft $$0 = this.g();
      this.m.a(new ffz($$0, new fhe(this.O, $$0)));
   }

   public void f() {
      this.Z = true;
   }

   private void a(@Nullable ffa $$0) {
      if ($$0 != null && ffa.a.b == $$0.i) {
         this.f();
         this.m.a(new ffz(this.N, new fhq(this.O.a, $$0, this.g())));
      } else {
         this.m.a(this);
      }
   }

   public fft g() {
      fft $$0 = new fft(this.N, this.P);
      $$0.Z = this.Z;
      return $$0;
   }
}
