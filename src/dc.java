import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dc(
   Optional<dc.b> b, Optional<jm<dcz>> c, Optional<jm<eim>> d, Optional<ale<dca>> e, Optional<Boolean> f, Optional<cz> g, Optional<av> h, Optional<cc> i
) {
   public static final Codec<dc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dc.b.a.optionalFieldOf("position").forGetter(dc::a),
               jx.a(lq.az).optionalFieldOf("biomes").forGetter(dc::b),
               jx.a(lq.aJ).optionalFieldOf("structures").forGetter(dc::c),
               ale.a(lq.aS).optionalFieldOf("dimension").forGetter(dc::d),
               Codec.BOOL.optionalFieldOf("smokey").forGetter(dc::e),
               cz.a.optionalFieldOf("light").forGetter(dc::f),
               av.a.optionalFieldOf("block").forGetter(dc::g),
               cc.a.optionalFieldOf("fluid").forGetter(dc::h)
            )
            .apply($$0, dc::new)
   );

   public boolean a(arf $$0, double $$1, double $$2, double $$3) {
      if (this.b.isPresent() && !this.b.get().a($$1, $$2, $$3)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$0.af()) {
         return false;
      } else {
         iz $$4 = iz.a($$1, $$2, $$3);
         boolean $$5 = $$0.p($$4);
         if (!this.c.isPresent() || $$5 && this.c.get().a($$0.t($$4))) {
            if (!this.d.isPresent() || $$5 && $$0.a().a($$4, this.d.get()).b()) {
               if (!this.f.isPresent() || $$5 && this.f.get() == dfp.a($$0, $$4)) {
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

   public Optional<dc.b> a() {
      return this.b;
   }

   public Optional<jm<dcz>> b() {
      return this.c;
   }

   public Optional<jm<eim>> c() {
      return this.d;
   }

   public Optional<ale<dca>> d() {
      return this.e;
   }

   public Optional<Boolean> e() {
      return this.f;
   }

   public Optional<cz> f() {
      return this.g;
   }

   public Optional<av> g() {
      return this.h;
   }

   public Optional<cc> h() {
      return this.i;
   }

   public static class a {
      private de.c a;
      private de.c b;
      private de.c c;
      private Optional<jm<dcz>> d;
      private Optional<jm<eim>> e;
      private Optional<ale<dca>> f;
      private Optional<Boolean> g;
      private Optional<cz> h;
      private Optional<av> i;
      private Optional<cc> j;

      public a() {
         this.a = de.c.c;
         this.b = de.c.c;
         this.c = de.c.c;
         this.d = Optional.empty();
         this.e = Optional.empty();
         this.f = Optional.empty();
         this.g = Optional.empty();
         this.h = Optional.empty();
         this.i = Optional.empty();
         this.j = Optional.empty();
      }

      public static dc.a a() {
         return new dc.a();
      }

      public static dc.a a(ji<dcz> $$0) {
         return a().a(jm.a($$0));
      }

      public static dc.a a(ale<dca> $$0) {
         return a().b($$0);
      }

      public static dc.a b(ji<eim> $$0) {
         return a().b(jm.a($$0));
      }

      public static dc.a a(de.c $$0) {
         return a().c($$0);
      }

      public dc.a b(de.c $$0) {
         this.a = $$0;
         return this;
      }

      public dc.a c(de.c $$0) {
         this.b = $$0;
         return this;
      }

      public dc.a d(de.c $$0) {
         this.c = $$0;
         return this;
      }

      public dc.a a(jm<dcz> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public dc.a b(jm<eim> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dc.a b(ale<dca> $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public dc.a a(cz.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public dc.a a(av.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public dc.a a(cc.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public dc.a a(boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public dc b() {
         Optional<dc.b> $$0 = dc.b.a(this.a, this.b, this.c);
         return new dc($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }

   static record b(de.c b, de.c c, de.c d) {
      public static final Codec<dc.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  de.c.d.optionalFieldOf("x", de.c.c).forGetter(dc.b::a),
                  de.c.d.optionalFieldOf("y", de.c.c).forGetter(dc.b::b),
                  de.c.d.optionalFieldOf("z", de.c.c).forGetter(dc.b::c)
               )
               .apply($$0, dc.b::new)
      );

      static Optional<dc.b> a(de.c $$0, de.c $$1, de.c $$2) {
         return $$0.c() && $$1.c() && $$2.c() ? Optional.empty() : Optional.of(new dc.b($$0, $$1, $$2));
      }

      public boolean a(double $$0, double $$1, double $$2) {
         return this.b.d($$0) && this.c.d($$1) && this.d.d($$2);
      }

      public de.c a() {
         return this.b;
      }

      public de.c b() {
         return this.c;
      }

      public de.c c() {
         return this.d;
      }
   }
}
