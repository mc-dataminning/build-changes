import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpc(int c, int d, float e, float f, float g, float h, int i, int j, bna<dal> k, bna<akf> l) {
   public static dpc a = new dpc(14, 4, 6.0F, 2.0F, 2.0F, 1.0F, 40, 36000, bna.b(), bna.<akf>a().a(eny.aR).a(eny.aQ).a());
   public static MapCodec<dpc> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("required_player_range", a.c).forGetter(dpc::a),
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dpc::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dpc::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dpc::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dpc::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dpc::f),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dpc::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", a.j).forGetter(dpc::h),
               dal.c.optionalFieldOf("spawn_potentials", bna.b()).forGetter(dpc::i),
               bna.a(akf.a).optionalFieldOf("loot_tables_to_eject", a.l).forGetter(dpc::j)
            )
            .apply($$0, dpc::new)
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

   public bna<dal> i() {
      return this.k;
   }

   public bna<akf> j() {
      return this.l;
   }
}
