import com.mojang.serialization.MapCodec;

public abstract class cvj extends cva {
   protected cvj(dhh.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cvj> a();

   protected boolean b(dhi $$0, crg $$1, ht $$2) {
      return $$0.a(arg.af) || $$0.a(cvc.cC);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return !$$0.a($$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      ht $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   public boolean a_(dhi $$0, crg $$1, ht $$2) {
      return $$0.u().c();
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return $$3 == edi.c && !this.aG ? true : super.a($$0, $$1, $$2, $$3);
   }
}
