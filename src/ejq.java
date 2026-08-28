import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejq(int b, int c, int d) implements eit {
   public static final Codec<ejq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azd.m.fieldOf("spread_width").forGetter(ejq::a), azd.m.fieldOf("spread_height").forGetter(ejq::b), azd.m.fieldOf("max_height").forGetter(ejq::c)
            )
            .apply($$0, ejq::new)
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
