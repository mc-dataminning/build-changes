import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edy(int b, int c, int d) implements edb {
   public static final Codec<edy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayg.l.fieldOf("spread_width").forGetter(edy::a), ayg.l.fieldOf("spread_height").forGetter(edy::b), ayg.l.fieldOf("max_height").forGetter(edy::c)
            )
            .apply($$0, edy::new)
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
