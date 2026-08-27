import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eoa extends gew {
   private static final aeu a = new aeu("realm_status/expired");
   private static final aeu b = new aeu("realm_status/expires_soon");
   private static final aeu c = new aeu("realm_status/open");
   private static final aeu y = new aeu("realm_status/closed");
   private static final Logger z = LogUtils.getLogger();
   private static final ti A = ti.c("mco.configure.worlds.title");
   private static final ti B = ti.c("mco.configure.world.title");
   private static final ti C = ti.c("mco.selectServer.expired");
   private static final ti D = ti.c("mco.selectServer.expires.soon");
   private static final ti E = ti.c("mco.selectServer.expires.day");
   private static final ti F = ti.c("mco.selectServer.open");
   private static final ti G = ti.c("mco.selectServer.closed");
   private static final int H = 80;
   private static final int I = 5;
   @Nullable
   private ti J;
   private final elv K;
   @Nullable
   private emr L;
   private final long M;
   private int N;
   private int O;
   private esl P;
   private esl Q;
   private esl R;
   private esl S;
   private esl T;
   private esl U;
   private esl V;
   private boolean W;
   private int X;
   private final List<ent> Y = Lists.newArrayList();

   public eoa(elv $$0, long $$1) {
      super(B);
      this.K = $$0;
      this.M = $$1;
   }

   @Override
   public void aD_() {
      if (this.L == null) {
         this.a(this.M);
      }

      this.N = this.g / 2 - 187;
      this.O = this.g / 2 + 190;
      this.P = this.d(esl.a(ti.c("mco.configure.world.buttons.players"), $$0x -> this.f.a(new eom(this, this.L))).a(this.a(0, 3), h(0), 100, 20).a());
      this.Q = this.d(esl.a(ti.c("mco.configure.world.buttons.settings"), $$0x -> this.f.a(new eos(this, this.L.d()))).a(this.a(1, 3), h(0), 100, 20).a());
      this.R = this.d(
         esl.a(ti.c("mco.configure.world.buttons.subscription"), $$0x -> this.f.a(new eou(this, this.L.d(), this.K))).a(this.a(2, 3), h(0), 100, 20).a()
      );
      this.Y.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.Y.add(this.a($$0));
      }

      this.V = this.d(
         esl.a(ti.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.f.a(new eor(ti.c("mco.template.title.minigame"), this::a, emr.c.b)))
            .a(this.b(0), h(13) - 5, 100, 20)
            .a()
      );
      this.S = this.d(
         esl.a(ti.c("mco.configure.world.buttons.options"), $$0x -> this.f.a(new eot(this, this.L.i.get(this.L.n).d(), this.L.m, this.L.n)))
            .a(this.b(0), h(13) - 5, 90, 20)
            .a()
      );
      this.T = this.d(esl.a(ti.c("mco.configure.world.backup"), $$0x -> this.f.a(new enx(this, this.L.d(), this.L.n))).a(this.b(1), h(13) - 5, 90, 20).a());
      this.U = this.d(
         esl.a(ti.c("mco.configure.world.buttons.resetworld"), $$0x -> this.f.a(eop.b(this, this.L.d(), () -> this.f.execute(() -> this.f.a(this.f())))))
            .a(this.b(2), h(13) - 5, 90, 20)
            .a()
      );
      this.d(esl.a(th.k, $$0x -> this.C()).a(this.O - 80 + 8, h(13) - 5, 70, 20).a());
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

   private ent a(int $$0) {
      int $$1 = this.c($$0);
      int $$2 = h(5) + 5;
      ent $$3 = new ent($$1, $$2, 80, 80, () -> this.L, $$0x -> this.J = $$0x, $$0, $$1x -> {
         ent.b $$2x = ((ent)$$1x).a();
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
   public void c() {
      super.c();
      this.X--;
      if (this.X < 0) {
         this.X = 0;
      }

      this.Y.forEach(ent::b);
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.J = null;
      $$0.a(this.i, A, this.g / 2, h(4), -1);
      if (this.L == null) {
         $$0.a(this.i, this.e, this.g / 2, 17, -1);
      } else {
         String $$4 = this.L.b();
         int $$5 = this.i.b($$4);
         int $$6 = this.L.e == emr.b.a ? -6250336 : 8388479;
         int $$7 = this.i.a(this.e);
         $$0.a(this.i, this.e, this.g / 2, 12, -1);
         $$0.a(this.i, $$4, this.g / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.g / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.a($$0, $$8, 7, $$1, $$2);
         if (this.F()) {
            $$0.a(this.i, ti.a("mco.configure.world.minigame", this.L.c()), this.N + 80 + 20 + 10, h(13), -1, false);
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
         this.K.f();
      }

      this.f.a(this.K);
   }

   private void a(long $$0) {
      new Thread(() -> {
         ema $$1 = ema.a();

         try {
            emr $$2 = $$1.a($$0);
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
         } catch (enn var5) {
            z.error("Couldn't get own world", var5);
            this.f.execute(() -> this.f.a(new eoe(var5, this.K)));
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

   private void a(emr $$0) {
      if (this.L.e == emr.b.b) {
         this.K.a($$0, new eoa(this.K.h(), this.M));
      } else {
         this.a(true, new eoa(this.K.h(), this.M));
      }
   }

   private void E() {
      eor $$0 = new eor(ti.c("mco.template.title.minigame"), this::a, emr.c.b);
      $$0.a(ti.c("mco.minigame.world.info.line1"), ti.c("mco.minigame.world.info.line2"));
      this.f.a($$0);
   }

   private void a(int $$0, emr $$1) {
      ti $$2 = ti.c("mco.configure.world.slot.switch.question.line1");
      ti $$3 = ti.c("mco.configure.world.slot.switch.question.line2");
      this.f.a(new eog($$2x -> {
         if ($$2x) {
            this.f.a(new eoh(this.K, new epx($$1.a, $$0, () -> this.f.execute(() -> this.f.a(this.f())))));
         } else {
            this.f.a(this);
         }
      }, eog.a.b, $$2, $$3, true));
   }

   private void b(int $$0, emr $$1) {
      ti $$2 = ti.c("mco.configure.world.slot.switch.question.line1");
      ti $$3 = ti.c("mco.configure.world.slot.switch.question.line2");
      this.f.a(new eog($$2x -> {
         if ($$2x) {
            eop $$3x = eop.a(this, $$0, $$1, () -> this.f.execute(() -> this.f.a(this.f())));
            this.f.a($$3x);
         } else {
            this.f.a(this);
         }
      }, eog.a.b, $$2, $$3, true));
   }

   private void a(esa $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.L.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> C);
      } else if (this.L.e == emr.b.a) {
         this.a($$0, $$1, $$2, $$3, $$4, y, () -> G);
      } else if (this.L.e == emr.b.b) {
         if (this.L.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.L.l <= 0) {
                  return D;
               } else {
                  return (ti)(this.L.l == 1 ? E : ti.a("mco.selectServer.expires.days", this.L.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> F);
         }
      }
   }

   private void a(esa $$0, int $$1, int $$2, int $$3, int $$4, aeu $$5, Supplier<ti> $$6) {
      $$0.a($$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.J = $$6.get();
      }
   }

   private boolean F() {
      return this.L != null && this.L.m == emr.c.b;
   }

   private void G() {
      this.a(this.S);
      this.a(this.T);
      this.a(this.U);
   }

   private void a(esl $$0) {
      $$0.j = false;
   }

   private void b(esl $$0) {
      $$0.j = true;
   }

   private void H() {
      this.a(this.V);
   }

   public void a(emy $$0) {
      emy $$1 = this.L.i.get(this.L.n);
      $$0.j = $$1.j;
      $$0.k = $$1.k;
      ema $$2 = ema.a();

      try {
         $$2.a(this.L.a, this.L.n, $$0);
         this.L.i.put(this.L.n, $$0);
      } catch (enn var5) {
         z.error("Couldn't save slot settings", var5);
         this.f.a(new eoe(var5, this));
         return;
      }

      this.f.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = ac.b($$1) ? null : $$1;
      ema $$3 = ema.a();

      try {
         $$3.b(this.L.a, $$0, $$2);
         this.L.a($$0);
         this.L.b($$2);
      } catch (enn var6) {
         z.error("Couldn't save settings", var6);
         this.f.a(new eoe(var6, this));
         return;
      }

      this.f.a(this);
   }

   public void a(boolean $$0, eyf $$1) {
      this.f.a(new eoh($$1, new epr(this.L, this, this.K, $$0, this.f)));
   }

   public void a(eyf $$0) {
      this.f.a(new eoh($$0, new epm(this.L, this)));
   }

   public void e() {
      this.W = true;
   }

   private void a(@Nullable eni $$0) {
      if ($$0 != null && eni.a.b == $$0.i) {
         this.f.a(new eoh(this.K, new epw(this.L.a, $$0, this.f())));
      } else {
         this.f.a(this);
      }
   }

   public eoa f() {
      return new eoa(this.K, this.M);
   }
}
