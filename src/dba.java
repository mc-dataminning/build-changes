import com.mojang.serialization.MapCodec;

public class dba extends ddq implements daf, day {
   public static final MapCodec<dba> c = b(dba::new);

   @Override
   public MapCodec<dba> a() {
      return c;
   }

   public dba(dna.d $$0) {
      super($$0, ih.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected ddr c() {
      return (ddr)dae.sv;
   }

   @Override
   protected dnb a(dnb $$0, dnb $$1) {
      return $$1.a(r_, $$0.c(r_));
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
