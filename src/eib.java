import com.mojang.serialization.Codec;

public class eib extends eit<ekp> {
   public eib(Codec<ekp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eiv<ekp> $$0) {
      iu $$1 = $$0.e();
      djo $$2 = $$0.b();
      azt $$3 = $$0.d();
      ekp $$4 = $$0.f();
      if ($$1.v() < $$2.G_() + 5) {
         return false;
      } else {
         int $$5 = 2 + $$3.a(2);
         int $$6 = 2 + $$3.a(2);

         for (iu $$7 : iu.c($$1.b(-$$5, 0, -$$6), $$1.b($$5, 1, $$6))) {
            int $$8 = $$1.u() - $$7.u();
            int $$9 = $$1.w() - $$7.w();
            if ((float)($$8 * $$8 + $$9 * $$9) <= $$3.i() * 10.0F - $$3.i() * 6.0F) {
               this.a($$2, $$7, $$3, $$4);
            } else if ((double)$$3.i() < 0.031) {
               this.a($$2, $$7, $$3, $$4);
            }
         }

         return true;
      }
   }

   private boolean a(diq $$0, iu $$1, azt $$2) {
      iu $$3 = $$1.e();
      dzo $$4 = $$0.a_($$3);
      return $$4.a(dlw.lg) ? $$2.h() : $$4.c($$0, $$3, ja.b);
   }

   private void a(diq $$0, iu $$1, azt $$2, ekp $$3) {
      if ($$0.v($$1) && this.a($$0, $$1, $$2)) {
         $$0.a($$1, $$3.b.a($$2, $$1), 260);
      }
   }
}
