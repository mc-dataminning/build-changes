import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class fra extends frw {
   private static final alj a = alj.b("icon/draft_report");
   private int b;
   private final xj c;
   private final boolean d;
   private xj s;
   private final List<fmd> u = Lists.newArrayList();
   @Nullable
   private fmd v;

   public fra(@Nullable xj $$0, boolean $$1) {
      super(xj.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   protected void aR_() {
      this.b = 0;
      this.u.clear();
      xj $$0 = this.d ? xj.c("deathScreen.spectate") : xj.c("deathScreen.respawn");
      this.u.add(this.c(fmd.a($$0, $$0x -> {
         this.m.t.ge();
         $$0x.j = false;
      }).a(this.n / 2 - 100, this.o / 4 + 72, 200, 20).a()));
      this.v = this.c(
         fmd.a(xj.c("deathScreen.titleScreen"), $$0x -> this.m.bb().a(this.m, this, this::m, true)).a(this.n / 2 - 100, this.o / 4 + 96, 200, 20).a()
      );
      this.u.add(this.v);
      this.c(false);
      this.s = xj.a("deathScreen.score.value", xj.b(Integer.toString(this.m.t.gb())).a(n.o));
   }

   @Override
   public boolean aG_() {
      return false;
   }

   private void m() {
      if (this.d) {
         this.F();
      } else {
         fqu $$0 = new fra.a($$0x -> {
            if ($$0x) {
               this.F();
            } else {
               this.m.t.ge();
               this.m.a(null);
            }
         }, xj.c("deathScreen.quit.confirm"), xi.a, xj.c("deathScreen.titleScreen"), xj.c("deathScreen.respawn"));
         this.m.a($$0);
         $$0.b(20);
      }
   }

   private void F() {
      if (this.m.s != null) {
         this.m.s.aa();
      }

      this.m.b(new frh(xj.c("menu.savingLevel")));
      this.m.a(new fry());
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
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
         yg $$4 = this.a($$1);
         $$0.a(this.p, $$4, $$1, $$2);
      }

      if (this.v != null && this.m.bb().c()) {
         $$0.a(gjq::B, a, this.v.D() + this.v.y() - 17, this.v.E() + 3, 15, 15);
      }
   }

   @Override
   public void b(flq $$0, int $$1, int $$2, float $$3) {
      a($$0, this.n, this.o);
   }

   static void a(flq $$0, int $$1, int $$2) {
      $$0.b(0, 0, $$1, $$2, 1615855616, -1602211792);
   }

   @Nullable
   private yg a(int $$0) {
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
         yg $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.h() != null && $$3.h().a() == xh.a.a) {
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
      for (fmd $$1 : this.u) {
         $$1.j = $$0;
      }
   }

   public static class a extends fqu {
      public a(BooleanConsumer $$0, xj $$1, xj $$2, xj $$3, xj $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public void b(flq $$0, int $$1, int $$2, float $$3) {
         fra.a($$0, this.n, this.o);
      }
   }
}
