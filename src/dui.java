import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dui(int b, int c, int d, int e, int f, bja g, float h) implements dtr {
   public static final Codec<dui> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 32).fieldOf("charge_count").forGetter(dui::a),
               Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(dui::b),
               Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(dui::c),
               Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(dui::d),
               Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(dui::f),
               bja.c.fieldOf("extra_rare_growths").forGetter(dui::g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(dui::h)
            )
            .apply($$0, dui::new)
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
