import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fko extends hne {
   private static final ald a = ald.b("realm_status/expired");
   private static final ald b = ald.b("realm_status/expires_soon");
   private static final ald c = ald.b("realm_status/open");
   private static final ald C = ald.b("realm_status/closed");
   private static final Logger D = LogUtils.getLogger();
   private static final wv E = wv.c("mco.configure.worlds.title");
   private static final wv F = wv.c("mco.configure.world.title");
   private static final wv G = wv.c("mco.selectServer.expired");
   private static final wv H = wv.c("mco.selectServer.expires.soon");
   private static final wv I = wv.c("mco.selectServer.expires.day");
   private static final wv J = wv.c("mco.selectServer.open");
   private static final wv K = wv.c("mco.selectServer.closed");
   private static final int L = 80;
   private static final int M = 5;
   @Nullable
   private wv N;
   private final fhz O;
   @Nullable
   private fjf P;
   private final long Q;
   private int R;
   private int S;
   private fqn T;
   private fqn U;
   private fqn V;
   private fqn W;
   private fqn X;
   private fqn Y;
   private fqn Z;
   private boolean aa;
   private final List<fkg> ab = Lists.newArrayList();

   public fko(fhz $$0, long $$1) {
      super(F);
      this.O = $$0;
      this.Q = $$1;
   }

   @Override
   public void aN_() {
      if (this.P == null) {
         this.a(this.Q);
      }

      this.R = this.n / 2 - 187;
      this.S = this.n / 2 + 190;
      this.T = this.c(fqn.a(wv.c("mco.configure.world.buttons.players"), $$0x -> this.m.a(new fkz(this, this.P))).a(this.a(0, 3), g(0), 100, 20).a());
      this.U = this.c(fqn.a(wv.c("mco.configure.world.buttons.settings"), $$0x -> this.m.a(new fle(this, this.P.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.V = this.c(
         fqn.a(wv.c("mco.configure.world.buttons.subscription"), $$0x -> this.m.a(new flg(this, this.P.g(), this.O))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.ab.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.ab.add(this.a($$0));
      }

      this.Z = this.c(
         fqn.a(wv.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.m.a(new fld(wv.c("mco.template.title.minigame"), this::a, fjf.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.W = this.c(
         fqn.a(wv.c("mco.configure.world.buttons.options"), $$0x -> this.m.a(new flf(this, this.P.i.get(this.P.p).d(), this.P.m, this.P.p)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.X = this.c(fqn.a(wv.c("mco.configure.world.backup"), $$0x -> this.m.a(new fkl(this, this.P.g(), this.P.p))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.Y = this.c(
         fqn.a(wv.c("mco.configure.world.buttons.resetworld"), $$0x -> this.m.a(flb.a(this, this.P.g(), () -> this.m.execute(() -> this.m.a(this.g())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.c(fqn.a(wu.k, $$0x -> this.aK_()).a(this.S - 80 + 8, g(13) - 5, 70, 20).a());
      this.X.j = true;
      if (this.P == null) {
         this.I();
         this.H();
         this.T.j = false;
         this.U.j = false;
         this.V.j = false;
      } else {
         this.E();
         if (this.G()) {
            this.H();
         } else {
            this.I();
         }
      }
   }

   private fkg a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      fkg $$3 = new fkg($$1, $$2, 80, 80, $$0, $$1x -> {
         fkg.b $$2x = ((fkg)$$1x).a();
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
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.N = null;
      $$0.a(this.p, E, this.n / 2, g(4), -1);
      if (this.P == null) {
         $$0.a(this.p, this.l, this.n / 2, 17, -1);
      } else {
         String $$4 = Objects.requireNonNullElse(this.P.b(), "");
         int $$5 = this.p.b($$4);
         int $$6 = this.P.e == fjf.c.a ? -6250336 : 8388479;
         int $$7 = this.p.a(this.l);
         $$0.a(this.p, this.l, this.n / 2, 12, -1);
         $$0.a(this.p, $$4, this.n / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.n / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.b($$0, $$8, 7, $$1, $$2);
         if (this.G()) {
            String $$9 = this.P.c();
            if ($$9 != null) {
               $$0.b(this.p, wv.a("mco.configure.world.minigame", $$9), this.R + 80 + 20 + 10, g(13), -1);
            }
         }
      }
   }

   private int h(int $$0) {
      return this.R + ($$0 - 1) * 98;
   }

   @Override
   public void aK_() {
      this.m.a(this.O);
      if (this.aa) {
         this.O.h();
      }
   }

   @Override
   public void a(long $$0) {
      new Thread(() -> {
         fie $$1 = fie.a();

         try {
            fjf $$2 = $$1.a($$0);
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

               for (fkg $$1x : this.ab) {
                  $$1x.a($$2);
               }
            });
         } catch (fka var5) {
            D.error("Couldn't get own world", var5);
            this.m.execute(() -> this.m.a(new fks(var5, this.O)));
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

   private void a(fjf $$0) {
      if (this.P.e == fjf.c.b) {
         fhz.a($$0, this);
      } else {
         this.b(true);
      }
   }

   private void F() {
      fld $$0 = new fld(wv.c("mco.template.title.minigame"), this::a, fjf.d.b);
      $$0.a(wv.c("mco.minigame.world.info.line1"), wv.c("mco.minigame.world.info.line2"));
      this.m.a($$0);
   }

   private void a(int $$0, fjf $$1) {
      this.m.a(fla.a(this, wv.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         this.m.a(new fku(this.O, new fmi($$1.a, $$0, () -> this.m.execute(() -> this.m.a(this.g())))));
      }));
   }

   private void b(int $$0, fjf $$1) {
      this.m.a(fla.a(this, wv.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         flb $$3 = flb.a(this, $$0, $$1, () -> this.m.execute(() -> this.m.a(this.g())));
         this.m.a($$3);
      }));
   }

   private void b(fpz $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.P.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> G);
      } else if (this.P.e == fjf.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, C, () -> K);
      } else if (this.P.e == fjf.c.b) {
         if (this.P.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.P.l <= 0) {
                  return H;
               } else {
                  return (wv)(this.P.l == 1 ? I : wv.a("mco.selectServer.expires.days", this.P.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> J);
         }
      }
   }

   private void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, ald $$5, Supplier<wv> $$6) {
      $$0.a(goi::H, $$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.d($$6.get());
      }
   }

   private boolean G() {
      return this.P != null && this.P.i();
   }

   private void H() {
      this.a(this.W);
      this.a(this.X);
      this.a(this.Y);
   }

   private void a(fqn $$0) {
      $$0.k = false;
   }

   private void b(fqn $$0) {
      $$0.k = true;
   }

   private void I() {
      this.a(this.Z);
   }

   public void a(fjl $$0) {
      fjl $$1 = this.P.i.get(this.P.p);
      $$0.k = $$1.k;
      $$0.l = $$1.l;
      fie $$2 = fie.a();

      try {
         $$2.a(this.P.a, this.P.p, $$0);
         this.P.i.put(this.P.p, $$0);
         if ($$1.g != $$0.g || $$1.h != $$0.h) {
            fhz.g();
         }
      } catch (fka var5) {
         D.error("Couldn't save slot settings", var5);
         this.m.a(new fks(var5, this));
         return;
      }

      this.m.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = bah.h($$1) ? "" : $$1;
      fie $$3 = fie.a();

      try {
         $$3.b(this.P.a, $$0, $$2);
         this.P.a($$0);
         this.P.b($$2);
         this.f();
      } catch (fka var6) {
         D.error("Couldn't save settings", var6);
         this.m.a(new fks(var6, this));
         return;
      }

      this.m.a(this);
   }

   public void b(boolean $$0) {
      fko $$1 = this.g();
      this.m.a(new fku($$1, new fmc(this.P, $$1, $$0, this.m)));
   }

   public void b() {
      fko $$0 = this.g();
      this.m.a(new fku($$0, new flx(this.P, $$0)));
   }

   public void f() {
      this.aa = true;
   }

   private void a(@Nullable fjv $$0) {
      if ($$0 != null && fjv.a.b == $$0.i) {
         this.f();
         this.m.a(new fku(this.O, new fmh(this.P.a, $$0, this.g())));
      } else {
         this.m.a(this);
      }
   }

   public fko g() {
      fko $$0 = new fko(this.O, this.Q);
      $$0.aa = this.aa;
      return $$0;
   }
}
