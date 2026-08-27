import com.mojang.serialization.MapCodec;

public class cti extends ctk {
   public static final MapCodec<cti> a = b(cti::new);
   private static final eiy b = cua.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends cti> a() {
      return a;
   }

   protected cti(dga.d $$0) {
      super($$0);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return b;
   }
}
