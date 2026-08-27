import com.mojang.serialization.Codec;

public class ebo extends ebg {
   public static final Codec<ebo> a = arz.a(kd.e).fieldOf("tag").xmap(ebo::new, $$0 -> $$0.b).codec();
   private final arz<cvf> b;

   public ebo(arz<cvf> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dhn $$0, atw $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ebh<?> a() {
      return ebh.d;
   }
}
