import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bp(Optional<ci> b, Optional<ci> c, Optional<ci> d, Optional<ci> e, Optional<ci> f, Optional<ci> g) {
   public static final Codec<bp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axu.a(ci.a, "head").forGetter(bp::a),
               axu.a(ci.a, "chest").forGetter(bp::b),
               axu.a(ci.a, "legs").forGetter(bp::c),
               axu.a(ci.a, "feet").forGetter(bp::d),
               axu.a(ci.a, "mainhand").forGetter(bp::e),
               axu.a(ci.a, "offhand").forGetter(bp::f)
            )
            .apply($$0, bp::new)
   );

   public static bp a(jb<dpr> $$0) {
      return bp.a.a().a(ci.a.a().a(cuk.wA).a(kc.a(cnm.a($$0).a()))).b();
   }

   public boolean a(@Nullable brv $$0) {
      if ($$0 instanceof bso $$1) {
         if (this.b.isPresent() && !this.b.get().a($$1.d(bsc.f))) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().a($$1.d(bsc.e))) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1.d(bsc.d))) {
            return false;
         } else if (this.e.isPresent() && !this.e.get().a($$1.d(bsc.c))) {
            return false;
         } else {
            return this.f.isPresent() && !this.f.get().a($$1.d(bsc.a)) ? false : !this.g.isPresent() || this.g.get().a($$1.d(bsc.b));
         }
      } else {
         return false;
      }
   }

   public Optional<ci> a() {
      return this.b;
   }

   public Optional<ci> b() {
      return this.c;
   }

   public Optional<ci> c() {
      return this.d;
   }

   public Optional<ci> d() {
      return this.e;
   }

   public Optional<ci> e() {
      return this.f;
   }

   public Optional<ci> f() {
      return this.g;
   }

   public static class a {
      private Optional<ci> a = Optional.empty();
      private Optional<ci> b = Optional.empty();
      private Optional<ci> c = Optional.empty();
      private Optional<ci> d = Optional.empty();
      private Optional<ci> e = Optional.empty();
      private Optional<ci> f = Optional.empty();

      public static bp.a a() {
         return new bp.a();
      }

      public bp.a a(ci.a $$0) {
         this.a = Optional.of($$0.b());
         return this;
      }

      public bp.a b(ci.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bp.a c(ci.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bp.a d(ci.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bp.a e(ci.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bp.a f(ci.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bp b() {
         return new bp(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }
}
