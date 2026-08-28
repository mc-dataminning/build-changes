import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dzb(int d, float e, float f, float g, float h, int i, bsm<djp> j, bsm<alf<eze>> k, alf<eze> l) {
   public static final dzb a = b().a();
   public static final Codec<dzb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dzb::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dzb::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dzb::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dzb::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dzb::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dzb::h),
               djp.c.optionalFieldOf("spawn_potentials", bsm.a()).forGetter(dzb::i),
               bsm.a(alf.a(mg.bp)).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dzb::j),
               alf.a(mg.bp).optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dzb::k)
            )
            .apply($$0, dzb::new)
   );
   public static final Codec<je<dzb>> c = alc.a(mg.bh, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dzb.a b() {
      return new dzb.a();
   }

   public dzb a(bwm<?> $$0) {
      tz $$1 = new tz();
      $$1.a("id", mf.f.b($$0).toString());
      djp $$2 = new djp($$1, Optional.empty(), Optional.empty());
      return new dzb(this.d, this.e, this.f, this.g, this.h, this.i, bsm.a($$2), this.k, this.l);
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

   public bsm<djp> i() {
      return this.j;
   }

   public bsm<alf<eze>> j() {
      return this.k;
   }

   public alf<eze> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private bsm<djp> g = bsm.a();
      private bsm<alf<eze>> h = bsm.<alf<eze>>b().a(eyv.aM).a(eyv.aL).a();
      private alf<eze> i = eyv.aP;

      public dzb.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dzb.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dzb.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dzb.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dzb.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dzb.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dzb.a a(bsm<djp> $$0) {
         this.g = $$0;
         return this;
      }

      public dzb.a b(bsm<alf<eze>> $$0) {
         this.h = $$0;
         return this;
      }

      public dzb.a a(alf<eze> $$0) {
         this.i = $$0;
         return this;
      }

      public dzb a() {
         return new dzb(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
