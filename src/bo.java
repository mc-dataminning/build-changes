import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bo(Optional<cc> c, Optional<cc> d, Optional<cc> e, Optional<cc> f, Optional<cc> g, Optional<cc> h) {
   public static final Codec<bo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avu.a(cc.a, "head").forGetter(bo::a),
               avu.a(cc.a, "chest").forGetter(bo::b),
               avu.a(cc.a, "legs").forGetter(bo::c),
               avu.a(cc.a, "feet").forGetter(bo::d),
               avu.a(cc.a, "mainhand").forGetter(bo::e),
               avu.a(cc.a, "offhand").forGetter(bo::f)
            )
            .apply($$0, bo::new)
   );
   public static final bo b = bo.a.a().a(cc.a.a().a(cpt.uL).a(cjj.s().w())).b();

   public boolean a(@Nullable bof $$0) {
      if ($$0 instanceof box $$1) {
         if (this.c.isPresent() && !this.c.get().a($$1.c(bom.f))) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1.c(bom.e))) {
            return false;
         } else if (this.e.isPresent() && !this.e.get().a($$1.c(bom.d))) {
            return false;
         } else if (this.f.isPresent() && !this.f.get().a($$1.c(bom.c))) {
            return false;
         } else {
            return this.g.isPresent() && !this.g.get().a($$1.c(bom.a)) ? false : !this.h.isPresent() || this.h.get().a($$1.c(bom.b));
         }
      } else {
         return false;
      }
   }

   public Optional<cc> a() {
      return this.c;
   }

   public Optional<cc> b() {
      return this.d;
   }

   public Optional<cc> c() {
      return this.e;
   }

   public Optional<cc> d() {
      return this.f;
   }

   public Optional<cc> e() {
      return this.g;
   }

   public Optional<cc> f() {
      return this.h;
   }

   public static class a {
      private Optional<cc> a = Optional.empty();
      private Optional<cc> b = Optional.empty();
      private Optional<cc> c = Optional.empty();
      private Optional<cc> d = Optional.empty();
      private Optional<cc> e = Optional.empty();
      private Optional<cc> f = Optional.empty();

      public static bo.a a() {
         return new bo.a();
      }

      public bo.a a(cc.a $$0) {
         this.a = Optional.of($$0.b());
         return this;
      }

      public bo.a b(cc.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bo.a c(cc.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bo.a d(cc.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bo.a e(cc.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bo.a f(cc.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bo b() {
         return new bo(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }
}
