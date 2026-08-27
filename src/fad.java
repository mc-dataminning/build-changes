import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fad extends gsq {
   private static final akf a = new akf("realm_status/expired");
   private static final akf b = new akf("realm_status/expires_soon");
   private static final akf c = new akf("realm_status/open");
   private static final akf B = new akf("realm_status/closed");
   private static final Logger C = LogUtils.getLogger();
   private static final ws D = ws.c("mco.configure.worlds.title");
   private static final ws E = ws.c("mco.configure.world.title");
   private static final ws F = ws.c("mco.selectServer.expired");
   private static final ws G = ws.c("mco.selectServer.expires.soon");
   private static final ws H = ws.c("mco.selectServer.expires.day");
   private static final ws I = ws.c("mco.selectServer.open");
   private static final ws J = ws.c("mco.selectServer.closed");
   private static final int K = 80;
   private static final int L = 5;
   @Nullable
   private ws M;
   private final exy N;
   @Nullable
   private eyu O;
   private final long P;
   private int Q;
   private int R;
   private feu S;
   private feu T;
   private feu U;
   private feu V;
   private feu W;
   private feu X;
   private feu Y;
   private boolean Z;
   private final List<ezw> aa = Lists.newArrayList();

   public fad(exy $$0, long $$1) {
      super(E);
      this.N = $$0;
      this.P = $$1;
   }

   @Override
   public void aM_() {
      if (this.O == null) {
         this.a(this.P);
      }

      this.Q = this.n / 2 - 187;
      this.R = this.n / 2 + 190;
      this.S = this.c(feu.a(ws.c("mco.configure.world.buttons.players"), $$0x -> this.m.a(new fap(this, this.O))).a(this.a(0, 3), g(0), 100, 20).a());
      this.T = this.c(feu.a(ws.c("mco.configure.world.buttons.settings"), $$0x -> this.m.a(new fav(this, this.O.g()))).a(this.a(1, 3), g(0), 100, 20).a());
      this.U = this.c(
         feu.a(ws.c("mco.configure.world.buttons.subscription"), $$0x -> this.m.a(new fax(this, this.O.g(), this.N))).a(this.a(2, 3), g(0), 100, 20).a()
      );
      this.aa.clear();

      for (int $$0 = 1; $$0 < 5; $$0++) {
         this.aa.add(this.a($$0));
      }

      this.Y = this.c(
         feu.a(ws.c("mco.configure.world.buttons.switchminigame"), $$0x -> this.m.a(new fau(ws.c("mco.template.title.minigame"), this::a, eyu.d.b)))
            .a(this.b(0), g(13) - 5, 100, 20)
            .a()
      );
      this.V = this.c(
         feu.a(ws.c("mco.configure.world.buttons.options"), $$0x -> this.m.a(new faw(this, this.O.i.get(this.O.n).d(), this.O.m, this.O.n)))
            .a(this.b(0), g(13) - 5, 90, 20)
            .a()
      );
      this.W = this.c(feu.a(ws.c("mco.configure.world.backup"), $$0x -> this.m.a(new faa(this, this.O.g(), this.O.n))).a(this.b(1), g(13) - 5, 90, 20).a());
      this.X = this.c(
         feu.a(ws.c("mco.configure.world.buttons.resetworld"), $$0x -> this.m.a(fas.a(this, this.O.g(), () -> this.m.execute(() -> this.m.a(this.f())))))
            .a(this.b(2), g(13) - 5, 90, 20)
            .a()
      );
      this.c(feu.a(wr.k, $$0x -> this.d()).a(this.R - 80 + 8, g(13) - 5, 70, 20).a());
      this.W.j = true;
      if (this.O == null) {
         this.I();
         this.F();
         this.S.j = false;
         this.T.j = false;
         this.U.j = false;
      } else {
         this.C();
         if (this.E()) {
            this.F();
         } else {
            this.I();
         }
      }
   }

   private ezw a(int $$0) {
      int $$1 = this.h($$0);
      int $$2 = g(5) + 5;
      ezw $$3 = new ezw($$1, $$2, 80, 80, $$0, $$1x -> {
         ezw.b $$2x = ((ezw)$$1x).a();
         if ($$2x != null) {
            switch ($$2x.c) {
               case a:
                  break;
               case c:
                  this.a(this.O);
                  break;
               case b:
                  if ($$2x.b) {
                     this.D();
                  } else if ($$2x.a) {
                     this.b($$0, this.O);
                  } else {
                     this.a($$0, this.O);
                  }
                  break;
               default:
                  throw new IllegalStateException("Unknown action " + $$2x.c);
            }
         }
      });
      if (this.O != null) {
         $$3.a(this.O);
      }

      return this.c($$3);
   }

   private int b(int $$0) {
      return this.Q + $$0 * 95;
   }

   private int a(int $$0, int $$1) {
      return this.n / 2 - ($$1 * 105 - 5) / 2 + $$0 * 105;
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.M = null;
      $$0.a(this.p, D, this.n / 2, g(4), -1);
      if (this.O == null) {
         $$0.a(this.p, this.l, this.n / 2, 17, -1);
      } else {
         String $$4 = this.O.b();
         int $$5 = this.p.b($$4);
         int $$6 = this.O.e == eyu.c.a ? -6250336 : 8388479;
         int $$7 = this.p.a(this.l);
         $$0.a(this.p, this.l, this.n / 2, 12, -1);
         $$0.a(this.p, $$4, this.n / 2, 24, $$6);
         int $$8 = Math.min(this.a(2, 3) + 80 - 11, this.n / 2 + $$5 / 2 + $$7 / 2 + 10);
         this.b($$0, $$8, 7, $$1, $$2);
         if (this.E()) {
            String $$9 = this.O.c();
            if ($$9 != null) {
               $$0.a(this.p, ws.a("mco.configure.world.minigame", $$9), this.Q + 80 + 20 + 10, g(13), -1, false);
            }
         }
      }
   }

   private int h(int $$0) {
      return this.Q + ($$0 - 1) * 98;
   }

   @Override
   public void d() {
      this.m.a(this.N);
      if (this.Z) {
         this.N.h();
      }
   }

   private void a(long $$0) {
      new Thread(() -> {
         eyd $$1 = eyd.a();

         try {
            eyu $$2 = $$1.a($$0);
            this.m.execute(() -> {
               this.O = $$2;
               this.C();
               if (this.E()) {
                  this.b(this.Y);
               } else {
                  this.b(this.V);
                  this.b(this.W);
                  this.b(this.X);
               }

               for (ezw $$1x : this.aa) {
                  $$1x.a($$2);
               }
            });
         } catch (ezq var5) {
            C.error("Couldn't get own world", var5);
            this.m.execute(() -> this.m.a(new fah(var5, this.N)));
         }
      }).start();
   }

   private void C() {
      this.S.j = !this.O.j;
      this.T.j = !this.O.j;
      this.U.j = true;
      this.Y.j = !this.O.j;
      this.V.j = !this.O.j;
      this.X.j = !this.O.j;
   }

   private void a(eyu $$0) {
      if (this.O.e == eyu.c.b) {
         exy.a($$0, new fad(this.N, this.P));
      } else {
         this.a(true, new fad(this.N, this.P));
      }
   }

   private void D() {
      fau $$0 = new fau(ws.c("mco.template.title.minigame"), this::a, eyu.d.b);
      $$0.a(ws.c("mco.minigame.world.info.line1"), ws.c("mco.minigame.world.info.line2"));
      this.m.a($$0);
   }

   private void a(int $$0, eyu $$1) {
      ws $$2 = ws.c("mco.configure.world.slot.switch.question.line1");
      ws $$3 = ws.c("mco.configure.world.slot.switch.question.line2");
      this.m.a(new faj($$2x -> {
         if ($$2x) {
            this.b();
            this.m.a(new fak(this.N, new fcc($$1.a, $$0, () -> this.m.execute(() -> this.m.a(this.f())))));
         } else {
            this.m.a(this);
         }
      }, faj.a.b, $$2, $$3, true));
   }

   private void b(int $$0, eyu $$1) {
      ws $$2 = ws.c("mco.configure.world.slot.switch.question.line1");
      ws $$3 = ws.c("mco.configure.world.slot.switch.question.line2");
      this.m.a(new faj($$2x -> {
         if ($$2x) {
            this.b();
            fas $$3x = fas.a(this, $$0, $$1, () -> this.m.execute(() -> this.m.a(this.f())));
            this.m.a($$3x);
         } else {
            this.m.a(this);
         }
      }, faj.a.b, $$2, $$3, true));
   }

   private void b(feh $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.O.j) {
         this.a($$0, $$1, $$2, $$3, $$4, a, () -> F);
      } else if (this.O.e == eyu.c.a) {
         this.a($$0, $$1, $$2, $$3, $$4, B, () -> J);
      } else if (this.O.e == eyu.c.b) {
         if (this.O.l < 7) {
            this.a($$0, $$1, $$2, $$3, $$4, b, () -> {
               if (this.O.l <= 0) {
                  return G;
               } else {
                  return (ws)(this.O.l == 1 ? H : ws.a("mco.selectServer.expires.days", this.O.l));
               }
            });
         } else {
            this.a($$0, $$1, $$2, $$3, $$4, c, () -> I);
         }
      }
   }

   private void a(feh $$0, int $$1, int $$2, int $$3, int $$4, akf $$5, Supplier<ws> $$6) {
      $$0.a($$5, $$1, $$2, 10, 28);
      if ($$3 >= $$1 && $$3 <= $$1 + 9 && $$4 >= $$2 && $$4 <= $$2 + 27) {
         this.d($$6.get());
      }
   }

   private boolean E() {
      return this.O != null && this.O.m == eyu.d.b;
   }

   private void F() {
      this.a(this.V);
      this.a(this.W);
      this.a(this.X);
   }

   private void a(feu $$0) {
      $$0.k = false;
   }

   private void b(feu $$0) {
      $$0.k = true;
   }

   private void I() {
      this.a(this.Y);
   }

   public void a(ezb $$0) {
      ezb $$1 = this.O.i.get(this.O.n);
      $$0.l = $$1.l;
      $$0.m = $$1.m;
      eyd $$2 = eyd.a();

      try {
         $$2.a(this.O.a, this.O.n, $$0);
         this.O.i.put(this.O.n, $$0);
      } catch (ezq var5) {
         C.error("Couldn't save slot settings", var5);
         this.m.a(new fah(var5, this));
         return;
      }

      this.m.a(this);
   }

   public void a(String $$0, String $$1) {
      String $$2 = ayr.h($$1) ? null : $$1;
      eyd $$3 = eyd.a();

      try {
         $$3.b(this.O.a, $$0, $$2);
         this.O.a($$0);
         this.O.b($$2);
         this.b();
      } catch (ezq var6) {
         C.error("Couldn't save settings", var6);
         this.m.a(new fah(var6, this));
         return;
      }

      this.m.a(this);
   }

   public void a(boolean $$0, fkt $$1) {
      this.m.a(new fak($$1, new fbv(this.O, this, $$0, this.m)));
   }

   public void a(fkt $$0) {
      this.m.a(new fak($$0, new fbp(this.O, this)));
   }

   public void b() {
      this.Z = true;
   }

   private void a(@Nullable ezl $$0) {
      if ($$0 != null && ezl.a.b == $$0.i) {
         this.b();
         this.m.a(new fak(this.N, new fcb(this.O.a, $$0, this.f())));
      } else {
         this.m.a(this);
      }
   }

   public fad f() {
      fad $$0 = new fad(this.N, this.P);
      $$0.Z = this.Z;
      return $$0;
   }
}
