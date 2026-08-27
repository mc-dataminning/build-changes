import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqo(int b, int c, int d) implements dpr {
   public static final Codec<dqo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.j.fieldOf("spread_width").forGetter(dqo::a), aqy.j.fieldOf("spread_height").forGetter(dqo::b), aqy.j.fieldOf("max_height").forGetter(dqo::c)
            )
            .apply($$0, dqo::new)
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
