import com.mojang.serialization.MapCodec;

public class eok extends epc {
   public static final MapCodec<eok> a = lv.e.q().fieldOf("block").xmap(eok::new, $$0 -> $$0.b);
   private final dhm b;

   public eok(dhm $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dus $$0, azn $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected epd<?> a() {
      return epd.b;
   }
}
