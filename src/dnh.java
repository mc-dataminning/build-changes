import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnh extends dhj implements djs {
   public static final MapCodec<dnh> c = b(dnh::new);
   public static final dtc<dta> d = dhj.b;
   protected static final float e = 6.0F;
   protected static final ewm f = dfb.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dnh> a() {
      return c;
   }

   public dnh(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return f;
   }

   @Override
   protected boolean b(dse $$0, dbg $$1, iz $$2) {
      return $$0.d($$1, $$2, je.b) && !$$0.a(dfd.kJ);
   }

   @Override
   public cur a(dcd $$0, iz $$1, dse $$2) {
      return new cur(dfd.bw);
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      dse $$1 = super.a($$0);
      if ($$1 != null) {
         enx $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(awv.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      if ($$0.c(d) == dta.a) {
         dse $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dta.b;
      } else {
         enx $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awv.a) && $$4.e() == 8;
      }
   }

   @Override
   protected enx b_(dse $$0) {
      return eny.c.a(false);
   }

   @Override
   public boolean a(@Nullable cmz $$0, dbg $$1, iz $$2, dse $$3, enw $$4) {
      return false;
   }

   @Override
   public boolean a(dcb $$0, iz $$1, dse $$2, enx $$3) {
      return false;
   }
}
