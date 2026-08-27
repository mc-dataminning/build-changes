import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record duu(int b, int c, int d) implements dtx {
   public static final Codec<duu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atv.j.fieldOf("spread_width").forGetter(duu::a), atv.j.fieldOf("spread_height").forGetter(duu::b), atv.j.fieldOf("max_height").forGetter(duu::c)
            )
            .apply($$0, duu::new)
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
