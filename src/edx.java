import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edx(int b, int c, int d) implements eda {
   public static final Codec<edx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayf.l.fieldOf("spread_width").forGetter(edx::a), ayf.l.fieldOf("spread_height").forGetter(edx::b), ayf.l.fieldOf("max_height").forGetter(edx::c)
            )
            .apply($$0, edx::new)
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
