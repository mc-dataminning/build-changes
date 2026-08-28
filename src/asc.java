import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record asc(cov b) {
   private static final Codec<asc> c = RecordCodecBuilder.create($$0 -> $$0.group(cox.e.fieldOf("enabled").forGetter(asc::a)).apply($$0, asc::new));
   public static final asu<asc> a = asu.a("features", c);

   public cov a() {
      return this.b;
   }
}
