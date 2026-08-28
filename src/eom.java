import com.mojang.serialization.MapCodec;

public class eom extends epc {
   public static final MapCodec<eom> a = dus.a.fieldOf("block_state").xmap(eom::new, $$0 -> $$0.b);
   private final dus b;

   public eom(dus $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dus $$0, azn $$1) {
      return $$0 == this.b;
   }

   @Override
   protected epd<?> a() {
      return epd.c;
   }
}
