import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dmd(int c, int d, float e, float f, float g, float h, int i, int j, blm<cxq> k, blm<ajh> l) {
   public static dmd a = new dmd(14, 4, 6.0F, 2.0F, 2.0F, 1.0F, 40, 36000, blm.b(), blm.<ajh>a().a(eks.aN).a(eks.aM).a());
   public static MapCodec<dmd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("required_player_range", a.c).forGetter(dmd::a),
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dmd::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dmd::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dmd::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dmd::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dmd::f),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dmd::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", a.j).forGetter(dmd::h),
               cxq.c.optionalFieldOf("spawn_potentials", blm.b()).forGetter(dmd::i),
               blm.a(ajh.a).optionalFieldOf("loot_tables_to_eject", a.l).forGetter(dmd::j)
            )
            .apply($$0, dmd::new)
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

   public blm<cxq> i() {
      return this.k;
   }

   public blm<ajh> j() {
      return this.l;
   }
}
