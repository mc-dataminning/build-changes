import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dwa(int d, float e, float f, float g, float h, int i, bqs<dhc> j, bqs<aku<evw>> k, aku<evw> l) {
   public static final dwa a = b().a();
   public static final Codec<dwa> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dwa::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dwa::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dwa::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dwa::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dwa::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dwa::h),
               dhc.c.optionalFieldOf("spawn_potentials", bqs.b()).forGetter(dwa::i),
               bqs.a(aku.a(mc.bg)).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dwa::j),
               aku.a(mc.bg).optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dwa::k)
            )
            .apply($$0, dwa::new)
   );
   public static final Codec<jr<dwa>> c = akr.a(mc.bd, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dwa.a b() {
      return new dwa.a();
   }

   public dwa a(bus<?> $$0) {
      tq $$1 = new tq();
      $$1.a("id", mb.f.b($$0).toString());
      dhc $$2 = new dhc($$1, Optional.empty(), Optional.empty());
      return new dwa(this.d, this.e, this.f, this.g, this.h, this.i, bqs.a($$2), this.k, this.l);
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

   public bqs<dhc> i() {
      return this.j;
   }

   public bqs<aku<evw>> j() {
      return this.k;
   }

   public aku<evw> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private bqs<dhc> g = bqs.b();
      private bqs<aku<evw>> h = bqs.<aku<evw>>a().a(evn.aM).a(evn.aL).a();
      private aku<evw> i = evn.aP;

      public dwa.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dwa.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dwa.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dwa.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dwa.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dwa.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dwa.a a(bqs<dhc> $$0) {
         this.g = $$0;
         return this;
      }

      public dwa.a b(bqs<aku<evw>> $$0) {
         this.h = $$0;
         return this;
      }

      public dwa.a a(aku<evw> $$0) {
         this.i = $$0;
         return this;
      }

      public dwa a() {
         return new dwa(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
