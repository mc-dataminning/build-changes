import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efe(int b, int c, int d) implements eeh {
   public static final Codec<efe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axw.l.fieldOf("spread_width").forGetter(efe::a), axw.l.fieldOf("spread_height").forGetter(efe::b), axw.l.fieldOf("max_height").forGetter(efe::c)
            )
            .apply($$0, efe::new)
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
