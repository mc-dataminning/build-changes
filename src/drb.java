import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record drb(int c, float d, float e, float f, float g, int h, boz<dck> i, boz<ala<eqi>> j, ala<eqi> k) {
   public static final drb a = new drb(4, 6.0F, 2.0F, 2.0F, 1.0F, 40, boz.b(), boz.<ala<eqi>>a().a(epz.aY).a(epz.aX).a(), epz.bb);
   public static final Codec<drb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).lenientOptionalFieldOf("spawn_range", a.c).forGetter(drb::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs", a.d).forGetter(drb::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs", a.e).forGetter(drb::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs_added_per_player", a.f).forGetter(drb::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs_added_per_player", a.g).forGetter(drb::f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("ticks_between_spawn", a.h).forGetter(drb::g),
               dck.c.lenientOptionalFieldOf("spawn_potentials", boz.b()).forGetter(drb::h),
               boz.a(ala.a(lq.aU)).lenientOptionalFieldOf("loot_tables_to_eject", a.j).forGetter(drb::i),
               ala.a(lq.aU).lenientOptionalFieldOf("items_to_drop_when_ominous", a.k).forGetter(drb::j)
            )
            .apply($$0, drb::new)
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

   public boz<dck> h() {
      return this.i;
   }

   public boz<ala<eqi>> i() {
      return this.j;
   }

   public ala<eqi> j() {
      return this.k;
   }
}
