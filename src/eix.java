import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eix(int b, int c, int d) implements eia {
   public static final Codec<eix> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.m.fieldOf("spread_width").forGetter(eix::a), ayh.m.fieldOf("spread_height").forGetter(eix::b), ayh.m.fieldOf("max_height").forGetter(eix::c)
            )
            .apply($$0, eix::new)
   );

   public int a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
