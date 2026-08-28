import com.mojang.serialization.MapCodec;

public class dei extends dff implements dfi {
   public static final MapCodec<dei> a = b(dei::new);
   protected static final float b = 4.0F;
   protected static final ews c = dff.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dei> a() {
      return a;
   }

   public dei(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      evz $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return $$1.a_($$2.d()).a(avu.au);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if (!$$0.a($$3, $$4)) {
         return dfh.a.o();
      } else {
         if ($$1 == jf.b && $$2.a(dfh.mZ)) {
            $$3.a($$4, dfh.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return new cua(cud.dR);
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dsh $$0, cmh $$1, dbj $$2, ja $$3) {
      return $$1.eT().g() instanceof cvn ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dcd $$0, ja $$1) {
      $$0.a($$1.c(), dfh.mZ.o().a(dej.i, dst.b), 3);
   }
}
