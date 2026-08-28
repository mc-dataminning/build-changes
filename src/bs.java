import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bs(Optional<ct> b, Optional<ct> c, Optional<ct> d, Optional<ct> e, Optional<ct> f, Optional<ct> g, Optional<ct> h) {
   public static final Codec<bs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ct.a.optionalFieldOf("head").forGetter(bs::a),
               ct.a.optionalFieldOf("chest").forGetter(bs::b),
               ct.a.optionalFieldOf("legs").forGetter(bs::c),
               ct.a.optionalFieldOf("feet").forGetter(bs::d),
               ct.a.optionalFieldOf("body").forGetter(bs::e),
               ct.a.optionalFieldOf("mainhand").forGetter(bs::f),
               ct.a.optionalFieldOf("offhand").forGetter(bs::g)
            )
            .apply($$0, bs::new)
   );

   public static bs a(jq<cvt> $$0, jq<drw> $$1) {
      return bs.a.a().a(ct.a.a().a($$0, cwb.uR).a(kr.a(cpv.a($$1).a(), kt.ah, kt.h))).b();
   }

   public boolean a(@Nullable btz $$0) {
      if ($$0 instanceof buv $$1) {
         if (this.b.isPresent() && !this.b.get().a($$1.a(buh.f))) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().a($$1.a(buh.e))) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1.a(buh.d))) {
            return false;
         } else if (this.e.isPresent() && !this.e.get().a($$1.a(buh.c))) {
            return false;
         } else if (this.f.isPresent() && !this.f.get().a($$1.a(buh.g))) {
            return false;
         } else {
            return this.g.isPresent() && !this.g.get().a($$1.a(buh.a)) ? false : !this.h.isPresent() || this.h.get().a($$1.a(buh.b));
         }
      } else {
         return false;
      }
   }

   public Optional<ct> a() {
      return this.b;
   }

   public Optional<ct> b() {
      return this.c;
   }

   public Optional<ct> c() {
      return this.d;
   }

   public Optional<ct> d() {
      return this.e;
   }

   public Optional<ct> e() {
      return this.f;
   }

   public Optional<ct> f() {
      return this.g;
   }

   public Optional<ct> g() {
      return this.h;
   }

   public static class a {
      private Optional<ct> a = Optional.empty();
      private Optional<ct> b = Optional.empty();
      private Optional<ct> c = Optional.empty();
      private Optional<ct> d = Optional.empty();
      private Optional<ct> e = Optional.empty();
      private Optional<ct> f = Optional.empty();
      private Optional<ct> g = Optional.empty();

      public static bs.a a() {
         return new bs.a();
      }

      public bs.a a(ct.a $$0) {
         this.a = Optional.of($$0.b());
         return this;
      }

      public bs.a b(ct.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bs.a c(ct.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bs.a d(ct.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bs.a e(ct.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bs.a f(ct.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bs.a g(ct.a $$0) {
         this.g = Optional.of($$0.b());
         return this;
      }

      public bs b() {
         return new bs(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
