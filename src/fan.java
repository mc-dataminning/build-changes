import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fan extends gtb {
   private static final akh a = new akh("realm_status/expired");
   private static final akh b = new akh("realm_status/expires_soon");
   private static final akh c = new akh("realm_status/open");
   private static final akh B = new akh("realm_status/closed");
   private static final Logger C = LogUtils.getLogger();
   private static final wu D = wu.c("mco.configure.worlds.title");
   private static final wu E = wu.c("mco.configure.world.title");
   private static final wu F = wu.c("mco.selectServer.expired");
   private static final wu G = wu.c("mco.selectServer.expires.soon");
   private static final wu H = wu.c("mco.selectServer.expires.day");
   private static final wu I = wu.c("mco.selectServer.open");
   private static final wu J = wu.c("mco.selectServer.closed");
   private static final int K = 80;
   private static final int L = 5;
   @Nullable
   private wu M;
   private final eyi N;
   @Nullable
   private eze O;
   private final long P;
   private int Q;
   private int R;
   private ffe S;
   private ffe T;
   private ffe U;
   private ffe V;
   private ffe W;
   private ffe X;
   private ffe Y;
   private boolean Z;
   private final List<fag> aa = Lists.newArrayList();

   public fan(eyi $$0, long $$1) {
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
      this.S = this.c(ffe.a(wu.c("mco.configure.world.buttons.players"), $$0x -> this.m.a(new faz(this, this.O))).a(this.a(0, 3), g(0), 100, 20).a());
      this.T = this.c(ffe.a(wu.c("mco.configure.world.buttons.settings"), $$0x -> this.m.a(new fbf(this, this.O.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.U = this.c(
         ffe.a(wu.c("mco.configure.world.buttons.subscription"), $$0x -> this.m.a(new fbh(this, this.O.g(), this.N))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.aa.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.aa.add(this.a($$0));
      }

      this.Y = this.c(
         ffe.a(wu.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.m.a(new fbe(wu.c("mco.template.title.minigame"), this::a, eze.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.V = this.c(
         ffe.a(wu.c("mco.configure.world.buttons.options"), $$0x -> this.m.a(new fbg(this, this.O.i.get(this.O.n).d(), this.O.m, this.O.n)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.W = this.c(ffe.a(wu.c("mco.configure.world.backup"), $$0x -> this.m.a(new fak(this, this.O.g(), this.O.n))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.X = this.c(
         ffe.a(wu.c("mco.configure.world.buttons.resetworld"), $$0x -> this.m.a(fbc.a(this, this.O.g(), () -> this.m.execute(() -> this.m.a(this.f())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.c(ffe.a(wt.k, $$0x -> this.d()).a(this.R - 80 + 8, g(13) - 5, 70, 20).a());
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

   private fag a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      fag $$3 = new fag($$1, $$2, 80, 80, $$0, $$1x -> {
         fag.b $$2x = ((fag)$$1x).a();
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
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.M = null;
      $$0.a(this.p, D, this.n / 2, g(4), -1);
      if (this.O == null) {
         $$0.a(this.p, this.l, this.n / 2, 17, -1);
      } else {
         String $$4 = this.O.b();
         int $$5 = this.p.b($$4);
         int $$6 = this.O.e == eze.c.a ? -6250336 : 8388479;
         int $$7 = this.p.a(this.l);
         $$0.a(this.p, this.l, this.n / 2, 12, -1);
         $$0.a(this.p, $$4, this.n / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.n / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.b($$0, $$8, 7, $$1, $$2);
         if (this.E()) {
            String $$9 = this.O.c();
            if ($$9 != null) {
               $$0.a(this.p, wu.a("mco.configure.world.minigame", $$9), this.Q + 80 + 20 + 10, g(13), -1, false);
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
         eyn $$1 = eyn.a();

         try {
            eze $$2 = $$1.a($$0);
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

               for (fag $$1x : this.aa) {
                  $$1x.a($$2);
               }
            });
         } catch (faa var5) {
            C.error("Couldn't get own world", var5);
            this.m.execute(() -> this.m.a(new far(var5, this.N)));
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

   private void a(eze $$0) {
      if (this.O.e == eze.c.b) {
         eyi.a($$0, new fan(this.N, this.P));
      } else {
         this.a(true, new fan(this.N, this.P));
      }
   }

   private void D() {
      fbe $$0 = new fbe(wu.c("mco.template.title.minigame"), this::a, eze.d.b);
      $$0.a(wu.c("mco.minigame.world.info.line1"), wu.c("mco.minigame.world.info.line2"));
      this.m.a($$0);
   }

   private void a(int $$0, eze $$1) {
      wu $$2 = wu.c("mco.configure.world.slot.switch.question.line1");
      wu $$3 = wu.c("mco.configure.world.slot.switch.question.line2");
      this.m.a(new fat($$2x -> {
         if ($$2x) {
            this.b();
            this.m.a(new fau(this.N, new fcm($$1.a, $$0, () -> this.m.execute(() -> this.m.a(this.f())))));
         } else {
            this.m.a(this);
         }
      }, fat.a.b, $$2, $$3, true));
   }

   private void b(int $$0, eze $$1) {
      wu $$2 = wu.c("mco.configure.world.slot.switch.question.line1");
      wu $$3 = wu.c("mco.configure.world.slot.switch.question.line2");
      this.m.a(new fat($$2x -> {
         if ($$2x) {
            this.b();
            fbc $$3x = fbc.a(this, $$0, $$1, () -> this.m.execute(() -> this.m.a(this.f())));
            this.m.a($$3x);
         } else {
            this.m.a(this);
         }
      }, fat.a.b, $$2, $$3, true));
   }

   private void b(fer $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.O.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> F);
      } else if (this.O.e == eze.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, B, () -> J);
      } else if (this.O.e == eze.c.b) {
         if (this.O.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.O.l <= 0) {
                  return G;
               } else {
                  return (wu)(this.O.l == 1 ? H : wu.a("mco.selectServer.expires.days", this.O.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> I);
         }
      }
   }

   private void a(fer $$0, int $$1, int $$2, int $$3, int $$4, akh $$5, Supplier<wu> $$6) {
      $$0.a($$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.d($$6.get());
      }
   }

   private boolean E() {
      return this.O != null && this.O.m == eze.d.b;
   }

   private void F() {
      this.a(this.V);
      this.a(this.W);
      this.a(this.X);
   }

   private void a(ffe $$0) {
      $$0.k = false;
   }

   private void b(ffe $$0) {
      $$0.k = true;
   }

   private void I() {
      this.a(this.Y);
   }

   public void a(ezl $$0) {
      ezl $$1 = this.O.i.get(this.O.n);
      $$0.l = $$1.l;
      $$0.m = $$1.m;
      eyn $$2 = eyn.a();

      try {
         $$2.a(this.O.a, this.O.n, $$0);
         this.O.i.put(this.O.n, $$0);
      } catch (faa var5) {
         C.error("Couldn't save slot settings", var5);
         this.m.a(new far(var5, this));
         return;
      }

      this.m.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = ayu.h($$1) ? null : $$1;
      eyn $$3 = eyn.a();

      try {
         $$3.b(this.O.a, $$0, $$2);
         this.O.a($$0);
         this.O.b($$2);
         this.b();
      } catch (faa var6) {
         C.error("Couldn't save settings", var6);
         this.m.a(new far(var6, this));
         return;
      }

      this.m.a(this);
   }

   public void a(boolean $$0, fld $$1) {
      this.m.a(new fau($$1, new fcf(this.O, this, $$0, this.m)));
   }

   public void a(fld $$0) {
      this.m.a(new fau($$0, new fbz(this.O, this)));
   }

   public void b() {
      this.Z = true;
   }

   private void a(@Nullable ezv $$0) {
      if ($$0 != null && ezv.a.b == $$0.i) {
         this.b();
         this.m.a(new fau(this.N, new fcl(this.O.a, $$0, this.f())));
      } else {
         this.m.a(this);
      }
   }

   public fan f() {
      fan $$0 = new fan(this.N, this.P);
      $$0.Z = this.Z;
      return $$0;
   }
}
