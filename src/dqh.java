import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqh(int c, float d, float e, float f, float g, int h, bog<dbq> i, bog<akm<epm>> j, akm<epm> k) {
   public static final dqh a = new dqh(4, 6.0F, 2.0F, 2.0F, 1.0F, 40, bog.b(), bog.<akm<epm>>a().a(epf.aW).a(epf.aV).a(), epf.aZ);
   public static final Codec<dqh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).lenientOptionalFieldOf("spawn_range", a.c).forGetter(dqh::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs", a.d).forGetter(dqh::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs", a.e).forGetter(dqh::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs_added_per_player", a.f).forGetter(dqh::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs_added_per_player", a.g).forGetter(dqh::f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("ticks_between_spawn", a.h).forGetter(dqh::g),
               dbq.c.lenientOptionalFieldOf("spawn_potentials", bog.b()).forGetter(dqh::h),
               bog.a(akm.a(lf.aU)).lenientOptionalFieldOf("loot_tables_to_eject", a.j).forGetter(dqh::i),
               akm.a(lf.aU).lenientOptionalFieldOf("items_to_drop_when_ominous", a.k).forGetter(dqh::j)
            )
            .apply($$0, dqh::new)
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

   public bog<dbq> h() {
      return this.i;
   }

   public bog<akm<epm>> i() {
      return this.j;
   }

   public akm<epm> j() {
      return this.k;
   }
}
