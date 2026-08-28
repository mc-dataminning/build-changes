import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class fpw extends fqs {
   private static final alh a = alh.b("icon/draft_report");
   private int b;
   private final xh c;
   private final boolean d;
   private xh s;
   private final List<fkz> u = Lists.newArrayList();
   @Nullable
   private fkz v;

   public fpw(@Nullable xh $$0, boolean $$1) {
      super(xh.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   protected void aS_() {
      this.b = 0;
      this.u.clear();
      xh $$0 = this.d ? xh.c("deathScreen.spectate") : xh.c("deathScreen.respawn");
      this.u.add(this.c(fkz.a($$0, $$0x -> {
         this.m.t.gi();
         $$0x.j = false;
      }).a(this.n / 2 - 100, this.o / 4 + 72, 200, 20).a()));
      this.v = this.c(
         fkz.a(xh.c("deathScreen.titleScreen"), $$0x -> this.m.bc().a(this.m, this, this::m, true)).a(this.n / 2 - 100, this.o / 4 + 96, 200, 20).a()
      );
      this.u.add(this.v);
      this.c(false);
      this.s = xh.a("deathScreen.score.value", xh.b(Integer.toString(this.m.t.gf())).a(n.o));
   }

   @Override
   public boolean aI_() {
      return false;
   }

   private void m() {
      if (this.d) {
         this.D();
      } else {
         fpq $$0 = new fpw.a($$0x -> {
            if ($$0x) {
               this.D();
            } else {
               this.m.t.gi();
               this.m.a(null);
            }
         }, xh.c("deathScreen.quit.confirm"), xg.a, xh.c("deathScreen.titleScreen"), xh.c("deathScreen.respawn"));
         this.m.a($$0);
         $$0.b(20);
      }
   }

   private void D() {
      if (this.m.s != null) {
         this.m.s.Z();
      }

      this.m.b(new fqd(xh.c("menu.savingLevel")));
      this.m.a(new fqu());
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().b(2.0F, 2.0F, 2.0F);
      $$0.a(this.p, this.l, this.n / 2 / 2, 30, 16777215);
      $$0.c().b();
      if (this.c != null) {
         $$0.a(this.p, this.c, this.n / 2, 85, 16777215);
      }

      $$0.a(this.p, this.s, this.n / 2, 100, 16777215);
      if (this.c != null && $$2 > 85 && $$2 < 85 + 9) {
         ye $$4 = this.a($$1);
         $$0.a(this.p, $$4, $$1, $$2);
      }

      if (this.v != null && this.m.bc().c()) {
         $$0.a(gig::B, a, this.v.D() + this.v.y() - 17, this.v.E() + 3, 15, 15);
      }
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
      a($$0, this.n, this.o);
   }

   static void a(fkm $$0, int $$1, int $$2) {
      $$0.b(0, 0, $$1, $$2, 1615855616, -1602211792);
   }

   @Nullable
   private ye a(int $$0) {
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
         ye $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.h() != null && $$3.h().a() == xf.a.a) {
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
      for (fkz $$1 : this.u) {
         $$1.j = $$0;
      }
   }

   public static class a extends fpq {
      public a(BooleanConsumer $$0, xh $$1, xh $$2, xh $$3, xh $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public void b(fkm $$0, int $$1, int $$2, float $$3) {
         fpw.a($$0, this.n, this.o);
      }
   }
}
