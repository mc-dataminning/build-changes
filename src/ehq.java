import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehq(int b, int c, int d) implements egt {
   public static final Codec<ehq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.m.fieldOf("spread_width").forGetter(ehq::a), ayw.m.fieldOf("spread_height").forGetter(ehq::b), ayw.m.fieldOf("max_height").forGetter(ehq::c)
            )
            .apply($$0, ehq::new)
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
