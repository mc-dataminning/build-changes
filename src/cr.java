import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cr(
   Optional<cr.b> b, Optional<jb<dby>> c, Optional<jb<ehl>> d, Optional<akm<daz>> e, Optional<Boolean> f, Optional<co> g, Optional<av> h, Optional<bz> i
) {
   public static final Codec<cr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cr.b.a.optionalFieldOf("position").forGetter(cr::a),
               jm.a(lf.az).optionalFieldOf("biomes").forGetter(cr::b),
               jm.a(lf.aJ).optionalFieldOf("structures").forGetter(cr::c),
               akm.a(lf.aS).optionalFieldOf("dimension").forGetter(cr::d),
               Codec.BOOL.optionalFieldOf("smokey").forGetter(cr::e),
               co.a.optionalFieldOf("light").forGetter(cr::f),
               av.a.optionalFieldOf("block").forGetter(cr::g),
               bz.a.optionalFieldOf("fluid").forGetter(cr::h)
            )
            .apply($$0, cr::new)
   );

   public boolean a(aqn $$0, double $$1, double $$2, double $$3) {
      if (this.b.isPresent() && !this.b.get().a($$1, $$2, $$3)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$0.ae()) {
         return false;
      } else {
         io $$4 = io.a($$1, $$2, $$3);
         boolean $$5 = $$0.p($$4);
         if (!this.c.isPresent() || $$5 && this.c.get().a($$0.t($$4))) {
            if (!this.d.isPresent() || $$5 && $$0.a().a($$4, this.d.get()).b()) {
               if (!this.f.isPresent() || $$5 && this.f.get() == deo.a($$0, $$4)) {
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

   public Optional<jb<dby>> b() {
      return this.c;
   }

   public Optional<jb<ehl>> c() {
      return this.d;
   }

   public Optional<akm<daz>> d() {
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
      private Optional<jb<dby>> d;
      private Optional<jb<ehl>> e;
      private Optional<akm<daz>> f;
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

      public static cr.a a(ix<dby> $$0) {
         return a().a(jb.a($$0));
      }

      public static cr.a a(akm<daz> $$0) {
         return a().b($$0);
      }

      public static cr.a b(ix<ehl> $$0) {
         return a().b(jb.a($$0));
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

      public cr.a a(jb<dby> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public cr.a b(jb<ehl> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public cr.a b(akm<daz> $$0) {
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
                  ct.c.d.optionalFieldOf("x", ct.c.c).forGetter(cr.b::a),
                  ct.c.d.optionalFieldOf("y", ct.c.c).forGetter(cr.b::b),
                  ct.c.d.optionalFieldOf("z", ct.c.c).forGetter(cr.b::c)
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
