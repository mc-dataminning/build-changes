import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bu(Optional<cl> b, Optional<cl> c, Optional<cl> d, Optional<cl> e, Optional<cl> f, Optional<cl> g, Optional<cl> h) {
   public static final Codec<bu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cl.a.optionalFieldOf("head").forGetter(bu::a),
               cl.a.optionalFieldOf("chest").forGetter(bu::b),
               cl.a.optionalFieldOf("legs").forGetter(bu::c),
               cl.a.optionalFieldOf("feet").forGetter(bu::d),
               cl.a.optionalFieldOf("body").forGetter(bu::e),
               cl.a.optionalFieldOf("mainhand").forGetter(bu::f),
               cl.a.optionalFieldOf("offhand").forGetter(bu::g)
            )
            .apply($$0, bu::new)
   );

   public static bu a(jf<cyo> $$0, jf<dwc> $$1) {
      return bu.a.a().a(cl.a.a().a($$0, cyw.vT).a(kd.a(csh.a($$1).a(), kj.am, kj.h))).b();
   }

   public boolean a(@Nullable bwa $$0) {
      if ($$0 instanceof bwz $$1) {
         if (this.b.isPresent() && !this.b.get().a($$1.a(bwk.f))) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().a($$1.a(bwk.e))) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1.a(bwk.d))) {
            return false;
         } else if (this.e.isPresent() && !this.e.get().a($$1.a(bwk.c))) {
            return false;
         } else if (this.f.isPresent() && !this.f.get().a($$1.a(bwk.g))) {
            return false;
         } else {
            return this.g.isPresent() && !this.g.get().a($$1.a(bwk.a)) ? false : !this.h.isPresent() || this.h.get().a($$1.a(bwk.b));
         }
      } else {
         return false;
      }
   }

   public Optional<cl> a() {
      return this.b;
   }

   public Optional<cl> b() {
      return this.c;
   }

   public Optional<cl> c() {
      return this.d;
   }

   public Optional<cl> d() {
      return this.e;
   }

   public Optional<cl> e() {
      return this.f;
   }

   public Optional<cl> f() {
      return this.g;
   }

   public Optional<cl> g() {
      return this.h;
   }

   public static class a {
      private Optional<cl> a = Optional.empty();
      private Optional<cl> b = Optional.empty();
      private Optional<cl> c = Optional.empty();
      private Optional<cl> d = Optional.empty();
      private Optional<cl> e = Optional.empty();
      private Optional<cl> f = Optional.empty();
      private Optional<cl> g = Optional.empty();

      public static bu.a a() {
         return new bu.a();
      }

      public bu.a a(cl.a $$0) {
         this.a = Optional.of($$0.b());
         return this;
      }

      public bu.a b(cl.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bu.a c(cl.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bu.a d(cl.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bu.a e(cl.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bu.a f(cl.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bu.a g(cl.a $$0) {
         this.g = Optional.of($$0.b());
         return this;
      }

      public bu b() {
         return new bu(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
