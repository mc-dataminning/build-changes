import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dkq(int c, int d, float e, float f, float g, float h, int i, int j, bke<cwe> k, bke<aiy> l) {
   public static dkq a = new dkq(14, 4, 6.0F, 2.0F, 2.0F, 1.0F, 40, 36000, bke.b(), bke.<aiy>a().a(eit.aN).a(eit.aM).a());
   public static MapCodec<dkq> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("required_player_range", a.c).forGetter(dkq::a),
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dkq::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dkq::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dkq::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dkq::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dkq::f),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dkq::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", a.j).forGetter(dkq::h),
               cwe.c.optionalFieldOf("spawn_potentials", bke.b()).forGetter(dkq::i),
               bke.a(aiy.a).optionalFieldOf("loot_tables_to_eject", a.l).forGetter(dkq::j)
            )
            .apply($$0, dkq::new)
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

   public bke<cwe> i() {
      return this.k;
   }

   public bke<aiy> j() {
      return this.l;
   }
}
