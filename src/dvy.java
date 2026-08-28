import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dvy(int d, float e, float f, float g, float h, int i, bqq<dha> j, bqq<akt<evu>> k, akt<evu> l) {
   public static final dvy a = b().a();
   public static final Codec<dvy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dvy::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dvy::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dvy::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dvy::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dvy::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dvy::h),
               dha.c.optionalFieldOf("spawn_potentials", bqq.b()).forGetter(dvy::i),
               bqq.a(akt.a(mc.bg)).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dvy::j),
               akt.a(mc.bg).optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dvy::k)
            )
            .apply($$0, dvy::new)
   );
   public static final Codec<jr<dvy>> c = akq.a(mc.bd, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dvy.a b() {
      return new dvy.a();
   }

   public dvy a(buq<?> $$0) {
      tq $$1 = new tq();
      $$1.a("id", mb.f.b($$0).toString());
      dha $$2 = new dha($$1, Optional.empty(), Optional.empty());
      return new dvy(this.d, this.e, this.f, this.g, this.h, this.i, bqq.a($$2), this.k, this.l);
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

   public bqq<dha> i() {
      return this.j;
   }

   public bqq<akt<evu>> j() {
      return this.k;
   }

   public akt<evu> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private bqq<dha> g = bqq.b();
      private bqq<akt<evu>> h = bqq.<akt<evu>>a().a(evl.aM).a(evl.aL).a();
      private akt<evu> i = evl.aP;

      public dvy.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dvy.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dvy.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dvy.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dvy.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dvy.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dvy.a a(bqq<dha> $$0) {
         this.g = $$0;
         return this;
      }

      public dvy.a b(bqq<akt<evu>> $$0) {
         this.h = $$0;
         return this;
      }

      public dvy.a a(akt<evu> $$0) {
         this.i = $$0;
         return this;
      }

      public dvy a() {
         return new dvy(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
