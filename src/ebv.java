import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebv(int b, int c, int d) implements eay {
   public static final Codec<ebv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.j.fieldOf("spread_width").forGetter(ebv::a), axe.j.fieldOf("spread_height").forGetter(ebv::b), axe.j.fieldOf("max_height").forGetter(ebv::c)
            )
            .apply($$0, ebv::new)
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
