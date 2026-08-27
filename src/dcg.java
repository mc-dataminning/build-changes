import com.mojang.serialization.MapCodec;

public class dcg extends dac {
   public static final MapCodec<dcg> a = b(dcg::new);
   protected static final eqm b = dcz.c;

   @Override
   public MapCodec<dcg> a() {
      return a;
   }

   protected dcg(dna.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dnb $$0) {
      return true;
   }

   @Override
   public dnb a(csu $$0) {
      return !this.o().a((cxe)$$0.q(), $$0.a()) ? dac.a(this.o(), dae.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      dcz.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      dnb $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof ddb;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return b;
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
