import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fop extends hro {
   private static final alk a = alk.b("realm_status/expired");
   private static final alk b = alk.b("realm_status/expires_soon");
   private static final alk c = alk.b("realm_status/open");
   private static final alk C = alk.b("realm_status/closed");
   private static final Logger D = LogUtils.getLogger();
   private static final xc E = xc.c("mco.configure.worlds.title");
   private static final xc F = xc.c("mco.configure.world.title");
   private static final xc G = xc.c("mco.selectServer.expired");
   private static final xc H = xc.c("mco.selectServer.expires.soon");
   private static final xc I = xc.c("mco.selectServer.expires.day");
   private static final xc J = xc.c("mco.selectServer.open");
   private static final xc K = xc.c("mco.selectServer.closed");
   private static final int L = 80;
   private static final int M = 5;
   @Nullable
   private xc N;
   private final fma O;
   @Nullable
   private fng P;
   private final long Q;
   private int R;
   private int S;
   private fun T;
   private fun U;
   private fun V;
   private fun W;
   private fun X;
   private fun Y;
   private fun Z;
   private boolean aa;
   private final List<foh> ab = Lists.newArrayList();

   public fop(fma $$0, long $$1) {
      super(F);
      this.O = $$0;
      this.Q = $$1;
   }

   @Override
   public void aS_() {
      if (this.P == null) {
         this.a(this.Q);
      }

      this.R = this.n / 2 - 187;
      this.S = this.n / 2 + 190;
      this.T = this.c(fun.a(xc.c("mco.configure.world.buttons.players"), $$0x -> this.m.a(new fpb(this, this.P))).a(this.a(0, 3), g(0), 100, 20).a());
      this.U = this.c(fun.a(xc.c("mco.configure.world.buttons.settings"), $$0x -> this.m.a(new fpg(this, this.P.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.V = this.c(
         fun.a(xc.c("mco.configure.world.buttons.subscription"), $$0x -> this.m.a(new fpi(this, this.P.g(), this.O))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.ab.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.ab.add(this.a($$0));
      }

      this.Z = this.c(
         fun.a(xc.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.m.a(new fpf(xc.c("mco.template.title.minigame"), this::a, fng.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.W = this.c(
         fun.a(xc.c("mco.configure.world.buttons.options"), $$0x -> this.m.a(new fph(this, this.P.i.get(this.P.p).d(), this.P.m, this.P.p)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.X = this.c(fun.a(xc.c("mco.configure.world.backup"), $$0x -> this.m.a(new fom(this, this.P.g(), this.P.p))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.Y = this.c(
         fun.a(xc.c("mco.configure.world.buttons.resetworld"), $$0x -> this.m.a(fpd.a(this, this.P.g(), () -> this.m.execute(() -> this.m.a(this.g())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.c(fun.a(xb.k, $$0x -> this.aP_()).a(this.S - 80 + 8, g(13) - 5, 70, 20).a());
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

   private foh a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      foh $$3 = new foh($$1, $$2, 80, 80, $$0, $$1x -> {
         foh.b $$2x = ((foh)$$1x).a();
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
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.N = null;
      $$0.a(this.p, E, this.n / 2, g(4), -1);
      if (this.P == null) {
         $$0.a(this.p, this.l, this.n / 2, 17, -1);
      } else {
         String $$4 = Objects.requireNonNullElse(this.P.b(), "");
         int $$5 = this.p.b($$4);
         int $$6 = this.P.e == fng.c.a ? -6250336 : 8388479;
         int $$7 = this.p.a(this.l);
         $$0.a(this.p, this.l, this.n / 2, 12, -1);
         $$0.a(this.p, $$4, this.n / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.n / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.b($$0, $$8, 7, $$1, $$2);
         if (this.G()) {
            String $$9 = this.P.c();
            if ($$9 != null) {
               $$0.b(this.p, xc.a("mco.configure.world.minigame", $$9), this.R + 80 + 20 + 10, g(13), -1);
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
         fmf $$1 = fmf.a();

         try {
            fng $$2 = $$1.a($$0);
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

               for (foh $$1x : this.ab) {
                  $$1x.a($$2);
               }
            });
         } catch (fob var5) {
            D.error("Couldn't get own world", var5);
            this.m.execute(() -> this.m.a(new fou(var5, this.O)));
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

   private void a(fng $$0) {
      if (this.P.e == fng.c.b) {
         fma.a($$0, this);
      } else {
         this.b(true);
      }
   }

   private void F() {
      fpf $$0 = new fpf(xc.c("mco.template.title.minigame"), this::a, fng.d.b);
      $$0.a(xc.c("mco.minigame.world.info.line1"), xc.c("mco.minigame.world.info.line2"));
      this.m.a($$0);
   }

   private void a(int $$0, fng $$1) {
      this.m.a(fpc.a(this, xc.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         this.m.a(new fow(this.O, new fqk($$1.a, $$0, () -> this.m.execute(() -> this.m.a(this.g())))));
      }));
   }

   private void b(int $$0, fng $$1) {
      this.m.a(fpc.a(this, xc.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         fpd $$3 = fpd.a(this, $$0, $$1, () -> this.m.execute(() -> this.m.a(this.g())));
         this.m.a($$3);
      }));
   }

   private void b(ftz $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.P.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> G);
      } else if (this.P.e == fng.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, C, () -> K);
      } else if (this.P.e == fng.c.b) {
         if (this.P.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.P.l <= 0) {
                  return H;
               } else {
                  return (xc)(this.P.l == 1 ? I : xc.a("mco.selectServer.expires.days", this.P.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> J);
         }
      }
   }

   private void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, alk $$5, Supplier<xc> $$6) {
      $$0.a(gsn::H, $$5, $$1, $$2, 10, 28);
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

   private void a(fun $$0) {
      $$0.k = false;
   }

   private void b(fun $$0) {
      $$0.k = true;
   }

   private void I() {
      this.a(this.Z);
   }

   public void a(fnm $$0) {
      fnm $$1 = this.P.i.get(this.P.p);
      $$0.k = $$1.k;
      $$0.l = $$1.l;
      fmf $$2 = fmf.a();

      try {
         $$2.a(this.P.a, this.P.p, $$0);
         this.P.i.put(this.P.p, $$0);
         if ($$1.g != $$0.g || $$1.h != $$0.h) {
            fma.g();
         }
      } catch (fob var5) {
         D.error("Couldn't save slot settings", var5);
         this.m.a(new fou(var5, this));
         return;
      }

      this.m.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = bap.h($$1) ? "" : $$1;
      fmf $$3 = fmf.a();

      try {
         $$3.b(this.P.a, $$0, $$2);
         this.P.a($$0);
         this.P.b($$2);
         this.f();
      } catch (fob var6) {
         D.error("Couldn't save settings", var6);
         this.m.a(new fou(var6, this));
         return;
      }

      this.m.a(this);
   }

   public void b(boolean $$0) {
      fop $$1 = this.g();
      this.m.a(new fow($$1, new fqe(this.P, $$1, $$0, this.m)));
   }

   public void b() {
      fop $$0 = this.g();
      this.m.a(new fow($$0, new fpz(this.P, $$0)));
   }

   public void f() {
      this.aa = true;
   }

   private void a(@Nullable fnw $$0) {
      if ($$0 != null && fnw.a.b == $$0.i) {
         this.f();
         this.m.a(new fow(this.O, new fqj(this.P.a, $$0, this.g())));
      } else {
         this.m.a(this);
      }
   }

   public fop g() {
      fop $$0 = new fop(this.O, this.Q);
      $$0.aa = this.aa;
      return $$0;
   }
}
