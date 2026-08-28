import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emf(int b, int c, int d) implements eli {
   public static final Codec<emf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.m.fieldOf("spread_width").forGetter(emf::a), ayu.m.fieldOf("spread_height").forGetter(emf::b), ayu.m.fieldOf("max_height").forGetter(emf::c)
            )
            .apply($$0, emf::new)
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
