import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkd extends deg implements dgo {
   public static final MapCodec<dkd> c = b(dkd::new);
   public static final dpx<dpv> d = deg.b;
   protected static final float e = 6.0F;
   protected static final est f = dby.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dkd> a() {
      return c;
   }

   public dkd(doy.d $$0) {
      super($$0);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return f;
   }

   @Override
   protected boolean b(doz $$0, cyd $$1, ib $$2) {
      return $$0.d($$1, $$2, ih.b) && !$$0.a(dca.kJ);
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return new crj(dca.bw);
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      doz $$1 = super.a($$0);
      if ($$1 != null) {
         eks $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(avh.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      if ($$0.c(d) == dpv.a) {
         doz $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dpv.b;
      } else {
         eks $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(avh.a) && $$4.e() == 8;
      }
   }

   @Override
   protected eks c_(doz $$0) {
      return ekt.c.a(false);
   }

   @Override
   public boolean a(@Nullable cjt $$0, cyd $$1, ib $$2, doz $$3, ekr $$4) {
      return false;
   }

   @Override
   public boolean a(cyy $$0, ib $$1, doz $$2, eks $$3) {
      return false;
   }
}
