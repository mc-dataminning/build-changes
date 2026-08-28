import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eks(int b, int c, int d) implements ejv {
   public static final Codec<eks> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.m.fieldOf("spread_width").forGetter(eks::a), ays.m.fieldOf("spread_height").forGetter(eks::b), ays.m.fieldOf("max_height").forGetter(eks::c)
            )
            .apply($$0, eks::new)
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
