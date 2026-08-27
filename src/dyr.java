import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dyr(int b, int c, int d) implements dxu {
   public static final Codec<dyr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awe.k.fieldOf("spread_width").forGetter(dyr::a), awe.k.fieldOf("spread_height").forGetter(dyr::b), awe.k.fieldOf("max_height").forGetter(dyr::c)
            )
            .apply($$0, dyr::new)
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
