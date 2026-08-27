import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esj extends gkc {
   private static final ahd a = new ahd("realm_status/expired");
   private static final ahd b = new ahd("realm_status/expires_soon");
   private static final ahd c = new ahd("realm_status/open");
   private static final ahd v = new ahd("realm_status/closed");
   private static final Logger w = LogUtils.getLogger();
   private static final vd x = vd.c("mco.configure.worlds.title");
   private static final vd y = vd.c("mco.configure.world.title");
   private static final vd z = vd.c("mco.selectServer.expired");
   private static final vd A = vd.c("mco.selectServer.expires.soon");
   private static final vd B = vd.c("mco.selectServer.expires.day");
   private static final vd C = vd.c("mco.selectServer.open");
   private static final vd D = vd.c("mco.selectServer.closed");
   private static final int E = 80;
   private static final int F = 5;
   @Nullable
   private vd G;
   private final eqe H;
   @Nullable
   private era I;
   private final long J;
   private int K;
   private int L;
   private ewy M;
   private ewy N;
   private ewy O;
   private ewy P;
   private ewy Q;
   private ewy R;
   private ewy S;
   private boolean T;
   private final List<esc> U = Lists.newArrayList();

   public esj(eqe $$0, long $$1) {
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
      this.M = this.d(ewy.a(vd.c("mco.configure.world.buttons.players"), $$0x -> this.f.a(new esv(this, this.I))).a(this.a(0, 3), g(0), 100, 20).a());
      this.N = this.d(ewy.a(vd.c("mco.configure.world.buttons.settings"), $$0x -> this.f.a(new etb(this, this.I.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.O = this.d(
         ewy.a(vd.c("mco.configure.world.buttons.subscription"), $$0x -> this.f.a(new etd(this, this.I.g(), this.H))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.U.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.U.add(this.a($$0));
      }

      this.S = this.d(
         ewy.a(vd.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.f.a(new eta(vd.c("mco.template.title.minigame"), this::a, era.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.P = this.d(
         ewy.a(vd.c("mco.configure.world.buttons.options"), $$0x -> this.f.a(new etc(this, this.I.i.get(this.I.n).d(), this.I.m, this.I.n)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.Q = this.d(ewy.a(vd.c("mco.configure.world.backup"), $$0x -> this.f.a(new esg(this, this.I.g(), this.I.n))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.R = this.d(
         ewy.a(vd.c("mco.configure.world.buttons.resetworld"), $$0x -> this.f.a(esy.a(this, this.I.g(), () -> this.f.execute(() -> this.f.a(this.f())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.d(ewy.a(vc.k, $$0x -> this.aE_()).a(this.L - 80 + 8, g(13) - 5, 70, 20).a());
      this.Q.j = true;
      if (this.I == null) {
         this.I();
         this.H();
         this.M.j = false;
         this.N.j = false;
         this.O.j = false;
      } else {
         this.C();
         if (this.E()) {
            this.H();
         } else {
            this.I();
         }
      }
   }

   private esc a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      esc $$3 = new esc($$1, $$2, 80, 80, $$0, $$1x -> {
         esc.b $$2x = ((esc)$$1x).a();
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
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.G = null;
      $$0.a(this.i, x, this.g / 2, g(4), -1);
      if (this.I == null) {
         $$0.a(this.i, this.e, this.g / 2, 17, -1);
      } else {
         String $$4 = this.I.b();
         int $$5 = this.i.b($$4);
         int $$6 = this.I.e == era.c.a ? -6250336 : 8388479;
         int $$7 = this.i.a(this.e);
         $$0.a(this.i, this.e, this.g / 2, 12, -1);
         $$0.a(this.i, $$4, this.g / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.g / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.a($$0, $$8, 7, $$1, $$2);
         if (this.E()) {
            $$0.a(this.i, vd.a("mco.configure.world.minigame", this.I.c()), this.K + 80 + 20 + 10, g(13), -1, false);
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
         eqj $$1 = eqj.a();

         try {
            era $$2 = $$1.a($$0);
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

               for (esc $$1x : this.U) {
                  $$1x.a($$2);
               }
            });
         } catch (erw var5) {
            w.error("Couldn't get own world", var5);
            this.f.execute(() -> this.f.a(new esn(var5, this.H)));
         }
      }).start();
   }

   private void C() {
      this.M.j = !this.I.j;
      this.N.j = !this.I.j;
      this.O.j = true;
      this.S.j = !this.I.j;
      this.P.j = !this.I.j;
      this.R.j = !this.I.j;
   }

   private void a(era $$0) {
      if (this.I.e == era.c.b) {
         eqe.a($$0, new esj(this.H, this.J));
      } else {
         this.a(true, new esj(this.H, this.J));
      }
   }

   private void D() {
      eta $$0 = new eta(vd.c("mco.template.title.minigame"), this::a, era.d.b);
      $$0.a(vd.c("mco.minigame.world.info.line1"), vd.c("mco.minigame.world.info.line2"));
      this.f.a($$0);
   }

   private void a(int $$0, era $$1) {
      vd $$2 = vd.c("mco.configure.world.slot.switch.question.line1");
      vd $$3 = vd.c("mco.configure.world.slot.switch.question.line2");
      this.f.a(new esp($$2x -> {
         if ($$2x) {
            this.e();
            this.f.a(new esq(this.H, new euh($$1.a, $$0, () -> this.f.execute(() -> this.f.a(this.f())))));
         } else {
            this.f.a(this);
         }
      }, esp.a.b, $$2, $$3, true));
   }

   private void b(int $$0, era $$1) {
      vd $$2 = vd.c("mco.configure.world.slot.switch.question.line1");
      vd $$3 = vd.c("mco.configure.world.slot.switch.question.line2");
      this.f.a(new esp($$2x -> {
         if ($$2x) {
            this.e();
            esy $$3x = esy.a(this, $$0, $$1, () -> this.f.execute(() -> this.f.a(this.f())));
            this.f.a($$3x);
         } else {
            this.f.a(this);
         }
      }, esp.a.b, $$2, $$3, true));
   }

   private void a(ewm $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.I.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> z);
      } else if (this.I.e == era.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, v, () -> D);
      } else if (this.I.e == era.c.b) {
         if (this.I.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.I.l <= 0) {
                  return A;
               } else {
                  return (vd)(this.I.l == 1 ? B : vd.a("mco.selectServer.expires.days", this.I.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> C);
         }
      }
   }

   private void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, ahd $$5, Supplier<vd> $$6) {
      $$0.a($$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.d($$6.get());
      }
   }

   private boolean E() {
      return this.I != null && this.I.m == era.d.b;
   }

   private void H() {
      this.a(this.P);
      this.a(this.Q);
      this.a(this.R);
   }

   private void a(ewy $$0) {
      $$0.k = false;
   }

   private void b(ewy $$0) {
      $$0.k = true;
   }

   private void I() {
      this.a(this.S);
   }

   public void a(erh $$0) {
      erh $$1 = this.I.i.get(this.I.n);
      $$0.l = $$1.l;
      $$0.m = $$1.m;
      eqj $$2 = eqj.a();

      try {
         $$2.a(this.I.a, this.I.n, $$0);
         this.I.i.put(this.I.n, $$0);
      } catch (erw var5) {
         w.error("Couldn't save slot settings", var5);
         this.f.a(new esn(var5, this));
         return;
      }

      this.f.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = ac.b($$1) ? null : $$1;
      eqj $$3 = eqj.a();

      try {
         $$3.b(this.I.a, $$0, $$2);
         this.I.a($$0);
         this.I.b($$2);
         this.e();
      } catch (erw var6) {
         w.error("Couldn't save settings", var6);
         this.f.a(new esn(var6, this));
         return;
      }

      this.f.a(this);
   }

   public void a(boolean $$0, fct $$1) {
      this.f.a(new esq($$1, new eub(this.I, this, $$0, this.f)));
   }

   public void a(fct $$0) {
      this.f.a(new esq($$0, new etv(this.I, this)));
   }

   public void e() {
      this.T = true;
   }

   private void a(@Nullable err $$0) {
      if ($$0 != null && err.a.b == $$0.i) {
         this.e();
         this.f.a(new esq(this.H, new eug(this.I.a, $$0, this.f())));
      } else {
         this.f.a(this);
      }
   }

   public esj f() {
      esj $$0 = new esj(this.H, this.J);
      $$0.T = this.T;
      return $$0;
   }
}
