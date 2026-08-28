import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eeb(int b, int c, int d) implements ede {
   public static final Codec<eeb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.l.fieldOf("spread_width").forGetter(eeb::a), ayh.l.fieldOf("spread_height").forGetter(eeb::b), ayh.l.fieldOf("max_height").forGetter(eeb::c)
            )
            .apply($$0, eeb::new)
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
