import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqz(int b, int c, int d) implements dqc {
   public static final Codec<dqz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arh.j.fieldOf("spread_width").forGetter(dqz::a), arh.j.fieldOf("spread_height").forGetter(dqz::b), arh.j.fieldOf("max_height").forGetter(dqz::c)
            )
            .apply($$0, dqz::new)
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
