import com.mojang.serialization.MapCodec;

public abstract class czb extends cys {
   protected czb(dli.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends czb> a();

   protected boolean b(dlj $$0, cux $$1, hz $$2) {
      return $$0.a(aua.af) || $$0.a(cyu.cC);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return !$$0.a($$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      hz $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(dlj $$0, cux $$1, hz $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return $$3 == ehm.c && !this.aG ? true : super.a($$0, $$1, $$2, $$3);
   }
}
