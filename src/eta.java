import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eta extends gld {
   private static final ahh a = new ahh("realm_status/expired");
   private static final ahh b = new ahh("realm_status/expires_soon");
   private static final ahh c = new ahh("realm_status/open");
   private static final ahh v = new ahh("realm_status/closed");
   private static final Logger w = LogUtils.getLogger();
   private static final vg x = vg.c("mco.configure.worlds.title");
   private static final vg y = vg.c("mco.configure.world.title");
   private static final vg z = vg.c("mco.selectServer.expired");
   private static final vg A = vg.c("mco.selectServer.expires.soon");
   private static final vg B = vg.c("mco.selectServer.expires.day");
   private static final vg C = vg.c("mco.selectServer.open");
   private static final vg D = vg.c("mco.selectServer.closed");
   private static final int E = 80;
   private static final int F = 5;
   @Nullable
   private vg G;
   private final eqv H;
   @Nullable
   private err I;
   private final long J;
   private int K;
   private int L;
   private exr M;
   private exr N;
   private exr O;
   private exr P;
   private exr Q;
   private exr R;
   private exr S;
   private boolean T;
   private final List<est> U = Lists.newArrayList();

   public eta(eqv $$0, long $$1) {
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
      this.M = this.d(exr.a(vg.c("mco.configure.world.buttons.players"), $$0x -> this.f.a(new etm(this, this.I))).a(this.a(0, 3), g(0), 100, 20).a());
      this.N = this.d(exr.a(vg.c("mco.configure.world.buttons.settings"), $$0x -> this.f.a(new ets(this, this.I.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.O = this.d(
         exr.a(vg.c("mco.configure.world.buttons.subscription"), $$0x -> this.f.a(new etu(this, this.I.g(), this.H))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.U.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.U.add(this.a($$0));
      }

      this.S = this.d(
         exr.a(vg.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.f.a(new etr(vg.c("mco.template.title.minigame"), this::a, err.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.P = this.d(
         exr.a(vg.c("mco.configure.world.buttons.options"), $$0x -> this.f.a(new ett(this, this.I.i.get(this.I.n).d(), this.I.m, this.I.n)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.Q = this.d(exr.a(vg.c("mco.configure.world.backup"), $$0x -> this.f.a(new esx(this, this.I.g(), this.I.n))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.R = this.d(
         exr.a(vg.c("mco.configure.world.buttons.resetworld"), $$0x -> this.f.a(etp.a(this, this.I.g(), () -> this.f.execute(() -> this.f.a(this.f())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.d(exr.a(vf.k, $$0x -> this.d()).a(this.L - 80 + 8, g(13) - 5, 70, 20).a());
      this.Q.j = true;
      if (this.I == null) {
         this.K();
         this.J();
         this.M.j = false;
         this.N.j = false;
         this.O.j = false;
      } else {
         this.E();
         if (this.I()) {
            this.J();
         } else {
            this.K();
         }
      }
   }

   private est a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      est $$3 = new est($$1, $$2, 80, 80, $$0, $$1x -> {
         est.b $$2x = ((est)$$1x).a();
         if ($$2x != null) {
            switch ($$2x.c) {
               case a:
                  break;
               case c:
                  this.a(this.I);
                  break;
               case b:
                  if ($$2x.b) {
                     this.H();
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
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.G = null;
      $$0.a(this.i, x, this.g / 2, g(4), -1);
      if (this.I == null) {
         $$0.a(this.i, this.e, this.g / 2, 17, -1);
      } else {
         String $$4 = this.I.b();
         int $$5 = this.i.b($$4);
         int $$6 = this.I.e == err.c.a ? -6250336 : 8388479;
         int $$7 = this.i.a(this.e);
         $$0.a(this.i, this.e, this.g / 2, 12, -1);
         $$0.a(this.i, $$4, this.g / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.g / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.a($$0, $$8, 7, $$1, $$2);
         if (this.I()) {
            $$0.a(this.i, vg.a("mco.configure.world.minigame", this.I.c()), this.K + 80 + 20 + 10, g(13), -1, false);
         }
      }
   }

   private int h(int $$0) {
      return this.K + ($$0 - 1) * 98;
   }

   @Override
   public void d() {
      this.f.a(this.H);
      if (this.T) {
         this.H.h();
      }
   }

   private void a(long $$0) {
      new Thread(() -> {
         era $$1 = era.a();

         try {
            err $$2 = $$1.a($$0);
            this.f.execute(() -> {
               this.I = $$2;
               this.E();
               if (this.I()) {
                  this.b(this.S);
               } else {
                  this.b(this.P);
                  this.b(this.Q);
                  this.b(this.R);
               }

               for (est $$1x : this.U) {
                  $$1x.a($$2);
               }
            });
         } catch (esn var5) {
            w.error("Couldn't get own world", var5);
            this.f.execute(() -> this.f.a(new ete(var5, this.H)));
         }
      }).start();
   }

   private void E() {
      this.M.j = !this.I.j;
      this.N.j = !this.I.j;
      this.O.j = true;
      this.S.j = !this.I.j;
      this.P.j = !this.I.j;
      this.R.j = !this.I.j;
   }

   private void a(err $$0) {
      if (this.I.e == err.c.b) {
         eqv.a($$0, new eta(this.H, this.J));
      } else {
         this.a(true, new eta(this.H, this.J));
      }
   }

   private void H() {
      etr $$0 = new etr(vg.c("mco.template.title.minigame"), this::a, err.d.b);
      $$0.a(vg.c("mco.minigame.world.info.line1"), vg.c("mco.minigame.world.info.line2"));
      this.f.a($$0);
   }

   private void a(int $$0, err $$1) {
      vg $$2 = vg.c("mco.configure.world.slot.switch.question.line1");
      vg $$3 = vg.c("mco.configure.world.slot.switch.question.line2");
      this.f.a(new etg($$2x -> {
         if ($$2x) {
            this.b();
            this.f.a(new eth(this.H, new euy($$1.a, $$0, () -> this.f.execute(() -> this.f.a(this.f())))));
         } else {
            this.f.a(this);
         }
      }, etg.a.b, $$2, $$3, true));
   }

   private void b(int $$0, err $$1) {
      vg $$2 = vg.c("mco.configure.world.slot.switch.question.line1");
      vg $$3 = vg.c("mco.configure.world.slot.switch.question.line2");
      this.f.a(new etg($$2x -> {
         if ($$2x) {
            this.b();
            etp $$3x = etp.a(this, $$0, $$1, () -> this.f.execute(() -> this.f.a(this.f())));
            this.f.a($$3x);
         } else {
            this.f.a(this);
         }
      }, etg.a.b, $$2, $$3, true));
   }

   private void a(exe $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.I.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> z);
      } else if (this.I.e == err.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, v, () -> D);
      } else if (this.I.e == err.c.b) {
         if (this.I.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.I.l <= 0) {
                  return A;
               } else {
                  return (vg)(this.I.l == 1 ? B : vg.a("mco.selectServer.expires.days", this.I.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> C);
         }
      }
   }

   private void a(exe $$0, int $$1, int $$2, int $$3, int $$4, ahh $$5, Supplier<vg> $$6) {
      $$0.a($$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.d($$6.get());
      }
   }

   private boolean I() {
      return this.I != null && this.I.m == err.d.b;
   }

   private void J() {
      this.a(this.P);
      this.a(this.Q);
      this.a(this.R);
   }

   private void a(exr $$0) {
      $$0.k = false;
   }

   private void b(exr $$0) {
      $$0.k = true;
   }

   private void K() {
      this.a(this.S);
   }

   public void a(ery $$0) {
      ery $$1 = this.I.i.get(this.I.n);
      $$0.l = $$1.l;
      $$0.m = $$1.m;
      era $$2 = era.a();

      try {
         $$2.a(this.I.a, this.I.n, $$0);
         this.I.i.put(this.I.n, $$0);
      } catch (esn var5) {
         w.error("Couldn't save slot settings", var5);
         this.f.a(new ete(var5, this));
         return;
      }

      this.f.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = ac.b($$1) ? null : $$1;
      era $$3 = era.a();

      try {
         $$3.b(this.I.a, $$0, $$2);
         this.I.a($$0);
         this.I.b($$2);
         this.b();
      } catch (esn var6) {
         w.error("Couldn't save settings", var6);
         this.f.a(new ete(var6, this));
         return;
      }

      this.f.a(this);
   }

   public void a(boolean $$0, fdm $$1) {
      this.f.a(new eth($$1, new eus(this.I, this, $$0, this.f)));
   }

   public void a(fdm $$0) {
      this.f.a(new eth($$0, new eum(this.I, this)));
   }

   public void b() {
      this.T = true;
   }

   private void a(@Nullable esi $$0) {
      if ($$0 != null && esi.a.b == $$0.i) {
         this.b();
         this.f.a(new eth(this.H, new eux(this.I.a, $$0, this.f())));
      } else {
         this.f.a(this);
      }
   }

   public eta f() {
      eta $$0 = new eta(this.H, this.J);
      $$0.T = this.T;
      return $$0;
   }
}
