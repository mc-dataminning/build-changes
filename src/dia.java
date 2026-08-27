import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dia(int c, int d, float e, float f, float g, float h, int i, int j, bhv<ctp> k, bhv<agt> l) {
   public static dia a = new dia(14, 4, 6.0F, 2.0F, 2.0F, 1.0F, 40, 36000, bhv.b(), bhv.b());
   public static MapCodec<dia> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("required_player_range", a.c).forGetter(dia::a),
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dia::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dia::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dia::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dia::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dia::f),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dia::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", a.j).forGetter(dia::h),
               ctp.c.optionalFieldOf("spawn_potentials", bhv.b()).forGetter(dia::i),
               bhv.a(agt.a).optionalFieldOf("loot_tables_to_eject", bhv.b()).forGetter(dia::j)
            )
            .apply($$0, dia::new)
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

   public bhv<ctp> i() {
      return this.k;
   }

   public bhv<agt> j() {
      return this.l;
   }
}
