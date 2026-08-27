import java.util.List;
import javax.annotation.Nullable;

public class cqx extends crn {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cqx(crn.a $$0) {
      super($$0);
   }

   @Override
   public bof a(cuz $$0) {
      czg $$1 = $$0.q();
      if (!$$1.B) {
         crs $$2 = $$0.n();
         esj $$3 = $$0.l();
         ij $$4 = $$0.k();
         ckn $$5 = new ckn($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.g(1);
      }

      return bof.a($$1.B);
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      if ($$1.fB()) {
         crs $$3 = $$1.b($$2);
         if (!$$0.B) {
            ckn $$4 = new ckn($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(auz.c.b(this));
         }

         return bog.a($$1.b($$2), $$0.x_());
      } else {
         return bog.c($$1.b($$2));
      }
   }

   @Override
   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
      cuh $$4 = $$0.a(jr.K);
      if ($$4 != null) {
         $$4.a($$2::add, $$3);
      }
   }
}
