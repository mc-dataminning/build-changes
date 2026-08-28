import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emz(int b, int c, int d) implements emc {
   public static final Codec<emz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.m.fieldOf("spread_width").forGetter(emz::a), ayu.m.fieldOf("spread_height").forGetter(emz::b), ayu.m.fieldOf("max_height").forGetter(emz::c)
            )
            .apply($$0, emz::new)
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
