import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eaw(int b, int c, int d) implements dzz {
   public static final Codec<eaw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aws.j.fieldOf("spread_width").forGetter(eaw::a), aws.j.fieldOf("spread_height").forGetter(eaw::b), aws.j.fieldOf("max_height").forGetter(eaw::c)
            )
            .apply($$0, eaw::new)
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
