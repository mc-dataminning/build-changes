import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dur(int d, float e, float f, float g, float h, int i, bqp<dfz> j, bqp<alk<eul>> k, alk<eul> l) {
   public static final dur a = b().a();
   public static final Codec<dur> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dur::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dur::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dur::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dur::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dur::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dur::h),
               dfz.c.optionalFieldOf("spawn_potentials", bqp.b()).forGetter(dur::i),
               bqp.a(alk.a(ma.bd)).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dur::j),
               alk.a(ma.bd).optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dur::k)
            )
            .apply($$0, dur::new)
   );
   public static final Codec<jq<dur>> c = alh.a(ma.aF, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dur.a b() {
      return new dur.a();
   }

   public int c() {
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

   public float g() {
      return this.h;
   }

   public int h() {
      return this.i;
   }

   public bqp<dfz> i() {
      return this.j;
   }

   public bqp<alk<eul>> j() {
      return this.k;
   }

   public alk<eul> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private bqp<dfz> g = bqp.b();
      private bqp<alk<eul>> h = bqp.<alk<eul>>a().a(euc.aM).a(euc.aL).a();
      private alk<eul> i = euc.aP;

      public dur.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dur.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dur.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dur.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dur.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dur.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dur.a a(bqp<dfz> $$0) {
         this.g = $$0;
         return this;
      }

      public dur.a b(bqp<alk<eul>> $$0) {
         this.h = $$0;
         return this;
      }

      public dur.a a(alk<eul> $$0) {
         this.i = $$0;
         return this;
      }

      public dur a() {
         return new dur(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
