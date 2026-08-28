import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record df(
   Optional<df.b> b,
   Optional<jq<ddw>> c,
   Optional<jq<ejp>> d,
   Optional<akq<dcw>> e,
   Optional<Boolean> f,
   Optional<dc> g,
   Optional<aw> h,
   Optional<cd> i,
   Optional<Boolean> j
) {
   public static final Codec<df> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               df.b.a.optionalFieldOf("position").forGetter(df::a),
               kb.a(lu.aF).optionalFieldOf("biomes").forGetter(df::b),
               kb.a(lu.aR).optionalFieldOf("structures").forGetter(df::c),
               akq.a(lu.ba).optionalFieldOf("dimension").forGetter(df::d),
               Codec.BOOL.optionalFieldOf("smokey").forGetter(df::e),
               dc.a.optionalFieldOf("light").forGetter(df::f),
               aw.a.optionalFieldOf("block").forGetter(df::g),
               cd.a.optionalFieldOf("fluid").forGetter(df::h),
               Codec.BOOL.optionalFieldOf("can_see_sky").forGetter(df::i)
            )
            .apply($$0, df::new)
   );

   public boolean a(aqu $$0, double $$1, double $$2, double $$3) {
      if (this.b.isPresent() && !this.b.get().a($$1, $$2, $$3)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$0.af()) {
         return false;
      } else {
         jd $$4 = jd.a($$1, $$2, $$3);
         boolean $$5 = $$0.p($$4);
         if (!this.c.isPresent() || $$5 && this.c.get().a($$0.t($$4))) {
            if (!this.d.isPresent() || $$5 && $$0.a().a($$4, this.d.get()).b()) {
               if (!this.f.isPresent() || $$5 && this.f.get() == dgm.a($$0, $$4)) {
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

   public Optional<df.b> a() {
      return this.b;
   }

   public Optional<jq<ddw>> b() {
      return this.c;
   }

   public Optional<jq<ejp>> c() {
      return this.d;
   }

   public Optional<akq<dcw>> d() {
      return this.e;
   }

   public Optional<Boolean> e() {
      return this.f;
   }

   public Optional<dc> f() {
      return this.g;
   }

   public Optional<aw> g() {
      return this.h;
   }

   public Optional<cd> h() {
      return this.i;
   }

   public Optional<Boolean> i() {
      return this.j;
   }

   public static class a {
      private dh.c a;
      private dh.c b;
      private dh.c c;
      private Optional<jq<ddw>> d;
      private Optional<jq<ejp>> e;
      private Optional<akq<dcw>> f;
      private Optional<Boolean> g;
      private Optional<dc> h;
      private Optional<aw> i;
      private Optional<cd> j;
      private Optional<Boolean> k;

      public a() {
         this.a = dh.c.c;
         this.b = dh.c.c;
         this.c = dh.c.c;
         this.d = Optional.empty();
         this.e = Optional.empty();
         this.f = Optional.empty();
         this.g = Optional.empty();
         this.h = Optional.empty();
         this.i = Optional.empty();
         this.j = Optional.empty();
         this.k = Optional.empty();
      }

      public static df.a a() {
         return new df.a();
      }

      public static df.a a(jm<ddw> $$0) {
         return a().a(jq.a($$0));
      }

      public static df.a a(akq<dcw> $$0) {
         return a().b($$0);
      }

      public static df.a b(jm<ejp> $$0) {
         return a().b(jq.a($$0));
      }

      public static df.a a(dh.c $$0) {
         return a().c($$0);
      }

      public df.a b(dh.c $$0) {
         this.a = $$0;
         return this;
      }

      public df.a c(dh.c $$0) {
         this.b = $$0;
         return this;
      }

      public df.a d(dh.c $$0) {
         this.c = $$0;
         return this;
      }

      public df.a a(jq<ddw> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public df.a b(jq<ejp> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public df.a b(akq<dcw> $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public df.a a(dc.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public df.a a(aw.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public df.a a(cd.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public df.a a(boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public df.a b(boolean $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public df b() {
         Optional<df.b> $$0 = df.b.a(this.a, this.b, this.c);
         return new df($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
      }
   }

   static record b(dh.c b, dh.c c, dh.c d) {
      public static final Codec<df.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dh.c.d.optionalFieldOf("x", dh.c.c).forGetter(df.b::a),
                  dh.c.d.optionalFieldOf("y", dh.c.c).forGetter(df.b::b),
                  dh.c.d.optionalFieldOf("z", dh.c.c).forGetter(df.b::c)
               )
               .apply($$0, df.b::new)
      );

      static Optional<df.b> a(dh.c $$0, dh.c $$1, dh.c $$2) {
         return $$0.c() && $$1.c() && $$2.c() ? Optional.empty() : Optional.of(new df.b($$0, $$1, $$2));
      }

      public boolean a(double $$0, double $$1, double $$2) {
         return this.b.d($$0) && this.c.d($$1) && this.d.d($$2);
      }

      public dh.c a() {
         return this.b;
      }

      public dh.c b() {
         return this.c;
      }

      public dh.c c() {
         return this.d;
      }
   }
}
