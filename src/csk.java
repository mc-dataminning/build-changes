import com.mojang.serialization.MapCodec;

public class csk extends csm {
   public static final MapCodec<csk> a = b(csk::new);
   private static final eia b = ctc.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends csk> a() {
      return a;
   }

   protected csk(dfc.d $$0) {
      super($$0);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b;
   }
}
