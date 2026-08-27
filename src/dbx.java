import com.mojang.serialization.MapCodec;

public class dbx extends cua {
   public static final MapCodec<dbx> a = b(dbx::new);
   private static final double b = 5.0;
   private static final eiy c = cua.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dbx> a() {
      return a;
   }

   protected dbx(dga.d $$0) {
      super($$0);
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.a;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return c;
   }

   @Override
   public float b(dgb $$0, cqf $$1, ht $$2) {
      return 1.0F;
   }
}
