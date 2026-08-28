import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dzj(int d, float e, float f, float g, float h, int i, bso<dju> j, bso<alf<ezm>> k, alf<ezm> l) {
   public static final dzj a = b().a();
   public static final Codec<dzj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dzj::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dzj::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dzj::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dzj::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dzj::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dzj::h),
               dju.c.optionalFieldOf("spawn_potentials", bso.a()).forGetter(dzj::i),
               bso.a(alf.a(mg.bq)).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dzj::j),
               alf.a(mg.bq).optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dzj::k)
            )
            .apply($$0, dzj::new)
   );
   public static final Codec<je<dzj>> c = alc.a(mg.bi, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dzj.a b() {
      return new dzj.a();
   }

   public dzj a(bwo<?> $$0) {
      tz $$1 = new tz();
      $$1.a("id", mf.f.b($$0).toString());
      dju $$2 = new dju($$1, Optional.empty(), Optional.empty());
      return new dzj(this.d, this.e, this.f, this.g, this.h, this.i, bso.a($$2), this.k, this.l);
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

   public bso<dju> i() {
      return this.j;
   }

   public bso<alf<ezm>> j() {
      return this.k;
   }

   public alf<ezm> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private bso<dju> g = bso.a();
      private bso<alf<ezm>> h = bso.<alf<ezm>>b().a(ezd.aM).a(ezd.aL).a();
      private alf<ezm> i = ezd.aP;

      public dzj.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dzj.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dzj.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dzj.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dzj.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dzj.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dzj.a a(bso<dju> $$0) {
         this.g = $$0;
         return this;
      }

      public dzj.a b(bso<alf<ezm>> $$0) {
         this.h = $$0;
         return this;
      }

      public dzj.a a(alf<ezm> $$0) {
         this.i = $$0;
         return this;
      }

      public dzj a() {
         return new dzj(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
