import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpl(int c, int d, float e, float f, float g, float h, int i, int j, bnw<dau> k, bnw<akg<eoq>> l) {
   public static final dpl a = new dpl(14, 4, 6.0F, 2.0F, 2.0F, 1.0F, 40, 36000, bnw.b(), bnw.<akg<eoq>>a().a(eoj.aR).a(eoj.aQ).a());
   public static final MapCodec<dpl> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("required_player_range", a.c).forGetter(dpl::a),
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dpl::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dpl::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dpl::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dpl::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dpl::f),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dpl::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", a.j).forGetter(dpl::h),
               dau.c.optionalFieldOf("spawn_potentials", bnw.b()).forGetter(dpl::i),
               bnw.a(akg.a(le.aU)).optionalFieldOf("loot_tables_to_eject", a.l).forGetter(dpl::j)
            )
            .apply($$0, dpl::new)
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

   public bnw<dau> i() {
      return this.k;
   }

   public bnw<akg<eoq>> j() {
      return this.l;
   }
}
