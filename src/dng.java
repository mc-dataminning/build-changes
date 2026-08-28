import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dng extends dhi implements djr {
   public static final MapCodec<dng> c = b(dng::new);
   public static final dtb<dsz> d = dhi.b;
   protected static final float e = 6.0F;
   protected static final ewl f = dfa.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dng> a() {
      return c;
   }

   public dng(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return f;
   }

   @Override
   protected boolean b(dsd $$0, dbf $$1, iz $$2) {
      return $$0.d($$1, $$2, je.b) && !$$0.a(dfc.kJ);
   }

   @Override
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return new cuq(dfc.bw);
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      dsd $$1 = super.a($$0);
      if ($$1 != null) {
         enw $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(awv.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      if ($$0.c(d) == dsz.a) {
         dsd $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dsz.b;
      } else {
         enw $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awv.a) && $$4.e() == 8;
      }
   }

   @Override
   protected enw b_(dsd $$0) {
      return enx.c.a(false);
   }

   @Override
   public boolean a(@Nullable cmy $$0, dbf $$1, iz $$2, dsd $$3, env $$4) {
      return false;
   }

   @Override
   public boolean a(dca $$0, iz $$1, dsd $$2, enw $$3) {
      return false;
   }
}
