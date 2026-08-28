import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dyr(int d, float e, float f, float g, float h, int i, bsj<djj> j, bsj<ald<eys>> k, ald<eys> l) {
   public static final dyr a = b().a();
   public static final Codec<dyr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dyr::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dyr::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dyr::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dyr::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dyr::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dyr::h),
               djj.c.optionalFieldOf("spawn_potentials", bsj.a()).forGetter(dyr::i),
               bsj.a(ald.a(mg.bo)).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dyr::j),
               ald.a(mg.bo).optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dyr::k)
            )
            .apply($$0, dyr::new)
   );
   public static final Codec<je<dyr>> c = ala.a(mg.bg, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dyr.a b() {
      return new dyr.a();
   }

   public dyr a(bwj<?> $$0) {
      tx $$1 = new tx();
      $$1.a("id", mf.f.b($$0).toString());
      djj $$2 = new djj($$1, Optional.empty(), Optional.empty());
      return new dyr(this.d, this.e, this.f, this.g, this.h, this.i, bsj.a($$2), this.k, this.l);
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

   public bsj<djj> i() {
      return this.j;
   }

   public bsj<ald<eys>> j() {
      return this.k;
   }

   public ald<eys> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private bsj<djj> g = bsj.a();
      private bsj<ald<eys>> h = bsj.<ald<eys>>b().a(eyj.aM).a(eyj.aL).a();
      private ald<eys> i = eyj.aP;

      public dyr.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dyr.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dyr.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dyr.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dyr.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dyr.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dyr.a a(bsj<djj> $$0) {
         this.g = $$0;
         return this;
      }

      public dyr.a b(bsj<ald<eys>> $$0) {
         this.h = $$0;
         return this;
      }

      public dyr.a a(ald<eys> $$0) {
         this.i = $$0;
         return this;
      }

      public dyr a() {
         return new dyr(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
