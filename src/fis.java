import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fis extends hky {
   private static final aku a = aku.b("realm_status/expired");
   private static final aku b = aku.b("realm_status/expires_soon");
   private static final aku c = aku.b("realm_status/open");
   private static final aku C = aku.b("realm_status/closed");
   private static final Logger D = LogUtils.getLogger();
   private static final wo E = wo.c("mco.configure.worlds.title");
   private static final wo F = wo.c("mco.configure.world.title");
   private static final wo G = wo.c("mco.selectServer.expired");
   private static final wo H = wo.c("mco.selectServer.expires.soon");
   private static final wo I = wo.c("mco.selectServer.expires.day");
   private static final wo J = wo.c("mco.selectServer.open");
   private static final wo K = wo.c("mco.selectServer.closed");
   private static final int L = 80;
   private static final int M = 5;
   @Nullable
   private wo N;
   private final fgd O;
   @Nullable
   private fhj P;
   private final long Q;
   private int R;
   private int S;
   private fop T;
   private fop U;
   private fop V;
   private fop W;
   private fop X;
   private fop Y;
   private fop Z;
   private boolean aa;
   private final List<fik> ab = Lists.newArrayList();

   public fis(fgd $$0, long $$1) {
      super(F);
      this.O = $$0;
      this.Q = $$1;
   }

   @Override
   public void aR_() {
      if (this.P == null) {
         this.a(this.Q);
      }

      this.R = this.n / 2 - 187;
      this.S = this.n / 2 + 190;
      this.T = this.c(fop.a(wo.c("mco.configure.world.buttons.players"), $$0x -> this.m.a(new fjd(this, this.P))).a(this.a(0, 3), g(0), 100, 20).a());
      this.U = this.c(fop.a(wo.c("mco.configure.world.buttons.settings"), $$0x -> this.m.a(new fji(this, this.P.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.V = this.c(
         fop.a(wo.c("mco.configure.world.buttons.subscription"), $$0x -> this.m.a(new fjk(this, this.P.g(), this.O))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.ab.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.ab.add(this.a($$0));
      }

      this.Z = this.c(
         fop.a(wo.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.m.a(new fjh(wo.c("mco.template.title.minigame"), this::a, fhj.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.W = this.c(
         fop.a(wo.c("mco.configure.world.buttons.options"), $$0x -> this.m.a(new fjj(this, this.P.i.get(this.P.p).d(), this.P.m, this.P.p)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.X = this.c(fop.a(wo.c("mco.configure.world.backup"), $$0x -> this.m.a(new fip(this, this.P.g(), this.P.p))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.Y = this.c(
         fop.a(wo.c("mco.configure.world.buttons.resetworld"), $$0x -> this.m.a(fjf.a(this, this.P.g(), () -> this.m.execute(() -> this.m.a(this.g())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.c(fop.a(wn.k, $$0x -> this.aO_()).a(this.S - 80 + 8, g(13) - 5, 70, 20).a());
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

   private fik a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      fik $$3 = new fik($$1, $$2, 80, 80, $$0, $$1x -> {
         fik.b $$2x = ((fik)$$1x).a();
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
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.N = null;
      $$0.a(this.p, E, this.n / 2, g(4), -1);
      if (this.P == null) {
         $$0.a(this.p, this.l, this.n / 2, 17, -1);
      } else {
         String $$4 = Objects.requireNonNullElse(this.P.b(), "");
         int $$5 = this.p.b($$4);
         int $$6 = this.P.e == fhj.c.a ? -6250336 : 8388479;
         int $$7 = this.p.a(this.l);
         $$0.a(this.p, this.l, this.n / 2, 12, -1);
         $$0.a(this.p, $$4, this.n / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.n / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.b($$0, $$8, 7, $$1, $$2);
         if (this.G()) {
            String $$9 = this.P.c();
            if ($$9 != null) {
               $$0.b(this.p, wo.a("mco.configure.world.minigame", $$9), this.R + 80 + 20 + 10, g(13), -1);
            }
         }
      }
   }

   private int h(int $$0) {
      return this.R + ($$0 - 1) * 98;
   }

   @Override
   public void aO_() {
      this.m.a(this.O);
      if (this.aa) {
         this.O.h();
      }
   }

   @Override
   public void a(long $$0) {
      new Thread(() -> {
         fgi $$1 = fgi.a();

         try {
            fhj $$2 = $$1.a($$0);
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

               for (fik $$1x : this.ab) {
                  $$1x.a($$2);
               }
            });
         } catch (fie var5) {
            D.error("Couldn't get own world", var5);
            this.m.execute(() -> this.m.a(new fiw(var5, this.O)));
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

   private void a(fhj $$0) {
      if (this.P.e == fhj.c.b) {
         fgd.a($$0, this);
      } else {
         this.b(true);
      }
   }

   private void F() {
      fjh $$0 = new fjh(wo.c("mco.template.title.minigame"), this::a, fhj.d.b);
      $$0.a(wo.c("mco.minigame.world.info.line1"), wo.c("mco.minigame.world.info.line2"));
      this.m.a($$0);
   }

   private void a(int $$0, fhj $$1) {
      this.m.a(fje.a(this, wo.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         this.m.a(new fiy(this.O, new fkm($$1.a, $$0, () -> this.m.execute(() -> this.m.a(this.g())))));
      }));
   }

   private void b(int $$0, fhj $$1) {
      this.m.a(fje.a(this, wo.c("mco.configure.world.slot.switch.question.line1"), $$2 -> {
         this.f();
         fjf $$3 = fjf.a(this, $$0, $$1, () -> this.m.execute(() -> this.m.a(this.g())));
         this.m.a($$3);
      }));
   }

   private void b(fob $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.P.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> G);
      } else if (this.P.e == fhj.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, C, () -> K);
      } else if (this.P.e == fhj.c.b) {
         if (this.P.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.P.l <= 0) {
                  return H;
               } else {
                  return (wo)(this.P.l == 1 ? I : wo.a("mco.selectServer.expires.days", this.P.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> J);
         }
      }
   }

   private void a(fob $$0, int $$1, int $$2, int $$3, int $$4, aku $$5, Supplier<wo> $$6) {
      $$0.a(gmf::H, $$5, $$1, $$2, 10, 28);
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

   private void a(fop $$0) {
      $$0.k = false;
   }

   private void b(fop $$0) {
      $$0.k = true;
   }

   private void I() {
      this.a(this.Z);
   }

   public void a(fhp $$0) {
      fhp $$1 = this.P.i.get(this.P.p);
      $$0.k = $$1.k;
      $$0.l = $$1.l;
      fgi $$2 = fgi.a();

      try {
         $$2.a(this.P.a, this.P.p, $$0);
         this.P.i.put(this.P.p, $$0);
         if ($$1.g != $$0.g || $$1.h != $$0.h) {
            fgd.g();
         }
      } catch (fie var5) {
         D.error("Couldn't save slot settings", var5);
         this.m.a(new fiw(var5, this));
         return;
      }

      this.m.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = azv.h($$1) ? "" : $$1;
      fgi $$3 = fgi.a();

      try {
         $$3.b(this.P.a, $$0, $$2);
         this.P.a($$0);
         this.P.b($$2);
         this.f();
      } catch (fie var6) {
         D.error("Couldn't save settings", var6);
         this.m.a(new fiw(var6, this));
         return;
      }

      this.m.a(this);
   }

   public void b(boolean $$0) {
      fis $$1 = this.g();
      this.m.a(new fiy($$1, new fkg(this.P, $$1, $$0, this.m)));
   }

   public void b() {
      fis $$0 = this.g();
      this.m.a(new fiy($$0, new fkb(this.P, $$0)));
   }

   public void f() {
      this.aa = true;
   }

   private void a(@Nullable fhz $$0) {
      if ($$0 != null && fhz.a.b == $$0.i) {
         this.f();
         this.m.a(new fiy(this.O, new fkl(this.P.a, $$0, this.g())));
      } else {
         this.m.a(this);
      }
   }

   public fis g() {
      fis $$0 = new fis(this.O, this.Q);
      $$0.aa = this.aa;
      return $$0;
   }
}
