import com.mojang.serialization.MapCodec;

public class evt extends ewj {
   public static final MapCodec<evt> a = ebq.a.fieldOf("block_state").xmap(evt::new, $$0 -> $$0.b);
   private final ebq b;

   public evt(ebq $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(ebq $$0, bai $$1) {
      return $$0 == this.b;
   }

   @Override
   protected ewk<?> a() {
      return ewk.c;
   }
}
