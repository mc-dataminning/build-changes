import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class ftp extends ful {
   private static final akv a = akv.b("icon/draft_report");
   private int b;
   private final wp c;
   private final boolean d;
   private wp s;
   private final List<fot> u = Lists.newArrayList();
   @Nullable
   private fot v;

   public ftp(@Nullable wp $$0, boolean $$1) {
      super(wp.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   protected void aR_() {
      this.b = 0;
      this.u.clear();
      wp $$0 = this.d ? wp.c("deathScreen.spectate") : wp.c("deathScreen.respawn");
      this.u.add(this.c(fot.a($$0, $$0x -> {
         this.m.t.gg();
         $$0x.j = false;
      }).a(this.n / 2 - 100, this.o / 4 + 72, 200, 20).a()));
      this.v = this.c(
         fot.a(wp.c("deathScreen.titleScreen"), $$0x -> this.m.ba().a(this.m, this, this::m, true)).a(this.n / 2 - 100, this.o / 4 + 96, 200, 20).a()
      );
      this.u.add(this.v);
      this.c(false);
      this.s = wp.a("deathScreen.score.value", wp.b(Integer.toString(this.m.t.gd())).a(n.o));
   }

   @Override
   public boolean aG_() {
      return false;
   }

   private void m() {
      if (this.d) {
         this.E();
      } else {
         ftj $$0 = new ftp.a($$0x -> {
            if ($$0x) {
               this.E();
            } else {
               this.m.t.gg();
               this.m.a(null);
            }
         }, wp.c("deathScreen.quit.confirm"), wo.a, wp.c("deathScreen.titleScreen"), wp.c("deathScreen.respawn"));
         this.m.a($$0);
         $$0.b(20);
      }
   }

   private void E() {
      if (this.m.s != null) {
         this.m.s.ac();
      }

      this.m.b(new ftw(wp.c("menu.savingLevel")));
      this.m.a(new fun());
   }

   @Override
   public void a(foe $$0, int $$1, int $$2, float $$3) {
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
         xm $$4 = this.a($$1);
         $$0.a(this.p, $$4, $$1, $$2);
      }

      if (this.v != null && this.m.ba().c()) {
         $$0.a(gmi::H, a, this.v.F() + this.v.A() - 17, this.v.G() + 3, 15, 15);
      }
   }

   @Override
   public void b(foe $$0, int $$1, int $$2, float $$3) {
      a($$0, this.n, this.o);
   }

   static void a(foe $$0, int $$1, int $$2) {
      $$0.b(0, 0, $$1, $$2, 1615855616, -1602211792);
   }

   @Nullable
   private xm a(int $$0) {
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
         xm $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.i() != null && $$3.i().a() == wn.a.a) {
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
      for (fot $$1 : this.u) {
         $$1.j = $$0;
      }
   }

   public static class a extends ftj {
      public a(BooleanConsumer $$0, wp $$1, wp $$2, wp $$3, wp $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public void b(foe $$0, int $$1, int $$2, float $$3) {
         ftp.a($$0, this.n, this.o);
      }
   }
}
