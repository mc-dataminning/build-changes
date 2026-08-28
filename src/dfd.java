import com.mojang.serialization.MapCodec;

public abstract class dfd extends deu {
   protected dfd(drw.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfd> a();

   protected boolean b(drx $$0, daz $$1, iz $$2) {
      return $$0.a(awl.af) || $$0.a(dew.cC);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      iz $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(drx $$0, daz $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return $$1 == eof.c && !this.aG ? true : super.a($$0, $$1);
   }
}
