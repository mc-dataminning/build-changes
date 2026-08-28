import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjq extends hhu {
   private static final alz a = alz.b("realm_status/expired");
   private static final alz b = alz.b("realm_status/expires_soon");
   private static final alz c = alz.b("realm_status/open");
   private static final alz C = alz.b("realm_status/closed");
   private static final Logger D = LogUtils.getLogger();
   private static final xv E = xv.c("mco.configure.worlds.title");
   private static final xv F = xv.c("mco.configure.world.title");
   private static final xv G = xv.c("mco.selectServer.expired");
   private static final xv H = xv.c("mco.selectServer.expires.soon");
   private static final xv I = xv.c("mco.selectServer.expires.day");
   private static final xv J = xv.c("mco.selectServer.open");
   private static final xv K = xv.c("mco.selectServer.closed");
   private static final int L = 80;
   private static final int M = 5;
   @Nullable
   private xv N;
   private final fhb O;
   @Nullable
   private fih P;
   private final long Q;
   private int R;
   private int S;
   private fod T;
   private fod U;
   private fod V;
   private fod W;
   private fod X;
   private fod Y;
   private fod Z;
   private boolean aa;
   private final List<fji> ab = Lists.newArrayList();

   public fjq(fhb $$0, long $$1) {
      super(F);
      this.O = $$0;
      this.Q = $$1;
   }

   @Override
   public void aT_() {
      if (this.P == null) {
         this.a(this.Q);
      }

      this.R = this.n / 2 - 187;
      this.S = this.n / 2 + 190;
      this.T = this.c(fod.a(xv.c("mco.configure.world.buttons.players"), $$0x -> this.m.a(new fkb(this, this.P))).a(this.a(0, 3), g(0), 100, 20).a());
      this.U = this.c(fod.a(xv.c("mco.configure.world.buttons.settings"), $$0x -> this.m.a(new fkg(this, this.P.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.V = this.c(
         fod.a(xv.c("mco.configure.world.buttons.subscription"), $$0x -> this.m.a(new fki(this, this.P.g(), this.O))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.ab.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.ab.add(this.a($$0));
      }

      this.Z = this.c(
         fod.a(xv.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.m.a(new fkf(xv.c("mco.template.title.minigame"), this::a, fih.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.W = this.c(
         fod.a(xv.c("mco.configure.world.buttons.options"), $$0x -> this.m.a(new fkh(this, this.P.i.get(this.P.p).d(), this.P.m, this.P.p)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.X = this.c(fod.a(xv.c("mco.configure.world.backup"), $$0x -> this.m.a(new fjn(this, this.P.g(), this.P.p))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.Y = this.c(
         fod.a(xv.c("mco.configure.world.buttons.resetworld"), $$0x -> this.m.a(fkd.a(this, this.P.g(), () -> this.m.execute(() -> this.m.a(this.g())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.c(fod.a(xu.k, $$0x -> this.aP_()).a(this.S - 80 + 8, g(13) - 5, 70, 20).a());
      this.X.j = true;
      if (this.P == null) {
         this.K();
         this.J();
         this.T.j = false;
         this.U.j = false;
         this.V.j = false;
      } else {
         this.E();
         if (this.G()) {
            this.J();
         } else {
            this.K();
         }
      }
   }

   private fji a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      fji $$3 = new fji($$1, $$2, 80, 80, $$0, $$1x -> {
         fji.b $$2x = ((fji)$$1x).a();
         if ($$2x != null) {
            switch ($$2x.c) {
               case a:
                  break;
               case c:
                  this.a(this.P);
                  break;
               case b:
                  if ($$2x.b) {
                     this.F();
                  } else if ($$2x.a) {
                     this.b($$0, this.P);
                  } else {
                     this.a($$0, this.P);
                  }
                  break;
               default:
                  throw new IllegalStateException("Unknown action " + $$2x.c);
            }
         }
      });
      if (this.P != null) {
         $$3.a(this.P);
      }

      return this.c($$3);
   }

   private int b(int $$0) {
      return this.R + $$0 * 95;
   }

   private int a(int $$0, int $$1) {
      return this.n / 2 - ($$1 * 105 - 5) / 2 + $$0 * 105;
   }

   @Override
   public void a(fnq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.N = null;
      $$0.a(this.p, E, this.n / 2, g(4), -1);
      if (this.P == null) {
         $$0.a(this.p, this.l, this.n / 2, 17, -1);
      } else {
         String $$4 = this.P.b();
         int $$5 = this.p.b($$4);
         int $$6 = this.P.e == fih.c.a ? -6250336 : 8388479;
         int $$7 = this.p.a(this.l);
         $$0.a(this.p, this.l, this.n / 2, 12, -1);
         $$0.a(this.p, $$4, this.n / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.n / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.b($$0, $$8, 7, $$1, $$2);
         if (this.G()) {
            String $$9 = this.P.c();
            if ($$9 != null) {
               $$0.a(this.p, xv.a("mco.configure.world.minigame", $$9), this.R + 80 + 20 + 10, g(13), -1, false);
            }
         }
      }
   }

   private int h(int $$0) {
      return this.R + ($$0 - 1) * 98;
   }

   @Override
   public void aP_() {
      this.m.a(this.O);
      if (this.aa) {
         this.O.h();
      }
   }

   @Override
   public void a(long $$0) {
      new Thread(() -> {
         fhg $$1 = fhg.a();

         try {
            fih $$2 = $$1.a($$0);
            this.m.execute(() -> {
               this.P = $$2;
               this.E();
               if (this.G()) {
                  this.b(this.Z);
               } else {
                  this.b(this.W);
                  this.b(this.X);
                  this.b(this.Y);
               }

               for (fji $$1x : this.ab) {
                  $$1x.a($$2);
               }
            });
         } catch (fjc var5) {
            D.error("Couldn't get own world", var5);
            this.m.execute(() -> this.m.a(new fju(var5, this.O)));
         }
      }).start();
   }

   private void E() {
      this.T.j = !this.P.j;
      this.U.j = !this.P.j;
      this.V.j = true;
      this.Z.j = !this.P.j;
      this.W.j = !this.P.j;
      this.Y.j = !this.P.j;
   }

   private void a(fih $$0) {
      if (this.P.e == fih.c.b) {
         fhb.a($$0, this);
      } else {
         this.b(true);
      }
   }

   private void F() {
      fkf $$0 = new fkf(xv.c("mco.template.title.minigame"), this::a, fih.d.b);
      $$0.a(xv.c("mco.minigame.world.info.line1"), xv.c("mco.minigame.world.info.line2"));
      this.m.a($$0);
   }

   private void a(int $$0, fih $$1) {
      this.m.a(fkc.a(this, xv.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         this.m.a(new fjw(this.O, new flk($$1.a, $$0, () -> this.m.execute(() -> this.m.a(this.g())))));
      }));
   }

   private void b(int $$0, fih $$1) {
      this.m.a(fkc.a(this, xv.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         fkd $$3 = fkd.a(this, $$0, $$1, () -> this.m.execute(() -> this.m.a(this.g())));
         this.m.a($$3);
      }));
   }

   private void b(fnq $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.P.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> G);
      } else if (this.P.e == fih.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, C, () -> K);
      } else if (this.P.e == fih.c.b) {
         if (this.P.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.P.l <= 0) {
                  return H;
               } else {
                  return (xv)(this.P.l == 1 ? I : xv.a("mco.selectServer.expires.days", this.P.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> J);
         }
      }
   }

   private void a(fnq $$0, int $$1, int $$2, int $$3, int $$4, alz $$5, Supplier<xv> $$6) {
      $$0.a(glt::B, $$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.d($$6.get());
      }
   }

   private boolean G() {
      return this.P != null && this.P.i();
   }

   private void J() {
      this.a(this.W);
      this.a(this.X);
      this.a(this.Y);
   }

   private void a(fod $$0) {
      $$0.k = false;
   }

   private void b(fod $$0) {
      $$0.k = true;
   }

   private void K() {
      this.a(this.Z);
   }

   public void a(fin $$0) {
      fin $$1 = this.P.i.get(this.P.p);
      $$0.k = $$1.k;
      $$0.l = $$1.l;
      fhg $$2 = fhg.a();

      try {
         $$2.a(this.P.a, this.P.p, $$0);
         this.P.i.put(this.P.p, $$0);
         if ($$1.g != $$0.g || $$1.h != $$0.h) {
            fhb.g();
         }
      } catch (fjc var5) {
         D.error("Couldn't save slot settings", var5);
         this.m.a(new fju(var5, this));
         return;
      }

      this.m.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = bbb.h($$1) ? null : $$1;
      fhg $$3 = fhg.a();

      try {
         $$3.b(this.P.a, $$0, $$2);
         this.P.a($$0);
         this.P.b($$2);
         this.f();
      } catch (fjc var6) {
         D.error("Couldn't save settings", var6);
         this.m.a(new fju(var6, this));
         return;
      }

      this.m.a(this);
   }

   public void b(boolean $$0) {
      fjq $$1 = this.g();
      this.m.a(new fjw($$1, new fle(this.P, $$1, $$0, this.m)));
   }

   public void b() {
      fjq $$0 = this.g();
      this.m.a(new fjw($$0, new fkz(this.P, $$0)));
   }

   public void f() {
      this.aa = true;
   }

   private void a(@Nullable fix $$0) {
      if ($$0 != null && fix.a.b == $$0.i) {
         this.f();
         this.m.a(new fjw(this.O, new flj(this.P.a, $$0, this.g())));
      } else {
         this.m.a(this);
      }
   }

   public fjq g() {
      fjq $$0 = new fjq(this.O, this.Q);
      $$0.aa = this.aa;
      return $$0;
   }
}
