import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwq(int d, float e, float f, float g, float h, int i, brm<dhu> j, brm<aly<ewm>> k, aly<ewm> l) {
   public static final dwq a = b().a();
   public static final Codec<dwq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dwq::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dwq::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dwq::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dwq::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dwq::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dwq::h),
               dhu.c.optionalFieldOf("spawn_potentials", brm.b()).forGetter(dwq::i),
               brm.a(aly.a(mb.bf)).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dwq::j),
               aly.a(mb.bf).optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dwq::k)
            )
            .apply($$0, dwq::new)
   );
   public static final Codec<jq<dwq>> c = alv.a(mb.bc, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dwq.a b() {
      return new dwq.a();
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

   public brm<dhu> i() {
      return this.j;
   }

   public brm<aly<ewm>> j() {
      return this.k;
   }

   public aly<ewm> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private brm<dhu> g = brm.b();
      private brm<aly<ewm>> h = brm.<aly<ewm>>a().a(ewd.aM).a(ewd.aL).a();
      private aly<ewm> i = ewd.aP;

      public dwq.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dwq.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dwq.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dwq.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dwq.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dwq.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dwq.a a(brm<dhu> $$0) {
         this.g = $$0;
         return this;
      }

      public dwq.a b(brm<aly<ewm>> $$0) {
         this.h = $$0;
         return this;
      }

      public dwq.a a(aly<ewm> $$0) {
         this.i = $$0;
         return this;
      }

      public dwq a() {
         return new dwq(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
