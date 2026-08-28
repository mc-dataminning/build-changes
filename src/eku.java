import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eku(eng b, egu c, btd d, int e) implements ekx {
   public static final Codec<eku> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eng.a.fieldOf("state_provider").forGetter(eku::a),
               egu.b.fieldOf("target").forGetter(eku::b),
               btd.b(0, 8).fieldOf("radius").forGetter(eku::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(eku::d)
            )
            .apply($$0, eku::new)
   );

   public eng a() {
      return this.b;
   }

   public egu b() {
      return this.c;
   }

   public btd c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
