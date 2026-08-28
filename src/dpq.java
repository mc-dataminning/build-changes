import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpq extends djr implements dma {
   public static final MapCodec<dpq> c = b(dpq::new);
   public static final dvm<dvk> d = djr.b;
   protected static final float e = 6.0F;
   protected static final ezm f = dhj.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dpq> a() {
      return c;
   }

   public dpq(dun.d $$0) {
      super($$0);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return f;
   }

   @Override
   protected boolean b(duo $$0, ddl $$1, je $$2) {
      return $$0.c($$1, $$2, jj.b) && !$$0.a(dhl.kJ);
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return new cvp(dhl.bw);
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      duo $$1 = super.a($$0);
      if ($$1 != null) {
         eqp $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(awz.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      if ($$0.c(d) == dvk.a) {
         duo $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == dvk.b;
      } else {
         eqp $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awz.a) && $$4.e() == 8;
      }
   }

   @Override
   protected eqp b_(duo $$0) {
      return eqq.c.a(false);
   }

   @Override
   public boolean a(@Nullable cnu $$0, ddl $$1, je $$2, duo $$3, eqo $$4) {
      return false;
   }

   @Override
   public boolean a(deh $$0, je $$1, duo $$2, eqp $$3) {
      return false;
   }
}
