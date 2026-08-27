import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dbm extends dcn {
   public static final dmh<dlu> K = dlz.U;

   protected dbm(dli.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dbm> a();

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(cvu $$0, hz $$1, ie $$2) {
      hz $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      for (ie $$1 : $$0.f()) {
         dlj $$2;
         if ($$1.o() == ie.a.b) {
            $$2 = this.o().a(K, $$1 == ie.b ? dlu.c : dlu.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dlu.b).a(aE, $$1.g());
         }

         if ($$2.a((cvu)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ie m(dlj $$0) {
      switch ((dlu)$$0.c(K)) {
         case c:
            return ie.a;
         case a:
            return ie.b;
         default:
            return $$0.c(aE);
      }
   }
}
