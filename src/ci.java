import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ci(
   Optional<ci.b> b, Optional<ags<ctx>> c, Optional<ags<dyo>> d, Optional<ags<csy>> e, Optional<Boolean> f, Optional<cf> g, Optional<au> h, Optional<bw> i
) {
   public static final Codec<ci> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atg.a(ci.b.a, "position").forGetter(ci::a),
               atg.a(ags.a(kc.as), "biome").forGetter(ci::b),
               atg.a(ags.a(kc.aC), "structure").forGetter(ci::c),
               atg.a(ags.a(kc.aL), "dimension").forGetter(ci::d),
               atg.a(Codec.BOOL, "smokey").forGetter(ci::e),
               atg.a(cf.a, "light").forGetter(ci::f),
               atg.a(au.a, "block").forGetter(ci::g),
               atg.a(bw.a, "fluid").forGetter(ci::h)
            )
            .apply($$0, ci::new)
   );

   private static Optional<ci> a(
      Optional<ci.b> $$0,
      Optional<ags<ctx>> $$1,
      Optional<ags<dyo>> $$2,
      Optional<ags<csy>> $$3,
      Optional<Boolean> $$4,
      Optional<cf> $$5,
      Optional<au> $$6,
      Optional<bw> $$7
   ) {
      return $$0.isEmpty() && $$1.isEmpty() && $$2.isEmpty() && $$3.isEmpty() && $$4.isEmpty() && $$5.isEmpty() && $$6.isEmpty() && $$7.isEmpty()
         ? Optional.empty()
         : Optional.of(new ci($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   public boolean a(amp $$0, double $$1, double $$2, double $$3) {
      if (this.b.isPresent() && !this.b.get().a($$1, $$2, $$3)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$0.ad()) {
         return false;
      } else {
         hv $$4 = hv.a($$1, $$2, $$3);
         boolean $$5 = $$0.o($$4);
         if (!this.c.isPresent() || $$5 && $$0.s($$4).a(this.c.get())) {
            if (!this.d.isPresent() || $$5 && $$0.a().a($$4, this.d.get()).b()) {
               if (!this.f.isPresent() || $$5 && this.f.get() == cwn.a($$0, $$4)) {
                  if (this.g.isPresent() && !this.g.get().a($$0, $$4)) {
                     return false;
                  } else {
                     return this.h.isPresent() && !this.h.get().a($$0, $$4) ? false : !this.i.isPresent() || this.i.get().a($$0, $$4);
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

   public Optional<ci.b> a() {
      return this.b;
   }

   public Optional<ags<ctx>> b() {
      return this.c;
   }

   public Optional<ags<dyo>> c() {
      return this.d;
   }

   public Optional<ags<csy>> d() {
      return this.e;
   }

   public Optional<Boolean> e() {
      return this.f;
   }

   public Optional<cf> f() {
      return this.g;
   }

   public Optional<au> g() {
      return this.h;
   }

   public Optional<bw> h() {
      return this.i;
   }

   public static class a {
      private ck.c a;
      private ck.c b;
      private ck.c c;
      private Optional<ags<ctx>> d;
      private Optional<ags<dyo>> e;
      private Optional<ags<csy>> f;
      private Optional<Boolean> g;
      private Optional<cf> h;
      private Optional<au> i;
      private Optional<bw> j;

      public a() {
         this.a = ck.c.c;
         this.b = ck.c.c;
         this.c = ck.c.c;
         this.d = Optional.empty();
         this.e = Optional.empty();
         this.f = Optional.empty();
         this.g = Optional.empty();
         this.h = Optional.empty();
         this.i = Optional.empty();
         this.j = Optional.empty();
      }

      public static ci.a a() {
         return new ci.a();
      }

      public static ci.a a(ags<ctx> $$0) {
         return a().d($$0);
      }

      public static ci.a b(ags<csy> $$0) {
         return a().f($$0);
      }

      public static ci.a c(ags<dyo> $$0) {
         return a().e($$0);
      }

      public static ci.a a(ck.c $$0) {
         return a().c($$0);
      }

      public ci.a b(ck.c $$0) {
         this.a = $$0;
         return this;
      }

      public ci.a c(ck.c $$0) {
         this.b = $$0;
         return this;
      }

      public ci.a d(ck.c $$0) {
         this.c = $$0;
         return this;
      }

      public ci.a d(ags<ctx> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ci.a e(ags<dyo> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public ci.a f(ags<csy> $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public ci.a a(cf.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public ci.a a(au.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public ci.a a(bw.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public ci.a a(boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public ci b() {
         Optional<ci.b> $$0 = ci.b.a(this.a, this.b, this.c);
         return new ci($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }

   static record b(ck.c b, ck.c c, ck.c d) {
      public static final Codec<ci.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atg.a(ck.c.d, "x", ck.c.c).forGetter(ci.b::a), atg.a(ck.c.d, "y", ck.c.c).forGetter(ci.b::b), atg.a(ck.c.d, "z", ck.c.c).forGetter(ci.b::c)
               )
               .apply($$0, ci.b::new)
      );

      static Optional<ci.b> a(ck.c $$0, ck.c $$1, ck.c $$2) {
         return $$0.c() && $$1.c() && $$2.c() ? Optional.empty() : Optional.of(new ci.b($$0, $$1, $$2));
      }

      public boolean a(double $$0, double $$1, double $$2) {
         return this.b.d($$0) && this.c.d($$1) && this.d.d($$2);
      }

      public ck.c a() {
         return this.b;
      }

      public ck.c b() {
         return this.c;
      }

      public ck.c c() {
         return this.d;
      }
   }
}
