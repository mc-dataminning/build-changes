import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpt extends dju implements dmd {
   public static final MapCodec<dpt> c = b(dpt::new);
   public static final dvq<dvo> d = dju.b;
   protected static final float e = 6.0F;
   protected static final ezq f = dhm.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dpt> a() {
      return c;
   }

   public dpt(dur.d $$0) {
      super($$0);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return f;
   }

   @Override
   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      return $$0.c($$1, $$2, jk.b) && !$$0.a(dho.kJ);
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return new cvs(dho.bw);
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      dus $$1 = super.a($$0);
      if ($$1 != null) {
         eqt $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(axb.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      if ($$0.c(d) == dvo.a) {
         dus $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == dvo.b;
      } else {
         eqt $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(axb.a) && $$4.e() == 8;
      }
   }

   @Override
   protected eqt b_(dus $$0) {
      return equ.c.a(false);
   }

   @Override
   public boolean a(@Nullable cnx $$0, ddo $$1, jf $$2, dus $$3, eqs $$4) {
      return false;
   }

   @Override
   public boolean a(dek $$0, jf $$1, dus $$2, eqt $$3) {
      return false;
   }
}
