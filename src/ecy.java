import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ecy(int b, int c, int d) implements ecb {
   public static final Codec<ecy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axm.j.fieldOf("spread_width").forGetter(ecy::a), axm.j.fieldOf("spread_height").forGetter(ecy::b), axm.j.fieldOf("max_height").forGetter(ecy::c)
            )
            .apply($$0, ecy::new)
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
