import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record drl(int c, float d, float e, float f, float g, int h, bon<dcv> i, bon<akj<eqt>> j, akj<eqt> k) {
   public static final drl a = new drl(4, 6.0F, 2.0F, 2.0F, 1.0F, 40, bon.b(), bon.<akj<eqt>>a().a(eqk.aY).a(eqk.aX).a(), eqk.bb);
   public static final Codec<drl> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).lenientOptionalFieldOf("spawn_range", a.c).forGetter(drl::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs", a.d).forGetter(drl::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs", a.e).forGetter(drl::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs_added_per_player", a.f).forGetter(drl::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs_added_per_player", a.g).forGetter(drl::f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("ticks_between_spawn", a.h).forGetter(drl::g),
               dcv.c.lenientOptionalFieldOf("spawn_potentials", bon.b()).forGetter(drl::h),
               bon.a(akj.a(lr.bb)).lenientOptionalFieldOf("loot_tables_to_eject", a.j).forGetter(drl::i),
               akj.a(lr.bb).lenientOptionalFieldOf("items_to_drop_when_ominous", a.k).forGetter(drl::j)
            )
            .apply($$0, drl::new)
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

   public bon<dcv> h() {
      return this.i;
   }

   public bon<akj<eqt>> i() {
      return this.j;
   }

   public akj<eqt> j() {
      return this.k;
   }
}
