import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eiy(int b, int c, int d) implements eib {
   public static final Codec<eiy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.m.fieldOf("spread_width").forGetter(eiy::a), ayi.m.fieldOf("spread_height").forGetter(eiy::b), ayi.m.fieldOf("max_height").forGetter(eiy::c)
            )
            .apply($$0, eiy::new)
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
