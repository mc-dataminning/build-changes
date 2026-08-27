import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgt extends daw implements dde {
   public static final MapCodec<dgt> c = b(dgt::new);
   public static final dmd<dmb> d = daw.b;
   protected static final float e = 6.0F;
   protected static final eol f = cyo.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dgt> a() {
      return c;
   }

   public dgt(dle.d $$0) {
      super($$0);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return f;
   }

   @Override
   protected boolean b(dlf $$0, cut $$1, hz $$2) {
      return $$0.d($$1, $$2, ie.b) && !$$0.a(cyq.kJ);
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return new coz(cyq.bw);
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      dlf $$1 = super.a($$0);
      if ($$1 != null) {
         egp $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(aue.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      if ($$0.c(d) == dmb.a) {
         dlf $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dmb.b;
      } else {
         egp $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(aue.a) && $$4.e() == 8;
      }
   }

   @Override
   protected egp c_(dlf $$0) {
      return egq.c.a(false);
   }

   @Override
   public boolean a(@Nullable chh $$0, cut $$1, hz $$2, dlf $$3, ego $$4) {
      return false;
   }

   @Override
   public boolean a(cvo $$0, hz $$1, dlf $$2, egp $$3) {
      return false;
   }
}
