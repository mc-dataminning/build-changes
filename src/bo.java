import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bo(Optional<cg> b, Optional<cg> c, Optional<cg> d, Optional<cg> e, Optional<cg> f, Optional<cg> g) {
   public static final Codec<bo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.a(cg.a, "head").forGetter(bo::a),
               axe.a(cg.a, "chest").forGetter(bo::b),
               axe.a(cg.a, "legs").forGetter(bo::c),
               axe.a(cg.a, "feet").forGetter(bo::d),
               axe.a(cg.a, "mainhand").forGetter(bo::e),
               axe.a(cg.a, "offhand").forGetter(bo::f)
            )
            .apply($$0, bo::new)
   );

   public static bo a(iw<dmt> $$0) {
      return bo.a.a().a(cg.a.a().a(csg.uP).a(jx.a(clw.a($$0).a()))).b();
   }

   public boolean a(@Nullable bql $$0) {
      if ($$0 instanceof bre $$1) {
         if (this.b.isPresent() && !this.b.get().a($$1.d(bqs.f))) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().a($$1.d(bqs.e))) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1.d(bqs.d))) {
            return false;
         } else if (this.e.isPresent() && !this.e.get().a($$1.d(bqs.c))) {
            return false;
         } else {
            return this.f.isPresent() && !this.f.get().a($$1.d(bqs.a)) ? false : !this.g.isPresent() || this.g.get().a($$1.d(bqs.b));
         }
      } else {
         return false;
      }
   }

   public Optional<cg> a() {
      return this.b;
   }

   public Optional<cg> b() {
      return this.c;
   }

   public Optional<cg> c() {
      return this.d;
   }

   public Optional<cg> d() {
      return this.e;
   }

   public Optional<cg> e() {
      return this.f;
   }

   public Optional<cg> f() {
      return this.g;
   }

   public static class a {
      private Optional<cg> a = Optional.empty();
      private Optional<cg> b = Optional.empty();
      private Optional<cg> c = Optional.empty();
      private Optional<cg> d = Optional.empty();
      private Optional<cg> e = Optional.empty();
      private Optional<cg> f = Optional.empty();

      public static bo.a a() {
         return new bo.a();
      }

      public bo.a a(cg.a $$0) {
         this.a = Optional.of($$0.b());
         return this;
      }

      public bo.a b(cg.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bo.a c(cg.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bo.a d(cg.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bo.a e(cg.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bo.a f(cg.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bo b() {
         return new bo(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }
}
