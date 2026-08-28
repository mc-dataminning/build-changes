import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record drf(int c, float d, float e, float f, float g, int h, bpd<dco> i, bpd<ald<eqm>> j, ald<eqm> k) {
   public static final drf a = new drf(4, 6.0F, 2.0F, 2.0F, 1.0F, 40, bpd.b(), bpd.<ald<eqm>>a().a(eqd.aY).a(eqd.aX).a(), eqd.bb);
   public static final Codec<drf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).lenientOptionalFieldOf("spawn_range", a.c).forGetter(drf::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs", a.d).forGetter(drf::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs", a.e).forGetter(drf::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs_added_per_player", a.f).forGetter(drf::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs_added_per_player", a.g).forGetter(drf::f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("ticks_between_spawn", a.h).forGetter(drf::g),
               dco.c.lenientOptionalFieldOf("spawn_potentials", bpd.b()).forGetter(drf::h),
               bpd.a(ald.a(lq.aU)).lenientOptionalFieldOf("loot_tables_to_eject", a.j).forGetter(drf::i),
               ald.a(lq.aU).lenientOptionalFieldOf("items_to_drop_when_ominous", a.k).forGetter(drf::j)
            )
            .apply($$0, drf::new)
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

   public bpd<dco> h() {
      return this.i;
   }

   public bpd<ald<eqm>> i() {
      return this.j;
   }

   public ald<eqm> j() {
      return this.k;
   }
}
