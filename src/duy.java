import com.mojang.serialization.Codec;

public class duy extends dts<dwg> {
   public duy(Codec<dwg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtu<dwg> $$0) {
      boolean $$1 = false;
      awo $$2 = $$0.d();
      cwi $$3 = $$0.b();
      hz $$4 = $$0.e();
      dwg $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dqo.a.d, $$4.u() + $$6, $$4.w() + $$7);
      hz $$9 = new hz($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(cyq.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dlf $$11 = $$10 ? cyq.bx.o() : cyq.bw.o();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dlf $$12 = $$11.a(dgt.d, dmb.a);
               hz $$13 = $$9.c();
               if ($$3.a_($$13).a(cyq.G)) {
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
