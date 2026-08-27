import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dir(int c, int d, float e, float f, float g, float h, int i, int j, bik<cuf> k, bik<ahg> l) {
   public static dir a = new dir(14, 4, 6.0F, 2.0F, 2.0F, 1.0F, 40, 36000, bik.b(), bik.b());
   public static MapCodec<dir> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("required_player_range", a.c).forGetter(dir::a),
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dir::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dir::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dir::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dir::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dir::f),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dir::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", a.j).forGetter(dir::h),
               cuf.c.optionalFieldOf("spawn_potentials", bik.b()).forGetter(dir::i),
               bik.a(ahg.a).optionalFieldOf("loot_tables_to_eject", bik.b()).forGetter(dir::j)
            )
            .apply($$0, dir::new)
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

   public bik<cuf> i() {
      return this.k;
   }

   public bik<ahg> j() {
      return this.l;
   }
}
