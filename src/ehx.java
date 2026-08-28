import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehx(ekj b, edx c, brn d, int e) implements eia {
   public static final Codec<ehx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekj.a.fieldOf("state_provider").forGetter(ehx::a),
               edx.b.fieldOf("target").forGetter(ehx::b),
               brn.b(0, 8).fieldOf("radius").forGetter(ehx::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(ehx::d)
            )
            .apply($$0, ehx::new)
   );

   public ekj a() {
      return this.b;
   }

   public edx b() {
      return this.c;
   }

   public brn c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
