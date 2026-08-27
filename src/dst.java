import com.mojang.serialization.Codec;

public class dst extends drn<dub> {
   public dst(Codec<dub> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drp<dub> $$0) {
      boolean $$1 = false;
      aup $$2 = $$0.d();
      cud $$3 = $$0.b();
      hx $$4 = $$0.e();
      dub $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(doj.a.d, $$4.u() + $$6, $$4.w() + $$7);
      hx $$9 = new hx($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(cwl.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dja $$11 = $$10 ? cwl.bx.o() : cwl.bw.o();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dja $$12 = $$11.a(deo.d, djw.a);
               hx $$13 = $$9.c();
               if ($$3.a_($$13).a(cwl.G)) {
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
