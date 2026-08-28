import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwr(int d, float e, float f, float g, float h, int i, bri<dht> j, bri<alo<ewn>> k, alo<ewn> l) {
   public static final dwr a = b().a();
   public static final Codec<dwr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dwr::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dwr::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dwr::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dwr::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dwr::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dwr::h),
               dht.c.optionalFieldOf("spawn_potentials", bri.b()).forGetter(dwr::i),
               bri.a(alo.a(mb.bg)).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dwr::j),
               alo.a(mb.bg).optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dwr::k)
            )
            .apply($$0, dwr::new)
   );
   public static final Codec<jq<dwr>> c = all.a(mb.bd, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dwr.a b() {
      return new dwr.a();
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

   public bri<dht> i() {
      return this.j;
   }

   public bri<alo<ewn>> j() {
      return this.k;
   }

   public alo<ewn> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private bri<dht> g = bri.b();
      private bri<alo<ewn>> h = bri.<alo<ewn>>a().a(ewe.aM).a(ewe.aL).a();
      private alo<ewn> i = ewe.aP;

      public dwr.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dwr.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dwr.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dwr.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dwr.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dwr.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dwr.a a(bri<dht> $$0) {
         this.g = $$0;
         return this;
      }

      public dwr.a b(bri<alo<ewn>> $$0) {
         this.h = $$0;
         return this;
      }

      public dwr.a a(alo<ewn> $$0) {
         this.i = $$0;
         return this;
      }

      public dwr a() {
         return new dwr(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
