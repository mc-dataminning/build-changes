import com.mojang.serialization.Codec;

public class eit extends ejk {
   public static final Codec<eit> a = kt.e.q().fieldOf("block").xmap(eit::new, $$0 -> $$0.b).codec();
   private final dch b;

   public eit(dch $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dpi $$0, axt $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ejl<?> a() {
      return ejl.b;
   }
}
