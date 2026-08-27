import com.mojang.serialization.MapCodec;

public abstract class cvp extends cvz {
   protected static final int a = 2;
   protected static final elu b = cvz.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected cvp(dio.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cvp> a();

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return b;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$1 == ia.a && !this.a($$0, $$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return a($$1, $$2.d(), ia.b);
   }
}
