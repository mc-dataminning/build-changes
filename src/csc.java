import javax.annotation.Nullable;

public class csc extends crx implements csb {
   public csc(dex.d $$0) {
      super($$0);
   }

   @Override
   public chk a() {
      return chk.a;
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new dcf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return a($$2, dcm.o, dcf::a);
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.B) {
         return bgo.a;
      } else {
         dck $$6 = $$1.c_($$2);
         if ($$6 instanceof dcf) {
            $$3.a((dcf)$$6);
            $$3.a(ape.ab);
         }

         return bgo.b;
      }
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, biw $$3, ciw $$4) {
      if ($$4.A()) {
         dck $$5 = $$0.c_($$1);
         if ($$5 instanceof dcf) {
            ((dcf)$$5).a($$4.y());
         }
      }
   }
}
