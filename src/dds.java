import com.mojang.serialization.MapCodec;

public class dds extends dgk implements dcy, ddr {
   public static final MapCodec<dds> c = b(dds::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dds> a() {
      return c;
   }

   public dds(dpx.d $$0) {
      super($$0, ir.a, q_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(ayd $$0) {
      return 1;
   }

   @Override
   protected boolean g(dpy $$0) {
      return $$0.i();
   }

   @Override
   protected dcv b() {
      return dcx.sw;
   }

   @Override
   protected dpy a(dpy $$0, dpy $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   protected dpy a(dpy $$0, ayd $$1) {
      return super.a($$0, $$1).a(r_, Boolean.valueOf($$1.i() < 0.11F));
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
      super.a($$0);
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
