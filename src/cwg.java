import com.mojang.serialization.MapCodec;

public class cwg extends cwi {
   public static final MapCodec<cwg> a = b(cwg::new);
   private static final emv b = cwy.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends cwg> a() {
      return a;
   }

   protected cwg(djo.d $$0) {
      super($$0);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return b;
   }
}
