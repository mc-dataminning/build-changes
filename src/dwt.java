import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dwt(int d, float e, float f, float g, float h, int i, brj<dht> j, brj<akt<ewt>> k, akt<ewt> l) {
   public static final dwt a = b().a();
   public static final Codec<dwt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dwt::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dwt::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dwt::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dwt::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dwt::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dwt::h),
               dht.c.optionalFieldOf("spawn_potentials", brj.a()).forGetter(dwt::i),
               brj.a(akt.a(mc.bi)).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dwt::j),
               akt.a(mc.bi).optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dwt::k)
            )
            .apply($$0, dwt::new)
   );
   public static final Codec<jr<dwt>> c = akq.a(mc.bf, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dwt.a b() {
      return new dwt.a();
   }

   public dwt a(bvi<?> $$0) {
      tq $$1 = new tq();
      $$1.a("id", mb.f.b($$0).toString());
      dht $$2 = new dht($$1, Optional.empty(), Optional.empty());
      return new dwt(this.d, this.e, this.f, this.g, this.h, this.i, brj.a($$2), this.k, this.l);
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

   public brj<dht> i() {
      return this.j;
   }

   public brj<akt<ewt>> j() {
      return this.k;
   }

   public akt<ewt> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private brj<dht> g = brj.a();
      private brj<akt<ewt>> h = brj.<akt<ewt>>b().a(ewk.aM).a(ewk.aL).a();
      private akt<ewt> i = ewk.aP;

      public dwt.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dwt.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dwt.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dwt.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dwt.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dwt.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dwt.a a(brj<dht> $$0) {
         this.g = $$0;
         return this;
      }

      public dwt.a b(brj<akt<ewt>> $$0) {
         this.h = $$0;
         return this;
      }

      public dwt.a a(akt<ewt> $$0) {
         this.i = $$0;
         return this;
      }

      public dwt a() {
         return new dwt(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
