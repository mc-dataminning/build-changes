import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dqf(int c, float d, float e, float f, float g, int h, boe<dbo> i, boe<akl<epk>> j, akl<epk> k) {
   public static final dqf a = new dqf(4, 6.0F, 2.0F, 2.0F, 1.0F, 40, boe.b(), boe.<akl<epk>>a().a(epd.aW).a(epd.aV).a(), epd.aZ);
   public static final Codec<dqf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).lenientOptionalFieldOf("spawn_range", a.c).forGetter(dqf::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs", a.d).forGetter(dqf::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs", a.e).forGetter(dqf::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs_added_per_player", a.f).forGetter(dqf::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs_added_per_player", a.g).forGetter(dqf::f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("ticks_between_spawn", a.h).forGetter(dqf::g),
               dbo.c.lenientOptionalFieldOf("spawn_potentials", boe.b()).forGetter(dqf::h),
               boe.a(akl.a(lf.aU)).lenientOptionalFieldOf("loot_tables_to_eject", a.j).forGetter(dqf::i),
               akl.a(lf.aU).lenientOptionalFieldOf("items_to_drop_when_ominous", a.k).forGetter(dqf::j)
            )
            .apply($$0, dqf::new)
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

   public boe<dbo> h() {
      return this.i;
   }

   public boe<akl<epk>> i() {
      return this.j;
   }

   public akl<epk> j() {
      return this.k;
   }
}
