import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eiv(elh b, eev c, bsd d, int e) implements eiy {
   public static final Codec<eiv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               elh.a.fieldOf("state_provider").forGetter(eiv::a),
               eev.b.fieldOf("target").forGetter(eiv::b),
               bsd.b(0, 8).fieldOf("radius").forGetter(eiv::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(eiv::d)
            )
            .apply($$0, eiv::new)
   );

   public elh a() {
      return this.b;
   }

   public eev b() {
      return this.c;
   }

   public bsd c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
