import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eda(int b, int c, int d) implements ecd {
   public static final Codec<eda> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axn.j.fieldOf("spread_width").forGetter(eda::a), axn.j.fieldOf("spread_height").forGetter(eda::b), axn.j.fieldOf("max_height").forGetter(eda::c)
            )
            .apply($$0, eda::new)
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
