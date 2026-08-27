import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dod(int c, int d, float e, float f, float g, float h, int i, int j, bmk<czo> k, bmk<ajt> l) {
   public static dod a = new dod(14, 4, 6.0F, 2.0F, 2.0F, 1.0F, 40, 36000, bmk.b(), bmk.<ajt>a().a(emz.aO).a(emz.aN).a());
   public static MapCodec<dod> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("required_player_range", a.c).forGetter(dod::a),
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dod::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dod::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dod::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dod::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dod::f),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dod::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", a.j).forGetter(dod::h),
               czo.c.optionalFieldOf("spawn_potentials", bmk.b()).forGetter(dod::i),
               bmk.a(ajt.a).optionalFieldOf("loot_tables_to_eject", a.l).forGetter(dod::j)
            )
            .apply($$0, dod::new)
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

   public bmk<czo> i() {
      return this.k;
   }

   public bmk<ajt> j() {
      return this.l;
   }
}
