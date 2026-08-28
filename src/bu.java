import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bu(Optional<cv> b, Optional<cv> c, Optional<cv> d, Optional<cv> e, Optional<cv> f, Optional<cv> g, Optional<cv> h) {
   public static final Codec<bu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cv.a.optionalFieldOf("head").forGetter(bu::a),
               cv.a.optionalFieldOf("chest").forGetter(bu::b),
               cv.a.optionalFieldOf("legs").forGetter(bu::c),
               cv.a.optionalFieldOf("feet").forGetter(bu::d),
               cv.a.optionalFieldOf("body").forGetter(bu::e),
               cv.a.optionalFieldOf("mainhand").forGetter(bu::f),
               cv.a.optionalFieldOf("offhand").forGetter(bu::g)
            )
            .apply($$0, bu::new)
   );

   public static bu a(js<cwk> $$0, js<dto> $$1) {
      return bu.a.a().a(cv.a.a().a($$0, cws.vP).a(kt.a(cqj.a($$1).a(), kv.ai, kv.h))).b();
   }

   public boolean a(@Nullable buk $$0) {
      if ($$0 instanceof bvg $$1) {
         if (this.b.isPresent() && !this.b.get().a($$1.a(bus.f))) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().a($$1.a(bus.e))) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1.a(bus.d))) {
            return false;
         } else if (this.e.isPresent() && !this.e.get().a($$1.a(bus.c))) {
            return false;
         } else if (this.f.isPresent() && !this.f.get().a($$1.a(bus.g))) {
            return false;
         } else {
            return this.g.isPresent() && !this.g.get().a($$1.a(bus.a)) ? false : !this.h.isPresent() || this.h.get().a($$1.a(bus.b));
         }
      } else {
         return false;
      }
   }

   public Optional<cv> a() {
      return this.b;
   }

   public Optional<cv> b() {
      return this.c;
   }

   public Optional<cv> c() {
      return this.d;
   }

   public Optional<cv> d() {
      return this.e;
   }

   public Optional<cv> e() {
      return this.f;
   }

   public Optional<cv> f() {
      return this.g;
   }

   public Optional<cv> g() {
      return this.h;
   }

   public static class a {
      private Optional<cv> a = Optional.empty();
      private Optional<cv> b = Optional.empty();
      private Optional<cv> c = Optional.empty();
      private Optional<cv> d = Optional.empty();
      private Optional<cv> e = Optional.empty();
      private Optional<cv> f = Optional.empty();
      private Optional<cv> g = Optional.empty();

      public static bu.a a() {
         return new bu.a();
      }

      public bu.a a(cv.a $$0) {
         this.a = Optional.of($$0.b());
         return this;
      }

      public bu.a b(cv.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bu.a c(cv.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bu.a d(cv.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bu.a e(cv.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bu.a f(cv.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bu.a g(cv.a $$0) {
         this.g = Optional.of($$0.b());
         return this;
      }

      public bu b() {
         return new bu(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
