import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egn implements egt {
   public static final Codec<egn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(brm.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), brm.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, egn::new)
   );
   private final brm b;
   private final brm c;

   public egn(brm $$0, brm $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public brm a() {
      return this.b;
   }

   public brm b() {
      return this.c;
   }
}
