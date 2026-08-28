import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eem(int b, int c, int d) implements edp {
   public static final Codec<eem> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axo.l.fieldOf("spread_width").forGetter(eem::a), axo.l.fieldOf("spread_height").forGetter(eem::b), axo.l.fieldOf("max_height").forGetter(eem::c)
            )
            .apply($$0, eem::new)
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
