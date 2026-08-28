import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdd extends gvs {
   private static final akk a = new akk("realm_status/expired");
   private static final akk b = new akk("realm_status/expires_soon");
   private static final akk c = new akk("realm_status/open");
   private static final akk A = new akk("realm_status/closed");
   private static final Logger B = LogUtils.getLogger();
   private static final wu C = wu.c("mco.configure.worlds.title");
   private static final wu D = wu.c("mco.configure.world.title");
   private static final wu E = wu.c("mco.selectServer.expired");
   private static final wu F = wu.c("mco.selectServer.expires.soon");
   private static final wu G = wu.c("mco.selectServer.expires.day");
   private static final wu H = wu.c("mco.selectServer.open");
   private static final wu I = wu.c("mco.selectServer.closed");
   private static final int J = 80;
   private static final int K = 5;
   @Nullable
   private wu L;
   private final fax M;
   @Nullable
   private fbt N;
   private final long O;
   private int P;
   private int Q;
   private fhs R;
   private fhs S;
   private fhs T;
   private fhs U;
   private fhs V;
   private fhs W;
   private fhs X;
   private boolean Y;
   private final List<fcv> Z = Lists.newArrayList();

   public fdd(fax $$0, long $$1) {
      super(D);
      this.M = $$0;
      this.O = $$1;
   }

   @Override
   public void aP_() {
      if (this.N == null) {
         this.a(this.O);
      }

      this.P = this.m / 2 - 187;
      this.Q = this.m / 2 + 190;
      this.R = this.c(fhs.a(wu.c("mco.configure.world.buttons.players"), $$0x -> this.l.a(new fdo(this, this.N))).a(this.a(0, 3), g(0), 100, 20).a());
      this.S = this.c(fhs.a(wu.c("mco.configure.world.buttons.settings"), $$0x -> this.l.a(new fdu(this, this.N.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.T = this.c(
         fhs.a(wu.c("mco.configure.world.buttons.subscription"), $$0x -> this.l.a(new fdw(this, this.N.g(), this.M))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.Z.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.Z.add(this.a($$0));
      }

      this.X = this.c(
         fhs.a(wu.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.l.a(new fdt(wu.c("mco.template.title.minigame"), this::a, fbt.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.U = this.c(
         fhs.a(wu.c("mco.configure.world.buttons.options"), $$0x -> this.l.a(new fdv(this, this.N.i.get(this.N.n).d(), this.N.m, this.N.n)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.V = this.c(fhs.a(wu.c("mco.configure.world.backup"), $$0x -> this.l.a(new fda(this, this.N.g(), this.N.n))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.W = this.c(
         fhs.a(wu.c("mco.configure.world.buttons.resetworld"), $$0x -> this.l.a(fdr.a(this, this.N.g(), () -> this.l.execute(() -> this.l.a(this.g())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.c(fhs.a(wt.k, $$0x -> this.d()).a(this.Q - 80 + 8, g(13) - 5, 70, 20).a());
      this.V.j = true;
      if (this.N == null) {
         this.K();
         this.J();
         this.R.j = false;
         this.S.j = false;
         this.T.j = false;
      } else {
         this.E();
         if (this.G()) {
            this.J();
         } else {
            this.K();
         }
      }
   }

   private fcv a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      fcv $$3 = new fcv($$1, $$2, 80, 80, $$0, $$1x -> {
         fcv.b $$2x = ((fcv)$$1x).a();
         if ($$2x != null) {
            switch ($$2x.c) {
               case a:
                  break;
               case c:
                  this.a(this.N);
                  break;
               case b:
                  if ($$2x.b) {
                     this.F();
                  } else if ($$2x.a) {
                     this.b($$0, this.N);
                  } else {
                     this.a($$0, this.N);
                  }
                  break;
               default:
                  throw new IllegalStateException("Unknown action " + $$2x.c);
            }
         }
      });
      if (this.N != null) {
         $$3.a(this.N);
      }

      return this.c($$3);
   }

   private int b(int $$0) {
      return this.P + $$0 * 95;
   }

   private int a(int $$0, int $$1) {
      return this.m / 2 - ($$1 * 105 - 5) / 2 + $$0 * 105;
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.L = null;
      $$0.a(this.o, C, this.m / 2, g(4), -1);
      if (this.N == null) {
         $$0.a(this.o, this.k, this.m / 2, 17, -1);
      } else {
         String $$4 = this.N.b();
         int $$5 = this.o.b($$4);
         int $$6 = this.N.e == fbt.c.a ? -6250336 : 8388479;
         int $$7 = this.o.a(this.k);
         $$0.a(this.o, this.k, this.m / 2, 12, -1);
         $$0.a(this.o, $$4, this.m / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.m / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.b($$0, $$8, 7, $$1, $$2);
         if (this.G()) {
            String $$9 = this.N.c();
            if ($$9 != null) {
               $$0.a(this.o, wu.a("mco.configure.world.minigame", $$9), this.P + 80 + 20 + 10, g(13), -1, false);
            }
         }
      }
   }

   private int h(int $$0) {
      return this.P + ($$0 - 1) * 98;
   }

   @Override
   public void d() {
      this.l.a(this.M);
      if (this.Y) {
         this.M.h();
      }
   }

   private void a(long $$0) {
      new Thread(() -> {
         fbc $$1 = fbc.a();

         try {
            fbt $$2 = $$1.a($$0);
            this.l.execute(() -> {
               this.N = $$2;
               this.E();
               if (this.G()) {
                  this.b(this.X);
               } else {
                  this.b(this.U);
                  this.b(this.V);
                  this.b(this.W);
               }

               for (fcv $$1x : this.Z) {
                  $$1x.a($$2);
               }
            });
         } catch (fcp var5) {
            B.error("Couldn't get own world", var5);
            this.l.execute(() -> this.l.a(new fdh(var5, this.M)));
         }
      }).start();
   }

   private void E() {
      this.R.j = !this.N.j;
      this.S.j = !this.N.j;
      this.T.j = true;
      this.X.j = !this.N.j;
      this.U.j = !this.N.j;
      this.W.j = !this.N.j;
   }

   private void a(fbt $$0) {
      if (this.N.e == fbt.c.b) {
         fax.a($$0, this);
      } else {
         this.b(true);
      }
   }

   private void F() {
      fdt $$0 = new fdt(wu.c("mco.template.title.minigame"), this::a, fbt.d.b);
      $$0.a(wu.c("mco.minigame.world.info.line1"), wu.c("mco.minigame.world.info.line2"));
      this.l.a($$0);
   }

   private void a(int $$0, fbt $$1) {
      this.l.a(fdp.a(this, wu.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         this.l.a(new fdj(this.M, new ffb($$1.a, $$0, () -> this.l.execute(() -> this.l.a(this.g())))));
      }));
   }

   private void b(int $$0, fbt $$1) {
      this.l.a(fdp.a(this, wu.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         fdr $$3 = fdr.a(this, $$0, $$1, () -> this.l.execute(() -> this.l.a(this.g())));
         this.l.a($$3);
      }));
   }

   private void b(fhf $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.N.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> E);
      } else if (this.N.e == fbt.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, A, () -> I);
      } else if (this.N.e == fbt.c.b) {
         if (this.N.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.N.l <= 0) {
                  return F;
               } else {
                  return (wu)(this.N.l == 1 ? G : wu.a("mco.selectServer.expires.days", this.N.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> H);
         }
      }
   }

   private void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, akk $$5, Supplier<wu> $$6) {
      $$0.a($$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.d($$6.get());
      }
   }

   private boolean G() {
      return this.N != null && this.N.i();
   }

   private void J() {
      this.a(this.U);
      this.a(this.V);
      this.a(this.W);
   }

   private void a(fhs $$0) {
      $$0.k = false;
   }

   private void b(fhs $$0) {
      $$0.k = true;
   }

   private void K() {
      this.a(this.X);
   }

   public void a(fca $$0) {
      fca $$1 = this.N.i.get(this.N.n);
      $$0.l = $$1.l;
      $$0.m = $$1.m;
      fbc $$2 = fbc.a();

      try {
         $$2.a(this.N.a, this.N.n, $$0);
         this.N.i.put(this.N.n, $$0);
      } catch (fcp var5) {
         B.error("Couldn't save slot settings", var5);
         this.l.a(new fdh(var5, this));
         return;
      }

      this.l.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = azd.h($$1) ? null : $$1;
      fbc $$3 = fbc.a();

      try {
         $$3.b(this.N.a, $$0, $$2);
         this.N.a($$0);
         this.N.b($$2);
         this.f();
      } catch (fcp var6) {
         B.error("Couldn't save settings", var6);
         this.l.a(new fdh(var6, this));
         return;
      }

      this.l.a(this);
   }

   public void b(boolean $$0) {
      fdd $$1 = this.g();
      this.l.a(new fdj($$1, new feu(this.N, $$1, $$0, this.l)));
   }

   public void b() {
      fdd $$0 = this.g();
      this.l.a(new fdj($$0, new feo(this.N, $$0)));
   }

   public void f() {
      this.Y = true;
   }

   private void a(@Nullable fck $$0) {
      if ($$0 != null && fck.a.b == $$0.i) {
         this.f();
         this.l.a(new fdj(this.M, new ffa(this.N.a, $$0, this.g())));
      } else {
         this.l.a(this);
      }
   }

   public fdd g() {
      fdd $$0 = new fdd(this.M, this.O);
      $$0.Y = this.Y;
      return $$0;
   }
}
