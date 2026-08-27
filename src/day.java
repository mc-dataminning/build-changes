import com.mojang.serialization.MapCodec;

public class day extends ddo implements dad, daw {
   public static final MapCodec<day> c = b(day::new);

   @Override
   public MapCodec<day> a() {
      return c;
   }

   public day(dmy.d $$0) {
      super($$0, ih.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected ddp c() {
      return (ddp)dac.sv;
   }

   @Override
   protected dmz a(dmz $$0, dmz $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      return new cqk(cqn.wn);
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      return daw.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(r_);
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
