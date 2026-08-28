import com.mojang.serialization.Codec;

public class emc extends ekw<enl> {
   public emc(Codec<enl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<enl> $$0) {
      boolean $$1 = false;
      bai $$2 = $$0.d();
      dli $$3 = $$0.b();
      iw $$4 = $$0.e();
      enl $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(ehp.a.d, $$4.u() + $$6, $$4.w() + $$7);
      iw $$9 = new iw($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dnq.J)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         ebq $$11 = $$10 ? dnq.bH.m() : dnq.bG.m();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               ebq $$12 = $$11.b(dwf.d, ecm.a);
               iw $$13 = $$9.d();
               if ($$3.a_($$13).a(dnq.J)) {
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
