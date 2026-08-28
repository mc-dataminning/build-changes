import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ct(
   Optional<ct.b> b,
   Optional<ji<dkd>> c,
   Optional<ji<erb>> d,
   Optional<alf<dja>> e,
   Optional<Boolean> f,
   Optional<cq> g,
   Optional<ay> h,
   Optional<cf> i,
   Optional<Boolean> j
) {
   public static final Codec<ct> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ct.b.a.optionalFieldOf("position").forGetter(ct::a),
               jt.a(mg.aG).optionalFieldOf("biomes").forGetter(ct::b),
               jt.a(mg.be).optionalFieldOf("structures").forGetter(ct::c),
               alf.a(mg.bo).optionalFieldOf("dimension").forGetter(ct::d),
               Codec.BOOL.optionalFieldOf("smokey").forGetter(ct::e),
               cq.a.optionalFieldOf("light").forGetter(ct::f),
               ay.a.optionalFieldOf("block").forGetter(ct::g),
               cf.a.optionalFieldOf("fluid").forGetter(ct::h),
               Codec.BOOL.optionalFieldOf("can_see_sky").forGetter(ct::i)
            )
            .apply($$0, ct::new)
   );

   public boolean a(arq $$0, double $$1, double $$2, double $$3) {
      if (this.b.isPresent() && !this.b.get().a($$1, $$2, $$3)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$0.aj()) {
         return false;
      } else {
         iu $$4 = iu.a($$1, $$2, $$3);
         boolean $$5 = $$0.p($$4);
         if (!this.c.isPresent() || $$5 && this.c.get().a($$0.u($$4))) {
            if (!this.d.isPresent() || $$5 && $$0.b().a($$4, this.d.get()).b()) {
               if (!this.f.isPresent() || $$5 && this.f.get() == dmv.a($$0, $$4)) {
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

   public Optional<ct.b> a() {
      return this.b;
   }

   public Optional<ji<dkd>> b() {
      return this.c;
   }

   public Optional<ji<erb>> c() {
      return this.d;
   }

   public Optional<alf<dja>> d() {
      return this.e;
   }

   public Optional<Boolean> e() {
      return this.f;
   }

   public Optional<cq> f() {
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
      private cv.c a;
      private cv.c b;
      private cv.c c;
      private Optional<ji<dkd>> d;
      private Optional<ji<erb>> e;
      private Optional<alf<dja>> f;
      private Optional<Boolean> g;
      private Optional<cq> h;
      private Optional<ay> i;
      private Optional<cf> j;
      private Optional<Boolean> k;

      public a() {
         this.a = cv.c.c;
         this.b = cv.c.c;
         this.c = cv.c.c;
         this.d = Optional.empty();
         this.e = Optional.empty();
         this.f = Optional.empty();
         this.g = Optional.empty();
         this.h = Optional.empty();
         this.i = Optional.empty();
         this.j = Optional.empty();
         this.k = Optional.empty();
      }

      public static ct.a a() {
         return new ct.a();
      }

      public static ct.a a(je<dkd> $$0) {
         return a().a(ji.a($$0));
      }

      public static ct.a a(alf<dja> $$0) {
         return a().b($$0);
      }

      public static ct.a b(je<erb> $$0) {
         return a().b(ji.a($$0));
      }

      public static ct.a a(cv.c $$0) {
         return a().c($$0);
      }

      public ct.a b(cv.c $$0) {
         this.a = $$0;
         return this;
      }

      public ct.a c(cv.c $$0) {
         this.b = $$0;
         return this;
      }

      public ct.a d(cv.c $$0) {
         this.c = $$0;
         return this;
      }

      public ct.a a(ji<dkd> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ct.a b(ji<erb> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public ct.a b(alf<dja> $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public ct.a a(cq.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public ct.a a(ay.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public ct.a a(cf.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public ct.a a(boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public ct.a b(boolean $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public ct b() {
         Optional<ct.b> $$0 = ct.b.a(this.a, this.b, this.c);
         return new ct($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
      }
   }

   static record b(cv.c b, cv.c c, cv.c d) {
      public static final Codec<ct.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cv.c.d.optionalFieldOf("x", cv.c.c).forGetter(ct.b::a),
                  cv.c.d.optionalFieldOf("y", cv.c.c).forGetter(ct.b::b),
                  cv.c.d.optionalFieldOf("z", cv.c.c).forGetter(ct.b::c)
               )
               .apply($$0, ct.b::new)
      );

      static Optional<ct.b> a(cv.c $$0, cv.c $$1, cv.c $$2) {
         return $$0.c() && $$1.c() && $$2.c() ? Optional.empty() : Optional.of(new ct.b($$0, $$1, $$2));
      }

      public boolean a(double $$0, double $$1, double $$2) {
         return this.b.d($$0) && this.c.d($$1) && this.d.d($$2);
      }

      public cv.c a() {
         return this.b;
      }

      public cv.c b() {
         return this.c;
      }

      public cv.c c() {
         return this.d;
      }
   }
}
