import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dom(int c, int d, float e, float f, float g, float h, int i, int j, bmp<czx> k, bmp<ajv> l) {
   public static dom a = new dom(14, 4, 6.0F, 2.0F, 2.0F, 1.0F, 40, 36000, bmp.b(), bmp.<ajv>a().a(eni.aO).a(eni.aN).a());
   public static MapCodec<dom> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("required_player_range", a.c).forGetter(dom::a),
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dom::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dom::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dom::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dom::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dom::f),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dom::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", a.j).forGetter(dom::h),
               czx.c.optionalFieldOf("spawn_potentials", bmp.b()).forGetter(dom::i),
               bmp.a(ajv.a).optionalFieldOf("loot_tables_to_eject", a.l).forGetter(dom::j)
            )
            .apply($$0, dom::new)
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

   public bmp<czx> i() {
      return this.k;
   }

   public bmp<ajv> j() {
      return this.l;
   }
}
