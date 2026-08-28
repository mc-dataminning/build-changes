import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eff(int b, int c, int d) implements eei {
   public static final Codec<eff> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axw.l.fieldOf("spread_width").forGetter(eff::a), axw.l.fieldOf("spread_height").forGetter(eff::b), axw.l.fieldOf("max_height").forGetter(eff::c)
            )
            .apply($$0, eff::new)
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
