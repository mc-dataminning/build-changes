import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dif extends dci implements deq {
   public static final MapCodec<dif> c = b(dif::new);
   public static final dnx<dnv> d = dci.b;
   protected static final float e = 6.0F;
   protected static final eqk f = daa.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dif> a() {
      return c;
   }

   public dif(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return f;
   }

   @Override
   protected boolean b(dmz $$0, cwf $$1, ib $$2) {
      return $$0.d($$1, $$2, ih.b) && !$$0.a(dac.kJ);
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      return new cqk(dac.bw);
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      dmz $$1 = super.a($$0);
      if ($$1 != null) {
         ein $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(aus.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      if ($$0.c(d) == dnv.a) {
         dmz $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dnv.b;
      } else {
         ein $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(aus.a) && $$4.e() == 8;
      }
   }

   @Override
   protected ein c_(dmz $$0) {
      return eio.c.a(false);
   }

   @Override
   public boolean a(@Nullable cis $$0, cwf $$1, ib $$2, dmz $$3, eim $$4) {
      return false;
   }

   @Override
   public boolean a(cxa $$0, ib $$1, dmz $$2, ein $$3) {
      return false;
   }
}
