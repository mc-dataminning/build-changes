import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cr(
   Optional<cr.b> b, Optional<ja<dbc>> c, Optional<ja<egp>> d, Optional<akg<dad>> e, Optional<Boolean> f, Optional<co> g, Optional<av> h, Optional<bz> i
) {
   public static final Codec<cr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axh.a(cr.b.a, "position").forGetter(cr::a),
               axh.a(jl.a(le.az), "biomes").forGetter(cr::b),
               axh.a(jl.a(le.aJ), "structures").forGetter(cr::c),
               axh.a(akg.a(le.aS), "dimension").forGetter(cr::d),
               axh.a(Codec.BOOL, "smokey").forGetter(cr::e),
               axh.a(co.a, "light").forGetter(cr::f),
               axh.a(av.a, "block").forGetter(cr::g),
               axh.a(bz.a, "fluid").forGetter(cr::h)
            )
            .apply($$0, cr::new)
   );

   public boolean a(aqh $$0, double $$1, double $$2, double $$3) {
      if (this.b.isPresent() && !this.b.get().a($$1, $$2, $$3)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$0.ae()) {
         return false;
      } else {
         in $$4 = in.a($$1, $$2, $$3);
         boolean $$5 = $$0.p($$4);
         if (!this.c.isPresent() || $$5 && this.c.get().a($$0.t($$4))) {
            if (!this.d.isPresent() || $$5 && $$0.a().a($$4, this.d.get()).b()) {
               if (!this.f.isPresent() || $$5 && this.f.get() == dds.a($$0, $$4)) {
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

   public Optional<cr.b> a() {
      return this.b;
   }

   public Optional<ja<dbc>> b() {
      return this.c;
   }

   public Optional<ja<egp>> c() {
      return this.d;
   }

   public Optional<akg<dad>> d() {
      return this.e;
   }

   public Optional<Boolean> e() {
      return this.f;
   }

   public Optional<co> f() {
      return this.g;
   }

   public Optional<av> g() {
      return this.h;
   }

   public Optional<bz> h() {
      return this.i;
   }

   public static class a {
      private ct.c a;
      private ct.c b;
      private ct.c c;
      private Optional<ja<dbc>> d;
      private Optional<ja<egp>> e;
      private Optional<akg<dad>> f;
      private Optional<Boolean> g;
      private Optional<co> h;
      private Optional<av> i;
      private Optional<bz> j;

      public a() {
         this.a = ct.c.c;
         this.b = ct.c.c;
         this.c = ct.c.c;
         this.d = Optional.empty();
         this.e = Optional.empty();
         this.f = Optional.empty();
         this.g = Optional.empty();
         this.h = Optional.empty();
         this.i = Optional.empty();
         this.j = Optional.empty();
      }

      public static cr.a a() {
         return new cr.a();
      }

      public static cr.a a(iw<dbc> $$0) {
         return a().a(ja.a($$0));
      }

      public static cr.a a(akg<dad> $$0) {
         return a().b($$0);
      }

      public static cr.a b(iw<egp> $$0) {
         return a().b(ja.a($$0));
      }

      public static cr.a a(ct.c $$0) {
         return a().c($$0);
      }

      public cr.a b(ct.c $$0) {
         this.a = $$0;
         return this;
      }

      public cr.a c(ct.c $$0) {
         this.b = $$0;
         return this;
      }

      public cr.a d(ct.c $$0) {
         this.c = $$0;
         return this;
      }

      public cr.a a(ja<dbc> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public cr.a b(ja<egp> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public cr.a b(akg<dad> $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public cr.a a(co.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public cr.a a(av.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public cr.a a(bz.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public cr.a a(boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public cr b() {
         Optional<cr.b> $$0 = cr.b.a(this.a, this.b, this.c);
         return new cr($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }

   static record b(ct.c b, ct.c c, ct.c d) {
      public static final Codec<cr.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axh.a(ct.c.d, "x", ct.c.c).forGetter(cr.b::a), axh.a(ct.c.d, "y", ct.c.c).forGetter(cr.b::b), axh.a(ct.c.d, "z", ct.c.c).forGetter(cr.b::c)
               )
               .apply($$0, cr.b::new)
      );

      static Optional<cr.b> a(ct.c $$0, ct.c $$1, ct.c $$2) {
         return $$0.c() && $$1.c() && $$2.c() ? Optional.empty() : Optional.of(new cr.b($$0, $$1, $$2));
      }

      public boolean a(double $$0, double $$1, double $$2) {
         return this.b.d($$0) && this.c.d($$1) && this.d.d($$2);
      }

      public ct.c a() {
         return this.b;
      }

      public ct.c b() {
         return this.c;
      }

      public ct.c c() {
         return this.d;
      }
   }
}
