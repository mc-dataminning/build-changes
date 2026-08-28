import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record drg(int c, float d, float e, float f, float g, int h, bpe<dcp> i, bpe<ale<eqn>> j, ale<eqn> k) {
   public static final drg a = new drg(4, 6.0F, 2.0F, 2.0F, 1.0F, 40, bpe.b(), bpe.<ale<eqn>>a().a(eqe.aY).a(eqe.aX).a(), eqe.bb);
   public static final Codec<drg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).lenientOptionalFieldOf("spawn_range", a.c).forGetter(drg::b),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs", a.d).forGetter(drg::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs", a.e).forGetter(drg::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("total_mobs_added_per_player", a.f).forGetter(drg::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).lenientOptionalFieldOf("simultaneous_mobs_added_per_player", a.g).forGetter(drg::f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("ticks_between_spawn", a.h).forGetter(drg::g),
               dcp.c.lenientOptionalFieldOf("spawn_potentials", bpe.b()).forGetter(drg::h),
               bpe.a(ale.a(lq.aU)).lenientOptionalFieldOf("loot_tables_to_eject", a.j).forGetter(drg::i),
               ale.a(lq.aU).lenientOptionalFieldOf("items_to_drop_when_ominous", a.k).forGetter(drg::j)
            )
            .apply($$0, drg::new)
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

   public bpe<dcp> h() {
      return this.i;
   }

   public bpe<ale<eqn>> i() {
      return this.j;
   }

   public ale<eqn> j() {
      return this.k;
   }
}
