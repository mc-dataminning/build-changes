import com.mojang.serialization.MapCodec;

public class dbk extends dch implements dck {
   public static final MapCodec<dbk> a = b(dbk::new);
   protected static final float b = 4.0F;
   protected static final etc c = dch.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dbk> a() {
      return a;
   }

   public dbk(dph.d $$0) {
      super($$0);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      esj $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return $$1.a_($$2.d()).a(ave.au);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if (!$$0.a($$3, $$4)) {
         return dcj.a.n();
      } else {
         if ($$1 == ij.b && $$2.a(dcj.mZ)) {
            $$3.a($$4, dcj.mZ.n(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return new crs(crv.dQ);
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dpi $$0, cka $$1, cym $$2, id $$3) {
      return $$1.eU().f() instanceof ctc ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(czg $$0, id $$1) {
      $$0.a($$1.c(), dcj.mZ.n().a(dbl.i, dpu.b), 3);
   }
}
