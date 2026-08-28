import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class fmp extends fnl {
   private static final akk a = new akk("icon/draft_report");
   private int b;
   private final wu c;
   private final boolean q;
   private wu r;
   private final List<fhu> s = Lists.newArrayList();
   @Nullable
   private fhu u;

   public fmp(@Nullable wu $$0, boolean $$1) {
      super(wu.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.q = $$1;
   }

   @Override
   protected void aP_() {
      this.b = 0;
      this.s.clear();
      wu $$0 = this.q ? wu.c("deathScreen.spectate") : wu.c("deathScreen.respawn");
      this.s.add(this.c(fhu.a($$0, $$0x -> {
         this.l.s.fY();
         $$0x.j = false;
      }).a(this.m / 2 - 100, this.n / 4 + 72, 200, 20).a()));
      this.u = this.c(
         fhu.a(wu.c("deathScreen.titleScreen"), $$0x -> this.l.aX().a(this.l, this, this::m, true)).a(this.m / 2 - 100, this.n / 4 + 96, 200, 20).a()
      );
      this.s.add(this.u);
      this.c(false);
      this.r = wu.a("deathScreen.score.value", wu.b(Integer.toString(this.l.s.fU())).a(n.o));
   }

   @Override
   public boolean aF_() {
      return false;
   }

   private void m() {
      if (this.q) {
         this.D();
      } else {
         fmj $$0 = new fmp.a($$0x -> {
            if ($$0x) {
               this.D();
            } else {
               this.l.s.fY();
               this.l.a(null);
            }
         }, wu.c("deathScreen.quit.confirm"), wt.a, wu.c("deathScreen.titleScreen"), wu.c("deathScreen.respawn"));
         this.l.a($$0);
         $$0.b(20);
      }
   }

   private void D() {
      if (this.l.r != null) {
         this.l.r.Y();
      }

      this.l.b(new fmw(wu.c("menu.savingLevel")));
      this.l.a(new fnn());
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
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
         xr $$4 = this.a($$1);
         $$0.a(this.o, $$4, $$1, $$2);
      }

      if (this.u != null && this.l.aX().c()) {
         $$0.a(a, this.u.D() + this.u.y() - 17, this.u.E() + 3, 15, 15);
      }
   }

   @Override
   public void b(fhh $$0, int $$1, int $$2, float $$3) {
      a($$0, this.m, this.n);
   }

   static void a(fhh $$0, int $$1, int $$2) {
      $$0.b(0, 0, $$1, $$2, 1615855616, -1602211792);
   }

   @Nullable
   private xr a(int $$0) {
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
         xr $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.h() != null && $$3.h().a() == ws.a.a) {
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
      for (fhu $$1 : this.s) {
         $$1.j = $$0;
      }
   }

   public static class a extends fmj {
      public a(BooleanConsumer $$0, wu $$1, wu $$2, wu $$3, wu $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public void b(fhh $$0, int $$1, int $$2, float $$3) {
         fmp.a($$0, this.m, this.n);
      }
   }
}
