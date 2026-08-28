import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dxp(int d, float e, float f, float g, float h, int i, bsb<dij> j, bsb<alc<exq>> k, alc<exq> l) {
   public static final dxp a = b().a();
   public static final Codec<dxp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dxp::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dxp::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dxp::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dxp::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dxp::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dxp::h),
               dij.c.optionalFieldOf("spawn_potentials", bsb.a()).forGetter(dxp::i),
               bsb.a(alc.a(me.bn)).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dxp::j),
               alc.a(me.bn).optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dxp::k)
            )
            .apply($$0, dxp::new)
   );
   public static final Codec<js<dxp>> c = akz.a(me.bk, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dxp.a b() {
      return new dxp.a();
   }

   public dxp a(bwb<?> $$0) {
      tw $$1 = new tw();
      $$1.a("id", md.f.b($$0).toString());
      dij $$2 = new dij($$1, Optional.empty(), Optional.empty());
      return new dxp(this.d, this.e, this.f, this.g, this.h, this.i, bsb.a($$2), this.k, this.l);
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

   public bsb<dij> i() {
      return this.j;
   }

   public bsb<alc<exq>> j() {
      return this.k;
   }

   public alc<exq> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private bsb<dij> g = bsb.a();
      private bsb<alc<exq>> h = bsb.<alc<exq>>b().a(exh.aM).a(exh.aL).a();
      private alc<exq> i = exh.aP;

      public dxp.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dxp.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dxp.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dxp.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dxp.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dxp.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dxp.a a(bsb<dij> $$0) {
         this.g = $$0;
         return this;
      }

      public dxp.a b(bsb<alc<exq>> $$0) {
         this.h = $$0;
         return this;
      }

      public dxp.a a(alc<exq> $$0) {
         this.i = $$0;
         return this;
      }

      public dxp a() {
         return new dxp(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
