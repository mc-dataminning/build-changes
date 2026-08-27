import com.mojang.serialization.MapCodec;

public class ddt extends dgj implements dcy, ddr {
   public static final MapCodec<ddt> c = b(ddt::new);

   @Override
   public MapCodec<ddt> a() {
      return c;
   }

   public ddt(dpx.d $$0) {
      super($$0, ir.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected dgk c() {
      return (dgk)dcx.sv;
   }

   @Override
   protected dpy a(dpy $$0, dpy $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return new csd(csg.ws);
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      return ddr.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(r_);
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
