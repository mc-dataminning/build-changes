import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dro(int c, float d, float e, float f, float g, int h, boq<dcx> i, boq<akj<eqz>> j, akj<eqz> k) {
   public static final dro a = new dro(4, 6.0F, 2.0F, 2.0F, 1.0F, 40, boq.b(), boq.<akj<eqz>>a().a(eqq.aY).a(eqq.aX).a(), eqq.bb);
   public static final Codec<dro> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).lenientOptionalFieldOf("spawn_range", a.c).forGetter(dro::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs", a.d).forGetter(dro::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs", a.e).forGetter(dro::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs_added_per_player", a.f).forGetter(dro::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs_added_per_player", a.g).forGetter(dro::f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("ticks_between_spawn", a.h).forGetter(dro::g),
               dcx.c.lenientOptionalFieldOf("spawn_potentials", boq.b()).forGetter(dro::h),
               boq.a(akj.a(lr.bb)).lenientOptionalFieldOf("loot_tables_to_eject", a.j).forGetter(dro::i),
               akj.a(lr.bb).lenientOptionalFieldOf("items_to_drop_when_ominous", a.k).forGetter(dro::j)
            )
            .apply($$0, dro::new)
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

   public boq<dcx> h() {
      return this.i;
   }

   public boq<akj<eqz>> i() {
      return this.j;
   }

   public akj<eqz> j() {
      return this.k;
   }
}
