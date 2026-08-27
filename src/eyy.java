import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eyy extends grl {
   private static final ajt a = new ajt("realm_status/expired");
   private static final ajt b = new ajt("realm_status/expires_soon");
   private static final ajt c = new ajt("realm_status/open");
   private static final ajt y = new ajt("realm_status/closed");
   private static final Logger z = LogUtils.getLogger();
   private static final wg A = wg.c("mco.configure.worlds.title");
   private static final wg B = wg.c("mco.configure.world.title");
   private static final wg C = wg.c("mco.selectServer.expired");
   private static final wg D = wg.c("mco.selectServer.expires.soon");
   private static final wg E = wg.c("mco.selectServer.expires.day");
   private static final wg F = wg.c("mco.selectServer.open");
   private static final wg G = wg.c("mco.selectServer.closed");
   private static final int H = 80;
   private static final int I = 5;
   @Nullable
   private wg J;
   private final ewt K;
   @Nullable
   private exp L;
   private final long M;
   private int N;
   private int O;
   private fdp P;
   private fdp Q;
   private fdp R;
   private fdp S;
   private fdp T;
   private fdp U;
   private fdp V;
   private boolean W;
   private final List<eyr> X = Lists.newArrayList();

   public eyy(ewt $$0, long $$1) {
      super(B);
      this.K = $$0;
      this.M = $$1;
   }

   @Override
   public void aN_() {
      if (this.L == null) {
         this.a(this.M);
      }

      this.N = this.k / 2 - 187;
      this.O = this.k / 2 + 190;
      this.P = this.c(fdp.a(wg.c("mco.configure.world.buttons.players"), $$0x -> this.j.a(new ezk(this, this.L))).a(this.a(0, 3), g(0), 100, 20).a());
      this.Q = this.c(fdp.a(wg.c("mco.configure.world.buttons.settings"), $$0x -> this.j.a(new ezq(this, this.L.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.R = this.c(
         fdp.a(wg.c("mco.configure.world.buttons.subscription"), $$0x -> this.j.a(new ezs(this, this.L.g(), this.K))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.X.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.X.add(this.a($$0));
      }

      this.V = this.c(
         fdp.a(wg.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.j.a(new ezp(wg.c("mco.template.title.minigame"), this::a, exp.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.S = this.c(
         fdp.a(wg.c("mco.configure.world.buttons.options"), $$0x -> this.j.a(new ezr(this, this.L.i.get(this.L.n).d(), this.L.m, this.L.n)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.T = this.c(fdp.a(wg.c("mco.configure.world.backup"), $$0x -> this.j.a(new eyv(this, this.L.g(), this.L.n))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.U = this.c(
         fdp.a(wg.c("mco.configure.world.buttons.resetworld"), $$0x -> this.j.a(ezn.a(this, this.L.g(), () -> this.j.execute(() -> this.j.a(this.f())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.c(fdp.a(wf.k, $$0x -> this.d()).a(this.O - 80 + 8, g(13) - 5, 70, 20).a());
      this.T.j = true;
      if (this.L == null) {
         this.I();
         this.F();
         this.P.j = false;
         this.Q.j = false;
         this.R.j = false;
      } else {
         this.C();
         if (this.E()) {
            this.F();
         } else {
            this.I();
         }
      }
   }

   private eyr a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      eyr $$3 = new eyr($$1, $$2, 80, 80, $$0, $$1x -> {
         eyr.b $$2x = ((eyr)$$1x).a();
         if ($$2x != null) {
            switch ($$2x.c) {
               case a:
                  break;
               case c:
                  this.a(this.L);
                  break;
               case b:
                  if ($$2x.b) {
                     this.D();
                  } else if ($$2x.a) {
                     this.b($$0, this.L);
                  } else {
                     this.a($$0, this.L);
                  }
                  break;
               default:
                  throw new IllegalStateException("Unknown action " + $$2x.c);
            }
         }
      });
      if (this.L != null) {
         $$3.a(this.L);
      }

      return this.c($$3);
   }

   private int b(int $$0) {
      return this.N + $$0 * 95;
   }

   private int a(int $$0, int $$1) {
      return this.k / 2 - ($$1 * 105 - 5) / 2 + $$0 * 105;
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.J = null;
      $$0.a(this.m, A, this.k / 2, g(4), -1);
      if (this.L == null) {
         $$0.a(this.m, this.i, this.k / 2, 17, -1);
      } else {
         String $$4 = this.L.b();
         int $$5 = this.m.b($$4);
         int $$6 = this.L.e == exp.c.a ? -6250336 : 8388479;
         int $$7 = this.m.a(this.i);
         $$0.a(this.m, this.i, this.k / 2, 12, -1);
         $$0.a(this.m, $$4, this.k / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.k / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.c($$0, $$8, 7, $$1, $$2);
         if (this.E()) {
            String $$9 = this.L.c();
            if ($$9 != null) {
               $$0.a(this.m, wg.a("mco.configure.world.minigame", $$9), this.N + 80 + 20 + 10, g(13), -1, false);
            }
         }
      }
   }

   private int h(int $$0) {
      return this.N + ($$0 - 1) * 98;
   }

   @Override
   public void d() {
      this.j.a(this.K);
      if (this.W) {
         this.K.h();
      }
   }

   private void a(long $$0) {
      new Thread(() -> {
         ewy $$1 = ewy.a();

         try {
            exp $$2 = $$1.a($$0);
            this.j.execute(() -> {
               this.L = $$2;
               this.C();
               if (this.E()) {
                  this.b(this.V);
               } else {
                  this.b(this.S);
                  this.b(this.T);
                  this.b(this.U);
               }

               for (eyr $$1x : this.X) {
                  $$1x.a($$2);
               }
            });
         } catch (eyl var5) {
            z.error("Couldn't get own world", var5);
            this.j.execute(() -> this.j.a(new ezc(var5, this.K)));
         }
      }).start();
   }

   private void C() {
      this.P.j = !this.L.j;
      this.Q.j = !this.L.j;
      this.R.j = true;
      this.V.j = !this.L.j;
      this.S.j = !this.L.j;
      this.U.j = !this.L.j;
   }

   private void a(exp $$0) {
      if (this.L.e == exp.c.b) {
         ewt.a($$0, new eyy(this.K, this.M));
      } else {
         this.a(true, new eyy(this.K, this.M));
      }
   }

   private void D() {
      ezp $$0 = new ezp(wg.c("mco.template.title.minigame"), this::a, exp.d.b);
      $$0.a(wg.c("mco.minigame.world.info.line1"), wg.c("mco.minigame.world.info.line2"));
      this.j.a($$0);
   }

   private void a(int $$0, exp $$1) {
      wg $$2 = wg.c("mco.configure.world.slot.switch.question.line1");
      wg $$3 = wg.c("mco.configure.world.slot.switch.question.line2");
      this.j.a(new eze($$2x -> {
         if ($$2x) {
            this.b();
            this.j.a(new ezf(this.K, new fax($$1.a, $$0, () -> this.j.execute(() -> this.j.a(this.f())))));
         } else {
            this.j.a(this);
         }
      }, eze.a.b, $$2, $$3, true));
   }

   private void b(int $$0, exp $$1) {
      wg $$2 = wg.c("mco.configure.world.slot.switch.question.line1");
      wg $$3 = wg.c("mco.configure.world.slot.switch.question.line2");
      this.j.a(new eze($$2x -> {
         if ($$2x) {
            this.b();
            ezn $$3x = ezn.a(this, $$0, $$1, () -> this.j.execute(() -> this.j.a(this.f())));
            this.j.a($$3x);
         } else {
            this.j.a(this);
         }
      }, eze.a.b, $$2, $$3, true));
   }

   private void c(fdc $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.L.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> C);
      } else if (this.L.e == exp.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, y, () -> G);
      } else if (this.L.e == exp.c.b) {
         if (this.L.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.L.l <= 0) {
                  return D;
               } else {
                  return (wg)(this.L.l == 1 ? E : wg.a("mco.selectServer.expires.days", this.L.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> F);
         }
      }
   }

   private void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, ajt $$5, Supplier<wg> $$6) {
      $$0.a($$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.d($$6.get());
      }
   }

   private boolean E() {
      return this.L != null && this.L.m == exp.d.b;
   }

   private void F() {
      this.a(this.S);
      this.a(this.T);
      this.a(this.U);
   }

   private void a(fdp $$0) {
      $$0.k = false;
   }

   private void b(fdp $$0) {
      $$0.k = true;
   }

   private void I() {
      this.a(this.V);
   }

   public void a(exw $$0) {
      exw $$1 = this.L.i.get(this.L.n);
      $$0.l = $$1.l;
      $$0.m = $$1.m;
      ewy $$2 = ewy.a();

      try {
         $$2.a(this.L.a, this.L.n, $$0);
         this.L.i.put(this.L.n, $$0);
      } catch (eyl var5) {
         z.error("Couldn't save slot settings", var5);
         this.j.a(new ezc(var5, this));
         return;
      }

      this.j.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = ayf.h($$1) ? null : $$1;
      ewy $$3 = ewy.a();

      try {
         $$3.b(this.L.a, $$0, $$2);
         this.L.a($$0);
         this.L.b($$2);
         this.b();
      } catch (eyl var6) {
         z.error("Couldn't save settings", var6);
         this.j.a(new ezc(var6, this));
         return;
      }

      this.j.a(this);
   }

   public void a(boolean $$0, fjo $$1) {
      this.j.a(new ezf($$1, new faq(this.L, this, $$0, this.j)));
   }

   public void a(fjo $$0) {
      this.j.a(new ezf($$0, new fak(this.L, this)));
   }

   public void b() {
      this.W = true;
   }

   private void a(@Nullable eyg $$0) {
      if ($$0 != null && eyg.a.b == $$0.i) {
         this.b();
         this.j.a(new ezf(this.K, new faw(this.L.a, $$0, this.f())));
      } else {
         this.j.a(this);
      }
   }

   public eyy f() {
      eyy $$0 = new eyy(this.K, this.M);
      $$0.W = this.W;
      return $$0;
   }
}
