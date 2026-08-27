import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bo(Optional<cc> b, Optional<cc> c, Optional<cc> d, Optional<cc> e, Optional<cc> f, Optional<cc> g) {
   public static final Codec<bo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awu.a(cc.a, "head").forGetter(bo::a),
               awu.a(cc.a, "chest").forGetter(bo::b),
               awu.a(cc.a, "legs").forGetter(bo::c),
               awu.a(cc.a, "feet").forGetter(bo::d),
               awu.a(cc.a, "mainhand").forGetter(bo::e),
               awu.a(cc.a, "offhand").forGetter(bo::f)
            )
            .apply($$0, bo::new)
   );

   public static bo a(io<dme> $$0) {
      return bo.a.a().a(cc.a.a().a(crv.uN).a(jp.a(cll.a($$0).a()))).b();
   }

   public boolean a(@Nullable bqa $$0) {
      if ($$0 instanceof bqt $$1) {
         if (this.b.isPresent() && !this.b.get().a($$1.d(bqh.f))) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().a($$1.d(bqh.e))) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1.d(bqh.d))) {
            return false;
         } else if (this.e.isPresent() && !this.e.get().a($$1.d(bqh.c))) {
            return false;
         } else {
            return this.f.isPresent() && !this.f.get().a($$1.d(bqh.a)) ? false : !this.g.isPresent() || this.g.get().a($$1.d(bqh.b));
         }
      } else {
         return false;
      }
   }

   public Optional<cc> a() {
      return this.b;
   }

   public Optional<cc> b() {
      return this.c;
   }

   public Optional<cc> c() {
      return this.d;
   }

   public Optional<cc> d() {
      return this.e;
   }

   public Optional<cc> e() {
      return this.f;
   }

   public Optional<cc> f() {
      return this.g;
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
