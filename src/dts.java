import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dts(int c, float d, float e, float f, float g, int h, bpz<dez> i, bpz<alb<etm>> j, alb<etm> k) {
   public static final dts a = new dts(4, 6.0F, 2.0F, 2.0F, 1.0F, 40, bpz.b(), bpz.<alb<etm>>a().a(etd.aK).a(etd.aJ).a(), etd.aN);
   public static final Codec<dts> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).lenientOptionalFieldOf("spawn_range", a.c).forGetter(dts::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs", a.d).forGetter(dts::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs", a.e).forGetter(dts::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs_added_per_player", a.f).forGetter(dts::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs_added_per_player", a.g).forGetter(dts::f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("ticks_between_spawn", a.h).forGetter(dts::g),
               dez.c.lenientOptionalFieldOf("spawn_potentials", bpz.b()).forGetter(dts::h),
               bpz.a(alb.a(lv.bd)).lenientOptionalFieldOf("loot_tables_to_eject", a.j).forGetter(dts::i),
               alb.a(lv.bd).lenientOptionalFieldOf("items_to_drop_when_ominous", a.k).forGetter(dts::j)
            )
            .apply($$0, dts::new)
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

   public bpz<dez> h() {
      return this.i;
   }

   public bpz<alb<etm>> i() {
      return this.j;
   }

   public alb<etm> j() {
      return this.k;
   }
}
