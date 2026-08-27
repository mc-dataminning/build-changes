import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class ezg extends fah {
   private static final agg a = new agg("icon/draft_report");
   private int b;
   private final ur c;
   private final boolean k;
   private ur l;
   private final List<eum> m = Lists.newArrayList();
   @Nullable
   private eum n;

   public ezg(@Nullable ur $$0, boolean $$1) {
      super(ur.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.k = $$1;
   }

   @Override
   protected void aO_() {
      this.b = 0;
      this.m.clear();
      ur $$0 = this.k ? ur.c("deathScreen.spectate") : ur.c("deathScreen.respawn");
      this.m.add(this.d(eum.a($$0, $$0x -> {
         this.f.s.fQ();
         $$0x.i = false;
      }).a(this.g / 2 - 100, this.h / 4 + 72, 200, 20).a()));
      this.n = this.d(
         eum.a(ur.c("deathScreen.titleScreen"), $$0x -> this.f.aW().a(this.f, this, this::l, true)).a(this.g / 2 - 100, this.h / 4 + 96, 200, 20).a()
      );
      this.m.add(this.n);
      this.c(false);
      this.l = ur.a("deathScreen.score.value", ur.b(Integer.toString(this.f.s.fN())).a(n.o));
   }

   @Override
   public boolean aD_() {
      return false;
   }

   private void l() {
      if (this.k) {
         this.C();
      } else {
         eza $$0 = new ezg.a($$0x -> {
            if ($$0x) {
               this.C();
            } else {
               this.f.s.fQ();
               this.f.a(null);
            }
         }, ur.c("deathScreen.quit.confirm"), uq.a, ur.c("deathScreen.titleScreen"), ur.c("deathScreen.respawn"));
         this.f.a($$0);
         $$0.b(20);
      }
   }

   private void C() {
      if (this.f.r != null) {
         this.f.r.U();
      }

      this.f.b(new ezn(ur.c("menu.savingLevel")));
      this.f.a(new fam());
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().b(2.0F, 2.0F, 2.0F);
      $$0.a(this.i, this.e, this.g / 2 / 2, 30, 16777215);
      $$0.c().b();
      if (this.c != null) {
         $$0.a(this.i, this.c, this.g / 2, 85, 16777215);
      }

      $$0.a(this.i, this.l, this.g / 2, 100, 16777215);
      if (this.c != null && $$2 > 85 && $$2 < 85 + 9) {
         vo $$4 = this.a($$1);
         $$0.a(this.i, $$4, $$1, $$2);
      }

      if (this.n != null && this.f.aW().c()) {
         $$0.a(a, this.n.p() + this.n.k() - 17, this.n.r() + 3, 15, 15);
      }
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
      $$0.b(0, 0, this.g, this.h, 1615855616, -1602211792);
   }

   @Nullable
   private vo a(int $$0) {
      if (this.c == null) {
         return null;
      } else {
         int $$1 = this.f.h.a(this.c);
         int $$2 = this.g / 2 - $$1 / 2;
         int $$3 = this.g / 2 + $$1 / 2;
         return $$0 >= $$2 && $$0 <= $$3 ? this.f.h.b().a(this.c, $$0 - $$2) : null;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.c != null && $$1 > 85.0 && $$1 < (double)(85 + 9)) {
         vo $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.h() != null && $$3.h().a() == up.a.a) {
            this.a($$3);
            return false;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public void d() {
      super.d();
      this.b++;
      if (this.b == 20) {
         this.c(true);
      }
   }

   private void c(boolean $$0) {
      for (eum $$1 : this.m) {
         $$1.i = $$0;
      }
   }

   public static class a extends eza {
      public a(BooleanConsumer $$0, ur $$1, ur $$2, ur $$3, ur $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }
   }
}
