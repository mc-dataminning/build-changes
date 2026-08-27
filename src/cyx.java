import com.mojang.serialization.MapCodec;

public class cyx extends cua {
   public static final MapCodec<cyx> a = b(cyx::new);
   protected static final eiy b = cua.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<cyx> a() {
      return a;
   }

   public cyx(dga.d $$0) {
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
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   @Override
   public float b(dgb $$0, cqf $$1, ht $$2) {
      return 0.2F;
   }
}
