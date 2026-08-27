import com.mojang.serialization.Codec;

public class dyy extends dzn {
   public static final Codec<dyy> a = dgb.b.fieldOf("block_state").xmap(dyy::new, $$0 -> $$0.b).codec();
   private final dgb b;

   public dyy(dgb $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dgb $$0, ate $$1) {
      return $$0 == this.b;
   }

   @Override
   protected dzo<?> a() {
      return dzo.c;
   }
}
