import com.mojang.serialization.MapCodec;

public class epl extends epc {
   public static final MapCodec<epl> b = ebq.a.fieldOf("state").xmap(epl::new, $$0 -> $$0.c);
   private final ebq c;

   protected epl(ebq $$0) {
      this.c = $$0;
   }

   @Override
   protected epd<?> a() {
      return epd.a;
   }

   @Override
   public ebq a(bai $$0, iw $$1) {
      return this.c;
   }
}
