import java.util.List;
import javax.annotation.Nullable;

public class cel extends ceq {
   private int a;
   private final byc b;
   @Nullable
   private crx c;
   private cdz d;

   public cel(byc $$0) {
      this.b = $$0;
   }

   @Override
   public boolean b() {
      List<cui> $$0 = this.b.dV().a(cui.class, this.b.cR().g(5.0));
      boolean $$1 = false;

      for (cui $$2 : $$0) {
         bwt $$3 = $$2.cW();
         if ($$3 instanceof crx $$4 && (azo.e($$4.bg) > 0.0F || azo.e($$4.bi) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (azo.e(this.c.bg) > 0.0F || azo.e(this.c.bi) > 0.0F) || $$1;
   }

   @Override
   public boolean U_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.c != null && this.c.bY() && (azo.e(this.c.bg) > 0.0F || azo.e(this.c.bi) > 0.0F);
   }

   @Override
   public void d() {
      for (cui $$1 : this.b.dV().a(cui.class, this.b.cR().g(5.0))) {
         if ($$1.cW() instanceof crx $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = cdz.a;
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      boolean $$0 = azo.e(this.c.bg) > 0.0F || azo.e(this.c.bi) > 0.0F;
      float $$1 = this.d == cdz.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new ffq((double)this.b.bg, (double)this.b.bh, (double)this.b.bi));
      this.b.a(bxy.a, this.b.dy());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == cdz.a) {
            iv $$2 = this.c.dv().a(this.c.cO().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.O().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = cdz.b;
            }
         } else if (this.d == cdz.b) {
            jb $$3 = this.c.cP();
            iv $$4 = this.c.dv().a($$3, 10);
            this.b.O().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = cdz.a;
            }
         }
      }
   }
}
