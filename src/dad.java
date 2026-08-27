import com.mojang.serialization.MapCodec;

public class dad extends dct implements czi, dab {
   public static final MapCodec<dad> c = b(dad::new);

   @Override
   public MapCodec<dad> a() {
      return c;
   }

   public dad(dmd.d $$0) {
      super($$0, ih.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected dcu c() {
      return (dcu)czh.sv;
   }

   @Override
   protected dme a(dme $$0, dme $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return new cpq(cpt.wm);
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      return dab.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(r_);
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
