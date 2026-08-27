import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cs(
   Optional<cs.b> b, Optional<je<dcz>> c, Optional<je<ejt>> d, Optional<aks<dca>> e, Optional<Boolean> f, Optional<cp> g, Optional<aw> h, Optional<ca> i
) {
   public static final Codec<cs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axu.a(cs.b.a, "position").forGetter(cs::a),
               axu.a(jp.a(li.az), "biomes").forGetter(cs::b),
               axu.a(jp.a(li.aJ), "structures").forGetter(cs::c),
               axu.a(aks.a(li.aS), "dimension").forGetter(cs::d),
               axu.a(Codec.BOOL, "smokey").forGetter(cs::e),
               axu.a(cp.a, "light").forGetter(cs::f),
               axu.a(aw.a, "block").forGetter(cs::g),
               axu.a(ca.a, "fluid").forGetter(cs::h)
            )
            .apply($$0, cs::new)
   );

   public boolean a(aqt $$0, double $$1, double $$2, double $$3) {
      if (this.b.isPresent() && !this.b.get().a($$1, $$2, $$3)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$0.af()) {
         return false;
      } else {
         ir $$4 = ir.a($$1, $$2, $$3);
         boolean $$5 = $$0.p($$4);
         if (!this.c.isPresent() || $$5 && this.c.get().a($$0.t($$4))) {
            if (!this.d.isPresent() || $$5 && $$0.a().a($$4, this.d.get()).b()) {
               if (!this.f.isPresent() || $$5 && this.f.get() == dfq.a($$0, $$4)) {
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

   public Optional<cs.b> a() {
      return this.b;
   }

   public Optional<je<dcz>> b() {
      return this.c;
   }

   public Optional<je<ejt>> c() {
      return this.d;
   }

   public Optional<aks<dca>> d() {
      return this.e;
   }

   public Optional<Boolean> e() {
      return this.f;
   }

   public Optional<cp> f() {
      return this.g;
   }

   public Optional<aw> g() {
      return this.h;
   }

   public Optional<ca> h() {
      return this.i;
   }

   public static class a {
      private cu.c a;
      private cu.c b;
      private cu.c c;
      private Optional<je<dcz>> d;
      private Optional<je<ejt>> e;
      private Optional<aks<dca>> f;
      private Optional<Boolean> g;
      private Optional<cp> h;
      private Optional<aw> i;
      private Optional<ca> j;

      public a() {
         this.a = cu.c.c;
         this.b = cu.c.c;
         this.c = cu.c.c;
         this.d = Optional.empty();
         this.e = Optional.empty();
         this.f = Optional.empty();
         this.g = Optional.empty();
         this.h = Optional.empty();
         this.i = Optional.empty();
         this.j = Optional.empty();
      }

      public static cs.a a() {
         return new cs.a();
      }

      public static cs.a a(ja<dcz> $$0) {
         return a().a(je.a($$0));
      }

      public static cs.a a(aks<dca> $$0) {
         return a().b($$0);
      }

      public static cs.a b(ja<ejt> $$0) {
         return a().b(je.a($$0));
      }

      public static cs.a a(cu.c $$0) {
         return a().c($$0);
      }

      public cs.a b(cu.c $$0) {
         this.a = $$0;
         return this;
      }

      public cs.a c(cu.c $$0) {
         this.b = $$0;
         return this;
      }

      public cs.a d(cu.c $$0) {
         this.c = $$0;
         return this;
      }

      public cs.a a(je<dcz> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public cs.a b(je<ejt> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public cs.a b(aks<dca> $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public cs.a a(cp.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public cs.a a(aw.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public cs.a a(ca.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public cs.a a(boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public cs b() {
         Optional<cs.b> $$0 = cs.b.a(this.a, this.b, this.c);
         return new cs($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }

   static record b(cu.c b, cu.c c, cu.c d) {
      public static final Codec<cs.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.a(cu.c.d, "x", cu.c.c).forGetter(cs.b::a), axu.a(cu.c.d, "y", cu.c.c).forGetter(cs.b::b), axu.a(cu.c.d, "z", cu.c.c).forGetter(cs.b::c)
               )
               .apply($$0, cs.b::new)
      );

      static Optional<cs.b> a(cu.c $$0, cu.c $$1, cu.c $$2) {
         return $$0.c() && $$1.c() && $$2.c() ? Optional.empty() : Optional.of(new cs.b($$0, $$1, $$2));
      }

      public boolean a(double $$0, double $$1, double $$2) {
         return this.b.d($$0) && this.c.d($$1) && this.d.d($$2);
      }

      public cu.c a() {
         return this.b;
      }

      public cu.c b() {
         return this.c;
      }

      public cu.c c() {
         return this.d;
      }
   }
}
