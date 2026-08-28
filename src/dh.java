import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dh(
   Optional<dh.b> b,
   Optional<ju<dij>> c,
   Optional<ju<eoj>> d,
   Optional<aly<dhh>> e,
   Optional<Boolean> f,
   Optional<de> g,
   Optional<ax> h,
   Optional<ce> i,
   Optional<Boolean> j
) {
   public static final Codec<dh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dh.b.a.optionalFieldOf("position").forGetter(dh::a),
               kf.a(mb.aI).optionalFieldOf("biomes").forGetter(dh::b),
               kf.a(mb.aU).optionalFieldOf("structures").forGetter(dh::c),
               aly.a(mb.be).optionalFieldOf("dimension").forGetter(dh::d),
               Codec.BOOL.optionalFieldOf("smokey").forGetter(dh::e),
               de.a.optionalFieldOf("light").forGetter(dh::f),
               ax.a.optionalFieldOf("block").forGetter(dh::g),
               ce.a.optionalFieldOf("fluid").forGetter(dh::h),
               Codec.BOOL.optionalFieldOf("can_see_sky").forGetter(dh::i)
            )
            .apply($$0, dh::new)
   );

   public boolean a(ash $$0, double $$1, double $$2, double $$3) {
      if (this.b.isPresent() && !this.b.get().a($$1, $$2, $$3)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$0.ah()) {
         return false;
      } else {
         jh $$4 = jh.a($$1, $$2, $$3);
         boolean $$5 = $$0.p($$4);
         if (!this.c.isPresent() || $$5 && this.c.get().a($$0.t($$4))) {
            if (!this.d.isPresent() || $$5 && $$0.b().a($$4, this.d.get()).b()) {
               if (!this.f.isPresent() || $$5 && this.f.get() == dla.a($$0, $$4)) {
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

   public Optional<dh.b> a() {
      return this.b;
   }

   public Optional<ju<dij>> b() {
      return this.c;
   }

   public Optional<ju<eoj>> c() {
      return this.d;
   }

   public Optional<aly<dhh>> d() {
      return this.e;
   }

   public Optional<Boolean> e() {
      return this.f;
   }

   public Optional<de> f() {
      return this.g;
   }

   public Optional<ax> g() {
      return this.h;
   }

   public Optional<ce> h() {
      return this.i;
   }

   public Optional<Boolean> i() {
      return this.j;
   }

   public static class a {
      private dj.c a;
      private dj.c b;
      private dj.c c;
      private Optional<ju<dij>> d;
      private Optional<ju<eoj>> e;
      private Optional<aly<dhh>> f;
      private Optional<Boolean> g;
      private Optional<de> h;
      private Optional<ax> i;
      private Optional<ce> j;
      private Optional<Boolean> k;

      public a() {
         this.a = dj.c.c;
         this.b = dj.c.c;
         this.c = dj.c.c;
         this.d = Optional.empty();
         this.e = Optional.empty();
         this.f = Optional.empty();
         this.g = Optional.empty();
         this.h = Optional.empty();
         this.i = Optional.empty();
         this.j = Optional.empty();
         this.k = Optional.empty();
      }

      public static dh.a a() {
         return new dh.a();
      }

      public static dh.a a(jq<dij> $$0) {
         return a().a(ju.a($$0));
      }

      public static dh.a a(aly<dhh> $$0) {
         return a().b($$0);
      }

      public static dh.a b(jq<eoj> $$0) {
         return a().b(ju.a($$0));
      }

      public static dh.a a(dj.c $$0) {
         return a().c($$0);
      }

      public dh.a b(dj.c $$0) {
         this.a = $$0;
         return this;
      }

      public dh.a c(dj.c $$0) {
         this.b = $$0;
         return this;
      }

      public dh.a d(dj.c $$0) {
         this.c = $$0;
         return this;
      }

      public dh.a a(ju<dij> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public dh.a b(ju<eoj> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dh.a b(aly<dhh> $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public dh.a a(de.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public dh.a a(ax.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public dh.a a(ce.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public dh.a a(boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public dh.a b(boolean $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public dh b() {
         Optional<dh.b> $$0 = dh.b.a(this.a, this.b, this.c);
         return new dh($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
      }
   }

   static record b(dj.c b, dj.c c, dj.c d) {
      public static final Codec<dh.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dj.c.d.optionalFieldOf("x", dj.c.c).forGetter(dh.b::a),
                  dj.c.d.optionalFieldOf("y", dj.c.c).forGetter(dh.b::b),
                  dj.c.d.optionalFieldOf("z", dj.c.c).forGetter(dh.b::c)
               )
               .apply($$0, dh.b::new)
      );

      static Optional<dh.b> a(dj.c $$0, dj.c $$1, dj.c $$2) {
         return $$0.c() && $$1.c() && $$2.c() ? Optional.empty() : Optional.of(new dh.b($$0, $$1, $$2));
      }

      public boolean a(double $$0, double $$1, double $$2) {
         return this.b.d($$0) && this.c.d($$1) && this.d.d($$2);
      }

      public dj.c a() {
         return this.b;
      }

      public dj.c b() {
         return this.c;
      }

      public dj.c c() {
         return this.d;
      }
   }
}
