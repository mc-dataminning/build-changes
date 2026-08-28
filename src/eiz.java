import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eiz(int b, int c, int d) implements eic {
   public static final Codec<eiz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.m.fieldOf("spread_width").forGetter(eiz::a), ayi.m.fieldOf("spread_height").forGetter(eiz::b), ayi.m.fieldOf("max_height").forGetter(eiz::c)
            )
            .apply($$0, eiz::new)
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
