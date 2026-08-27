import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dmf(int c, int d, float e, float f, float g, float h, int i, int j, bln<cxs> k, bln<ajh> l) {
   public static dmf a = new dmf(14, 4, 6.0F, 2.0F, 2.0F, 1.0F, 40, 36000, bln.b(), bln.<ajh>a().a(eku.aO).a(eku.aN).a());
   public static MapCodec<dmf> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("required_player_range", a.c).forGetter(dmf::a),
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dmf::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dmf::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dmf::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dmf::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dmf::f),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dmf::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", a.j).forGetter(dmf::h),
               cxs.c.optionalFieldOf("spawn_potentials", bln.b()).forGetter(dmf::i),
               bln.a(ajh.a).optionalFieldOf("loot_tables_to_eject", a.l).forGetter(dmf::j)
            )
            .apply($$0, dmf::new)
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

   public bln<cxs> i() {
      return this.k;
   }

   public bln<ajh> j() {
      return this.l;
   }
}
