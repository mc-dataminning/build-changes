import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cus extends cum implements cur {
   public static final MapCodec<cus> a = b(cus::new);

   @Override
   public MapCodec<cus> a() {
      return a;
   }

   public cus(dhh.d $$0) {
      super($$0);
   }

   @Override
   public cjx b() {
      return cjx.a;
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dey($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return a($$2, dff.o, dey::a);
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         return bix.a;
      } else {
         dfd $$6 = $$1.c_($$2);
         if ($$6 instanceof dey) {
            $$3.a((dey)$$6);
            $$3.a(arb.ab);
         }

         return bix.b;
      }
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, blg $$3, clj $$4) {
      if ($$4.A()) {
         dfd $$5 = $$0.c_($$1);
         if ($$5 instanceof dey) {
            ((dey)$$5).a($$4.y());
         }
      }
   }
}
