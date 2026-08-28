import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dri(int c, float d, float e, float f, float g, int h, bpg<dcr> i, bpg<ale<eqp>> j, ale<eqp> k) {
   public static final dri a = new dri(4, 6.0F, 2.0F, 2.0F, 1.0F, 40, bpg.b(), bpg.<ale<eqp>>a().a(eqg.aY).a(eqg.aX).a(), eqg.bb);
   public static final Codec<dri> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).lenientOptionalFieldOf("spawn_range", a.c).forGetter(dri::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs", a.d).forGetter(dri::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs", a.e).forGetter(dri::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs_added_per_player", a.f).forGetter(dri::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs_added_per_player", a.g).forGetter(dri::f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("ticks_between_spawn", a.h).forGetter(dri::g),
               dcr.c.lenientOptionalFieldOf("spawn_potentials", bpg.b()).forGetter(dri::h),
               bpg.a(ale.a(lq.aU)).lenientOptionalFieldOf("loot_tables_to_eject", a.j).forGetter(dri::i),
               ale.a(lq.aU).lenientOptionalFieldOf("items_to_drop_when_ominous", a.k).forGetter(dri::j)
            )
            .apply($$0, dri::new)
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

   public bpg<dcr> h() {
      return this.i;
   }

   public bpg<ale<eqp>> i() {
      return this.j;
   }

   public ale<eqp> j() {
      return this.k;
   }
}
