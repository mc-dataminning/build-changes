import com.mojang.serialization.MapCodec;

public class dmd extends deh implements deb {
   public static final MapCodec<dmd> a = b(dmd::new);
   protected static final float b = 6.0F;
   protected static final evd c = ddy.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dmd> a() {
      return a;
   }

   protected dmd(dra.d $$0) {
      super($$0);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return c;
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return true;
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      dgg $$4 = (dgg)($$3.a(dea.bu) ? dea.iI : dea.iH);
      if ($$4.n().a($$0, $$2) && $$0.u($$2.c())) {
         dgg.a($$0, $$4.n(), $$2, 2);
      }
   }
}
