import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edz(int b, int c, int d) implements edc {
   public static final Codec<edz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.l.fieldOf("spread_width").forGetter(edz::a), ayh.l.fieldOf("spread_height").forGetter(edz::b), ayh.l.fieldOf("max_height").forGetter(edz::c)
            )
            .apply($$0, edz::new)
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
