import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dvd(int b, int c, int d) implements dug {
   public static final Codec<dvd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atx.j.fieldOf("spread_width").forGetter(dvd::a), atx.j.fieldOf("spread_height").forGetter(dvd::b), atx.j.fieldOf("max_height").forGetter(dvd::c)
            )
            .apply($$0, dvd::new)
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
