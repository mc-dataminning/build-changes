import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cv(
   Optional<cv.b> b,
   Optional<jk<dlm>> c,
   Optional<jk<esn>> d,
   Optional<alq<dkj>> e,
   Optional<Boolean> f,
   Optional<cs> g,
   Optional<az> h,
   Optional<ch> i,
   Optional<Boolean> j
) {
   public static final Codec<cv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cv.b.a.optionalFieldOf("position").forGetter(cv::a),
               jv.a(mi.aG).optionalFieldOf("biomes").forGetter(cv::b),
               jv.a(mi.be).optionalFieldOf("structures").forGetter(cv::c),
               alq.a(mi.bp).optionalFieldOf("dimension").forGetter(cv::d),
               Codec.BOOL.optionalFieldOf("smokey").forGetter(cv::e),
               cs.a.optionalFieldOf("light").forGetter(cv::f),
               az.a.optionalFieldOf("block").forGetter(cv::g),
               ch.a.optionalFieldOf("fluid").forGetter(cv::h),
               Codec.BOOL.optionalFieldOf("can_see_sky").forGetter(cv::i)
            )
            .apply($$0, cv::new)
   );

   public boolean a(asb $$0, double $$1, double $$2, double $$3) {
      if (this.b.isPresent() && !this.b.get().a($$1, $$2, $$3)) {
         return false;
      } else if (this.e.isPresent() && this.e.get() != $$0.aj()) {
         return false;
      } else {
         iw $$4 = iw.a($$1, $$2, $$3);
         boolean $$5 = $$0.p($$4);
         if (!this.c.isPresent() || $$5 && this.c.get().a($$0.u($$4))) {
            if (!this.d.isPresent() || $$5 && $$0.b().a($$4, this.d.get()).b()) {
               if (!this.f.isPresent() || $$5 && this.f.get() == doe.a($$0, $$4)) {
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

   public Optional<cv.b> a() {
      return this.b;
   }

   public Optional<jk<dlm>> b() {
      return this.c;
   }

   public Optional<jk<esn>> c() {
      return this.d;
   }

   public Optional<alq<dkj>> d() {
      return this.e;
   }

   public Optional<Boolean> e() {
      return this.f;
   }

   public Optional<cs> f() {
      return this.g;
   }

   public Optional<az> g() {
      return this.h;
   }

   public Optional<ch> h() {
      return this.i;
   }

   public Optional<Boolean> i() {
      return this.j;
   }

   public static class a {
      private cx.c a;
      private cx.c b;
      private cx.c c;
      private Optional<jk<dlm>> d;
      private Optional<jk<esn>> e;
      private Optional<alq<dkj>> f;
      private Optional<Boolean> g;
      private Optional<cs> h;
      private Optional<az> i;
      private Optional<ch> j;
      private Optional<Boolean> k;

      public a() {
         this.a = cx.c.c;
         this.b = cx.c.c;
         this.c = cx.c.c;
         this.d = Optional.empty();
         this.e = Optional.empty();
         this.f = Optional.empty();
         this.g = Optional.empty();
         this.h = Optional.empty();
         this.i = Optional.empty();
         this.j = Optional.empty();
         this.k = Optional.empty();
      }

      public static cv.a a() {
         return new cv.a();
      }

      public static cv.a a(jg<dlm> $$0) {
         return a().a(jk.a($$0));
      }

      public static cv.a a(alq<dkj> $$0) {
         return a().b($$0);
      }

      public static cv.a b(jg<esn> $$0) {
         return a().b(jk.a($$0));
      }

      public static cv.a a(cx.c $$0) {
         return a().c($$0);
      }

      public cv.a b(cx.c $$0) {
         this.a = $$0;
         return this;
      }

      public cv.a c(cx.c $$0) {
         this.b = $$0;
         return this;
      }

      public cv.a d(cx.c $$0) {
         this.c = $$0;
         return this;
      }

      public cv.a a(jk<dlm> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public cv.a b(jk<esn> $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public cv.a b(alq<dkj> $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public cv.a a(cs.a $$0) {
         this.h = Optional.of($$0.b());
         return this;
      }

      public cv.a a(az.a $$0) {
         this.i = Optional.of($$0.b());
         return this;
      }

      public cv.a a(ch.a $$0) {
         this.j = Optional.of($$0.b());
         return this;
      }

      public cv.a a(boolean $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public cv.a b(boolean $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public cv b() {
         Optional<cv.b> $$0 = cv.b.a(this.a, this.b, this.c);
         return new cv($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
      }
   }

   static record b(cx.c b, cx.c c, cx.c d) {
      public static final Codec<cv.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cx.c.d.optionalFieldOf("x", cx.c.c).forGetter(cv.b::a),
                  cx.c.d.optionalFieldOf("y", cx.c.c).forGetter(cv.b::b),
                  cx.c.d.optionalFieldOf("z", cx.c.c).forGetter(cv.b::c)
               )
               .apply($$0, cv.b::new)
      );

      static Optional<cv.b> a(cx.c $$0, cx.c $$1, cx.c $$2) {
         return $$0.c() && $$1.c() && $$2.c() ? Optional.empty() : Optional.of(new cv.b($$0, $$1, $$2));
      }

      public boolean a(double $$0, double $$1, double $$2) {
         return this.b.d($$0) && this.c.d($$1) && this.d.d($$2);
      }

      public cx.c a() {
         return this.b;
      }

      public cx.c b() {
         return this.c;
      }

      public cx.c c() {
         return this.d;
      }
   }
}
