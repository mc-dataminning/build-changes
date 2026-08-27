import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ece(int b, int c, int d) implements ebh {
   public static final Codec<ece> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axh.j.fieldOf("spread_width").forGetter(ece::a), axh.j.fieldOf("spread_height").forGetter(ece::b), axh.j.fieldOf("max_height").forGetter(ece::c)
            )
            .apply($$0, ece::new)
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
