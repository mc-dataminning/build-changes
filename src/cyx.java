import com.mojang.serialization.MapCodec;

public abstract class cyx extends cyo {
   protected cyx(dle.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cyx> a();

   protected boolean b(dlf $$0, cut $$1, hz $$2) {
      return $$0.a(atz.af) || $$0.a(cyq.cC);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return !$$0.a($$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      hz $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(dlf $$0, cut $$1, hz $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return $$3 == ehf.c && !this.aG ? true : super.a($$0, $$1, $$2, $$3);
   }
}
