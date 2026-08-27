import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class fnk extends fon {
   private static final akt a = new akt("icon/draft_report");
   private int b;
   private final xe c;
   private final boolean d;
   private xe r;
   private final List<fin> s = Lists.newArrayList();
   @Nullable
   private fin u;

   public fnk(@Nullable xe $$0, boolean $$1) {
      super(xe.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   protected void aN_() {
      this.b = 0;
      this.s.clear();
      xe $$0 = this.d ? xe.c("deathScreen.spectate") : xe.c("deathScreen.respawn");
      this.s.add(this.c(fin.a($$0, $$0x -> {
         this.m.s.gj();
         $$0x.j = false;
      }).a(this.n / 2 - 100, this.o / 4 + 72, 200, 20).a()));
      this.u = this.c(
         fin.a(xe.c("deathScreen.titleScreen"), $$0x -> this.m.bb().a(this.m, this, this::B, true)).a(this.n / 2 - 100, this.o / 4 + 96, 200, 20).a()
      );
      this.s.add(this.u);
      this.c(false);
      this.r = xe.a("deathScreen.score.value", xe.b(Integer.toString(this.m.s.gf())).a(n.o));
   }

   @Override
   public boolean aD_() {
      return false;
   }

   private void B() {
      if (this.d) {
         this.C();
      } else {
         fne $$0 = new fnk.a($$0x -> {
            if ($$0x) {
               this.C();
            } else {
               this.m.s.gj();
               this.m.a(null);
            }
         }, xe.c("deathScreen.quit.confirm"), xd.a, xe.c("deathScreen.titleScreen"), xe.c("deathScreen.respawn"));
         this.m.a($$0);
         $$0.b(20);
      }
   }

   private void C() {
      if (this.m.r != null) {
         this.m.r.Y();
      }

      this.m.b(new fns(xe.c("menu.savingLevel")));
      this.m.a(new fou());
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
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
         yb $$4 = this.a($$1);
         $$0.a(this.p, $$4, $$1, $$2);
      }

      if (this.u != null && this.m.bb().c()) {
         $$0.a(a, this.u.C() + this.u.x() - 17, this.u.D() + 3, 15, 15);
      }
   }

   @Override
   public void b(fia $$0, int $$1, int $$2, float $$3) {
      $$0.b(0, 0, this.n, this.o, 1615855616, -1602211792);
   }

   @Nullable
   private yb a(int $$0) {
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
         yb $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.h() != null && $$3.h().a() == xc.a.a) {
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
      for (fin $$1 : this.s) {
         $$1.j = $$0;
      }
   }

   public static class a extends fne {
      public a(BooleanConsumer $$0, xe $$1, xe $$2, xe $$3, xe $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }
   }
}
