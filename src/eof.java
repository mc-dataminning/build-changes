import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eof extends gfb {
   private static final aex a = new aex("realm_status/expired");
   private static final aex b = new aex("realm_status/expires_soon");
   private static final aex c = new aex("realm_status/open");
   private static final aex y = new aex("realm_status/closed");
   private static final Logger z = LogUtils.getLogger();
   private static final tm A = tm.c("mco.configure.worlds.title");
   private static final tm B = tm.c("mco.configure.world.title");
   private static final tm C = tm.c("mco.selectServer.expired");
   private static final tm D = tm.c("mco.selectServer.expires.soon");
   private static final tm E = tm.c("mco.selectServer.expires.day");
   private static final tm F = tm.c("mco.selectServer.open");
   private static final tm G = tm.c("mco.selectServer.closed");
   private static final int H = 80;
   private static final int I = 5;
   @Nullable
   private tm J;
   private final ema K;
   @Nullable
   private emw L;
   private final long M;
   private int N;
   private int O;
   private esq P;
   private esq Q;
   private esq R;
   private esq S;
   private esq T;
   private esq U;
   private esq V;
   private boolean W;
   private int X;
   private final List<eny> Y = Lists.newArrayList();

   public eof(ema $$0, long $$1) {
      super(B);
      this.K = $$0;
      this.M = $$1;
   }

   @Override
   public void aI_() {
      if (this.L == null) {
         this.a(this.M);
      }

      this.N = this.g / 2 - 187;
      this.O = this.g / 2 + 190;
      this.P = this.d(esq.a(tm.c("mco.configure.world.buttons.players"), $$0x -> this.f.a(new eor(this, this.L))).a(this.a(0, 3), h(0), 100, 20).a());
      this.Q = this.d(esq.a(tm.c("mco.configure.world.buttons.settings"), $$0x -> this.f.a(new eox(this, this.L.d()))).a(this.a(1, 3), h(0), 100, 20).a());
      this.R = this.d(
         esq.a(tm.c("mco.configure.world.buttons.subscription"), $$0x -> this.f.a(new eoz(this, this.L.d(), this.K))).a(this.a(2, 3), h(0), 100, 20).a()
      );
      this.Y.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.Y.add(this.a($$0));
      }

      this.V = this.d(
         esq.a(tm.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.f.a(new eow(tm.c("mco.template.title.minigame"), this::a, emw.c.b)))
            .a(this.b(0), h(13) - 5, 100, 20)
            .a()
      );
      this.S = this.d(
         esq.a(tm.c("mco.configure.world.buttons.options"), $$0x -> this.f.a(new eoy(this, this.L.i.get(this.L.n).d(), this.L.m, this.L.n)))
            .a(this.b(0), h(13) - 5, 90, 20)
            .a()
      );
      this.T = this.d(esq.a(tm.c("mco.configure.world.backup"), $$0x -> this.f.a(new eoc(this, this.L.d(), this.L.n))).a(this.b(1), h(13) - 5, 90, 20).a());
      this.U = this.d(
         esq.a(tm.c("mco.configure.world.buttons.resetworld"), $$0x -> this.f.a(eou.b(this, this.L.d(), () -> this.f.execute(() -> this.f.a(this.f())))))
            .a(this.b(2), h(13) - 5, 90, 20)
            .a()
      );
      this.d(esq.a(tl.k, $$0x -> this.D()).a(this.O - 80 + 8, h(13) - 5, 70, 20).a());
      this.T.i = true;
      if (this.L == null) {
         this.I();
         this.H();
         this.P.i = false;
         this.Q.i = false;
         this.R.i = false;
      } else {
         this.E();
         if (this.G()) {
            this.H();
         } else {
            this.I();
         }
      }
   }

   private eny a(int $$0) {
      int $$1 = this.c($$0);
      int $$2 = h(5) + 5;
      eny $$3 = new eny($$1, $$2, 80, 80, () -> this.L, $$0x -> this.J = $$0x, $$0, $$1x -> {
         eny.b $$2x = ((eny)$$1x).a();
         if ($$2x != null) {
            switch ($$2x.c) {
               case a:
                  break;
               case c:
                  this.a(this.L);
                  break;
               case b:
                  if ($$2x.b) {
                     this.F();
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

      this.Y.forEach(eny::b);
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.J = null;
      $$0.a(this.i, A, this.g / 2, h(4), -1);
      if (this.L == null) {
         $$0.a(this.i, this.e, this.g / 2, 17, -1);
      } else {
         String $$4 = this.L.b();
         int $$5 = this.i.b($$4);
         int $$6 = this.L.e == emw.b.a ? -6250336 : 8388479;
         int $$7 = this.i.a(this.e);
         $$0.a(this.i, this.e, this.g / 2, 12, -1);
         $$0.a(this.i, $$4, this.g / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.g / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.a($$0, $$8, 7, $$1, $$2);
         if (this.G()) {
            $$0.a(this.i, tm.a("mco.configure.world.minigame", this.L.c()), this.N + 80 + 20 + 10, h(13), -1, false);
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
         this.D();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void D() {
      if (this.W) {
         this.K.f();
      }

      this.f.a(this.K);
   }

   private void a(long $$0) {
      new Thread(() -> {
         emf $$1 = emf.a();

         try {
            emw $$2 = $$1.a($$0);
            this.f.execute(() -> {
               this.L = $$2;
               this.E();
               if (this.G()) {
                  this.b(this.V);
               } else {
                  this.b(this.S);
                  this.b(this.T);
                  this.b(this.U);
               }
            });
         } catch (ens var5) {
            z.error("Couldn't get own world", var5);
            this.f.execute(() -> this.f.a(new eoj(var5, this.K)));
         }
      }).start();
   }

   private void E() {
      this.P.i = !this.L.j;
      this.Q.i = !this.L.j;
      this.R.i = true;
      this.V.i = !this.L.j;
      this.S.i = !this.L.j;
      this.U.i = !this.L.j;
   }

   private void a(emw $$0) {
      if (this.L.e == emw.b.b) {
         this.K.a($$0, new eof(this.K.h(), this.M));
      } else {
         this.a(true, new eof(this.K.h(), this.M));
      }
   }

   private void F() {
      eow $$0 = new eow(tm.c("mco.template.title.minigame"), this::a, emw.c.b);
      $$0.a(tm.c("mco.minigame.world.info.line1"), tm.c("mco.minigame.world.info.line2"));
      this.f.a($$0);
   }

   private void a(int $$0, emw $$1) {
      tm $$2 = tm.c("mco.configure.world.slot.switch.question.line1");
      tm $$3 = tm.c("mco.configure.world.slot.switch.question.line2");
      this.f.a(new eol($$2x -> {
         if ($$2x) {
            this.f.a(new eom(this.K, new eqc($$1.a, $$0, () -> this.f.execute(() -> this.f.a(this.f())))));
         } else {
            this.f.a(this);
         }
      }, eol.a.b, $$2, $$3, true));
   }

   private void b(int $$0, emw $$1) {
      tm $$2 = tm.c("mco.configure.world.slot.switch.question.line1");
      tm $$3 = tm.c("mco.configure.world.slot.switch.question.line2");
      this.f.a(new eol($$2x -> {
         if ($$2x) {
            eou $$3x = eou.a(this, $$0, $$1, () -> this.f.execute(() -> this.f.a(this.f())));
            this.f.a($$3x);
         } else {
            this.f.a(this);
         }
      }, eol.a.b, $$2, $$3, true));
   }

   private void a(esf $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.L.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> C);
      } else if (this.L.e == emw.b.a) {
         this.a($$0, $$1, $$2, $$3, $$4, y, () -> G);
      } else if (this.L.e == emw.b.b) {
         if (this.L.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.L.l <= 0) {
                  return D;
               } else {
                  return (tm)(this.L.l == 1 ? E : tm.a("mco.selectServer.expires.days", this.L.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> F);
         }
      }
   }

   private void a(esf $$0, int $$1, int $$2, int $$3, int $$4, aex $$5, Supplier<tm> $$6) {
      $$0.a($$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.J = $$6.get();
      }
   }

   private boolean G() {
      return this.L != null && this.L.m == emw.c.b;
   }

   private void H() {
      this.a(this.S);
      this.a(this.T);
      this.a(this.U);
   }

   private void a(esq $$0) {
      $$0.j = false;
   }

   private void b(esq $$0) {
      $$0.j = true;
   }

   private void I() {
      this.a(this.V);
   }

   public void a(end $$0) {
      end $$1 = this.L.i.get(this.L.n);
      $$0.j = $$1.j;
      $$0.k = $$1.k;
      emf $$2 = emf.a();

      try {
         $$2.a(this.L.a, this.L.n, $$0);
         this.L.i.put(this.L.n, $$0);
      } catch (ens var5) {
         z.error("Couldn't save slot settings", var5);
         this.f.a(new eoj(var5, this));
         return;
      }

      this.f.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = ac.b($$1) ? null : $$1;
      emf $$3 = emf.a();

      try {
         $$3.b(this.L.a, $$0, $$2);
         this.L.a($$0);
         this.L.b($$2);
      } catch (ens var6) {
         z.error("Couldn't save settings", var6);
         this.f.a(new eoj(var6, this));
         return;
      }

      this.f.a(this);
   }

   public void a(boolean $$0, eyk $$1) {
      this.f.a(new eom($$1, new epw(this.L, this, this.K, $$0, this.f)));
   }

   public void a(eyk $$0) {
      this.f.a(new eom($$0, new epr(this.L, this)));
   }

   public void e() {
      this.W = true;
   }

   private void a(@Nullable enn $$0) {
      if ($$0 != null && enn.a.b == $$0.i) {
         this.f.a(new eom(this.K, new eqb(this.L.a, $$0, this.f())));
      } else {
         this.f.a(this);
      }
   }

   public eof f() {
      return new eof(this.K, this.M);
   }
}
