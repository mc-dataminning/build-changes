import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class fnh extends fod {
   private static final akr a = akr.b("icon/draft_report");
   private int b;
   private final wz c;
   private final boolean r;
   private wz s;
   private final List<fim> u = Lists.newArrayList();
   @Nullable
   private fim v;

   public fnh(@Nullable wz $$0, boolean $$1) {
      super(wz.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.r = $$1;
   }

   @Override
   protected void aT_() {
      this.b = 0;
      this.u.clear();
      wz $$0 = this.r ? wz.c("deathScreen.spectate") : wz.c("deathScreen.respawn");
      this.u.add(this.c(fim.a($$0, $$0x -> {
         this.l.s.fW();
         $$0x.j = false;
      }).a(this.m / 2 - 100, this.n / 4 + 72, 200, 20).a()));
      this.v = this.c(
         fim.a(wz.c("deathScreen.titleScreen"), $$0x -> this.l.aX().a(this.l, this, this::m, true)).a(this.m / 2 - 100, this.n / 4 + 96, 200, 20).a()
      );
      this.u.add(this.v);
      this.c(false);
      this.s = wz.a("deathScreen.score.value", wz.b(Integer.toString(this.l.s.fS())).a(n.o));
   }

   @Override
   public boolean aJ_() {
      return false;
   }

   private void m() {
      if (this.r) {
         this.C();
      } else {
         fnb $$0 = new fnh.a($$0x -> {
            if ($$0x) {
               this.C();
            } else {
               this.l.s.fW();
               this.l.a(null);
            }
         }, wz.c("deathScreen.quit.confirm"), wy.a, wz.c("deathScreen.titleScreen"), wz.c("deathScreen.respawn"));
         this.l.a($$0);
         $$0.b(20);
      }
   }

   private void C() {
      if (this.l.r != null) {
         this.l.r.Y();
      }

      this.l.b(new fno(wz.c("menu.savingLevel")));
      this.l.a(new fof());
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().b(2.0F, 2.0F, 2.0F);
      $$0.a(this.o, this.k, this.m / 2 / 2, 30, 16777215);
      $$0.c().b();
      if (this.c != null) {
         $$0.a(this.o, this.c, this.m / 2, 85, 16777215);
      }

      $$0.a(this.o, this.s, this.m / 2, 100, 16777215);
      if (this.c != null && $$2 > 85 && $$2 < 85 + 9) {
         xw $$4 = this.a($$1);
         $$0.a(this.o, $$4, $$1, $$2);
      }

      if (this.v != null && this.l.aX().c()) {
         $$0.a(a, this.v.D() + this.v.y() - 17, this.v.E() + 3, 15, 15);
      }
   }

   @Override
   public void b(fhz $$0, int $$1, int $$2, float $$3) {
      a($$0, this.m, this.n);
   }

   static void a(fhz $$0, int $$1, int $$2) {
      $$0.b(0, 0, $$1, $$2, 1615855616, -1602211792);
   }

   @Nullable
   private xw a(int $$0) {
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
         xw $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.h() != null && $$3.h().a() == wx.a.a) {
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
      for (fim $$1 : this.u) {
         $$1.j = $$0;
      }
   }

   public static class a extends fnb {
      public a(BooleanConsumer $$0, wz $$1, wz $$2, wz $$3, wz $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public void b(fhz $$0, int $$1, int $$2, float $$3) {
         fnh.a($$0, this.m, this.n);
      }
   }
}
