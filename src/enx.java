import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class enx extends gei {
   private static final aer a = new aer("realm_status/expired");
   private static final aer b = new aer("realm_status/expires_soon");
   private static final aer c = new aer("realm_status/open");
   private static final aer y = new aer("realm_status/closed");
   private static final Logger z = LogUtils.getLogger();
   private static final tf A = tf.c("mco.configure.worlds.title");
   private static final tf B = tf.c("mco.configure.world.title");
   private static final tf C = tf.c("mco.selectServer.expired");
   private static final tf D = tf.c("mco.selectServer.expires.soon");
   private static final tf E = tf.c("mco.selectServer.expires.day");
   private static final tf F = tf.c("mco.selectServer.open");
   private static final tf G = tf.c("mco.selectServer.closed");
   private static final int H = 80;
   private static final int I = 5;
   @Nullable
   private tf J;
   private final elr K;
   @Nullable
   private emn L;
   private final long M;
   private int N;
   private int O;
   private esh P;
   private esh Q;
   private esh R;
   private esh S;
   private esh T;
   private esh U;
   private esh V;
   private boolean W;
   private int X;
   private final List<enq> Y = Lists.newArrayList();

   public enx(elr $$0, long $$1) {
      super(B);
      this.K = $$0;
      this.M = $$1;
   }

   @Override
   public void aE_() {
      if (this.L == null) {
         this.a(this.M);
      }

      this.N = this.g / 2 - 187;
      this.O = this.g / 2 + 190;
      this.P = this.d(esh.a(tf.c("mco.configure.world.buttons.players"), $$0x -> this.f.a(new eoi(this, this.L))).a(this.a(0, 3), h(0), 100, 20).a());
      this.Q = this.d(esh.a(tf.c("mco.configure.world.buttons.settings"), $$0x -> this.f.a(new eoo(this, this.L.d()))).a(this.a(1, 3), h(0), 100, 20).a());
      this.R = this.d(
         esh.a(tf.c("mco.configure.world.buttons.subscription"), $$0x -> this.f.a(new eoq(this, this.L.d(), this.K))).a(this.a(2, 3), h(0), 100, 20).a()
      );
      this.Y.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.Y.add(this.a($$0));
      }

      this.V = this.d(
         esh.a(tf.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.f.a(new eon(tf.c("mco.template.title.minigame"), this::a, emn.c.b)))
            .a(this.b(0), h(13) - 5, 100, 20)
            .a()
      );
      this.S = this.d(
         esh.a(tf.c("mco.configure.world.buttons.options"), $$0x -> this.f.a(new eop(this, this.L.i.get(this.L.n).d(), this.L.m, this.L.n)))
            .a(this.b(0), h(13) - 5, 90, 20)
            .a()
      );
      this.T = this.d(esh.a(tf.c("mco.configure.world.backup"), $$0x -> this.f.a(new enu(this, this.L.d(), this.L.n))).a(this.b(1), h(13) - 5, 90, 20).a());
      this.U = this.d(
         esh.a(
               tf.c("mco.configure.world.buttons.resetworld"),
               $$0x -> this.f.a(new eol(this, this.L.d(), () -> this.f.execute(() -> this.f.a(this.f())), () -> this.f.a(this.f())))
            )
            .a(this.b(2), h(13) - 5, 90, 20)
            .a()
      );
      this.d(esh.a(te.k, $$0x -> this.B()).a(this.O - 80 + 8, h(13) - 5, 70, 20).a());
      this.T.i = true;
      if (this.L == null) {
         this.G();
         this.F();
         this.P.i = false;
         this.Q.i = false;
         this.R.i = false;
      } else {
         this.C();
         if (this.E()) {
            this.F();
         } else {
            this.G();
         }
      }
   }

   private enq a(int $$0) {
      int $$1 = this.c($$0);
      int $$2 = h(5) + 5;
      enq $$3 = new enq($$1, $$2, 80, 80, () -> this.L, $$0x -> this.J = $$0x, $$0, $$1x -> {
         enq.b $$2x = ((enq)$$1x).a();
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

      this.Y.forEach(enq::b);
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.J = null;
      $$0.a(this.i, A, this.g / 2, h(4), -1);
      if (this.L == null) {
         $$0.a(this.i, this.e, this.g / 2, 17, -1);
      } else {
         String $$4 = this.L.b();
         int $$5 = this.i.b($$4);
         int $$6 = this.L.e == emn.b.a ? -6250336 : 8388479;
         int $$7 = this.i.a(this.e);
         $$0.a(this.i, this.e, this.g / 2, 12, -1);
         $$0.a(this.i, $$4, this.g / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.g / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.a($$0, $$8, 7, $$1, $$2);
         if (this.E()) {
            $$0.a(this.i, tf.a("mco.configure.world.minigame", this.L.c()), this.N + 80 + 20 + 10, h(13), -1, false);
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
         this.B();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void B() {
      if (this.W) {
         this.K.d();
      }

      this.f.a(this.K);
   }

   private void a(long $$0) {
      new Thread(() -> {
         elw $$1 = elw.a();

         try {
            emn $$2 = $$1.a($$0);
            this.f.execute(() -> {
               this.L = $$2;
               this.C();
               if (this.E()) {
                  this.b(this.V);
               } else {
                  this.b(this.S);
                  this.b(this.T);
                  this.b(this.U);
               }
            });
         } catch (enj var5) {
            z.error("Couldn't get own world", var5);
            this.f.execute(() -> this.f.a(new eob(var5, this.K)));
         }
      }).start();
   }

   private void C() {
      this.P.i = !this.L.j;
      this.Q.i = !this.L.j;
      this.R.i = true;
      this.V.i = !this.L.j;
      this.S.i = !this.L.j;
      this.U.i = !this.L.j;
   }

   private void a(emn $$0) {
      if (this.L.e == emn.b.b) {
         this.K.a($$0, new enx(this.K.f(), this.M));
      } else {
         this.a(true, new enx(this.K.f(), this.M));
      }
   }

   private void D() {
      eon $$0 = new eon(tf.c("mco.template.title.minigame"), this::a, emn.c.b);
      $$0.a(tf.c("mco.minigame.world.info.line1"), tf.c("mco.minigame.world.info.line2"));
      this.f.a($$0);
   }

   private void a(int $$0, emn $$1) {
      tf $$2 = tf.c("mco.configure.world.slot.switch.question.line1");
      tf $$3 = tf.c("mco.configure.world.slot.switch.question.line2");
      this.f.a(new eod($$2x -> {
         if ($$2x) {
            this.f.a(new eoe(this.K, new ept($$1.a, $$0, () -> this.f.execute(() -> this.f.a(this.f())))));
         } else {
            this.f.a(this);
         }
      }, eod.a.b, $$2, $$3, true));
   }

   private void b(int $$0, emn $$1) {
      tf $$2 = tf.c("mco.configure.world.slot.switch.question.line1");
      tf $$3 = tf.c("mco.configure.world.slot.switch.question.line2");
      this.f
         .a(
            new eod(
               $$2x -> {
                  if ($$2x) {
                     eol $$3x = new eol(
                        this,
                        $$1,
                        tf.c("mco.configure.world.switch.slot"),
                        tf.c("mco.configure.world.switch.slot.subtitle"),
                        -6250336,
                        te.e,
                        () -> this.f.execute(() -> this.f.a(this.f())),
                        () -> this.f.a(this.f())
                     );
                     $$3x.a($$0);
                     $$3x.a(tf.c("mco.create.world.reset.title"));
                     this.f.a($$3x);
                  } else {
                     this.f.a(this);
                  }
               },
               eod.a.b,
               $$2,
               $$3,
               true
            )
         );
   }

   private void a(erw $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.L.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> C);
      } else if (this.L.e == emn.b.a) {
         this.a($$0, $$1, $$2, $$3, $$4, y, () -> G);
      } else if (this.L.e == emn.b.b) {
         if (this.L.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.L.l <= 0) {
                  return D;
               } else {
                  return (tf)(this.L.l == 1 ? E : tf.a("mco.selectServer.expires.days", this.L.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> F);
         }
      }
   }

   private void a(erw $$0, int $$1, int $$2, int $$3, int $$4, aer $$5, Supplier<tf> $$6) {
      $$0.a($$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.J = $$6.get();
      }
   }

   private boolean E() {
      return this.L != null && this.L.m == emn.c.b;
   }

   private void F() {
      this.a(this.S);
      this.a(this.T);
      this.a(this.U);
   }

   private void a(esh $$0) {
      $$0.j = false;
   }

   private void b(esh $$0) {
      $$0.j = true;
   }

   private void G() {
      this.a(this.V);
   }

   public void a(emu $$0) {
      emu $$1 = this.L.i.get(this.L.n);
      $$0.j = $$1.j;
      $$0.k = $$1.k;
      elw $$2 = elw.a();

      try {
         $$2.a(this.L.a, this.L.n, $$0);
         this.L.i.put(this.L.n, $$0);
      } catch (enj var5) {
         z.error("Couldn't save slot settings", var5);
         this.f.a(new eob(var5, this));
         return;
      }

      this.f.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = ac.b($$1) ? null : $$1;
      elw $$3 = elw.a();

      try {
         $$3.b(this.L.a, $$0, $$2);
         this.L.a($$0);
         this.L.b($$2);
      } catch (enj var6) {
         z.error("Couldn't save settings", var6);
         this.f.a(new eob(var6, this));
         return;
      }

      this.f.a(this);
   }

   public void a(boolean $$0, exz $$1) {
      this.f.a(new eoe($$1, new epn(this.L, this, this.K, $$0, this.f)));
   }

   public void a(exz $$0) {
      this.f.a(new eoe($$0, new epi(this.L, this)));
   }

   public void d() {
      this.W = true;
   }

   private void a(@Nullable ene $$0) {
      if ($$0 != null && ene.a.b == $$0.i) {
         this.f.a(new eoe(this.K, new eps(this.L.a, $$0, this.f())));
      } else {
         this.f.a(this);
      }
   }

   public enx f() {
      return new enx(this.K, this.M);
   }
}
