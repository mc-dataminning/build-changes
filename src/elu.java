import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record elu(int b, int c, int d) implements ekx {
   public static final Codec<elu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.m.fieldOf("spread_width").forGetter(elu::a), ays.m.fieldOf("spread_height").forGetter(elu::b), ays.m.fieldOf("max_height").forGetter(elu::c)
            )
            .apply($$0, elu::new)
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
