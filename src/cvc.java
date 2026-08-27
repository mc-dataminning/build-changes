import com.mojang.serialization.MapCodec;

public abstract class cvc extends cut {
   protected cvc(dgv.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cvc> a();

   protected boolean d(dgw $$0, cqy $$1, ht $$2) {
      return $$0.a(arc.af) || $$0.a(cuv.cC);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      ht $$3 = $$2.d();
      return this.d($$1.a_($$3), $$1, $$3);
   }

   @Override
   public boolean c(dgw $$0, cqy $$1, ht $$2) {
      return $$0.u().c();
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return $$3 == ecw.c && !this.aG ? true : super.a($$0, $$1, $$2, $$3);
   }
}
