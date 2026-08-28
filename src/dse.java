import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dse(int c, float d, float e, float f, float g, int h, bpa<ddm> i, bpa<akp<erq>> j, akp<erq> k) {
   public static final dse a = new dse(4, 6.0F, 2.0F, 2.0F, 1.0F, 40, bpa.b(), bpa.<akp<erq>>a().a(erh.aY).a(erh.aX).a(), erh.bb);
   public static final Codec<dse> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).lenientOptionalFieldOf("spawn_range", a.c).forGetter(dse::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs", a.d).forGetter(dse::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs", a.e).forGetter(dse::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs_added_per_player", a.f).forGetter(dse::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs_added_per_player", a.g).forGetter(dse::f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("ticks_between_spawn", a.h).forGetter(dse::g),
               ddm.c.lenientOptionalFieldOf("spawn_potentials", bpa.b()).forGetter(dse::h),
               bpa.a(akp.a(lu.bc)).lenientOptionalFieldOf("loot_tables_to_eject", a.j).forGetter(dse::i),
               akp.a(lu.bc).lenientOptionalFieldOf("items_to_drop_when_ominous", a.k).forGetter(dse::j)
            )
            .apply($$0, dse::new)
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

   public bpa<ddm> h() {
      return this.i;
   }

   public bpa<akp<erq>> i() {
      return this.j;
   }

   public akp<erq> j() {
      return this.k;
   }
}
