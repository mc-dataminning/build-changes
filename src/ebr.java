import com.mojang.serialization.Codec;

public class ebr extends eci {
   public static final Codec<ebr> a = kb.e.q().fieldOf("block").xmap(ebr::new, $$0 -> $$0.b).codec();
   private final cvz b;

   public ebr(cvz $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dip $$0, auf $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ecj<?> a() {
      return ecj.b;
   }
}
