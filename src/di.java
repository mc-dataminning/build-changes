import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record di(
   Optional<di.b> b,
   Optional<jv<dhi>> c,
   Optional<jv<enk>> d,
   Optional<akt<dgg>> e,
   Optional<Boolean> f,
   Optional<df> g,
   Optional<ay> h,
   Optional<cf> i,
   Optional<Boolean> j
) {
   public static final Codec<di> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               di.b.a.optionalFieldOf("position").forGetter(di::a),
               kg.a(mc.aI).optionalFieldOf("biomes").forGetter(di::b),
               kg.a(mc.aU).optionalFieldOf("structures").forGetter(di::c),
               akt.a(mc.be).optionalFieldOf("dimension").forGetter(di::d),
               Codec.BOOL.optionalFieldOf("smokey").forGetter(di::e),
               df.a.optionalFieldOf("light").forGetter(di::f),
               ay.a.optionalFieldOf("block").forGetter(di::g),
               cf.a.optionalFieldOf("fluid").forGetter(di::h),
               Codec.BOOL.optionalFieldOf("can_see_sky").forGetter(di::i)
            )
            .apply($$0, di::new)
   );

   public boolean a(arc $$0, double $$1, double $$2, double $$3) {
      if (this.b.isPresent() && !this.b.get().a($$1, $$2, $$3)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$0.ai()) {
         return false;
      } else {
         ji $$4 = ji.a($$1, $$2, $$3);
         boolean $$5 = $$0.p($$4);
         if (!this.c.isPresent() || $$5 && this.c.get().a($$0.t($$4))) {
            if (!this.d.isPresent() || $$5 && $$0.b().a($$4, this.d.get()).b()) {
               if (!this.f.isPresent() || $$5 && this.f.get() == djz.a($$0, $$4)) {
                  if (this.g.isPresent() && !this.g.get().a($$0, $$4)) {
                     return false;
                  } else if (this.h.isPresent() && !this.h.get().a($$0, $$4)) {
                     return false;
                  } else {
                     return this.i.isPresent() && !this.i.get().a($$0, $$4) ? false : !this.j.isPresent() || this.j.get() == $$0.h($$4);
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public Optional<di.b> a() {
      return this.b;
   }

   public Optional<jv<dhi>> b() {
      return this.c;
   }

   public Optional<jv<enk>> c() {
      return this.d;
   }

   public Optional<akt<dgg>> d() {
      return this.e;
   }

   public Optional<Boolean> e() {
      return this.f;
   }

   public Optional<df> f() {
      return this.g;
   }

   public Optional<ay> g() {
      return this.h;
   }

   public Optional<cf> h() {
      return this.i;
   }

   public Optional<Boolean> i() {
      return this.j;
   }

   public static class a {
      private dk.c a;
      private dk.c b;
      private dk.c c;
      private Optional<jv<dhi>> d;
      private Optional<jv<enk>> e;
      private Optional<akt<dgg>> f;
      private Optional<Boolean> g;
      private Optional<df> h;
      private Optional<ay> i;
      private Optional<cf> j;
      private Optional<Boolean> k;

      public a() {
         this.a = dk.c.c;
         this.b = dk.c.c;
         this.c = dk.c.c;
         this.d = Optional.empty();
         this.e = Optional.empty();
         this.f = Optional.empty();
         this.g = Optional.empty();
         this.h = Optional.empty();
         this.i = Optional.empty();
         this.j = Optional.empty();
         this.k = Optional.empty();
      }

      public static di.a a() {
         return new di.a();
      }

      public static di.a a(jr<dhi> $$0) {
         return a().a(jv.a($$0));
      }

      public static di.a a(akt<dgg> $$0) {
         return a().b($$0);
      }

      public static di.a b(jr<enk> $$0) {
         return a().b(jv.a($$0));
      }

      public static di.a a(dk.c $$0) {
         return a().c($$0);
      }

      public di.a b(dk.c $$0) {
         this.a = $$0;
         return this;
      }

      public di.a c(dk.c $$0) {
         this.b = $$0;
         return this;
      }

      public di.a d(dk.c $$0) {
         this.c = $$0;
         return this;
      }

      public di.a a(jv<dhi> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public di.a b(jv<enk> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public di.a b(akt<dgg> $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public di.a a(df.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public di.a a(ay.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public di.a a(cf.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public di.a a(boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public di.a b(boolean $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public di b() {
         Optional<di.b> $$0 = di.b.a(this.a, this.b, this.c);
         return new di($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
      }
   }

   static record b(dk.c b, dk.c c, dk.c d) {
      public static final Codec<di.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dk.c.d.optionalFieldOf("x", dk.c.c).forGetter(di.b::a),
                  dk.c.d.optionalFieldOf("y", dk.c.c).forGetter(di.b::b),
                  dk.c.d.optionalFieldOf("z", dk.c.c).forGetter(di.b::c)
               )
               .apply($$0, di.b::new)
      );

      static Optional<di.b> a(dk.c $$0, dk.c $$1, dk.c $$2) {
         return $$0.c() && $$1.c() && $$2.c() ? Optional.empty() : Optional.of(new di.b($$0, $$1, $$2));
      }

      public boolean a(double $$0, double $$1, double $$2) {
         return this.b.d($$0) && this.c.d($$1) && this.d.d($$2);
      }

      public dk.c a() {
         return this.b;
      }

      public dk.c b() {
         return this.c;
      }

      public dk.c c() {
         return this.d;
      }
   }
}
