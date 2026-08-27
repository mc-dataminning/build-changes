import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cq(
   Optional<cq.b> b, Optional<iz<dat>> c, Optional<iz<egg>> d, Optional<ake<czu>> e, Optional<Boolean> f, Optional<cn> g, Optional<av> h, Optional<by> i
) {
   public static final Codec<cq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.a(cq.b.a, "position").forGetter(cq::a),
               axe.a(jk.a(ld.ay), "biomes").forGetter(cq::b),
               axe.a(jk.a(ld.aI), "structures").forGetter(cq::c),
               axe.a(ake.a(ld.aR), "dimension").forGetter(cq::d),
               axe.a(Codec.BOOL, "smokey").forGetter(cq::e),
               axe.a(cn.a, "light").forGetter(cq::f),
               axe.a(av.a, "block").forGetter(cq::g),
               axe.a(by.a, "fluid").forGetter(cq::h)
            )
            .apply($$0, cq::new)
   );

   public boolean a(aqe $$0, double $$1, double $$2, double $$3) {
      if (this.b.isPresent() && !this.b.get().a($$1, $$2, $$3)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$0.ae()) {
         return false;
      } else {
         im $$4 = im.a($$1, $$2, $$3);
         boolean $$5 = $$0.p($$4);
         if (!this.c.isPresent() || $$5 && this.c.get().a($$0.t($$4))) {
            if (!this.d.isPresent() || $$5 && $$0.a().a($$4, this.d.get()).b()) {
               if (!this.f.isPresent() || $$5 && this.f.get() == ddj.a($$0, $$4)) {
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

   public Optional<cq.b> a() {
      return this.b;
   }

   public Optional<iz<dat>> b() {
      return this.c;
   }

   public Optional<iz<egg>> c() {
      return this.d;
   }

   public Optional<ake<czu>> d() {
      return this.e;
   }

   public Optional<Boolean> e() {
      return this.f;
   }

   public Optional<cn> f() {
      return this.g;
   }

   public Optional<av> g() {
      return this.h;
   }

   public Optional<by> h() {
      return this.i;
   }

   public static class a {
      private cs.c a;
      private cs.c b;
      private cs.c c;
      private Optional<iz<dat>> d;
      private Optional<iz<egg>> e;
      private Optional<ake<czu>> f;
      private Optional<Boolean> g;
      private Optional<cn> h;
      private Optional<av> i;
      private Optional<by> j;

      public a() {
         this.a = cs.c.c;
         this.b = cs.c.c;
         this.c = cs.c.c;
         this.d = Optional.empty();
         this.e = Optional.empty();
         this.f = Optional.empty();
         this.g = Optional.empty();
         this.h = Optional.empty();
         this.i = Optional.empty();
         this.j = Optional.empty();
      }

      public static cq.a a() {
         return new cq.a();
      }

      public static cq.a a(iv<dat> $$0) {
         return a().a(iz.a($$0));
      }

      public static cq.a a(ake<czu> $$0) {
         return a().b($$0);
      }

      public static cq.a b(iv<egg> $$0) {
         return a().b(iz.a($$0));
      }

      public static cq.a a(cs.c $$0) {
         return a().c($$0);
      }

      public cq.a b(cs.c $$0) {
         this.a = $$0;
         return this;
      }

      public cq.a c(cs.c $$0) {
         this.b = $$0;
         return this;
      }

      public cq.a d(cs.c $$0) {
         this.c = $$0;
         return this;
      }

      public cq.a a(iz<dat> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public cq.a b(iz<egg> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public cq.a b(ake<czu> $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public cq.a a(cn.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public cq.a a(av.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public cq.a a(by.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public cq.a a(boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public cq b() {
         Optional<cq.b> $$0 = cq.b.a(this.a, this.b, this.c);
         return new cq($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }

   static record b(cs.c b, cs.c c, cs.c d) {
      public static final Codec<cq.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axe.a(cs.c.d, "x", cs.c.c).forGetter(cq.b::a), axe.a(cs.c.d, "y", cs.c.c).forGetter(cq.b::b), axe.a(cs.c.d, "z", cs.c.c).forGetter(cq.b::c)
               )
               .apply($$0, cq.b::new)
      );

      static Optional<cq.b> a(cs.c $$0, cs.c $$1, cs.c $$2) {
         return $$0.c() && $$1.c() && $$2.c() ? Optional.empty() : Optional.of(new cq.b($$0, $$1, $$2));
      }

      public boolean a(double $$0, double $$1, double $$2) {
         return this.b.d($$0) && this.c.d($$1) && this.d.d($$2);
      }

      public cs.c a() {
         return this.b;
      }

      public cs.c b() {
         return this.c;
      }

      public cs.c c() {
         return this.d;
      }
   }
}
