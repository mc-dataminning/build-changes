import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bm(Optional<ca> c, Optional<ca> d, Optional<ca> e, Optional<ca> f, Optional<ca> g, Optional<ca> h) {
   public static final Codec<bm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atq.a(ca.a, "head").forGetter(bm::a),
               atq.a(ca.a, "chest").forGetter(bm::b),
               atq.a(ca.a, "legs").forGetter(bm::c),
               atq.a(ca.a, "feet").forGetter(bm::d),
               atq.a(ca.a, "mainhand").forGetter(bm::e),
               atq.a(ca.a, "offhand").forGetter(bm::f)
            )
            .apply($$0, bm::new)
   );
   public static final bm b = bm.a.a().a(ca.a.a().a(cmu.uI).a(cgj.s().v())).b();

   public boolean a(@Nullable blp $$0) {
      if ($$0 instanceof bmf $$1) {
         if (this.c.isPresent() && !this.c.get().a($$1.c(blu.f))) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1.c(blu.e))) {
            return false;
         } else if (this.e.isPresent() && !this.e.get().a($$1.c(blu.d))) {
            return false;
         } else if (this.f.isPresent() && !this.f.get().a($$1.c(blu.c))) {
            return false;
         } else {
            return this.g.isPresent() && !this.g.get().a($$1.c(blu.a)) ? false : !this.h.isPresent() || this.h.get().a($$1.c(blu.b));
         }
      } else {
         return false;
      }
   }

   public Optional<ca> a() {
      return this.c;
   }

   public Optional<ca> b() {
      return this.d;
   }

   public Optional<ca> c() {
      return this.e;
   }

   public Optional<ca> d() {
      return this.f;
   }

   public Optional<ca> e() {
      return this.g;
   }

   public Optional<ca> f() {
      return this.h;
   }

   public static class a {
      private Optional<ca> a = Optional.empty();
      private Optional<ca> b = Optional.empty();
      private Optional<ca> c = Optional.empty();
      private Optional<ca> d = Optional.empty();
      private Optional<ca> e = Optional.empty();
      private Optional<ca> f = Optional.empty();

      public static bm.a a() {
         return new bm.a();
      }

      public bm.a a(ca.a $$0) {
         this.a = Optional.of($$0.b());
         return this;
      }

      public bm.a b(ca.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bm.a c(ca.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bm.a d(ca.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bm.a e(ca.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bm.a f(ca.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bm b() {
         return new bm(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }
}
