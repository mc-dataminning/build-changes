import com.mojang.serialization.MapCodec;

public class dga extends diu implements dff, dfy {
   public static final MapCodec<dga> c = b(dga::new);

   @Override
   public MapCodec<dga> a() {
      return c;
   }

   public dga(dtb.d $$0) {
      super($$0, iw.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected div c() {
      return (div)dfe.tS;
   }

   @Override
   protected dtc a(dtc $$0, dtc $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return new cuh(cuk.ye);
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      return dfy.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(r_);
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
