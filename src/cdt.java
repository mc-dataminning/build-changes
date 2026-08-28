import java.util.List;
import javax.annotation.Nullable;

public class cdt extends cdy {
   private int a;
   private final bxk b;
   @Nullable
   private cqy c;
   private cdh d;

   public cdt(bxk $$0) {
      this.b = $$0;
   }

   @Override
   public boolean b() {
      List<cti> $$0 = this.b.dV().a(cti.class, this.b.cR().g(5.0));
      boolean $$1 = false;

      for (cti $$2 : $$0) {
         bwd $$3 = $$2.cW();
         if ($$3 instanceof cqy $$4 && (azm.e($$4.bg) > 0.0F || azm.e($$4.bi) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (azm.e(this.c.bg) > 0.0F || azm.e(this.c.bi) > 0.0F) || $$1;
   }

   @Override
   public boolean P_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.c != null && this.c.bZ() && (azm.e(this.c.bg) > 0.0F || azm.e(this.c.bi) > 0.0F);
   }

   @Override
   public void d() {
      for (cti $$1 : this.b.dV().a(cti.class, this.b.cR().g(5.0))) {
         if ($$1.cW() instanceof cqy $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = cdh.a;
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      boolean $$0 = azm.e(this.c.bg) > 0.0F || azm.e(this.c.bi) > 0.0F;
      float $$1 = this.d == cdh.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new fei((double)this.b.bg, (double)this.b.bh, (double)this.b.bi));
      this.b.a(bxg.a, this.b.dy());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == cdh.a) {
            iu $$2 = this.c.dv().a(this.c.cO().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.O().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = cdh.b;
            }
         } else if (this.d == cdh.b) {
            ja $$3 = this.c.cP();
            iu $$4 = this.c.dv().a($$3, 10);
            this.b.O().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = cdh.a;
            }
         }
      }
   }
}
