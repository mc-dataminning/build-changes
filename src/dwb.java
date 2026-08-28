import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dwb(int d, float e, float f, float g, float h, int i, bqt<dhd> j, bqt<aku<evx>> k, aku<evx> l) {
   public static final dwb a = b().a();
   public static final Codec<dwb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dwb::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dwb::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dwb::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dwb::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dwb::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dwb::h),
               dhd.c.optionalFieldOf("spawn_potentials", bqt.b()).forGetter(dwb::i),
               bqt.a(aku.a(mc.bg)).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dwb::j),
               aku.a(mc.bg).optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dwb::k)
            )
            .apply($$0, dwb::new)
   );
   public static final Codec<jr<dwb>> c = akr.a(mc.bd, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dwb.a b() {
      return new dwb.a();
   }

   public dwb a(but<?> $$0) {
      tq $$1 = new tq();
      $$1.a("id", mb.f.b($$0).toString());
      dhd $$2 = new dhd($$1, Optional.empty(), Optional.empty());
      return new dwb(this.d, this.e, this.f, this.g, this.h, this.i, bqt.a($$2), this.k, this.l);
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

   public bqt<dhd> i() {
      return this.j;
   }

   public bqt<aku<evx>> j() {
      return this.k;
   }

   public aku<evx> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private bqt<dhd> g = bqt.b();
      private bqt<aku<evx>> h = bqt.<aku<evx>>a().a(evo.aM).a(evo.aL).a();
      private aku<evx> i = evo.aP;

      public dwb.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dwb.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dwb.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dwb.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dwb.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dwb.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dwb.a a(bqt<dhd> $$0) {
         this.g = $$0;
         return this;
      }

      public dwb.a b(bqt<aku<evx>> $$0) {
         this.h = $$0;
         return this;
      }

      public dwb.a a(aku<evx> $$0) {
         this.i = $$0;
         return this;
      }

      public dwb a() {
         return new dwb(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
