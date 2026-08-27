import com.mojang.serialization.Codec;

public class duo extends duf {
   public static final Codec<duo> b = dhn.b.fieldOf("state").xmap(duo::new, $$0 -> $$0.c).codec();
   private final dhn c;

   protected duo(dhn $$0) {
      this.c = $$0;
   }

   @Override
   protected dug<?> a() {
      return dug.a;
   }

   @Override
   public dhn a(atw $$0, hx $$1) {
      return this.c;
   }
}
