import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esr extends gkp {
   private static final ahg a = new ahg("realm_status/expired");
   private static final ahg b = new ahg("realm_status/expires_soon");
   private static final ahg c = new ahg("realm_status/open");
   private static final ahg v = new ahg("realm_status/closed");
   private static final Logger w = LogUtils.getLogger();
   private static final vf x = vf.c("mco.configure.worlds.title");
   private static final vf y = vf.c("mco.configure.world.title");
   private static final vf z = vf.c("mco.selectServer.expired");
   private static final vf A = vf.c("mco.selectServer.expires.soon");
   private static final vf B = vf.c("mco.selectServer.expires.day");
   private static final vf C = vf.c("mco.selectServer.open");
   private static final vf D = vf.c("mco.selectServer.closed");
   private static final int E = 80;
   private static final int F = 5;
   @Nullable
   private vf G;
   private final eqm H;
   @Nullable
   private eri I;
   private final long J;
   private int K;
   private int L;
   private exg M;
   private exg N;
   private exg O;
   private exg P;
   private exg Q;
   private exg R;
   private exg S;
   private boolean T;
   private final List<esk> U = Lists.newArrayList();

   public esr(eqm $$0, long $$1) {
      super(y);
      this.H = $$0;
      this.J = $$1;
   }

   @Override
   public void aN_() {
      if (this.I == null) {
         this.a(this.J);
      }

      this.K = this.g / 2 - 187;
      this.L = this.g / 2 + 190;
      this.M = this.d(exg.a(vf.c("mco.configure.world.buttons.players"), $$0x -> this.f.a(new etd(this, this.I))).a(this.a(0, 3), g(0), 100, 20).a());
      this.N = this.d(exg.a(vf.c("mco.configure.world.buttons.settings"), $$0x -> this.f.a(new etj(this, this.I.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.O = this.d(
         exg.a(vf.c("mco.configure.world.buttons.subscription"), $$0x -> this.f.a(new etl(this, this.I.g(), this.H))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.U.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.U.add(this.a($$0));
      }

      this.S = this.d(
         exg.a(vf.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.f.a(new eti(vf.c("mco.template.title.minigame"), this::a, eri.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.P = this.d(
         exg.a(vf.c("mco.configure.world.buttons.options"), $$0x -> this.f.a(new etk(this, this.I.i.get(this.I.n).d(), this.I.m, this.I.n)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.Q = this.d(exg.a(vf.c("mco.configure.world.backup"), $$0x -> this.f.a(new eso(this, this.I.g(), this.I.n))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.R = this.d(
         exg.a(vf.c("mco.configure.world.buttons.resetworld"), $$0x -> this.f.a(etg.a(this, this.I.g(), () -> this.f.execute(() -> this.f.a(this.f())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.d(exg.a(ve.k, $$0x -> this.aE_()).a(this.L - 80 + 8, g(13) - 5, 70, 20).a());
      this.Q.j = true;
      if (this.I == null) {
         this.J();
         this.I();
         this.M.j = false;
         this.N.j = false;
         this.O.j = false;
      } else {
         this.D();
         if (this.H()) {
            this.I();
         } else {
            this.J();
         }
      }
   }

   private esk a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      esk $$3 = new esk($$1, $$2, 80, 80, $$0, $$1x -> {
         esk.b $$2x = ((esk)$$1x).a();
         if ($$2x != null) {
            switch ($$2x.c) {
               case a:
                  break;
               case c:
                  this.a(this.I);
                  break;
               case b:
                  if ($$2x.b) {
                     this.E();
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
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.G = null;
      $$0.a(this.i, x, this.g / 2, g(4), -1);
      if (this.I == null) {
         $$0.a(this.i, this.e, this.g / 2, 17, -1);
      } else {
         String $$4 = this.I.b();
         int $$5 = this.i.b($$4);
         int $$6 = this.I.e == eri.c.a ? -6250336 : 8388479;
         int $$7 = this.i.a(this.e);
         $$0.a(this.i, this.e, this.g / 2, 12, -1);
         $$0.a(this.i, $$4, this.g / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.g / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.a($$0, $$8, 7, $$1, $$2);
         if (this.H()) {
            $$0.a(this.i, vf.a("mco.configure.world.minigame", this.I.c()), this.K + 80 + 20 + 10, g(13), -1, false);
         }
      }
   }

   private int h(int $$0) {
      return this.K + ($$0 - 1) * 98;
   }

   @Override
   public void aE_() {
      this.f.a(this.H);
      if (this.T) {
         this.H.g();
      }
   }

   private void a(long $$0) {
      new Thread(() -> {
         eqr $$1 = eqr.a();

         try {
            eri $$2 = $$1.a($$0);
            this.f.execute(() -> {
               this.I = $$2;
               this.D();
               if (this.H()) {
                  this.b(this.S);
               } else {
                  this.b(this.P);
                  this.b(this.Q);
                  this.b(this.R);
               }

               for (esk $$1x : this.U) {
                  $$1x.a($$2);
               }
            });
         } catch (ese var5) {
            w.error("Couldn't get own world", var5);
            this.f.execute(() -> this.f.a(new esv(var5, this.H)));
         }
      }).start();
   }

   private void D() {
      this.M.j = !this.I.j;
      this.N.j = !this.I.j;
      this.O.j = true;
      this.S.j = !this.I.j;
      this.P.j = !this.I.j;
      this.R.j = !this.I.j;
   }

   private void a(eri $$0) {
      if (this.I.e == eri.c.b) {
         eqm.a($$0, new esr(this.H, this.J));
      } else {
         this.a(true, new esr(this.H, this.J));
      }
   }

   private void E() {
      eti $$0 = new eti(vf.c("mco.template.title.minigame"), this::a, eri.d.b);
      $$0.a(vf.c("mco.minigame.world.info.line1"), vf.c("mco.minigame.world.info.line2"));
      this.f.a($$0);
   }

   private void a(int $$0, eri $$1) {
      vf $$2 = vf.c("mco.configure.world.slot.switch.question.line1");
      vf $$3 = vf.c("mco.configure.world.slot.switch.question.line2");
      this.f.a(new esx($$2x -> {
         if ($$2x) {
            this.e();
            this.f.a(new esy(this.H, new eup($$1.a, $$0, () -> this.f.execute(() -> this.f.a(this.f())))));
         } else {
            this.f.a(this);
         }
      }, esx.a.b, $$2, $$3, true));
   }

   private void b(int $$0, eri $$1) {
      vf $$2 = vf.c("mco.configure.world.slot.switch.question.line1");
      vf $$3 = vf.c("mco.configure.world.slot.switch.question.line2");
      this.f.a(new esx($$2x -> {
         if ($$2x) {
            this.e();
            etg $$3x = etg.a(this, $$0, $$1, () -> this.f.execute(() -> this.f.a(this.f())));
            this.f.a($$3x);
         } else {
            this.f.a(this);
         }
      }, esx.a.b, $$2, $$3, true));
   }

   private void a(ewu $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.I.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> z);
      } else if (this.I.e == eri.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, v, () -> D);
      } else if (this.I.e == eri.c.b) {
         if (this.I.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.I.l <= 0) {
                  return A;
               } else {
                  return (vf)(this.I.l == 1 ? B : vf.a("mco.selectServer.expires.days", this.I.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> C);
         }
      }
   }

   private void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, ahg $$5, Supplier<vf> $$6) {
      $$0.a($$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.d($$6.get());
      }
   }

   private boolean H() {
      return this.I != null && this.I.m == eri.d.b;
   }

   private void I() {
      this.a(this.P);
      this.a(this.Q);
      this.a(this.R);
   }

   private void a(exg $$0) {
      $$0.k = false;
   }

   private void b(exg $$0) {
      $$0.k = true;
   }

   private void J() {
      this.a(this.S);
   }

   public void a(erp $$0) {
      erp $$1 = this.I.i.get(this.I.n);
      $$0.l = $$1.l;
      $$0.m = $$1.m;
      eqr $$2 = eqr.a();

      try {
         $$2.a(this.I.a, this.I.n, $$0);
         this.I.i.put(this.I.n, $$0);
      } catch (ese var5) {
         w.error("Couldn't save slot settings", var5);
         this.f.a(new esv(var5, this));
         return;
      }

      this.f.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = ac.b($$1) ? null : $$1;
      eqr $$3 = eqr.a();

      try {
         $$3.b(this.I.a, $$0, $$2);
         this.I.a($$0);
         this.I.b($$2);
         this.e();
      } catch (ese var6) {
         w.error("Couldn't save settings", var6);
         this.f.a(new esv(var6, this));
         return;
      }

      this.f.a(this);
   }

   public void a(boolean $$0, fdb $$1) {
      this.f.a(new esy($$1, new euj(this.I, this, $$0, this.f)));
   }

   public void a(fdb $$0) {
      this.f.a(new esy($$0, new eud(this.I, this)));
   }

   public void e() {
      this.T = true;
   }

   private void a(@Nullable erz $$0) {
      if ($$0 != null && erz.a.b == $$0.i) {
         this.e();
         this.f.a(new esy(this.H, new euo(this.I.a, $$0, this.f())));
      } else {
         this.f.a(this);
      }
   }

   public esr f() {
      esr $$0 = new esr(this.H, this.J);
      $$0.T = this.T;
      return $$0;
   }
}
