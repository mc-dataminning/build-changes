import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class fmb extends fnd {
   private static final alf a = new alf("icon/draft_report");
   private int b;
   private final xp c;
   private final boolean d;
   private xp r;
   private final List<fhe> s = Lists.newArrayList();
   @Nullable
   private fhe u;

   public fmb(@Nullable xp $$0, boolean $$1) {
      super(xp.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   protected void aM_() {
      this.b = 0;
      this.s.clear();
      xp $$0 = this.d ? xp.c("deathScreen.spectate") : xp.c("deathScreen.respawn");
      this.s.add(this.c(fhe.a($$0, $$0x -> {
         this.m.s.ga();
         $$0x.j = false;
      }).a(this.n / 2 - 100, this.o / 4 + 72, 200, 20).a()));
      this.u = this.c(
         fhe.a(xp.c("deathScreen.titleScreen"), $$0x -> this.m.aZ().a(this.m, this, this::m, true)).a(this.n / 2 - 100, this.o / 4 + 96, 200, 20).a()
      );
      this.s.add(this.u);
      this.c(false);
      this.r = xp.a("deathScreen.score.value", xp.b(Integer.toString(this.m.s.fW())).a(n.o));
   }

   @Override
   public boolean aC_() {
      return false;
   }

   private void m() {
      if (this.d) {
         this.E();
      } else {
         flv $$0 = new fmb.a($$0x -> {
            if ($$0x) {
               this.E();
            } else {
               this.m.s.ga();
               this.m.a(null);
            }
         }, xp.c("deathScreen.quit.confirm"), xo.a, xp.c("deathScreen.titleScreen"), xp.c("deathScreen.respawn"));
         this.m.a($$0);
         $$0.b(20);
      }
   }

   private void E() {
      if (this.m.r != null) {
         this.m.r.Y();
      }

      this.m.b(new fmj(xp.c("menu.savingLevel")));
      this.m.a(new fni());
   }

   @Override
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
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
         ym $$4 = this.a($$1);
         $$0.a(this.p, $$4, $$1, $$2);
      }

      if (this.u != null && this.m.aZ().c()) {
         $$0.a(a, this.u.C() + this.u.x() - 17, this.u.D() + 3, 15, 15);
      }
   }

   @Override
   public void b(fgr $$0, int $$1, int $$2, float $$3) {
      a($$0, this.n, this.o);
   }

   static void a(fgr $$0, int $$1, int $$2) {
      $$0.b(0, 0, $$1, $$2, 1615855616, -1602211792);
   }

   @Nullable
   private ym a(int $$0) {
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
         ym $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.h() != null && $$3.h().a() == xn.a.a) {
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
      for (fhe $$1 : this.s) {
         $$1.j = $$0;
      }
   }

   public static class a extends flv {
      public a(BooleanConsumer $$0, xp $$1, xp $$2, xp $$3, xp $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public void b(fgr $$0, int $$1, int $$2, float $$3) {
         fmb.a($$0, this.n, this.o);
      }
   }
}
