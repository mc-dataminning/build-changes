import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqr extends ghw {
   private static final agm a = new agm("realm_status/expired");
   private static final agm b = new agm("realm_status/expires_soon");
   private static final agm c = new agm("realm_status/open");
   private static final agm v = new agm("realm_status/closed");
   private static final Logger w = LogUtils.getLogger();
   private static final uv x = uv.c("mco.configure.worlds.title");
   private static final uv y = uv.c("mco.configure.world.title");
   private static final uv z = uv.c("mco.selectServer.expired");
   private static final uv A = uv.c("mco.selectServer.expires.soon");
   private static final uv B = uv.c("mco.selectServer.expires.day");
   private static final uv C = uv.c("mco.selectServer.open");
   private static final uv D = uv.c("mco.selectServer.closed");
   private static final int E = 80;
   private static final int F = 5;
   @Nullable
   private uv G;
   private final eom H;
   @Nullable
   private epi I;
   private final long J;
   private int K;
   private int L;
   private eve M;
   private eve N;
   private eve O;
   private eve P;
   private eve Q;
   private eve R;
   private eve S;
   private boolean T;
   private final List<eqk> U = Lists.newArrayList();

   public eqr(eom $$0, long $$1) {
      super(y);
      this.H = $$0;
      this.J = $$1;
   }

   @Override
   public void aQ_() {
      if (this.I == null) {
         this.a(this.J);
      }

      this.K = this.g / 2 - 187;
      this.L = this.g / 2 + 190;
      this.M = this.d(eve.a(uv.c("mco.configure.world.buttons.players"), $$0x -> this.f.a(new erd(this, this.I))).a(this.a(0, 3), h(0), 100, 20).a());
      this.N = this.d(eve.a(uv.c("mco.configure.world.buttons.settings"), $$0x -> this.f.a(new erj(this, this.I.g()))).a(this.a(1, 3), h(0), 100, 20).a());
      this.O = this.d(
         eve.a(uv.c("mco.configure.world.buttons.subscription"), $$0x -> this.f.a(new erl(this, this.I.g(), this.H))).a(this.a(2, 3), h(0), 100, 20).a()
      );
      this.U.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.U.add(this.a($$0));
      }

      this.S = this.d(
         eve.a(uv.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.f.a(new eri(uv.c("mco.template.title.minigame"), this::a, epi.d.b)))
            .a(this.b(0), h(13) - 5, 100, 20)
            .a()
      );
      this.P = this.d(
         eve.a(uv.c("mco.configure.world.buttons.options"), $$0x -> this.f.a(new erk(this, this.I.i.get(this.I.n).d(), this.I.m, this.I.n)))
            .a(this.b(0), h(13) - 5, 90, 20)
            .a()
      );
      this.Q = this.d(eve.a(uv.c("mco.configure.world.backup"), $$0x -> this.f.a(new eqo(this, this.I.g(), this.I.n))).a(this.b(1), h(13) - 5, 90, 20).a());
      this.R = this.d(
         eve.a(uv.c("mco.configure.world.buttons.resetworld"), $$0x -> this.f.a(erg.a(this, this.I.g(), () -> this.f.execute(() -> this.f.a(this.f())))))
            .a(this.b(2), h(13) - 5, 90, 20)
            .a()
      );
      this.d(eve.a(uu.k, $$0x -> this.aG_()).a(this.L - 80 + 8, h(13) - 5, 70, 20).a());
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

   private eqk a(int $$0) {
      int $$1 = this.c($$0);
      int $$2 = h(5) + 5;
      eqk $$3 = new eqk($$1, $$2, 80, 80, $$0, $$1x -> {
         eqk.b $$2x = ((eqk)$$1x).a();
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
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.G = null;
      $$0.a(this.i, x, this.g / 2, h(4), -1);
      if (this.I == null) {
         $$0.a(this.i, this.e, this.g / 2, 17, -1);
      } else {
         String $$4 = this.I.b();
         int $$5 = this.i.b($$4);
         int $$6 = this.I.e == epi.c.a ? -6250336 : 8388479;
         int $$7 = this.i.a(this.e);
         $$0.a(this.i, this.e, this.g / 2, 12, -1);
         $$0.a(this.i, $$4, this.g / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.g / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.a($$0, $$8, 7, $$1, $$2);
         if (this.E()) {
            $$0.a(this.i, uv.a("mco.configure.world.minigame", this.I.c()), this.K + 80 + 20 + 10, h(13), -1, false);
         }
      }
   }

   private int c(int $$0) {
      return this.K + ($$0 - 1) * 98;
   }

   @Override
   public void aG_() {
      this.f.a(this.H);
      if (this.T) {
         this.H.g();
      }
   }

   private void a(long $$0) {
      new Thread(() -> {
         eor $$1 = eor.a();

         try {
            epi $$2 = $$1.a($$0);
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

               for (eqk $$1x : this.U) {
                  $$1x.a($$2);
               }
            });
         } catch (eqe var5) {
            w.error("Couldn't get own world", var5);
            this.f.execute(() -> this.f.a(new eqv(var5, this.H)));
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

   private void a(epi $$0) {
      if (this.I.e == epi.c.b) {
         eom.a($$0, new eqr(this.H, this.J));
      } else {
         this.a(true, new eqr(this.H, this.J));
      }
   }

   private void D() {
      eri $$0 = new eri(uv.c("mco.template.title.minigame"), this::a, epi.d.b);
      $$0.a(uv.c("mco.minigame.world.info.line1"), uv.c("mco.minigame.world.info.line2"));
      this.f.a($$0);
   }

   private void a(int $$0, epi $$1) {
      uv $$2 = uv.c("mco.configure.world.slot.switch.question.line1");
      uv $$3 = uv.c("mco.configure.world.slot.switch.question.line2");
      this.f.a(new eqx($$2x -> {
         if ($$2x) {
            this.e();
            this.f.a(new eqy(this.H, new esp($$1.a, $$0, () -> this.f.execute(() -> this.f.a(this.f())))));
         } else {
            this.f.a(this);
         }
      }, eqx.a.b, $$2, $$3, true));
   }

   private void b(int $$0, epi $$1) {
      uv $$2 = uv.c("mco.configure.world.slot.switch.question.line1");
      uv $$3 = uv.c("mco.configure.world.slot.switch.question.line2");
      this.f.a(new eqx($$2x -> {
         if ($$2x) {
            this.e();
            erg $$3x = erg.a(this, $$0, $$1, () -> this.f.execute(() -> this.f.a(this.f())));
            this.f.a($$3x);
         } else {
            this.f.a(this);
         }
      }, eqx.a.b, $$2, $$3, true));
   }

   private void a(eut $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.I.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> z);
      } else if (this.I.e == epi.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, v, () -> D);
      } else if (this.I.e == epi.c.b) {
         if (this.I.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.I.l <= 0) {
                  return A;
               } else {
                  return (uv)(this.I.l == 1 ? B : uv.a("mco.selectServer.expires.days", this.I.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> C);
         }
      }
   }

   private void a(eut $$0, int $$1, int $$2, int $$3, int $$4, agm $$5, Supplier<uv> $$6) {
      $$0.a($$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.d($$6.get());
      }
   }

   private boolean E() {
      return this.I != null && this.I.m == epi.d.b;
   }

   private void F() {
      this.a(this.P);
      this.a(this.Q);
      this.a(this.R);
   }

   private void a(eve $$0) {
      $$0.j = false;
   }

   private void b(eve $$0) {
      $$0.j = true;
   }

   private void G() {
      this.a(this.S);
   }

   public void a(epp $$0) {
      epp $$1 = this.I.i.get(this.I.n);
      $$0.l = $$1.l;
      $$0.m = $$1.m;
      eor $$2 = eor.a();

      try {
         $$2.a(this.I.a, this.I.n, $$0);
         this.I.i.put(this.I.n, $$0);
      } catch (eqe var5) {
         w.error("Couldn't save slot settings", var5);
         this.f.a(new eqv(var5, this));
         return;
      }

      this.f.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = ac.b($$1) ? null : $$1;
      eor $$3 = eor.a();

      try {
         $$3.b(this.I.a, $$0, $$2);
         this.I.a($$0);
         this.I.b($$2);
         this.e();
      } catch (eqe var6) {
         w.error("Couldn't save settings", var6);
         this.f.a(new eqv(var6, this));
         return;
      }

      this.f.a(this);
   }

   public void a(boolean $$0, faz $$1) {
      this.f.a(new eqy($$1, new esj(this.I, this, $$0, this.f)));
   }

   public void a(faz $$0) {
      this.f.a(new eqy($$0, new esd(this.I, this)));
   }

   public void e() {
      this.T = true;
   }

   private void a(@Nullable epz $$0) {
      if ($$0 != null && epz.a.b == $$0.i) {
         this.e();
         this.f.a(new eqy(this.H, new eso(this.I.a, $$0, this.f())));
      } else {
         this.f.a(this);
      }
   }

   public eqr f() {
      eqr $$0 = new eqr(this.H, this.J);
      $$0.T = this.T;
      return $$0;
   }
}
