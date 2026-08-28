import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record enm(int b, int c, int d) implements emp {
   public static final Codec<enm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.m.fieldOf("spread_width").forGetter(enm::a), ayw.m.fieldOf("spread_height").forGetter(enm::b), ayw.m.fieldOf("max_height").forGetter(enm::c)
            )
            .apply($$0, enm::new)
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
