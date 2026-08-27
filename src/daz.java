import com.mojang.serialization.MapCodec;

public class daz extends ddr implements daf, day {
   public static final MapCodec<daz> c = b(daz::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<daz> a() {
      return c;
   }

   public daz(dna.d $$0) {
      super($$0, ih.a, q_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(axd $$0) {
      return 1;
   }

   @Override
   protected boolean g(dnb $$0) {
      return $$0.i();
   }

   @Override
   protected dac b() {
      return dae.sw;
   }

   @Override
   protected dnb a(dnb $$0, dnb $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   protected dnb a(dnb $$0, axd $$1) {
      return super.a($$0, $$1).a(r_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return new cqm(cqp.wo);
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      return day.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      super.a($$0);
      $$0.a(r_);
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
