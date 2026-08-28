import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record atj(cub b) {
   private static final Codec<atj> c = RecordCodecBuilder.create($$0 -> $$0.group(cud.f.fieldOf("enabled").forGetter(atj::a)).apply($$0, atj::new));
   public static final aua<atj> a = new aua<>("features", c);

   public cub a() {
      return this.b;
   }
}
