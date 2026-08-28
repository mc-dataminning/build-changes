import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egv(int b, int c, int d) implements efy {
   public static final Codec<egv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayo.l.fieldOf("spread_width").forGetter(egv::a), ayo.l.fieldOf("spread_height").forGetter(egv::b), ayo.l.fieldOf("max_height").forGetter(egv::c)
            )
            .apply($$0, egv::new)
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
