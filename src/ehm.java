import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehm(int b, int c, int d) implements egp {
   public static final Codec<ehm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayt.m.fieldOf("spread_width").forGetter(ehm::a), ayt.m.fieldOf("spread_height").forGetter(ehm::b), ayt.m.fieldOf("max_height").forGetter(ehm::c)
            )
            .apply($$0, ehm::new)
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
