import com.mojang.serialization.MapCodec;

public class dbk extends cua {
   public static final MapCodec<dbk> a = b(dbk::new);
   protected static final eiy b = cua.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dbk> a() {
      return a;
   }

   public dbk(dga.d $$0) {
      super($$0);
   }

   @Override
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return b;
   }

   @Override
   public eiy b_(dgb $$0, cqf $$1, ht $$2) {
      return eiv.b();
   }

   @Override
   public eiy b(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return eiv.b();
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      cug.b($$1, $$2.c(), $$0);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$1 == hx.b && $$2.a(cuc.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   @Override
   public float b(dgb $$0, cqf $$1, ht $$2) {
      return 0.2F;
   }
}
