import com.mojang.serialization.MapCodec;

public class ctj extends ctk {
   public static final MapCodec<ctj> a = b(ctj::new);
   protected static final float b = 6.0F;
   protected static final eiy c = cua.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<ctj> a() {
      return a;
   }

   protected ctj(dga.d $$0) {
      super($$0);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return c;
   }
}
