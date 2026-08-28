import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eag(int d, float e, float f, float g, float h, int i, btb<dkr> j, btb<alh<fam>> k, alh<fam> l) {
   public static final eag a = b().a();
   public static final Codec<eag> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(eag::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(eag::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(eag::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(eag::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(eag::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(eag::h),
               dkr.c.optionalFieldOf("spawn_potentials", btb.a()).forGetter(eag::i),
               btb.a(fam.a).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(eag::j),
               fam.a.optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(eag::k)
            )
            .apply($$0, eag::new)
   );
   public static final Codec<jf<eag>> c = ale.a(mh.bi, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static eag.a b() {
      return new eag.a();
   }

   public eag a(bxc<?> $$0) {
      tz $$1 = new tz();
      $$1.a("id", mg.f.b($$0).toString());
      dkr $$2 = new dkr($$1, Optional.empty(), Optional.empty());
      return new eag(this.d, this.e, this.f, this.g, this.h, this.i, btb.a($$2), this.k, this.l);
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

   public btb<dkr> i() {
      return this.j;
   }

   public btb<alh<fam>> j() {
      return this.k;
   }

   public alh<fam> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private btb<dkr> g = btb.a();
      private btb<alh<fam>> h = btb.<alh<fam>>b().a(fad.aM).a(fad.aL).a();
      private alh<fam> i = fad.aP;

      public eag.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public eag.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public eag.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public eag.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public eag.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public eag.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public eag.a a(btb<dkr> $$0) {
         this.g = $$0;
         return this;
      }

      public eag.a b(btb<alh<fam>> $$0) {
         this.h = $$0;
         return this;
      }

      public eag.a a(alh<fam> $$0) {
         this.i = $$0;
         return this;
      }

      public eag a() {
         return new eag(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
