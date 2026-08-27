import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dud(int b, int c, int d) implements dtg {
   public static final Codec<dud> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atg.j.fieldOf("spread_width").forGetter(dud::a), atg.j.fieldOf("spread_height").forGetter(dud::b), atg.j.fieldOf("max_height").forGetter(dud::c)
            )
            .apply($$0, dud::new)
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
