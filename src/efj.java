import com.mojang.serialization.Codec;

public class efj extends ega {
   public static final Codec<efj> a = kh.e.q().fieldOf("block").xmap(efj::new, $$0 -> $$0.b).codec();
   private final czf b;

   public efj(czf $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dme $$0, awt $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected egb<?> a() {
      return egb.b;
   }
}
