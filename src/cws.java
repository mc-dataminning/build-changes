import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cws extends cxu {
   public static final dgz<dgm> K = dgr.U;

   protected cws(dga.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cws> a();

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return b($$1, $$2, h($$0).g());
   }

   public static boolean b(crc $$0, ht $$1, hx $$2) {
      ht $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      for (hx $$1 : $$0.f()) {
         dgb $$2;
         if ($$1.o() == hx.a.b) {
            $$2 = this.o().a(K, $$1 == hx.b ? dgm.c : dgm.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dgm.b).a(aE, $$1.g());
         }

         if ($$2.a((crc)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static hx h(dgb $$0) {
      switch ((dgm)$$0.c(K)) {
         case c:
            return hx.a;
         case a:
            return hx.b;
         default:
            return $$0.c(aE);
      }
   }
}
