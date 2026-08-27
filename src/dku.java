import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dku(int c, int d, float e, float f, float g, float h, int i, int j, bkg<cwi> k, bkg<aiy> l) {
   public static dku a = new dku(14, 4, 6.0F, 2.0F, 2.0F, 1.0F, 40, 36000, bkg.b(), bkg.<aiy>a().a(eja.aN).a(eja.aM).a());
   public static MapCodec<dku> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("required_player_range", a.c).forGetter(dku::a),
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dku::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dku::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dku::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dku::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dku::f),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dku::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", a.j).forGetter(dku::h),
               cwi.c.optionalFieldOf("spawn_potentials", bkg.b()).forGetter(dku::i),
               bkg.a(aiy.a).optionalFieldOf("loot_tables_to_eject", a.l).forGetter(dku::j)
            )
            .apply($$0, dku::new)
   );

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public float c() {
      return this.e;
   }

   public float d() {
      return this.f;
   }

   public float e() {
      return this.g;
   }

   public float f() {
      return this.h;
   }

   public int g() {
      return this.i;
   }

   public int h() {
      return this.j;
   }

   public bkg<cwi> i() {
      return this.k;
   }

   public bkg<aiy> j() {
      return this.l;
   }
}
