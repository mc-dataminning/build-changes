import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eox extends gfx {
   private static final afw a = new afw("realm_status/expired");
   private static final afw b = new afw("realm_status/expires_soon");
   private static final afw c = new afw("realm_status/open");
   private static final afw y = new afw("realm_status/closed");
   private static final Logger z = LogUtils.getLogger();
   private static final ui A = ui.c("mco.configure.worlds.title");
   private static final ui B = ui.c("mco.configure.world.title");
   private static final ui C = ui.c("mco.selectServer.expired");
   private static final ui D = ui.c("mco.selectServer.expires.soon");
   private static final ui E = ui.c("mco.selectServer.expires.day");
   private static final ui F = ui.c("mco.selectServer.open");
   private static final ui G = ui.c("mco.selectServer.closed");
   private static final int H = 80;
   private static final int I = 5;
   @Nullable
   private ui J;
   private final ems K;
   @Nullable
   private eno L;
   private final long M;
   private int N;
   private int O;
   private etj P;
   private etj Q;
   private etj R;
   private etj S;
   private etj T;
   private etj U;
   private etj V;
   private boolean W;
   private int X;
   private final List<eoq> Y = Lists.newArrayList();

   public eox(ems $$0, long $$1) {
      super(B);
      this.K = $$0;
      this.M = $$1;
   }

   @Override
   public void aM_() {
      if (this.L == null) {
         this.a(this.M);
      }

      this.N = this.g / 2 - 187;
      this.O = this.g / 2 + 190;
      this.P = this.d(etj.a(ui.c("mco.configure.world.buttons.players"), $$0x -> this.f.a(new epj(this, this.L))).a(this.a(0, 3), h(0), 100, 20).a());
      this.Q = this.d(etj.a(ui.c("mco.configure.world.buttons.settings"), $$0x -> this.f.a(new epp(this, this.L.g()))).a(this.a(1, 3), h(0), 100, 20).a());
      this.R = this.d(
         etj.a(ui.c("mco.configure.world.buttons.subscription"), $$0x -> this.f.a(new epr(this, this.L.g(), this.K))).a(this.a(2, 3), h(0), 100, 20).a()
      );
      this.Y.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.Y.add(this.a($$0));
      }

      this.V = this.d(
         etj.a(ui.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.f.a(new epo(ui.c("mco.template.title.minigame"), this::a, eno.d.b)))
            .a(this.b(0), h(13) - 5, 100, 20)
            .a()
      );
      this.S = this.d(
         etj.a(ui.c("mco.configure.world.buttons.options"), $$0x -> this.f.a(new epq(this, this.L.i.get(this.L.n).d(), this.L.m, this.L.n)))
            .a(this.b(0), h(13) - 5, 90, 20)
            .a()
      );
      this.T = this.d(etj.a(ui.c("mco.configure.world.backup"), $$0x -> this.f.a(new eou(this, this.L.g(), this.L.n))).a(this.b(1), h(13) - 5, 90, 20).a());
      this.U = this.d(
         etj.a(ui.c("mco.configure.world.buttons.resetworld"), $$0x -> this.f.a(epm.a(this, this.L.g(), () -> this.f.execute(() -> this.f.a(this.f())))))
            .a(this.b(2), h(13) - 5, 90, 20)
            .a()
      );
      this.d(etj.a(uh.k, $$0x -> this.C()).a(this.O - 80 + 8, h(13) - 5, 70, 20).a());
      this.T.i = true;
      if (this.L == null) {
         this.H();
         this.G();
         this.P.i = false;
         this.Q.i = false;
         this.R.i = false;
      } else {
         this.D();
         if (this.F()) {
            this.G();
         } else {
            this.H();
         }
      }
   }

   private eoq a(int $$0) {
      int $$1 = this.c($$0);
      int $$2 = h(5) + 5;
      eoq $$3 = new eoq($$1, $$2, 80, 80, () -> this.L, $$0x -> this.J = $$0x, $$0, $$1x -> {
         eoq.b $$2x = ((eoq)$$1x).a();
         if ($$2x != null) {
            switch ($$2x.c) {
               case a:
                  break;
               case c:
                  this.a(this.L);
                  break;
               case b:
                  if ($$2x.b) {
                     this.E();
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
      return this.d($$3);
   }

   private int b(int $$0) {
      return this.N + $$0 * 95;
   }

   private int a(int $$0, int $$1) {
      return this.g / 2 - ($$1 * 105 - 5) / 2 + $$0 * 105;
   }

   @Override
   public void d() {
      super.d();
      this.X--;
      if (this.X < 0) {
         this.X = 0;
      }

      this.Y.forEach(eoq::b);
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.J = null;
      $$0.a(this.i, A, this.g / 2, h(4), -1);
      if (this.L == null) {
         $$0.a(this.i, this.e, this.g / 2, 17, -1);
      } else {
         String $$4 = this.L.b();
         int $$5 = this.i.b($$4);
         int $$6 = this.L.e == eno.c.a ? -6250336 : 8388479;
         int $$7 = this.i.a(this.e);
         $$0.a(this.i, this.e, this.g / 2, 12, -1);
         $$0.a(this.i, $$4, this.g / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.g / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.a($$0, $$8, 7, $$1, $$2);
         if (this.F()) {
            $$0.a(this.i, ui.a("mco.configure.world.minigame", this.L.c()), this.N + 80 + 20 + 10, h(13), -1, false);
         }

         if (this.J != null) {
            $$0.a(this.i, this.J, $$1, $$2);
         }
      }
   }

   private int c(int $$0) {
      return this.N + ($$0 - 1) * 98;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.C();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void C() {
      if (this.W) {
         this.K.g();
      }

      this.f.a(this.K);
   }

   private void a(long $$0) {
      new Thread(() -> {
         emx $$1 = emx.a();

         try {
            eno $$2 = $$1.a($$0);
            this.f.execute(() -> {
               this.L = $$2;
               this.D();
               if (this.F()) {
                  this.b(this.V);
               } else {
                  this.b(this.S);
                  this.b(this.T);
                  this.b(this.U);
               }
            });
         } catch (eok var5) {
            z.error("Couldn't get own world", var5);
            this.f.execute(() -> this.f.a(new epb(var5, this.K)));
         }
      }).start();
   }

   private void D() {
      this.P.i = !this.L.j;
      this.Q.i = !this.L.j;
      this.R.i = true;
      this.V.i = !this.L.j;
      this.S.i = !this.L.j;
      this.U.i = !this.L.j;
   }

   private void a(eno $$0) {
      if (this.L.e == eno.c.b) {
         ems.a($$0, new eox(this.K, this.M));
      } else {
         this.a(true, new eox(this.K, this.M));
      }
   }

   private void E() {
      epo $$0 = new epo(ui.c("mco.template.title.minigame"), this::a, eno.d.b);
      $$0.a(ui.c("mco.minigame.world.info.line1"), ui.c("mco.minigame.world.info.line2"));
      this.f.a($$0);
   }

   private void a(int $$0, eno $$1) {
      ui $$2 = ui.c("mco.configure.world.slot.switch.question.line1");
      ui $$3 = ui.c("mco.configure.world.slot.switch.question.line2");
      this.f.a(new epd($$2x -> {
         if ($$2x) {
            this.f.a(new epe(this.K, new eqv($$1.a, $$0, () -> this.f.execute(() -> this.f.a(this.f())))));
         } else {
            this.f.a(this);
         }
      }, epd.a.b, $$2, $$3, true));
   }

   private void b(int $$0, eno $$1) {
      ui $$2 = ui.c("mco.configure.world.slot.switch.question.line1");
      ui $$3 = ui.c("mco.configure.world.slot.switch.question.line2");
      this.f.a(new epd($$2x -> {
         if ($$2x) {
            epm $$3x = epm.a(this, $$0, $$1, () -> this.f.execute(() -> this.f.a(this.f())));
            this.f.a($$3x);
         } else {
            this.f.a(this);
         }
      }, epd.a.b, $$2, $$3, true));
   }

   private void a(esy $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.L.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> C);
      } else if (this.L.e == eno.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, y, () -> G);
      } else if (this.L.e == eno.c.b) {
         if (this.L.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.L.l <= 0) {
                  return D;
               } else {
                  return (ui)(this.L.l == 1 ? E : ui.a("mco.selectServer.expires.days", this.L.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> F);
         }
      }
   }

   private void a(esy $$0, int $$1, int $$2, int $$3, int $$4, afw $$5, Supplier<ui> $$6) {
      $$0.a($$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.J = $$6.get();
      }
   }

   private boolean F() {
      return this.L != null && this.L.m == eno.d.b;
   }

   private void G() {
      this.a(this.S);
      this.a(this.T);
      this.a(this.U);
   }

   private void a(etj $$0) {
      $$0.j = false;
   }

   private void b(etj $$0) {
      $$0.j = true;
   }

   private void H() {
      this.a(this.V);
   }

   public void a(env $$0) {
      env $$1 = this.L.i.get(this.L.n);
      $$0.j = $$1.j;
      $$0.k = $$1.k;
      emx $$2 = emx.a();

      try {
         $$2.a(this.L.a, this.L.n, $$0);
         this.L.i.put(this.L.n, $$0);
      } catch (eok var5) {
         z.error("Couldn't save slot settings", var5);
         this.f.a(new epb(var5, this));
         return;
      }

      this.f.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = ac.b($$1) ? null : $$1;
      emx $$3 = emx.a();

      try {
         $$3.b(this.L.a, $$0, $$2);
         this.L.a($$0);
         this.L.b($$2);
      } catch (eok var6) {
         z.error("Couldn't save settings", var6);
         this.f.a(new epb(var6, this));
         return;
      }

      this.f.a(this);
   }

   public void a(boolean $$0, ezd $$1) {
      this.f.a(new epe($$1, new eqp(this.L, this, $$0, this.f)));
   }

   public void a(ezd $$0) {
      this.f.a(new epe($$0, new eqj(this.L, this)));
   }

   public void e() {
      this.W = true;
   }

   private void a(@Nullable eof $$0) {
      if ($$0 != null && eof.a.b == $$0.i) {
         this.f.a(new epe(this.K, new equ(this.L.a, $$0, this.f())));
      } else {
         this.f.a(this);
      }
   }

   public eox f() {
      return new eox(this.K, this.M);
   }
}
