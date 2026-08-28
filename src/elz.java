import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record elz(eol b, ehz c, btl d, int e) implements emc {
   public static final Codec<elz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eol.a.fieldOf("state_provider").forGetter(elz::a),
               ehz.b.fieldOf("target").forGetter(elz::b),
               btl.b(0, 8).fieldOf("radius").forGetter(elz::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(elz::d)
            )
            .apply($$0, elz::new)
   );

   public eol a() {
      return this.b;
   }

   public ehz b() {
      return this.c;
   }

   public btl c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
