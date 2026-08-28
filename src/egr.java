import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egr(int b, int c, int d) implements efu {
   public static final Codec<egr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aym.l.fieldOf("spread_width").forGetter(egr::a), aym.l.fieldOf("spread_height").forGetter(egr::b), aym.l.fieldOf("max_height").forGetter(egr::c)
            )
            .apply($$0, egr::new)
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
