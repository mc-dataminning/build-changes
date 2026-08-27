import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqm extends ghr {
   private static final agi a = new agi("realm_status/expired");
   private static final agi b = new agi("realm_status/expires_soon");
   private static final agi c = new agi("realm_status/open");
   private static final agi v = new agi("realm_status/closed");
   private static final Logger w = LogUtils.getLogger();
   private static final ur x = ur.c("mco.configure.worlds.title");
   private static final ur y = ur.c("mco.configure.world.title");
   private static final ur z = ur.c("mco.selectServer.expired");
   private static final ur A = ur.c("mco.selectServer.expires.soon");
   private static final ur B = ur.c("mco.selectServer.expires.day");
   private static final ur C = ur.c("mco.selectServer.open");
   private static final ur D = ur.c("mco.selectServer.closed");
   private static final int E = 80;
   private static final int F = 5;
   @Nullable
   private ur G;
   private final eoh H;
   @Nullable
   private epd I;
   private final long J;
   private int K;
   private int L;
   private euz M;
   private euz N;
   private euz O;
   private euz P;
   private euz Q;
   private euz R;
   private euz S;
   private boolean T;
   private final List<eqf> U = Lists.newArrayList();

   public eqm(eoh $$0, long $$1) {
      super(y);
      this.H = $$0;
      this.J = $$1;
   }

   @Override
   public void aP_() {
      if (this.I == null) {
         this.a(this.J);
      }

      this.K = this.g / 2 - 187;
      this.L = this.g / 2 + 190;
      this.M = this.d(euz.a(ur.c("mco.configure.world.buttons.players"), $$0x -> this.f.a(new eqy(this, this.I))).a(this.a(0, 3), h(0), 100, 20).a());
      this.N = this.d(euz.a(ur.c("mco.configure.world.buttons.settings"), $$0x -> this.f.a(new ere(this, this.I.g()))).a(this.a(1, 3), h(0), 100, 20).a());
      this.O = this.d(
         euz.a(ur.c("mco.configure.world.buttons.subscription"), $$0x -> this.f.a(new erg(this, this.I.g(), this.H))).a(this.a(2, 3), h(0), 100, 20).a()
      );
      this.U.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.U.add(this.a($$0));
      }

      this.S = this.d(
         euz.a(ur.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.f.a(new erd(ur.c("mco.template.title.minigame"), this::a, epd.d.b)))
            .a(this.b(0), h(13) - 5, 100, 20)
            .a()
      );
      this.P = this.d(
         euz.a(ur.c("mco.configure.world.buttons.options"), $$0x -> this.f.a(new erf(this, this.I.i.get(this.I.n).d(), this.I.m, this.I.n)))
            .a(this.b(0), h(13) - 5, 90, 20)
            .a()
      );
      this.Q = this.d(euz.a(ur.c("mco.configure.world.backup"), $$0x -> this.f.a(new eqj(this, this.I.g(), this.I.n))).a(this.b(1), h(13) - 5, 90, 20).a());
      this.R = this.d(
         euz.a(ur.c("mco.configure.world.buttons.resetworld"), $$0x -> this.f.a(erb.a(this, this.I.g(), () -> this.f.execute(() -> this.f.a(this.f())))))
            .a(this.b(2), h(13) - 5, 90, 20)
            .a()
      );
      this.d(euz.a(uq.k, $$0x -> this.aF_()).a(this.L - 80 + 8, h(13) - 5, 70, 20).a());
      this.Q.i = true;
      if (this.I == null) {
         this.G();
         this.F();
         this.M.i = false;
         this.N.i = false;
         this.O.i = false;
      } else {
         this.C();
         if (this.E()) {
            this.F();
         } else {
            this.G();
         }
      }
   }

   private eqf a(int $$0) {
      int $$1 = this.c($$0);
      int $$2 = h(5) + 5;
      eqf $$3 = new eqf($$1, $$2, 80, 80, $$0, $$1x -> {
         eqf.b $$2x = ((eqf)$$1x).a();
         if ($$2x != null) {
            switch ($$2x.c) {
               case a:
                  break;
               case c:
                  this.a(this.I);
                  break;
               case b:
                  if ($$2x.b) {
                     this.D();
                  } else if ($$2x.a) {
                     this.b($$0, this.I);
                  } else {
                     this.a($$0, this.I);
                  }
                  break;
               default:
                  throw new IllegalStateException("Unknown action " + $$2x.c);
            }
         }
      });
      if (this.I != null) {
         $$3.a(this.I);
      }

      return this.d($$3);
   }

   private int b(int $$0) {
      return this.K + $$0 * 95;
   }

   private int a(int $$0, int $$1) {
      return this.g / 2 - ($$1 * 105 - 5) / 2 + $$0 * 105;
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.G = null;
      $$0.a(this.i, x, this.g / 2, h(4), -1);
      if (this.I == null) {
         $$0.a(this.i, this.e, this.g / 2, 17, -1);
      } else {
         String $$4 = this.I.b();
         int $$5 = this.i.b($$4);
         int $$6 = this.I.e == epd.c.a ? -6250336 : 8388479;
         int $$7 = this.i.a(this.e);
         $$0.a(this.i, this.e, this.g / 2, 12, -1);
         $$0.a(this.i, $$4, this.g / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.g / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.a($$0, $$8, 7, $$1, $$2);
         if (this.E()) {
            $$0.a(this.i, ur.a("mco.configure.world.minigame", this.I.c()), this.K + 80 + 20 + 10, h(13), -1, false);
         }
      }
   }

   private int c(int $$0) {
      return this.K + ($$0 - 1) * 98;
   }

   @Override
   public void aF_() {
      this.f.a(this.H);
      if (this.T) {
         this.H.g();
      }
   }

   private void a(long $$0) {
      new Thread(() -> {
         eom $$1 = eom.a();

         try {
            epd $$2 = $$1.a($$0);
            this.f.execute(() -> {
               this.I = $$2;
               this.C();
               if (this.E()) {
                  this.b(this.S);
               } else {
                  this.b(this.P);
                  this.b(this.Q);
                  this.b(this.R);
               }

               for (eqf $$1x : this.U) {
                  $$1x.a($$2);
               }
            });
         } catch (epz var5) {
            w.error("Couldn't get own world", var5);
            this.f.execute(() -> this.f.a(new eqq(var5, this.H)));
         }
      }).start();
   }

   private void C() {
      this.M.i = !this.I.j;
      this.N.i = !this.I.j;
      this.O.i = true;
      this.S.i = !this.I.j;
      this.P.i = !this.I.j;
      this.R.i = !this.I.j;
   }

   private void a(epd $$0) {
      if (this.I.e == epd.c.b) {
         eoh.a($$0, new eqm(this.H, this.J));
      } else {
         this.a(true, new eqm(this.H, this.J));
      }
   }

   private void D() {
      erd $$0 = new erd(ur.c("mco.template.title.minigame"), this::a, epd.d.b);
      $$0.a(ur.c("mco.minigame.world.info.line1"), ur.c("mco.minigame.world.info.line2"));
      this.f.a($$0);
   }

   private void a(int $$0, epd $$1) {
      ur $$2 = ur.c("mco.configure.world.slot.switch.question.line1");
      ur $$3 = ur.c("mco.configure.world.slot.switch.question.line2");
      this.f.a(new eqs($$2x -> {
         if ($$2x) {
            this.e();
            this.f.a(new eqt(this.H, new esk($$1.a, $$0, () -> this.f.execute(() -> this.f.a(this.f())))));
         } else {
            this.f.a(this);
         }
      }, eqs.a.b, $$2, $$3, true));
   }

   private void b(int $$0, epd $$1) {
      ur $$2 = ur.c("mco.configure.world.slot.switch.question.line1");
      ur $$3 = ur.c("mco.configure.world.slot.switch.question.line2");
      this.f.a(new eqs($$2x -> {
         if ($$2x) {
            this.e();
            erb $$3x = erb.a(this, $$0, $$1, () -> this.f.execute(() -> this.f.a(this.f())));
            this.f.a($$3x);
         } else {
            this.f.a(this);
         }
      }, eqs.a.b, $$2, $$3, true));
   }

   private void a(euo $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.I.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> z);
      } else if (this.I.e == epd.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, v, () -> D);
      } else if (this.I.e == epd.c.b) {
         if (this.I.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.I.l <= 0) {
                  return A;
               } else {
                  return (ur)(this.I.l == 1 ? B : ur.a("mco.selectServer.expires.days", this.I.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> C);
         }
      }
   }

   private void a(euo $$0, int $$1, int $$2, int $$3, int $$4, agi $$5, Supplier<ur> $$6) {
      $$0.a($$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.d($$6.get());
      }
   }

   private boolean E() {
      return this.I != null && this.I.m == epd.d.b;
   }

   private void F() {
      this.a(this.P);
      this.a(this.Q);
      this.a(this.R);
   }

   private void a(euz $$0) {
      $$0.j = false;
   }

   private void b(euz $$0) {
      $$0.j = true;
   }

   private void G() {
      this.a(this.S);
   }

   public void a(epk $$0) {
      epk $$1 = this.I.i.get(this.I.n);
      $$0.l = $$1.l;
      $$0.m = $$1.m;
      eom $$2 = eom.a();

      try {
         $$2.a(this.I.a, this.I.n, $$0);
         this.I.i.put(this.I.n, $$0);
      } catch (epz var5) {
         w.error("Couldn't save slot settings", var5);
         this.f.a(new eqq(var5, this));
         return;
      }

      this.f.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = ac.b($$1) ? null : $$1;
      eom $$3 = eom.a();

      try {
         $$3.b(this.I.a, $$0, $$2);
         this.I.a($$0);
         this.I.b($$2);
         this.e();
      } catch (epz var6) {
         w.error("Couldn't save settings", var6);
         this.f.a(new eqq(var6, this));
         return;
      }

      this.f.a(this);
   }

   public void a(boolean $$0, fau $$1) {
      this.f.a(new eqt($$1, new ese(this.I, this, $$0, this.f)));
   }

   public void a(fau $$0) {
      this.f.a(new eqt($$0, new ery(this.I, this)));
   }

   public void e() {
      this.T = true;
   }

   private void a(@Nullable epu $$0) {
      if ($$0 != null && epu.a.b == $$0.i) {
         this.e();
         this.f.a(new eqt(this.H, new esj(this.I.a, $$0, this.f())));
      } else {
         this.f.a(this);
      }
   }

   public eqm f() {
      eqm $$0 = new eqm(this.H, this.J);
      $$0.T = this.T;
      return $$0;
   }
}
