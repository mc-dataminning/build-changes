import com.mojang.serialization.MapCodec;

public abstract class cvz extends cwj {
   protected static final int a = 2;
   protected static final emf b = cwj.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected cvz(diz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cvz> a();

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !this.a($$0, $$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return a($$1, $$2.d(), ic.b);
   }
}
