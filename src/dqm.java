import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqm(int b, int c, int d) implements dpp {
   public static final Codec<dqm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqw.j.fieldOf("spread_width").forGetter(dqm::a), aqw.j.fieldOf("spread_height").forGetter(dqm::b), aqw.j.fieldOf("max_height").forGetter(dqm::c)
            )
            .apply($$0, dqm::new)
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
