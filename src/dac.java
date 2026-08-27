import com.mojang.serialization.MapCodec;

public class dac extends dcu implements czi, dab {
   public static final MapCodec<dac> c = b(dac::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dac> a() {
      return c;
   }

   public dac(dmd.d $$0) {
      super($$0, ih.a, q_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(awt $$0) {
      return 1;
   }

   @Override
   protected boolean g(dme $$0) {
      return $$0.i();
   }

   @Override
   protected czf b() {
      return czh.sw;
   }

   @Override
   protected dme a(dme $$0, dme $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   protected dme a(dme $$0, awt $$1) {
      return super.a($$0, $$1).a(r_, Boolean.valueOf($$1.i() < 0.11F));
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
      super.a($$0);
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
