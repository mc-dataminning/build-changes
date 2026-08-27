import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ecu(int b, int c, int d, int e, int f, bpb g, float h) implements ecd {
   public static final Codec<ecu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(ecu::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(ecu::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(ecu::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(ecu::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(ecu::f),
               bpb.c.fieldOf("extra_rare_growths").forGetter(ecu::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(ecu::h)
            )
            .apply($$0, ecu::new)
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

   public int d() {
      return this.e;
   }
}
