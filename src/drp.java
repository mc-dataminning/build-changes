import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record drp(int c, float d, float e, float f, float g, int h, bor<dcy> i, bor<akj<erb>> j, akj<erb> k) {
   public static final drp a = new drp(4, 6.0F, 2.0F, 2.0F, 1.0F, 40, bor.b(), bor.<akj<erb>>a().a(eqs.aY).a(eqs.aX).a(), eqs.bb);
   public static final Codec<drp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).lenientOptionalFieldOf("spawn_range", a.c).forGetter(drp::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs", a.d).forGetter(drp::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs", a.e).forGetter(drp::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs_added_per_player", a.f).forGetter(drp::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs_added_per_player", a.g).forGetter(drp::f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("ticks_between_spawn", a.h).forGetter(drp::g),
               dcy.c.lenientOptionalFieldOf("spawn_potentials", bor.b()).forGetter(drp::h),
               bor.a(akj.a(lr.bb)).lenientOptionalFieldOf("loot_tables_to_eject", a.j).forGetter(drp::i),
               akj.a(lr.bb).lenientOptionalFieldOf("items_to_drop_when_ominous", a.k).forGetter(drp::j)
            )
            .apply($$0, drp::new)
   );

   public int a(int $$0) {
      return (int)Math.floor((double)(this.d + this.f * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }

   public float e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public int g() {
      return this.h;
   }

   public bor<dcy> h() {
      return this.i;
   }

   public bor<akj<erb>> i() {
      return this.j;
   }

   public akj<erb> j() {
      return this.k;
   }
}
