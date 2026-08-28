import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eai(int d, float e, float f, float g, float h, int i, btd<dkt> j, btd<alj<fao>> k, alj<fao> l) {
   public static final eai a = b().a();
   public static final Codec<eai> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(eai::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(eai::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(eai::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(eai::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(eai::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(eai::h),
               dkt.c.optionalFieldOf("spawn_potentials", btd.a()).forGetter(eai::i),
               btd.a(fao.a).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(eai::j),
               fao.a.optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(eai::k)
            )
            .apply($$0, eai::new)
   );
   public static final Codec<jg<eai>> c = alg.a(mi.bi, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static eai.a b() {
      return new eai.a();
   }

   public eai a(bxe<?> $$0) {
      ua $$1 = new ua();
      $$1.a("id", mh.f.b($$0).toString());
      dkt $$2 = new dkt($$1, Optional.empty(), Optional.empty());
      return new eai(this.d, this.e, this.f, this.g, this.h, this.i, btd.a($$2), this.k, this.l);
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

   public btd<dkt> i() {
      return this.j;
   }

   public btd<alj<fao>> j() {
      return this.k;
   }

   public alj<fao> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private btd<dkt> g = btd.a();
      private btd<alj<fao>> h = btd.<alj<fao>>b().a(faf.aM).a(faf.aL).a();
      private alj<fao> i = faf.aP;

      public eai.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public eai.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public eai.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public eai.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public eai.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public eai.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public eai.a a(btd<dkt> $$0) {
         this.g = $$0;
         return this;
      }

      public eai.a b(btd<alj<fao>> $$0) {
         this.h = $$0;
         return this;
      }

      public eai.a a(alj<fao> $$0) {
         this.i = $$0;
         return this;
      }

      public eai a() {
         return new eai(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
