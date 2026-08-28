import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class foa extends hrc {
   private static final alr a = alr.b("realm_status/expired");
   private static final alr b = alr.b("realm_status/expires_soon");
   private static final alr c = alr.b("realm_status/open");
   private static final alr C = alr.b("realm_status/closed");
   private static final Logger D = LogUtils.getLogger();
   private static final xg E = xg.c("mco.configure.worlds.title");
   private static final xg F = xg.c("mco.configure.world.title");
   private static final xg G = xg.c("mco.selectServer.expired");
   private static final xg H = xg.c("mco.selectServer.expires.soon");
   private static final xg I = xg.c("mco.selectServer.expires.day");
   private static final xg J = xg.c("mco.selectServer.open");
   private static final xg K = xg.c("mco.selectServer.closed");
   private static final int L = 80;
   private static final int M = 5;
   @Nullable
   private xg N;
   private final fll O;
   @Nullable
   private fmr P;
   private final long Q;
   private int R;
   private int S;
   private fty T;
   private fty U;
   private fty V;
   private fty W;
   private fty X;
   private fty Y;
   private fty Z;
   private boolean aa;
   private final List<fns> ab = Lists.newArrayList();

   public foa(fll $$0, long $$1) {
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
      this.T = this.c(fty.a(xg.c("mco.configure.world.buttons.players"), $$0x -> this.m.a(new fol(this, this.P))).a(this.a(0, 3), g(0), 100, 20).a());
      this.U = this.c(fty.a(xg.c("mco.configure.world.buttons.settings"), $$0x -> this.m.a(new foq(this, this.P.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.V = this.c(
         fty.a(xg.c("mco.configure.world.buttons.subscription"), $$0x -> this.m.a(new fot(this, this.P.g(), this.O))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.ab.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.ab.add(this.a($$0));
      }

      this.Z = this.c(
         fty.a(xg.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.m.a(new fop(xg.c("mco.template.title.minigame"), this::a, fmr.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.W = this.c(
         fty.a(xg.c("mco.configure.world.buttons.options"), $$0x -> this.m.a(new fos(this, this.P.i.get(this.P.p).d(), this.P.m, this.P.p)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.X = this.c(fty.a(xg.c("mco.configure.world.backup"), $$0x -> this.m.a(new fnx(this, this.P.g(), this.P.p))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.Y = this.c(
         fty.a(xg.c("mco.configure.world.buttons.resetworld"), $$0x -> this.m.a(fon.a(this, this.P.g(), () -> this.m.execute(() -> this.m.a(this.g())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.c(fty.a(xf.k, $$0x -> this.aQ_()).a(this.S - 80 + 8, g(13) - 5, 70, 20).a());
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

   private fns a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      fns $$3 = new fns($$1, $$2, 80, 80, $$0, $$1x -> {
         fns.b $$2x = ((fns)$$1x).a();
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
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.N = null;
      $$0.a(this.p, E, this.n / 2, g(4), -1);
      if (this.P == null) {
         $$0.a(this.p, this.l, this.n / 2, 17, -1);
      } else {
         String $$4 = Objects.requireNonNullElse(this.P.b(), "");
         int $$5 = this.p.b($$4);
         int $$6 = this.P.e == fmr.c.a ? -6250336 : 8388479;
         int $$7 = this.p.a(this.l);
         $$0.a(this.p, this.l, this.n / 2, 12, -1);
         $$0.a(this.p, $$4, this.n / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.n / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.b($$0, $$8, 7, $$1, $$2);
         if (this.G()) {
            String $$9 = this.P.c();
            if ($$9 != null) {
               $$0.b(this.p, xg.a("mco.configure.world.minigame", $$9), this.R + 80 + 20 + 10, g(13), -1);
            }
         }
      }
   }

   private int h(int $$0) {
      return this.R + ($$0 - 1) * 98;
   }

   @Override
   public void aQ_() {
      this.m.a(this.O);
      if (this.aa) {
         this.O.h();
      }
   }

   @Override
   public void a(long $$0) {
      new Thread(() -> {
         flq $$1 = flq.a();

         try {
            fmr $$2 = $$1.a($$0);
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

               for (fns $$1x : this.ab) {
                  $$1x.a($$2);
               }
            });
         } catch (fnm var5) {
            D.error("Couldn't get own world", var5);
            this.m.execute(() -> this.m.a(new foe(var5, this.O)));
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

   private void a(fmr $$0) {
      if (this.P.e == fmr.c.b) {
         fll.a($$0, this);
      } else {
         this.b(true);
      }
   }

   private void F() {
      fop $$0 = new fop(xg.c("mco.template.title.minigame"), this::a, fmr.d.b);
      $$0.a(xg.c("mco.minigame.world.info.line1"), xg.c("mco.minigame.world.info.line2"));
      this.m.a($$0);
   }

   private void a(int $$0, fmr $$1) {
      this.m.a(fom.a(this, xg.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         this.m.a(new fog(this.O, new fpv($$1.a, $$0, () -> this.m.execute(() -> this.m.a(this.g())))));
      }));
   }

   private void b(int $$0, fmr $$1) {
      this.m.a(fom.a(this, xg.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         fon $$3 = fon.a(this, $$0, $$1, () -> this.m.execute(() -> this.m.a(this.g())));
         this.m.a($$3);
      }));
   }

   private void b(ftk $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.P.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> G);
      } else if (this.P.e == fmr.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, C, () -> K);
      } else if (this.P.e == fmr.c.b) {
         if (this.P.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.P.l <= 0) {
                  return H;
               } else {
                  return (xg)(this.P.l == 1 ? I : xg.a("mco.selectServer.expires.days", this.P.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> J);
         }
      }
   }

   private void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, alr $$5, Supplier<xg> $$6) {
      $$0.a(gry::H, $$5, $$1, $$2, 10, 28);
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

   private void a(fty $$0) {
      $$0.k = false;
   }

   private void b(fty $$0) {
      $$0.k = true;
   }

   private void I() {
      this.a(this.Z);
   }

   public void a(fmx $$0) {
      fmx $$1 = this.P.i.get(this.P.p);
      $$0.k = $$1.k;
      $$0.l = $$1.l;
      flq $$2 = flq.a();

      try {
         $$2.a(this.P.a, this.P.p, $$0);
         this.P.i.put(this.P.p, $$0);
         if ($$1.g != $$0.g || $$1.h != $$0.h) {
            fll.g();
         }
      } catch (fnm var5) {
         D.error("Couldn't save slot settings", var5);
         this.m.a(new foe(var5, this));
         return;
      }

      this.m.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = bay.h($$1) ? "" : $$1;
      flq $$3 = flq.a();

      try {
         $$3.b(this.P.a, $$0, $$2);
         this.P.a($$0);
         this.P.b($$2);
         this.f();
      } catch (fnm var6) {
         D.error("Couldn't save settings", var6);
         this.m.a(new foe(var6, this));
         return;
      }

      this.m.a(this);
   }

   public void b(boolean $$0) {
      foa $$1 = this.g();
      this.m.a(new fog($$1, new fpp(this.P, $$1, $$0, this.m)));
   }

   public void b() {
      foa $$0 = this.g();
      this.m.a(new fog($$0, new fpk(this.P, $$0)));
   }

   public void f() {
      this.aa = true;
   }

   private void a(@Nullable fnh $$0) {
      if ($$0 != null && fnh.a.b == $$0.i) {
         this.f();
         this.m.a(new fog(this.O, new fpu(this.P.a, $$0, this.g())));
      } else {
         this.m.a(this);
      }
   }

   public foa g() {
      foa $$0 = new foa(this.O, this.Q);
      $$0.aa = this.aa;
      return $$0;
   }
}
