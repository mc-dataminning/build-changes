import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eas(int d, float e, float f, float g, float h, int i, btm<dld> j, btm<alq<fay>> k, alq<fay> l) {
   public static final eas a = b().a();
   public static final Codec<eas> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(eas::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(eas::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(eas::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(eas::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(eas::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(eas::h),
               dld.c.optionalFieldOf("spawn_potentials", btm.a()).forGetter(eas::i),
               btm.a(fay.a).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(eas::j),
               fay.a.optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(eas::k)
            )
            .apply($$0, eas::new)
   );
   public static final Codec<jg<eas>> c = aln.a(mi.bi, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static eas.a b() {
      return new eas.a();
   }

   public eas a(bxn<?> $$0) {
      ua $$1 = new ua();
      $$1.a("id", mh.f.b($$0).toString());
      dld $$2 = new dld($$1, Optional.empty(), Optional.empty());
      return new eas(this.d, this.e, this.f, this.g, this.h, this.i, btm.a($$2), this.k, this.l);
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

   public btm<dld> i() {
      return this.j;
   }

   public btm<alq<fay>> j() {
      return this.k;
   }

   public alq<fay> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private btm<dld> g = btm.a();
      private btm<alq<fay>> h = btm.<alq<fay>>b().a(fap.aM).a(fap.aL).a();
      private alq<fay> i = fap.aP;

      public eas.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public eas.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public eas.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public eas.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public eas.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public eas.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public eas.a a(btm<dld> $$0) {
         this.g = $$0;
         return this;
      }

      public eas.a b(btm<alq<fay>> $$0) {
         this.h = $$0;
         return this;
      }

      public eas.a a(alq<fay> $$0) {
         this.i = $$0;
         return this;
      }

      public eas a() {
         return new eas(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
