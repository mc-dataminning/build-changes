import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czu extends czo implements czt {
   public static final MapCodec<czu> a = b(czu::new);

   @Override
   public MapCodec<czu> a() {
      return a;
   }

   public czu(dna.d $$0) {
      super($$0);
   }

   @Override
   public cpd b() {
      return cpd.a;
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dkd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return a($$2, dkk.o, dkd::a);
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         return bnd.a;
      } else {
         dki $$5 = $$1.c_($$2);
         if ($$5 instanceof dkd) {
            $$3.a((dkd)$$5);
            $$3.a(aui.ab);
         }

         return bnd.b;
      }
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, bpp $$3, cqm $$4) {
      if ($$4.B()) {
         dki $$5 = $$0.c_($$1);
         if ($$5 instanceof dkd) {
            ((dkd)$$5).a($$4.z());
         }
      }
   }
}
