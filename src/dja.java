import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dja(int c, int d, float e, float f, float g, float h, int i, int j, bim<cuo> k, bim<ahh> l) {
   public static dja a = new dja(14, 4, 6.0F, 2.0F, 2.0F, 1.0F, 40, 36000, bim.b(), bim.<ahh>a().a(ehd.aN).a(ehd.aM).a());
   public static MapCodec<dja> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("required_player_range", a.c).forGetter(dja::a),
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dja::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dja::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dja::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dja::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dja::f),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dja::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", a.j).forGetter(dja::h),
               cuo.c.optionalFieldOf("spawn_potentials", bim.b()).forGetter(dja::i),
               bim.a(ahh.a).optionalFieldOf("loot_tables_to_eject", a.l).forGetter(dja::j)
            )
            .apply($$0, dja::new)
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

   public bim<cuo> i() {
      return this.k;
   }

   public bim<ahh> j() {
      return this.l;
   }
}
