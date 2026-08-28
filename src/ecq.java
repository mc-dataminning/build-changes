import com.mojang.serialization.Codec;

public class ecq extends ebk<edy> {
   public ecq(Codec<edy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebm<edy> $$0) {
      boolean $$1 = false;
      ayo $$2 = $$0.d();
      ddb $$3 = $$0.b();
      ja $$4 = $$0.e();
      edy $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dyf.a.d, $$4.u() + $$6, $$4.w() + $$7);
      ja $$9 = new ja($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dfj.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dsk $$11 = $$10 ? dfj.bx.o() : dfj.bw.o();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dsk $$12 = $$11.a(dnn.d, dtg.a);
               ja $$13 = $$9.c();
               if ($$3.a_($$13).a(dfj.G)) {
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
