import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezh extends gru {
   private static final ajv a = new ajv("realm_status/expired");
   private static final ajv b = new ajv("realm_status/expires_soon");
   private static final ajv c = new ajv("realm_status/open");
   private static final ajv y = new ajv("realm_status/closed");
   private static final Logger z = LogUtils.getLogger();
   private static final wi A = wi.c("mco.configure.worlds.title");
   private static final wi B = wi.c("mco.configure.world.title");
   private static final wi C = wi.c("mco.selectServer.expired");
   private static final wi D = wi.c("mco.selectServer.expires.soon");
   private static final wi E = wi.c("mco.selectServer.expires.day");
   private static final wi F = wi.c("mco.selectServer.open");
   private static final wi G = wi.c("mco.selectServer.closed");
   private static final int H = 80;
   private static final int I = 5;
   @Nullable
   private wi J;
   private final exc K;
   @Nullable
   private exy L;
   private final long M;
   private int N;
   private int O;
   private fdy P;
   private fdy Q;
   private fdy R;
   private fdy S;
   private fdy T;
   private fdy U;
   private fdy V;
   private boolean W;
   private final List<eza> X = Lists.newArrayList();

   public ezh(exc $$0, long $$1) {
      super(B);
      this.K = $$0;
      this.M = $$1;
   }

   @Override
   public void aM_() {
      if (this.L == null) {
         this.a(this.M);
      }

      this.N = this.k / 2 - 187;
      this.O = this.k / 2 + 190;
      this.P = this.c(fdy.a(wi.c("mco.configure.world.buttons.players"), $$0x -> this.j.a(new ezt(this, this.L))).a(this.a(0, 3), g(0), 100, 20).a());
      this.Q = this.c(fdy.a(wi.c("mco.configure.world.buttons.settings"), $$0x -> this.j.a(new ezz(this, this.L.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.R = this.c(
         fdy.a(wi.c("mco.configure.world.buttons.subscription"), $$0x -> this.j.a(new fab(this, this.L.g(), this.K))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.X.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.X.add(this.a($$0));
      }

      this.V = this.c(
         fdy.a(wi.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.j.a(new ezy(wi.c("mco.template.title.minigame"), this::a, exy.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.S = this.c(
         fdy.a(wi.c("mco.configure.world.buttons.options"), $$0x -> this.j.a(new faa(this, this.L.i.get(this.L.n).d(), this.L.m, this.L.n)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.T = this.c(fdy.a(wi.c("mco.configure.world.backup"), $$0x -> this.j.a(new eze(this, this.L.g(), this.L.n))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.U = this.c(
         fdy.a(wi.c("mco.configure.world.buttons.resetworld"), $$0x -> this.j.a(ezw.a(this, this.L.g(), () -> this.j.execute(() -> this.j.a(this.f())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.c(fdy.a(wh.k, $$0x -> this.d()).a(this.O - 80 + 8, g(13) - 5, 70, 20).a());
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

   private eza a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      eza $$3 = new eza($$1, $$2, 80, 80, $$0, $$1x -> {
         eza.b $$2x = ((eza)$$1x).a();
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
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.J = null;
      $$0.a(this.m, A, this.k / 2, g(4), -1);
      if (this.L == null) {
         $$0.a(this.m, this.i, this.k / 2, 17, -1);
      } else {
         String $$4 = this.L.b();
         int $$5 = this.m.b($$4);
         int $$6 = this.L.e == exy.c.a ? -6250336 : 8388479;
         int $$7 = this.m.a(this.i);
         $$0.a(this.m, this.i, this.k / 2, 12, -1);
         $$0.a(this.m, $$4, this.k / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.k / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.c($$0, $$8, 7, $$1, $$2);
         if (this.E()) {
            String $$9 = this.L.c();
            if ($$9 != null) {
               $$0.a(this.m, wi.a("mco.configure.world.minigame", $$9), this.N + 80 + 20 + 10, g(13), -1, false);
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
         exh $$1 = exh.a();

         try {
            exy $$2 = $$1.a($$0);
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

               for (eza $$1x : this.X) {
                  $$1x.a($$2);
               }
            });
         } catch (eyu var5) {
            z.error("Couldn't get own world", var5);
            this.j.execute(() -> this.j.a(new ezl(var5, this.K)));
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

   private void a(exy $$0) {
      if (this.L.e == exy.c.b) {
         exc.a($$0, new ezh(this.K, this.M));
      } else {
         this.a(true, new ezh(this.K, this.M));
      }
   }

   private void D() {
      ezy $$0 = new ezy(wi.c("mco.template.title.minigame"), this::a, exy.d.b);
      $$0.a(wi.c("mco.minigame.world.info.line1"), wi.c("mco.minigame.world.info.line2"));
      this.j.a($$0);
   }

   private void a(int $$0, exy $$1) {
      wi $$2 = wi.c("mco.configure.world.slot.switch.question.line1");
      wi $$3 = wi.c("mco.configure.world.slot.switch.question.line2");
      this.j.a(new ezn($$2x -> {
         if ($$2x) {
            this.b();
            this.j.a(new ezo(this.K, new fbg($$1.a, $$0, () -> this.j.execute(() -> this.j.a(this.f())))));
         } else {
            this.j.a(this);
         }
      }, ezn.a.b, $$2, $$3, true));
   }

   private void b(int $$0, exy $$1) {
      wi $$2 = wi.c("mco.configure.world.slot.switch.question.line1");
      wi $$3 = wi.c("mco.configure.world.slot.switch.question.line2");
      this.j.a(new ezn($$2x -> {
         if ($$2x) {
            this.b();
            ezw $$3x = ezw.a(this, $$0, $$1, () -> this.j.execute(() -> this.j.a(this.f())));
            this.j.a($$3x);
         } else {
            this.j.a(this);
         }
      }, ezn.a.b, $$2, $$3, true));
   }

   private void c(fdl $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.L.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> C);
      } else if (this.L.e == exy.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, y, () -> G);
      } else if (this.L.e == exy.c.b) {
         if (this.L.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.L.l <= 0) {
                  return D;
               } else {
                  return (wi)(this.L.l == 1 ? E : wi.a("mco.selectServer.expires.days", this.L.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> F);
         }
      }
   }

   private void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, ajv $$5, Supplier<wi> $$6) {
      $$0.a($$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.d($$6.get());
      }
   }

   private boolean E() {
      return this.L != null && this.L.m == exy.d.b;
   }

   private void F() {
      this.a(this.S);
      this.a(this.T);
      this.a(this.U);
   }

   private void a(fdy $$0) {
      $$0.k = false;
   }

   private void b(fdy $$0) {
      $$0.k = true;
   }

   private void I() {
      this.a(this.V);
   }

   public void a(eyf $$0) {
      eyf $$1 = this.L.i.get(this.L.n);
      $$0.l = $$1.l;
      $$0.m = $$1.m;
      exh $$2 = exh.a();

      try {
         $$2.a(this.L.a, this.L.n, $$0);
         this.L.i.put(this.L.n, $$0);
      } catch (eyu var5) {
         z.error("Couldn't save slot settings", var5);
         this.j.a(new ezl(var5, this));
         return;
      }

      this.j.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = ayh.h($$1) ? null : $$1;
      exh $$3 = exh.a();

      try {
         $$3.b(this.L.a, $$0, $$2);
         this.L.a($$0);
         this.L.b($$2);
         this.b();
      } catch (eyu var6) {
         z.error("Couldn't save settings", var6);
         this.j.a(new ezl(var6, this));
         return;
      }

      this.j.a(this);
   }

   public void a(boolean $$0, fjx $$1) {
      this.j.a(new ezo($$1, new faz(this.L, this, $$0, this.j)));
   }

   public void a(fjx $$0) {
      this.j.a(new ezo($$0, new fat(this.L, this)));
   }

   public void b() {
      this.W = true;
   }

   private void a(@Nullable eyp $$0) {
      if ($$0 != null && eyp.a.b == $$0.i) {
         this.b();
         this.j.a(new ezo(this.K, new fbf(this.L.a, $$0, this.f())));
      } else {
         this.j.a(this);
      }
   }

   public ezh f() {
      ezh $$0 = new ezh(this.K, this.M);
      $$0.W = this.W;
      return $$0;
   }
}
