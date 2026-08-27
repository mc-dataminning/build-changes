import com.mojang.serialization.MapCodec;

public class dgs extends cyx implements cyr {
   public static final MapCodec<dgs> a = b(dgs::new);
   protected static final float b = 6.0F;
   protected static final eol c = cyo.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dgs> a() {
      return a;
   }

   protected dgs(dle.d $$0) {
      super($$0);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return c;
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return true;
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      daw $$4 = (daw)($$3.a(cyq.bu) ? cyq.iI : cyq.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.c())) {
         daw.a($$0, $$4.o(), $$2, 2);
      }
   }
}
