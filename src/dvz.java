import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dvz(int d, float e, float f, float g, float h, int i, bqr<dhb> j, bqr<aku<evv>> k, aku<evv> l) {
   public static final dvz a = b().a();
   public static final Codec<dvz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dvz::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dvz::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dvz::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dvz::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dvz::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dvz::h),
               dhb.c.optionalFieldOf("spawn_potentials", bqr.b()).forGetter(dvz::i),
               bqr.a(aku.a(mc.bg)).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dvz::j),
               aku.a(mc.bg).optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dvz::k)
            )
            .apply($$0, dvz::new)
   );
   public static final Codec<jr<dvz>> c = akr.a(mc.bd, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dvz.a b() {
      return new dvz.a();
   }

   public dvz a(bur<?> $$0) {
      tq $$1 = new tq();
      $$1.a("id", mb.f.b($$0).toString());
      dhb $$2 = new dhb($$1, Optional.empty(), Optional.empty());
      return new dvz(this.d, this.e, this.f, this.g, this.h, this.i, bqr.a($$2), this.k, this.l);
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

   public bqr<dhb> i() {
      return this.j;
   }

   public bqr<aku<evv>> j() {
      return this.k;
   }

   public aku<evv> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private bqr<dhb> g = bqr.b();
      private bqr<aku<evv>> h = bqr.<aku<evv>>a().a(evm.aM).a(evm.aL).a();
      private aku<evv> i = evm.aP;

      public dvz.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dvz.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dvz.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dvz.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dvz.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dvz.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dvz.a a(bqr<dhb> $$0) {
         this.g = $$0;
         return this;
      }

      public dvz.a b(bqr<aku<evv>> $$0) {
         this.h = $$0;
         return this;
      }

      public dvz.a a(aku<evv> $$0) {
         this.i = $$0;
         return this;
      }

      public dvz a() {
         return new dvz(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
