import com.mojang.serialization.MapCodec;

public abstract class dej extends dea {
   protected dej(drc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dej> a();

   protected boolean b(drd $$0, daf $$1, io $$2) {
      return $$0.a(avx.af) || $$0.a(dec.cC);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return !$$0.a($$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      io $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(drd $$0, daf $$1, io $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return $$1 == enl.c && !this.aG ? true : super.a($$0, $$1);
   }
}
