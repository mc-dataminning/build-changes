import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsk(int b, int c, int d) implements drn {
   public static final Codec<dsk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asq.j.fieldOf("spread_width").forGetter(dsk::a), asq.j.fieldOf("spread_height").forGetter(dsk::b), asq.j.fieldOf("max_height").forGetter(dsk::c)
            )
            .apply($$0, dsk::new)
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
