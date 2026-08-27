import com.mojang.serialization.MapCodec;

public abstract class cws extends cwj {
   protected cws(diz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cws> a();

   protected boolean b(dja $$0, cso $$1, hx $$2) {
      return $$0.a(asb.af) || $$0.a(cwl.cC);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      hx $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   public boolean a_(dja $$0, cso $$1, hx $$2) {
      return $$0.u().c();
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return $$3 == efa.c && !this.aG ? true : super.a($$0, $$1, $$2, $$3);
   }
}
