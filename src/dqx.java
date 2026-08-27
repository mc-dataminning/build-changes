import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqx(int b, int c, int d) implements dqa {
   public static final Codec<dqx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arg.j.fieldOf("spread_width").forGetter(dqx::a), arg.j.fieldOf("spread_height").forGetter(dqx::b), arg.j.fieldOf("max_height").forGetter(dqx::c)
            )
            .apply($$0, dqx::new)
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
