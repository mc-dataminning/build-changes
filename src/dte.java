import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dte(int c, float d, float e, float f, float g, int h, bpu<del> i, bpu<ala<esy>> j, ala<esy> k) {
   public static final dte a = new dte(4, 6.0F, 2.0F, 2.0F, 1.0F, 40, bpu.b(), bpu.<ala<esy>>a().a(esp.aK).a(esp.aJ).a(), esp.aN);
   public static final Codec<dte> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).lenientOptionalFieldOf("spawn_range", a.c).forGetter(dte::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs", a.d).forGetter(dte::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs", a.e).forGetter(dte::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs_added_per_player", a.f).forGetter(dte::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs_added_per_player", a.g).forGetter(dte::f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("ticks_between_spawn", a.h).forGetter(dte::g),
               del.c.lenientOptionalFieldOf("spawn_potentials", bpu.b()).forGetter(dte::h),
               bpu.a(ala.a(lv.bc)).lenientOptionalFieldOf("loot_tables_to_eject", a.j).forGetter(dte::i),
               ala.a(lv.bc).lenientOptionalFieldOf("items_to_drop_when_ominous", a.k).forGetter(dte::j)
            )
            .apply($$0, dte::new)
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

   public bpu<del> h() {
      return this.i;
   }

   public bpu<ala<esy>> i() {
      return this.j;
   }

   public ala<esy> j() {
      return this.k;
   }
}
