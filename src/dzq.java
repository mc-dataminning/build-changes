import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dzq(int d, float e, float f, float g, float h, int i, bsq<dkb> j, bsq<alf<ezt>> k, alf<ezt> l) {
   public static final dzq a = b().a();
   public static final Codec<dzq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dzq::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dzq::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dzq::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dzq::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dzq::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dzq::h),
               dkb.c.optionalFieldOf("spawn_potentials", bsq.a()).forGetter(dzq::i),
               bsq.a(ezt.a).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dzq::j),
               ezt.a.optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dzq::k)
            )
            .apply($$0, dzq::new)
   );
   public static final Codec<jf<dzq>> c = alc.a(mh.bi, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dzq.a b() {
      return new dzq.a();
   }

   public dzq a(bwr<?> $$0) {
      tz $$1 = new tz();
      $$1.a("id", mg.f.b($$0).toString());
      dkb $$2 = new dkb($$1, Optional.empty(), Optional.empty());
      return new dzq(this.d, this.e, this.f, this.g, this.h, this.i, bsq.a($$2), this.k, this.l);
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

   public bsq<dkb> i() {
      return this.j;
   }

   public bsq<alf<ezt>> j() {
      return this.k;
   }

   public alf<ezt> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private bsq<dkb> g = bsq.a();
      private bsq<alf<ezt>> h = bsq.<alf<ezt>>b().a(ezk.aM).a(ezk.aL).a();
      private alf<ezt> i = ezk.aP;

      public dzq.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dzq.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dzq.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dzq.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dzq.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dzq.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dzq.a a(bsq<dkb> $$0) {
         this.g = $$0;
         return this;
      }

      public dzq.a b(bsq<alf<ezt>> $$0) {
         this.h = $$0;
         return this;
      }

      public dzq.a a(alf<ezt> $$0) {
         this.i = $$0;
         return this;
      }

      public dzq a() {
         return new dzq(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
