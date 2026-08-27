import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import javax.annotation.Nullable;

public class fbs extends fct {
   private static final ahd a = new ahd("icon/draft_report");
   private int b;
   private final vd c;
   private final boolean k;
   private vd l;
   private final List<ewy> m = Lists.newArrayList();
   @Nullable
   private ewy n;

   public fbs(@Nullable vd $$0, boolean $$1) {
      super(vd.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.c = $$0;
      this.k = $$1;
   }

   @Override
   protected void aN_() {
      this.b = 0;
      this.m.clear();
      vd $$0 = this.k ? vd.c("deathScreen.spectate") : vd.c("deathScreen.respawn");
      this.m.add(this.d(ewy.a($$0, $$0x -> {
         this.f.s.fQ();
         $$0x.j = false;
      }).a(this.g / 2 - 100, this.h / 4 + 72, 200, 20).a()));
      this.n = this.d(
         ewy.a(vd.c("deathScreen.titleScreen"), $$0x -> this.f.aW().a(this.f, this, this::n, true)).a(this.g / 2 - 100, this.h / 4 + 96, 200, 20).a()
      );
      this.m.add(this.n);
      this.c(false);
      this.l = vd.a("deathScreen.score.value", vd.b(Integer.toString(this.f.s.fN())).a(n.o));
   }

   @Override
   public boolean aL_() {
      return false;
   }

   private void n() {
      if (this.k) {
         this.C();
      } else {
         fbm $$0 = new fbs.a($$0x -> {
            if ($$0x) {
               this.C();
            } else {
               this.f.s.fQ();
               this.f.a(null);
            }
         }, vd.c("deathScreen.quit.confirm"), vc.a, vd.c("deathScreen.titleScreen"), vd.c("deathScreen.respawn"));
         this.f.a($$0);
         $$0.b(20);
      }
   }

   private void C() {
      if (this.f.r != null) {
         this.f.r.W();
      }

      this.f.b(new fbz(vd.c("menu.savingLevel")));
      this.f.a(new fcy());
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
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
         wa $$4 = this.a($$1);
         $$0.a(this.i, $$4, $$1, $$2);
      }

      if (this.n != null && this.f.aW().c()) {
         $$0.a(a, this.n.B() + this.n.w() - 17, this.n.C() + 3, 15, 15);
      }
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      $$0.b(0, 0, this.g, this.h, 1615855616, -1602211792);
   }

   @Nullable
   private wa a(int $$0) {
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
         wa $$3 = this.a((int)$$0);
         if ($$3 != null && $$3.h() != null && $$3.h().a() == vb.a.a) {
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
   public void d() {
      super.d();
      this.b++;
      if (this.b == 20) {
         this.c(true);
      }
   }

   private void c(boolean $$0) {
      for (ewy $$1 : this.m) {
         $$1.j = $$0;
      }
   }

   public static class a extends fbm {
      public a(BooleanConsumer $$0, vd $$1, vd $$2, vd $$3, vd $$4) {
         super($$0, $$1, $$2, $$3, $$4);
      }
   }
}
