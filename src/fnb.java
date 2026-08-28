import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class fnb extends fnx {
   private static final akq a = akq.b("icon/draft_report");
   private int b;
   private final wy c;
   private final boolean q;
   private wy r;
   private final List<fig> s = Lists.newArrayList();
   @Nullable
   private fig u;

   public fnb(@Nullable wy $$0, boolean $$1) {
      super(wy.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.q = $$1;
   }

   @Override
   protected void aP_() {
      this.b = 0;
      this.s.clear();
      wy $$0 = this.q ? wy.c("deathScreen.spectate") : wy.c("deathScreen.respawn");
      this.s.add(this.c(fig.a($$0, $$0x -> {
         this.l.s.fX();
         $$0x.j = false;
      }).a(this.m / 2 - 100, this.n / 4 + 72, 200, 20).a()));
      this.u = this.c(
         fig.a(wy.c("deathScreen.titleScreen"), $$0x -> this.l.aX().a(this.l, this, this::m, true)).a(this.m / 2 - 100, this.n / 4 + 96, 200, 20).a()
      );
      this.s.add(this.u);
      this.c(false);
      this.r = wy.a("deathScreen.score.value", wy.b(Integer.toString(this.l.s.fT())).a(n.o));
   }

   @Override
   public boolean aF_() {
      return false;
   }

   private void m() {
      if (this.q) {
         this.D();
      } else {
         fmv $$0 = new fnb.a($$0x -> {
            if ($$0x) {
               this.D();
            } else {
               this.l.s.fX();
               this.l.a(null);
            }
         }, wy.c("deathScreen.quit.confirm"), wx.a, wy.c("deathScreen.titleScreen"), wy.c("deathScreen.respawn"));
         this.l.a($$0);
         $$0.b(20);
      }
   }

   private void D() {
      if (this.l.r != null) {
         this.l.r.Y();
      }

      this.l.b(new fni(wy.c("menu.savingLevel")));
      this.l.a(new fnz());
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().b(2.0F, 2.0F, 2.0F);
      $$0.a(this.o, this.k, this.m / 2 / 2, 30, 16777215);
      $$0.c().b();
      if (this.c != null) {
         $$0.a(this.o, this.c, this.m / 2, 85, 16777215);
      }

      $$0.a(this.o, this.r, this.m / 2, 100, 16777215);
      if (this.c != null && $$2 > 85 && $$2 < 85 + 9) {
         xv $$4 = this.a($$1);
         $$0.a(this.o, $$4, $$1, $$2);
      }

      if (this.u != null && this.l.aX().c()) {
         $$0.a(a, this.u.D() + this.u.y() - 17, this.u.E() + 3, 15, 15);
      }
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
      a($$0, this.m, this.n);
   }

   static void a(fht $$0, int $$1, int $$2) {
      $$0.b(0, 0, $$1, $$2, 1615855616, -1602211792);
   }

   @Nullable
   private xv a(int $$0) {
      if (this.c == null) {
         return null;
      } else {
         int $$1 = this.l.h.a(this.c);
         int $$2 = this.m / 2 - $$1 / 2;
         int $$3 = this.m / 2 + $$1 / 2;
         return $$0 >= $$2 && $$0 <= $$3 ? this.l.h.b().a(this.c, $$0 - $$2) : null;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.c != null && $$1 > 85.0 && $$1 < (double)(85 + 9)) {
         xv $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.h() != null && $$3.h().a() == ww.a.a) {
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
      for (fig $$1 : this.s) {
         $$1.j = $$0;
      }
   }

   public static class a extends fmv {
      public a(BooleanConsumer $$0, wy $$1, wy $$2, wy $$3, wy $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public void b(fht $$0, int $$1, int $$2, float $$3) {
         fnb.a($$0, this.m, this.n);
      }
   }
}
