import com.mojang.serialization.Codec;

public class eai extends eaw {
   public static final Codec<eai> a = blb.b(0, 256).fieldOf("count").xmap(eai::new, $$0 -> $$0.c).codec();
   private final blb c;

   private eai(blb $$0) {
      this.c = $$0;
   }

   public static eai a(blb $$0) {
      return new eai($$0);
   }

   public static eai a(int $$0) {
      return a(bky.a($$0));
   }

   @Override
   protected int a(awp $$0, hz $$1) {
      return this.c.a($$0);
   }

   @Override
   public eat<?> b() {
      return eat.f;
   }
}
