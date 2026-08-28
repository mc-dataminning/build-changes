import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgq extends hep {
   private static final ali a = ali.b("realm_status/expired");
   private static final ali b = ali.b("realm_status/expires_soon");
   private static final ali c = ali.b("realm_status/open");
   private static final ali B = ali.b("realm_status/closed");
   private static final Logger C = LogUtils.getLogger();
   private static final xi D = xi.c("mco.configure.worlds.title");
   private static final xi E = xi.c("mco.configure.world.title");
   private static final xi F = xi.c("mco.selectServer.expired");
   private static final xi G = xi.c("mco.selectServer.expires.soon");
   private static final xi H = xi.c("mco.selectServer.expires.day");
   private static final xi I = xi.c("mco.selectServer.open");
   private static final xi J = xi.c("mco.selectServer.closed");
   private static final int K = 80;
   private static final int L = 5;
   @Nullable
   private xi M;
   private final fem N;
   @Nullable
   private ffi O;
   private final long P;
   private int Q;
   private int R;
   private flh S;
   private flh T;
   private flh U;
   private flh V;
   private flh W;
   private flh X;
   private flh Y;
   private boolean Z;
   private final List<fgi> aa = Lists.newArrayList();

   public fgq(fem $$0, long $$1) {
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
      this.S = this.c(flh.a(xi.c("mco.configure.world.buttons.players"), $$0x -> this.m.a(new fhb(this, this.O))).a(this.a(0, 3), g(0), 100, 20).a());
      this.T = this.c(flh.a(xi.c("mco.configure.world.buttons.settings"), $$0x -> this.m.a(new fhh(this, this.O.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.U = this.c(
         flh.a(xi.c("mco.configure.world.buttons.subscription"), $$0x -> this.m.a(new fhj(this, this.O.g(), this.N))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.aa.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.aa.add(this.a($$0));
      }

      this.Y = this.c(
         flh.a(xi.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.m.a(new fhg(xi.c("mco.template.title.minigame"), this::a, ffi.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.V = this.c(
         flh.a(xi.c("mco.configure.world.buttons.options"), $$0x -> this.m.a(new fhi(this, this.O.i.get(this.O.n).d(), this.O.m, this.O.n)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.W = this.c(flh.a(xi.c("mco.configure.world.backup"), $$0x -> this.m.a(new fgn(this, this.O.g(), this.O.n))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.X = this.c(
         flh.a(xi.c("mco.configure.world.buttons.resetworld"), $$0x -> this.m.a(fhe.a(this, this.O.g(), () -> this.m.execute(() -> this.m.a(this.g())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.c(flh.a(xh.k, $$0x -> this.d()).a(this.R - 80 + 8, g(13) - 5, 70, 20).a());
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

   private fgi a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      fgi $$3 = new fgi($$1, $$2, 80, 80, $$0, $$1x -> {
         fgi.b $$2x = ((fgi)$$1x).a();
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
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.M = null;
      $$0.a(this.p, D, this.n / 2, g(4), -1);
      if (this.O == null) {
         $$0.a(this.p, this.l, this.n / 2, 17, -1);
      } else {
         String $$4 = this.O.b();
         int $$5 = this.p.b($$4);
         int $$6 = this.O.e == ffi.c.a ? -6250336 : 8388479;
         int $$7 = this.p.a(this.l);
         $$0.a(this.p, this.l, this.n / 2, 12, -1);
         $$0.a(this.p, $$4, this.n / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.n / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.b($$0, $$8, 7, $$1, $$2);
         if (this.F()) {
            String $$9 = this.O.c();
            if ($$9 != null) {
               $$0.a(this.p, xi.a("mco.configure.world.minigame", $$9), this.Q + 80 + 20 + 10, g(13), -1, false);
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
         fer $$1 = fer.a();

         try {
            ffi $$2 = $$1.a($$0);
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

               for (fgi $$1x : this.aa) {
                  $$1x.a($$2);
               }
            });
         } catch (fgc var5) {
            C.error("Couldn't get own world", var5);
            this.m.execute(() -> this.m.a(new fgu(var5, this.N)));
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

   private void a(ffi $$0) {
      if (this.O.e == ffi.c.b) {
         fem.a($$0, this);
      } else {
         this.b(true);
      }
   }

   private void E() {
      fhg $$0 = new fhg(xi.c("mco.template.title.minigame"), this::a, ffi.d.b);
      $$0.a(xi.c("mco.minigame.world.info.line1"), xi.c("mco.minigame.world.info.line2"));
      this.m.a($$0);
   }

   private void a(int $$0, ffi $$1) {
      this.m.a(fhc.a(this, xi.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         this.m.a(new fgw(this.N, new fio($$1.a, $$0, () -> this.m.execute(() -> this.m.a(this.g())))));
      }));
   }

   private void b(int $$0, ffi $$1) {
      this.m.a(fhc.a(this, xi.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         fhe $$3 = fhe.a(this, $$0, $$1, () -> this.m.execute(() -> this.m.a(this.g())));
         this.m.a($$3);
      }));
   }

   private void b(fku $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.O.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> F);
      } else if (this.O.e == ffi.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, B, () -> J);
      } else if (this.O.e == ffi.c.b) {
         if (this.O.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.O.l <= 0) {
                  return G;
               } else {
                  return (xi)(this.O.l == 1 ? H : xi.a("mco.selectServer.expires.days", this.O.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> I);
         }
      }
   }

   private void a(fku $$0, int $$1, int $$2, int $$3, int $$4, ali $$5, Supplier<xi> $$6) {
      $$0.a(gir::B, $$5, $$1, $$2, 10, 28);
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

   private void a(flh $$0) {
      $$0.k = false;
   }

   private void b(flh $$0) {
      $$0.k = true;
   }

   private void J() {
      this.a(this.Y);
   }

   public void a(ffn $$0) {
      ffn $$1 = this.O.i.get(this.O.n);
      $$0.j = $$1.j;
      $$0.k = $$1.k;
      fer $$2 = fer.a();

      try {
         $$2.a(this.O.a, this.O.n, $$0);
         this.O.i.put(this.O.n, $$0);
      } catch (fgc var5) {
         C.error("Couldn't save slot settings", var5);
         this.m.a(new fgu(var5, this));
         return;
      }

      this.m.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = bah.h($$1) ? null : $$1;
      fer $$3 = fer.a();

      try {
         $$3.b(this.O.a, $$0, $$2);
         this.O.a($$0);
         this.O.b($$2);
         this.f();
      } catch (fgc var6) {
         C.error("Couldn't save settings", var6);
         this.m.a(new fgu(var6, this));
         return;
      }

      this.m.a(this);
   }

   public void b(boolean $$0) {
      fgq $$1 = this.g();
      this.m.a(new fgw($$1, new fih(this.O, $$1, $$0, this.m)));
   }

   public void b() {
      fgq $$0 = this.g();
      this.m.a(new fgw($$0, new fib(this.O, $$0)));
   }

   public void f() {
      this.Z = true;
   }

   private void a(@Nullable ffx $$0) {
      if ($$0 != null && ffx.a.b == $$0.i) {
         this.f();
         this.m.a(new fgw(this.N, new fin(this.O.a, $$0, this.g())));
      } else {
         this.m.a(this);
      }
   }

   public fgq g() {
      fgq $$0 = new fgq(this.N, this.P);
      $$0.Z = this.Z;
      return $$0;
   }
}
