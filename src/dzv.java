import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dzv(int d, float e, float f, float g, float h, int i, bsq<dkg> j, bsq<alf<ezy>> k, alf<ezy> l) {
   public static final dzv a = b().a();
   public static final Codec<dzv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dzv::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dzv::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dzv::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dzv::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dzv::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dzv::h),
               dkg.c.optionalFieldOf("spawn_potentials", bsq.a()).forGetter(dzv::i),
               bsq.a(ezy.a).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dzv::j),
               ezy.a.optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dzv::k)
            )
            .apply($$0, dzv::new)
   );
   public static final Codec<jf<dzv>> c = alc.a(mh.bi, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dzv.a b() {
      return new dzv.a();
   }

   public dzv a(bwr<?> $$0) {
      tz $$1 = new tz();
      $$1.a("id", mg.f.b($$0).toString());
      dkg $$2 = new dkg($$1, Optional.empty(), Optional.empty());
      return new dzv(this.d, this.e, this.f, this.g, this.h, this.i, bsq.a($$2), this.k, this.l);
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

   public bsq<dkg> i() {
      return this.j;
   }

   public bsq<alf<ezy>> j() {
      return this.k;
   }

   public alf<ezy> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private bsq<dkg> g = bsq.a();
      private bsq<alf<ezy>> h = bsq.<alf<ezy>>b().a(ezp.aM).a(ezp.aL).a();
      private alf<ezy> i = ezp.aP;

      public dzv.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dzv.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dzv.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dzv.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dzv.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dzv.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dzv.a a(bsq<dkg> $$0) {
         this.g = $$0;
         return this;
      }

      public dzv.a b(bsq<alf<ezy>> $$0) {
         this.h = $$0;
         return this;
      }

      public dzv.a a(alf<ezy> $$0) {
         this.i = $$0;
         return this;
      }

      public dzv a() {
         return new dzv(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
