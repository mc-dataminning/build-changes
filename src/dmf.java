import com.mojang.serialization.MapCodec;

public class dmf extends dej implements ded {
   public static final MapCodec<dmf> a = b(dmf::new);
   protected static final float b = 6.0F;
   protected static final evf c = dea.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dmf> a() {
      return a;
   }

   protected dmf(drc.d $$0) {
      super($$0);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return c;
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return true;
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      dgi $$4 = (dgi)($$3.a(dec.bu) ? dec.iI : dec.iH);
      if ($$4.n().a($$0, $$2) && $$0.u($$2.c())) {
         dgi.a($$0, $$4.n(), $$2, 2);
      }
   }
}
