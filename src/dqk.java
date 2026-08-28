import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dqk extends drp {
   public static final eco<ecb> c = ecg.X;

   protected dqk(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqk> a();

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dkm $$0, iw $$1, jc $$2) {
      iw $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      for (jc $$1 : $$0.f()) {
         ebq $$2;
         if ($$1.o() == jc.a.b) {
            $$2 = this.m().b(c, $$1 == jc.b ? ecb.c : ecb.a).b(e, $$0.g());
         } else {
            $$2 = this.m().b(c, ecb.b).b(e, $$1.g());
         }

         if ($$2.a((dkm)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static jc n(ebq $$0) {
      switch ((ecb)$$0.c(c)) {
         case c:
            return jc.a;
         case a:
            return jc.b;
         default:
            return $$0.c(e);
      }
   }
}
