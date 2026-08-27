import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqn(int b, int c, int d) implements dpq {
   public static final Codec<dqn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.j.fieldOf("spread_width").forGetter(dqn::a), aqy.j.fieldOf("spread_height").forGetter(dqn::b), aqy.j.fieldOf("max_height").forGetter(dqn::c)
            )
            .apply($$0, dqn::new)
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
