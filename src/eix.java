import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eix(elj b, eex c, bso d, int e) implements eja {
   public static final Codec<eix> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               elj.a.fieldOf("state_provider").forGetter(eix::a),
               eex.b.fieldOf("target").forGetter(eix::b),
               bso.b(0, 8).fieldOf("radius").forGetter(eix::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(eix::d)
            )
            .apply($$0, eix::new)
   );

   public elj a() {
      return this.b;
   }

   public eex b() {
      return this.c;
   }

   public bso c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
