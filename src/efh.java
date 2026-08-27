import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efh(int b, int c, int d) implements eek {
   public static final Codec<efh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axu.j.fieldOf("spread_width").forGetter(efh::a), axu.j.fieldOf("spread_height").forGetter(efh::b), axu.j.fieldOf("max_height").forGetter(efh::c)
            )
            .apply($$0, efh::new)
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
