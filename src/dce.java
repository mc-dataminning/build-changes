import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dce extends cwg implements cyp {
   public static final MapCodec<dce> c = b(dce::new);
   public static final dgz<dgx> d = cwg.b;
   protected static final float e = 6.0F;
   protected static final eiy f = cua.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dce> a() {
      return c;
   }

   public dce(dga.d $$0) {
      super($$0);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return f;
   }

   @Override
   protected boolean d(dgb $$0, cqf $$1, ht $$2) {
      return $$0.d($$1, $$2, hx.b) && !$$0.a(cuc.kJ);
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return new ckj(cuc.bw);
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = super.a($$0);
      if ($$1 != null) {
         ebe $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(aqx.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      if ($$0.c(d) == dgx.a) {
         dgb $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dgx.b;
      } else {
         ebe $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(aqx.a) && $$4.e() == 8;
      }
   }

   @Override
   public ebe c_(dgb $$0) {
      return ebf.c.a(false);
   }

   @Override
   public boolean a(@Nullable ccx $$0, cqf $$1, ht $$2, dgb $$3, ebd $$4) {
      return false;
   }

   @Override
   public boolean a(cra $$0, ht $$1, dgb $$2, ebe $$3) {
      return false;
   }
}
