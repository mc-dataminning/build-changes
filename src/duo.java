import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record duo(int b, int c, int d) implements dtr {
   public static final Codec<duo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atq.j.fieldOf("spread_width").forGetter(duo::a), atq.j.fieldOf("spread_height").forGetter(duo::b), atq.j.fieldOf("max_height").forGetter(duo::c)
            )
            .apply($$0, duo::new)
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
