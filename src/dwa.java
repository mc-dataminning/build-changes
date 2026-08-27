import com.mojang.serialization.Codec;

public class dwa extends duu<dxi> {
   public dwa(Codec<dxi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(duw<dxi> $$0) {
      boolean $$1 = false;
      awt $$2 = $$0.d();
      cwz $$3 = $$0.b();
      ib $$4 = $$0.e();
      dxi $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(drq.a.d, $$4.u() + $$6, $$4.w() + $$7);
      ib $$9 = new ib($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(czh.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dme $$11 = $$10 ? czh.bx.o() : czh.bw.o();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dme $$12 = $$11.a(dhk.d, dna.a);
               ib $$13 = $$9.c();
               if ($$3.a_($$13).a(czh.G)) {
                  $$3.a($$9, $$11, 2);
                  $$3.a($$13, $$12, 2);
               }
            } else {
               $$3.a($$9, $$11, 2);
            }

            $$1 = true;
         }
      }

      return $$1;
   }
}
