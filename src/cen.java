import java.util.List;
import javax.annotation.Nullable;

public class cen extends ces {
   private int a;
   private final bye b;
   @Nullable
   private crz c;
   private ceb d;

   public cen(bye $$0) {
      this.b = $$0;
   }

   @Override
   public boolean b() {
      List<cuk> $$0 = this.b.dV().a(cuk.class, this.b.cR().g(5.0));
      boolean $$1 = false;

      for (cuk $$2 : $$0) {
         bwv $$3 = $$2.cW();
         if ($$3 instanceof crz $$4 && (azq.e($$4.bg) > 0.0F || azq.e($$4.bi) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (azq.e(this.c.bg) > 0.0F || azq.e(this.c.bi) > 0.0F) || $$1;
   }

   @Override
   public boolean U_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.c != null && this.c.bY() && (azq.e(this.c.bg) > 0.0F || azq.e(this.c.bi) > 0.0F);
   }

   @Override
   public void d() {
      for (cuk $$1 : this.b.dV().a(cuk.class, this.b.cR().g(5.0))) {
         if ($$1.cW() instanceof crz $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = ceb.a;
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      boolean $$0 = azq.e(this.c.bg) > 0.0F || azq.e(this.c.bi) > 0.0F;
      float $$1 = this.d == ceb.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new ffs((double)this.b.bg, (double)this.b.bh, (double)this.b.bi));
      this.b.a(bya.a, this.b.dy());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == ceb.a) {
            iw $$2 = this.c.dv().a(this.c.cO().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.O().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = ceb.b;
            }
         } else if (this.d == ceb.b) {
            jc $$3 = this.c.cP();
            iw $$4 = this.c.dv().a($$3, 10);
            this.b.O().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = ceb.a;
            }
         }
      }
   }
}
