import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class fiv extends fjx {
   private static final ajv a = new ajv("icon/draft_report");
   private int b;
   private final wi c;
   private final boolean d;
   private wi o;
   private final List<fdy> p = Lists.newArrayList();
   @Nullable
   private fdy q;

   public fiv(@Nullable wi $$0, boolean $$1) {
      super(wi.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   protected void aM_() {
      this.b = 0;
      this.p.clear();
      wi $$0 = this.d ? wi.c("deathScreen.spectate") : wi.c("deathScreen.respawn");
      this.p.add(this.c(fdy.a($$0, $$0x -> {
         this.j.s.fX();
         $$0x.j = false;
      }).a(this.k / 2 - 100, this.l / 4 + 72, 200, 20).a()));
      this.q = this.c(
         fdy.a(wi.c("deathScreen.titleScreen"), $$0x -> this.j.ba().a(this.j, this, this::m, true)).a(this.k / 2 - 100, this.l / 4 + 96, 200, 20).a()
      );
      this.p.add(this.q);
      this.c(false);
      this.o = wi.a("deathScreen.score.value", wi.b(Integer.toString(this.j.s.fT())).a(n.o));
   }

   @Override
   public boolean aD_() {
      return false;
   }

   private void m() {
      if (this.d) {
         this.C();
      } else {
         fip $$0 = new fiv.a($$0x -> {
            if ($$0x) {
               this.C();
            } else {
               this.j.s.fX();
               this.j.a(null);
            }
         }, wi.c("deathScreen.quit.confirm"), wh.a, wi.c("deathScreen.titleScreen"), wi.c("deathScreen.respawn"));
         this.j.a($$0);
         $$0.b(20);
      }
   }

   private void C() {
      if (this.j.r != null) {
         this.j.r.X();
      }

      this.j.b(new fjd(wi.c("menu.savingLevel")));
      this.j.a(new fkc());
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().b(2.0F, 2.0F, 2.0F);
      $$0.a(this.m, this.i, this.k / 2 / 2, 30, 16777215);
      $$0.c().b();
      if (this.c != null) {
         $$0.a(this.m, this.c, this.k / 2, 85, 16777215);
      }

      $$0.a(this.m, this.o, this.k / 2, 100, 16777215);
      if (this.c != null && $$2 > 85 && $$2 < 85 + 9) {
         xf $$4 = this.a($$1);
         $$0.a(this.m, $$4, $$1, $$2);
      }

      if (this.q != null && this.j.ba().c()) {
         $$0.a(a, this.q.C() + this.q.x() - 17, this.q.D() + 3, 15, 15);
      }
   }

   @Override
   public void b(fdl $$0, int $$1, int $$2, float $$3) {
      $$0.b(0, 0, this.k, this.l, 1615855616, -1602211792);
   }

   @Nullable
   private xf a(int $$0) {
      if (this.c == null) {
         return null;
      } else {
         int $$1 = this.j.h.a(this.c);
         int $$2 = this.k / 2 - $$1 / 2;
         int $$3 = this.k / 2 + $$1 / 2;
         return $$0 >= $$2 && $$0 <= $$3 ? this.j.h.b().a(this.c, $$0 - $$2) : null;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.c != null && $$1 > 85.0 && $$1 < (double)(85 + 9)) {
         xf $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.h() != null && $$3.h().a() == wg.a.a) {
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
      for (fdy $$1 : this.p) {
         $$1.j = $$0;
      }
   }

   public static class a extends fip {
      public a(BooleanConsumer $$0, wi $$1, wi $$2, wi $$3, wi $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }
   }
}
