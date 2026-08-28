import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eea(int b, int c, int d) implements edd {
   public static final Codec<eea> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.l.fieldOf("spread_width").forGetter(eea::a), ayh.l.fieldOf("spread_height").forGetter(eea::b), ayh.l.fieldOf("max_height").forGetter(eea::c)
            )
            .apply($$0, eea::new)
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
