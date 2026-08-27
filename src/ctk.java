import java.util.List;
import javax.annotation.Nullable;

public class ctk extends cuc {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public ctk(cuc.a $$0) {
      super($$0);
   }

   @Override
   public bqa a(cyf $$0) {
      dca $$1 = $$0.q();
      if (!$$1.C) {
         cuh $$2 = $$0.n();
         ewu $$3 = $$0.l();
         iw $$4 = $$0.k();
         cmm $$5 = new cmm($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bqa.a($$1.C);
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      if ($$1.fN()) {
         cuh $$3 = $$1.b($$2);
         if (!$$0.C) {
            cmm $$4 = new cmm($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(avz.c.b(this));
         }

         return bqb.a($$1.b($$2), $$0.x_());
      } else {
         return bqb.c($$1.b($$2));
      }
   }

   @Override
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      cxk $$4 = $$0.a(ke.T);
      if ($$4 != null) {
         $$4.a($$2::add, $$3);
      }
   }
}
