import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class daw extends cuj implements cud, cyp {
   public static final MapCodec<daw> a = b(daw::new);
   protected static final float b = 6.0F;
   protected static final eiy c = cua.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<daw> a() {
      return a;
   }

   protected daw(dga.d $$0) {
      super($$0);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return c;
   }

   @Override
   protected boolean d(dgb $$0, cqf $$1, ht $$2) {
      return $$0.d($$1, $$2, hx.b) && !$$0.a(cuc.kJ);
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      ebe $$1 = $$0.q().b_($$0.a());
      return $$1.a(aqx.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      dgb $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return true;
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public ebe c_(dgb $$0) {
      return ebf.c.a(false);
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      dgb $$4 = cuc.bx.o();
      dgb $$5 = $$4.a(dce.d, dgx.a);
      ht $$6 = $$2.c();
      if ($$0.a_($$6).a(cuc.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
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
