import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egd(int b, int c, int d) implements efg {
   public static final Codec<egd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayl.l.fieldOf("spread_width").forGetter(egd::a), ayl.l.fieldOf("spread_height").forGetter(egd::b), ayl.l.fieldOf("max_height").forGetter(egd::c)
            )
            .apply($$0, egd::new)
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
