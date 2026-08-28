import com.mojang.serialization.MapCodec;

public class dfb extends dfy implements dgb {
   public static final MapCodec<dfb> a = b(dfb::new);
   protected static final float b = 4.0F;
   protected static final exv c = dfy.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dfb> a() {
      return a;
   }

   public dfb(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      exc $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return $$1.a_($$2.e()).a(awe.av);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if (!$$0.a($$3, $$4)) {
         return dga.a.o();
      } else {
         if ($$1 == ji.b && $$2.a(dga.mZ)) {
            $$3.a($$4, dga.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return new cuq(cut.dR);
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dtc $$0, cmx $$1, dcc $$2, jd $$3) {
      return $$1.eT().g() instanceof cwg ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dcw $$0, jd $$1) {
      $$0.a($$1.d(), dga.mZ.o().a(dfc.i, dto.b), 3);
   }
}
