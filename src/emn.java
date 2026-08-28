import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emn(int b, int c, int d) implements elq {
   public static final Codec<emn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.m.fieldOf("spread_width").forGetter(emn::a), ayu.m.fieldOf("spread_height").forGetter(emn::b), ayu.m.fieldOf("max_height").forGetter(emn::c)
            )
            .apply($$0, emn::new)
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
