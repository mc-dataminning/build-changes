import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record br(Optional<cp> b, Optional<cp> c, Optional<cp> d, Optional<cp> e, Optional<cp> f, Optional<cp> g, Optional<cp> h) {
   public static final Codec<br> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cp.a.optionalFieldOf("head").forGetter(br::a),
               cp.a.optionalFieldOf("chest").forGetter(br::b),
               cp.a.optionalFieldOf("legs").forGetter(br::c),
               cp.a.optionalFieldOf("feet").forGetter(br::d),
               cp.a.optionalFieldOf("body").forGetter(br::e),
               cp.a.optionalFieldOf("mainhand").forGetter(br::f),
               cp.a.optionalFieldOf("offhand").forGetter(br::g)
            )
            .apply($$0, br::new)
   );

   public static br a(jj<dow> $$0) {
      return br.a.a().a(cp.a.a().a(cur.uP).a(kk.a(coh.a($$0).a()))).b();
   }

   public boolean a(@Nullable bst $$0) {
      if ($$0 instanceof bto $$1) {
         if (this.b.isPresent() && !this.b.get().a($$1.a(bta.f))) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().a($$1.a(bta.e))) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1.a(bta.d))) {
            return false;
         } else if (this.e.isPresent() && !this.e.get().a($$1.a(bta.c))) {
            return false;
         } else if (this.f.isPresent() && !this.f.get().a($$1.a(bta.g))) {
            return false;
         } else {
            return this.g.isPresent() && !this.g.get().a($$1.a(bta.a)) ? false : !this.h.isPresent() || this.h.get().a($$1.a(bta.b));
         }
      } else {
         return false;
      }
   }

   public Optional<cp> a() {
      return this.b;
   }

   public Optional<cp> b() {
      return this.c;
   }

   public Optional<cp> c() {
      return this.d;
   }

   public Optional<cp> d() {
      return this.e;
   }

   public Optional<cp> e() {
      return this.f;
   }

   public Optional<cp> f() {
      return this.g;
   }

   public Optional<cp> g() {
      return this.h;
   }

   public static class a {
      private Optional<cp> a = Optional.empty();
      private Optional<cp> b = Optional.empty();
      private Optional<cp> c = Optional.empty();
      private Optional<cp> d = Optional.empty();
      private Optional<cp> e = Optional.empty();
      private Optional<cp> f = Optional.empty();
      private Optional<cp> g = Optional.empty();

      public static br.a a() {
         return new br.a();
      }

      public br.a a(cp.a $$0) {
         this.a = Optional.of($$0.b());
         return this;
      }

      public br.a b(cp.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public br.a c(cp.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public br.a d(cp.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public br.a e(cp.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public br.a f(cp.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public br.a g(cp.a $$0) {
         this.g = Optional.of($$0.b());
         return this;
      }

      public br b() {
         return new br(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
