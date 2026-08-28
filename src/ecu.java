import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ecu(efg b, dyw c, bpu d, int e) implements ecx {
   public static final Codec<ecu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efg.a.fieldOf("state_provider").forGetter(ecu::a),
               dyw.b.fieldOf("target").forGetter(ecu::b),
               bpu.b(0, 8).fieldOf("radius").forGetter(ecu::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(ecu::d)
            )
            .apply($$0, ecu::new)
   );

   public efg a() {
      return this.b;
   }

   public dyw b() {
      return this.c;
   }

   public bpu c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
