import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqs(int b, int c, int d) implements dpv {
   public static final Codec<dqs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arb.j.fieldOf("spread_width").forGetter(dqs::a), arb.j.fieldOf("spread_height").forGetter(dqs::b), arb.j.fieldOf("max_height").forGetter(dqs::c)
            )
            .apply($$0, dqs::new)
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
