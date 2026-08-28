import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dic extends dje {
   public static final dtj<dsw> K = dtb.U;

   protected dic(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dic> a();

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(dcj $$0, ja $$1, jf $$2) {
      ja $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      for (jf $$1 : $$0.f()) {
         dsl $$2;
         if ($$1.o() == jf.a.b) {
            $$2 = this.o().a(K, $$1 == jf.b ? dsw.c : dsw.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dsw.b).a(aE, $$1.g());
         }

         if ($$2.a((dcj)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static jf m(dsl $$0) {
      switch ((dsw)$$0.c(K)) {
         case c:
            return jf.a;
         case a:
            return jf.b;
         default:
            return $$0.c(aE);
      }
   }
}
