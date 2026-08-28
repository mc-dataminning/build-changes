import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eeg(int b, int c, int d, int e, int f, bpm g, float h) implements edp {
   public static final Codec<eeg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(eeg::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(eeg::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(eeg::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(eeg::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(eeg::f),
               bpm.c.fieldOf("extra_rare_growths").forGetter(eeg::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(eeg::h)
            )
            .apply($$0, eeg::new)
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
