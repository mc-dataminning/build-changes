import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edm(efy b, dzn c, bpm d, int e) implements edp {
   public static final Codec<edm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efy.a.fieldOf("state_provider").forGetter(edm::a),
               dzn.b.fieldOf("target").forGetter(edm::b),
               bpm.b(0, 8).fieldOf("radius").forGetter(edm::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(edm::d)
            )
            .apply($$0, edm::new)
   );

   public efy a() {
      return this.b;
   }

   public dzn b() {
      return this.c;
   }

   public bpm c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
