import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsg(int c, int d, float e, float f, float g, float h, int i, int j, bok<dcr> k, bok<aks<eru>> l) {
   public static final dsg a = new dsg(14, 4, 6.0F, 2.0F, 2.0F, 1.0F, 40, 36000, bok.b(), bok.<aks<eru>>a().a(ern.bk).a(ern.bj).a());
   public static final MapCodec<dsg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("required_player_range", a.c).forGetter(dsg::a),
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dsg::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dsg::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dsg::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dsg::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dsg::f),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dsg::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", a.j).forGetter(dsg::h),
               dcr.c.optionalFieldOf("spawn_potentials", bok.b()).forGetter(dsg::i),
               bok.a(aks.a(li.aU)).optionalFieldOf("loot_tables_to_eject", a.l).forGetter(dsg::j)
            )
            .apply($$0, dsg::new)
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

   public bok<dcr> i() {
      return this.k;
   }

   public bok<aks<eru>> j() {
      return this.l;
   }
}
