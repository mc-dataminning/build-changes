import com.mojang.serialization.MapCodec;

public class ddd extends dea implements ded {
   public static final MapCodec<ddd> a = b(ddd::new);
   protected static final float b = 4.0F;
   protected static final evf c = dea.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<ddd> a() {
      return a;
   }

   public ddd(drc.d $$0) {
      super($$0);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      eum $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return $$1.a_($$2.d()).a(avx.au);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if (!$$0.a($$3, $$4)) {
         return dec.a.n();
      } else {
         if ($$1 == it.b && $$2.a(dec.mZ)) {
            $$3.a($$4, dec.mZ.n(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return new ctq(ctt.dR);
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(drd $$0, cly $$1, daf $$2, io $$3) {
      return $$1.eX().g() instanceof cvd ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(daz $$0, io $$1) {
      $$0.a($$1.c(), dec.mZ.n().a(dde.i, drp.b), 3);
   }
}
