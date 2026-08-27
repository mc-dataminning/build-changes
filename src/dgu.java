import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgu extends dhw {
   public static final dsb<dro> K = drt.U;

   protected dgu(drc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dgu> a();

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(dbc $$0, io $$1, it $$2) {
      io $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      for (it $$1 : $$0.f()) {
         drd $$2;
         if ($$1.o() == it.a.b) {
            $$2 = this.n().a(K, $$1 == it.b ? dro.c : dro.a).a(aE, $$0.g());
         } else {
            $$2 = this.n().a(K, dro.b).a(aE, $$1.g());
         }

         if ($$2.a((dbc)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static it m(drd $$0) {
      switch ((dro)$$0.c(K)) {
         case c:
            return it.a;
         case a:
            return it.b;
         default:
            return $$0.c(aE);
      }
   }
}
