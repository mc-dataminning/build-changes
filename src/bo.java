import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bo(Optional<ch> b, Optional<ch> c, Optional<ch> d, Optional<ch> e, Optional<ch> f, Optional<ch> g) {
   public static final Codec<bo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axh.a(ch.a, "head").forGetter(bo::a),
               axh.a(ch.a, "chest").forGetter(bo::b),
               axh.a(ch.a, "legs").forGetter(bo::c),
               axh.a(ch.a, "feet").forGetter(bo::d),
               axh.a(ch.a, "mainhand").forGetter(bo::e),
               axh.a(ch.a, "offhand").forGetter(bo::f)
            )
            .apply($$0, bo::new)
   );

   public static bo a(ix<dnc> $$0) {
      return bo.a.a().a(ch.a.a().a(ctc.uP).a(jy.a(cms.a($$0).a()))).b();
   }

   public boolean a(@Nullable brh $$0) {
      if ($$0 instanceof bsa $$1) {
         if (this.b.isPresent() && !this.b.get().a($$1.d(bro.f))) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().a($$1.d(bro.e))) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1.d(bro.d))) {
            return false;
         } else if (this.e.isPresent() && !this.e.get().a($$1.d(bro.c))) {
            return false;
         } else {
            return this.f.isPresent() && !this.f.get().a($$1.d(bro.a)) ? false : !this.g.isPresent() || this.g.get().a($$1.d(bro.b));
         }
      } else {
         return false;
      }
   }

   public Optional<ch> a() {
      return this.b;
   }

   public Optional<ch> b() {
      return this.c;
   }

   public Optional<ch> c() {
      return this.d;
   }

   public Optional<ch> d() {
      return this.e;
   }

   public Optional<ch> e() {
      return this.f;
   }

   public Optional<ch> f() {
      return this.g;
   }

   public static class a {
      private Optional<ch> a = Optional.empty();
      private Optional<ch> b = Optional.empty();
      private Optional<ch> c = Optional.empty();
      private Optional<ch> d = Optional.empty();
      private Optional<ch> e = Optional.empty();
      private Optional<ch> f = Optional.empty();

      public static bo.a a() {
         return new bo.a();
      }

      public bo.a a(ch.a $$0) {
         this.a = Optional.of($$0.b());
         return this;
      }

      public bo.a b(ch.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bo.a c(ch.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bo.a d(ch.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bo.a e(ch.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bo.a f(ch.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bo b() {
         return new bo(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }
}
