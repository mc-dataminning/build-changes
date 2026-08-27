import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dyt(int b, int c, int d) implements dxw {
   public static final Codec<dyt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awe.k.fieldOf("spread_width").forGetter(dyt::a), awe.k.fieldOf("spread_height").forGetter(dyt::b), awe.k.fieldOf("max_height").forGetter(dyt::c)
            )
            .apply($$0, dyt::new)
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
