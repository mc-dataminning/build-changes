import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dum(int d, float e, float f, float g, float h, int i, bql<dfu> j, bql<alh<euh>> k, alh<euh> l) {
   public static final dum a = b().a();
   public static final Codec<dum> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dum::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dum::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dum::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dum::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dum::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dum::h),
               dfu.c.optionalFieldOf("spawn_potentials", bql.b()).forGetter(dum::i),
               bql.a(alh.a(lz.bd)).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dum::j),
               alh.a(lz.bd).optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dum::k)
            )
            .apply($$0, dum::new)
   );
   public static final Codec<jq<dum>> c = ale.a(lz.aF, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dum.a b() {
      return new dum.a();
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

   public bql<dfu> i() {
      return this.j;
   }

   public bql<alh<euh>> j() {
      return this.k;
   }

   public alh<euh> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private bql<dfu> g = bql.b();
      private bql<alh<euh>> h = bql.<alh<euh>>a().a(ety.aM).a(ety.aL).a();
      private alh<euh> i = ety.aP;

      public dum.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dum.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dum.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dum.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dum.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dum.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dum.a a(bql<dfu> $$0) {
         this.g = $$0;
         return this;
      }

      public dum.a b(bql<alh<euh>> $$0) {
         this.h = $$0;
         return this;
      }

      public dum.a a(alh<euh> $$0) {
         this.i = $$0;
         return this;
      }

      public dum a() {
         return new dum(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
