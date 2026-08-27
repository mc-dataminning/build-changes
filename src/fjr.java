import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class fjr extends fkt {
   private static final akf a = new akf("icon/draft_report");
   private int b;
   private final ws c;
   private final boolean d;
   private ws r;
   private final List<feu> s = Lists.newArrayList();
   @Nullable
   private feu u;

   public fjr(@Nullable ws $$0, boolean $$1) {
      super(ws.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   protected void aM_() {
      this.b = 0;
      this.s.clear();
      ws $$0 = this.d ? ws.c("deathScreen.spectate") : ws.c("deathScreen.respawn");
      this.s.add(this.c(feu.a($$0, $$0x -> {
         this.m.s.fY();
         $$0x.j = false;
      }).a(this.n / 2 - 100, this.o / 4 + 72, 200, 20).a()));
      this.u = this.c(
         feu.a(ws.c("deathScreen.titleScreen"), $$0x -> this.m.ba().a(this.m, this, this::m, true)).a(this.n / 2 - 100, this.o / 4 + 96, 200, 20).a()
      );
      this.s.add(this.u);
      this.c(false);
      this.r = ws.a("deathScreen.score.value", ws.b(Integer.toString(this.m.s.fU())).a(n.o));
   }

   @Override
   public boolean aD_() {
      return false;
   }

   private void m() {
      if (this.d) {
         this.C();
      } else {
         fjl $$0 = new fjr.a($$0x -> {
            if ($$0x) {
               this.C();
            } else {
               this.m.s.fY();
               this.m.a(null);
            }
         }, ws.c("deathScreen.quit.confirm"), wr.a, ws.c("deathScreen.titleScreen"), ws.c("deathScreen.respawn"));
         this.m.a($$0);
         $$0.b(20);
      }
   }

   private void C() {
      if (this.m.r != null) {
         this.m.r.X();
      }

      this.m.b(new fjz(ws.c("menu.savingLevel")));
      this.m.a(new fky());
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().b(2.0F, 2.0F, 2.0F);
      $$0.a(this.p, this.l, this.n / 2 / 2, 30, 16777215);
      $$0.c().b();
      if (this.c != null) {
         $$0.a(this.p, this.c, this.n / 2, 85, 16777215);
      }

      $$0.a(this.p, this.r, this.n / 2, 100, 16777215);
      if (this.c != null && $$2 > 85 && $$2 < 85 + 9) {
         xp $$4 = this.a($$1);
         $$0.a(this.p, $$4, $$1, $$2);
      }

      if (this.u != null && this.m.ba().c()) {
         $$0.a(a, this.u.C() + this.u.x() - 17, this.u.D() + 3, 15, 15);
      }
   }

   @Override
   public void b(feh $$0, int $$1, int $$2, float $$3) {
      $$0.b(0, 0, this.n, this.o, 1615855616, -1602211792);
   }

   @Nullable
   private xp a(int $$0) {
      if (this.c == null) {
         return null;
      } else {
         int $$1 = this.m.h.a(this.c);
         int $$2 = this.n / 2 - $$1 / 2;
         int $$3 = this.n / 2 + $$1 / 2;
         return $$0 >= $$2 && $$0 <= $$3 ? this.m.h.b().a(this.c, $$0 - $$2) : null;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.c != null && $$1 > 85.0 && $$1 < (double)(85 + 9)) {
         xp $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.h() != null && $$3.h().a() == wq.a.a) {
            this.a($$3);
            return false;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public void e() {
      super.e();
      this.b++;
      if (this.b == 20) {
         this.c(true);
      }
   }

   private void c(boolean $$0) {
      for (feu $$1 : this.s) {
         $$1.j = $$0;
      }
   }

   public static class a extends fjl {
      public a(BooleanConsumer $$0, ws $$1, ws $$2, ws $$3, ws $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }
   }
}
