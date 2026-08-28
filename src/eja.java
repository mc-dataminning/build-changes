import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eja(int b, int c, int d) implements eid {
   public static final Codec<eja> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.m.fieldOf("spread_width").forGetter(eja::a), ayi.m.fieldOf("spread_height").forGetter(eja::b), ayi.m.fieldOf("max_height").forGetter(eja::c)
            )
            .apply($$0, eja::new)
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
