import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqr(int b, int c, int d) implements dpu {
   public static final Codec<dqr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arj.j.fieldOf("spread_width").forGetter(dqr::a), arj.j.fieldOf("spread_height").forGetter(dqr::b), arj.j.fieldOf("max_height").forGetter(dqr::c)
            )
            .apply($$0, dqr::new)
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
