import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsg(int c, float d, float e, float f, float g, int h, bpb<ddo> i, bpb<akq<erw>> j, akq<erw> k) {
   public static final dsg a = new dsg(4, 6.0F, 2.0F, 2.0F, 1.0F, 40, bpb.b(), bpb.<akq<erw>>a().a(ern.aY).a(ern.aX).a(), ern.bb);
   public static final Codec<dsg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).lenientOptionalFieldOf("spawn_range", a.c).forGetter(dsg::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs", a.d).forGetter(dsg::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs", a.e).forGetter(dsg::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs_added_per_player", a.f).forGetter(dsg::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs_added_per_player", a.g).forGetter(dsg::f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("ticks_between_spawn", a.h).forGetter(dsg::g),
               ddo.c.lenientOptionalFieldOf("spawn_potentials", bpb.b()).forGetter(dsg::h),
               bpb.a(akq.a(lu.bc)).lenientOptionalFieldOf("loot_tables_to_eject", a.j).forGetter(dsg::i),
               akq.a(lu.bc).lenientOptionalFieldOf("items_to_drop_when_ominous", a.k).forGetter(dsg::j)
            )
            .apply($$0, dsg::new)
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

   public bpb<ddo> h() {
      return this.i;
   }

   public bpb<akq<erw>> i() {
      return this.j;
   }

   public akq<erw> j() {
      return this.k;
   }
}
