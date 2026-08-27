import com.mojang.serialization.MapCodec;

public abstract class cwi extends cvz {
   protected cwi(dio.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cwi> a();

   protected boolean b(dip $$0, cse $$1, hv $$2) {
      return $$0.a(arr.af) || $$0.a(cwb.cC);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return !$$0.a($$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      hv $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   public boolean a_(dip $$0, cse $$1, hv $$2) {
      return $$0.u().c();
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return $$3 == eep.c && !this.aG ? true : super.a($$0, $$1, $$2, $$3);
   }
}
