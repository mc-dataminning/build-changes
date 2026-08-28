import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dre(int c, float d, float e, float f, float g, int h, bpc<dcn> i, bpc<ald<eql>> j, ald<eql> k) {
   public static final dre a = new dre(4, 6.0F, 2.0F, 2.0F, 1.0F, 40, bpc.b(), bpc.<ald<eql>>a().a(eqc.aY).a(eqc.aX).a(), eqc.bb);
   public static final Codec<dre> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).lenientOptionalFieldOf("spawn_range", a.c).forGetter(dre::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs", a.d).forGetter(dre::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs", a.e).forGetter(dre::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs_added_per_player", a.f).forGetter(dre::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs_added_per_player", a.g).forGetter(dre::f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("ticks_between_spawn", a.h).forGetter(dre::g),
               dcn.c.lenientOptionalFieldOf("spawn_potentials", bpc.b()).forGetter(dre::h),
               bpc.a(ald.a(lq.aU)).lenientOptionalFieldOf("loot_tables_to_eject", a.j).forGetter(dre::i),
               ald.a(lq.aU).lenientOptionalFieldOf("items_to_drop_when_ominous", a.k).forGetter(dre::j)
            )
            .apply($$0, dre::new)
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

   public bpc<dcn> h() {
      return this.i;
   }

   public bpc<ald<eql>> i() {
      return this.j;
   }

   public ald<eql> j() {
      return this.k;
   }
}
