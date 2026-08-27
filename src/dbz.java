import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dbz extends dda {
   public static final dnc<dmp> K = dmu.U;

   protected dbz(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dbz> a();

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(cwh $$0, ib $$1, ih $$2) {
      ib $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      for (ih $$1 : $$0.f()) {
         dme $$2;
         if ($$1.o() == ih.a.b) {
            $$2 = this.o().a(K, $$1 == ih.b ? dmp.c : dmp.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dmp.b).a(aE, $$1.g());
         }

         if ($$2.a((cwh)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ih m(dme $$0) {
      switch ((dmp)$$0.c(K)) {
         case c:
            return ih.a;
         case a:
            return ih.b;
         default:
            return $$0.c(aE);
      }
   }
}
