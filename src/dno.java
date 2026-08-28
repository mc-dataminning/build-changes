import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dno extends dhq implements djz {
   public static final MapCodec<dno> c = b(dno::new);
   public static final dtj<dth> d = dhq.b;
   protected static final float e = 6.0F;
   protected static final exa f = dfi.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dno> a() {
      return c;
   }

   public dno(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return f;
   }

   @Override
   protected boolean b(dsl $$0, dbm $$1, ja $$2) {
      return $$0.d($$1, $$2, jf.b) && !$$0.a(dfk.kJ);
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return new cud(dfk.bw);
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = super.a($$0);
      if ($$1 != null) {
         eoj $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(awc.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      if ($$0.c(d) == dth.a) {
         dsl $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dth.b;
      } else {
         eoj $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awc.a) && $$4.e() == 8;
      }
   }

   @Override
   protected eoj b_(dsl $$0) {
      return eok.c.a(false);
   }

   @Override
   public boolean a(@Nullable cml $$0, dbm $$1, ja $$2, dsl $$3, eoi $$4) {
      return false;
   }

   @Override
   public boolean a(dch $$0, ja $$1, dsl $$2, eoj $$3) {
      return false;
   }
}
