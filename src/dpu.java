import com.mojang.serialization.Codec;

public class dpu extends doo<drc> {
   public dpu(Codec<drc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doq<drc> $$0) {
      boolean $$1 = false;
      ate $$2 = $$0.d();
      crt $$3 = $$0.b();
      ht $$4 = $$0.e();
      drc $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dlk.a.d, $$4.u() + $$6, $$4.w() + $$7);
      ht $$9 = new ht($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(cuc.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dgb $$11 = $$10 ? cuc.bx.o() : cuc.bw.o();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dgb $$12 = $$11.a(dce.d, dgx.a);
               ht $$13 = $$9.c();
               if ($$3.a_($$13).a(cuc.G)) {
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
