import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record drh(int c, float d, float e, float f, float g, int h, bpf<dcq> i, bpf<ale<eqo>> j, ale<eqo> k) {
   public static final drh a = new drh(4, 6.0F, 2.0F, 2.0F, 1.0F, 40, bpf.b(), bpf.<ale<eqo>>a().a(eqf.aY).a(eqf.aX).a(), eqf.bb);
   public static final Codec<drh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).lenientOptionalFieldOf("spawn_range", a.c).forGetter(drh::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs", a.d).forGetter(drh::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs", a.e).forGetter(drh::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs_added_per_player", a.f).forGetter(drh::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs_added_per_player", a.g).forGetter(drh::f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("ticks_between_spawn", a.h).forGetter(drh::g),
               dcq.c.lenientOptionalFieldOf("spawn_potentials", bpf.b()).forGetter(drh::h),
               bpf.a(ale.a(lq.aU)).lenientOptionalFieldOf("loot_tables_to_eject", a.j).forGetter(drh::i),
               ale.a(lq.aU).lenientOptionalFieldOf("items_to_drop_when_ominous", a.k).forGetter(drh::j)
            )
            .apply($$0, drh::new)
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

   public bpf<dcq> h() {
      return this.i;
   }

   public bpf<ale<eqo>> i() {
      return this.j;
   }

   public ale<eqo> j() {
      return this.k;
   }
}
