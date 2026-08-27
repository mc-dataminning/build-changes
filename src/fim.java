import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class fim extends fjo {
   private static final ajt a = new ajt("icon/draft_report");
   private int b;
   private final wg c;
   private final boolean d;
   private wg o;
   private final List<fdp> p = Lists.newArrayList();
   @Nullable
   private fdp q;

   public fim(@Nullable wg $$0, boolean $$1) {
      super(wg.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   protected void aN_() {
      this.b = 0;
      this.p.clear();
      wg $$0 = this.d ? wg.c("deathScreen.spectate") : wg.c("deathScreen.respawn");
      this.p.add(this.c(fdp.a($$0, $$0x -> {
         this.j.s.fX();
         $$0x.j = false;
      }).a(this.k / 2 - 100, this.l / 4 + 72, 200, 20).a()));
      this.q = this.c(
         fdp.a(wg.c("deathScreen.titleScreen"), $$0x -> this.j.ba().a(this.j, this, this::m, true)).a(this.k / 2 - 100, this.l / 4 + 96, 200, 20).a()
      );
      this.p.add(this.q);
      this.c(false);
      this.o = wg.a("deathScreen.score.value", wg.b(Integer.toString(this.j.s.fT())).a(n.o));
   }

   @Override
   public boolean aE_() {
      return false;
   }

   private void m() {
      if (this.d) {
         this.C();
      } else {
         fig $$0 = new fim.a($$0x -> {
            if ($$0x) {
               this.C();
            } else {
               this.j.s.fX();
               this.j.a(null);
            }
         }, wg.c("deathScreen.quit.confirm"), wf.a, wg.c("deathScreen.titleScreen"), wg.c("deathScreen.respawn"));
         this.j.a($$0);
         $$0.b(20);
      }
   }

   private void C() {
      if (this.j.r != null) {
         this.j.r.X();
      }

      this.j.b(new fiu(wg.c("menu.savingLevel")));
      this.j.a(new fjt());
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
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
         xd $$4 = this.a($$1);
         $$0.a(this.m, $$4, $$1, $$2);
      }

      if (this.q != null && this.j.ba().c()) {
         $$0.a(a, this.q.C() + this.q.x() - 17, this.q.D() + 3, 15, 15);
      }
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      $$0.b(0, 0, this.k, this.l, 1615855616, -1602211792);
   }

   @Nullable
   private xd a(int $$0) {
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
         xd $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.h() != null && $$3.h().a() == we.a.a) {
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
      for (fdp $$1 : this.p) {
         $$1.j = $$0;
      }
   }

   public static class a extends fig {
      public a(BooleanConsumer $$0, wg $$1, wg $$2, wg $$3, wg $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }
   }
}
