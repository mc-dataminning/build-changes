import com.mojang.serialization.MapCodec;

public class dfz extends div implements dff, dfy {
   public static final MapCodec<dfz> c = b(dfz::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dfz> a() {
      return c;
   }

   public dfz(dtb.d $$0) {
      super($$0, iw.a, q_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(ayt $$0) {
      return 1;
   }

   @Override
   protected boolean g(dtc $$0) {
      return $$0.i();
   }

   @Override
   protected dfc b() {
      return dfe.tT;
   }

   @Override
   protected dtc a(dtc $$0, dtc $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   protected dtc a(dtc $$0, ayt $$1) {
      return super.a($$0, $$1).a(r_, Boolean.valueOf($$1.i() < 0.11F));
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
      super.a($$0);
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
