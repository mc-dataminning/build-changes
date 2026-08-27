import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpm(dry b, dlo c, bft d, int e) implements dpp {
   public static final Codec<dpm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dry.a.fieldOf("state_provider").forGetter(dpm::a),
               dlo.b.fieldOf("target").forGetter(dpm::b),
               bft.b(0, 8).fieldOf("radius").forGetter(dpm::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dpm::d)
            )
            .apply($$0, dpm::new)
   );

   public dry a() {
      return this.b;
   }

   public dlo b() {
      return this.c;
   }

   public bft c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
