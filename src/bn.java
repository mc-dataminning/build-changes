import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bn(Optional<cb> c, Optional<cb> d, Optional<cb> e, Optional<cb> f, Optional<cb> g, Optional<cb> h) {
   public static final Codec<bn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arg.a(cb.a, "head").forGetter(bn::a),
               arg.a(cb.a, "chest").forGetter(bn::b),
               arg.a(cb.a, "legs").forGetter(bn::c),
               arg.a(cb.a, "feet").forGetter(bn::d),
               arg.a(cb.a, "mainhand").forGetter(bn::e),
               arg.a(cb.a, "offhand").forGetter(bn::f)
            )
            .apply($$0, bn::new)
   );
   public static final bn b = bn.a.a().a(cb.a.a().a(cji.tV).a(cdb.s().v())).b();

   public boolean a(@Nullable biq $$0) {
      if ($$0 instanceof bjg $$1) {
         if (this.c.isPresent() && !this.c.get().a($$1.c(biv.f))) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1.c(biv.e))) {
            return false;
         } else if (this.e.isPresent() && !this.e.get().a($$1.c(biv.d))) {
            return false;
         } else if (this.f.isPresent() && !this.f.get().a($$1.c(biv.c))) {
            return false;
         } else {
            return this.g.isPresent() && !this.g.get().a($$1.c(biv.a)) ? false : !this.h.isPresent() || this.h.get().a($$1.c(biv.b));
         }
      } else {
         return false;
      }
   }

   public Optional<cb> a() {
      return this.c;
   }

   public Optional<cb> b() {
      return this.d;
   }

   public Optional<cb> c() {
      return this.e;
   }

   public Optional<cb> d() {
      return this.f;
   }

   public Optional<cb> e() {
      return this.g;
   }

   public Optional<cb> f() {
      return this.h;
   }

   public static class a {
      private Optional<cb> a = Optional.empty();
      private Optional<cb> b = Optional.empty();
      private Optional<cb> c = Optional.empty();
      private Optional<cb> d = Optional.empty();
      private Optional<cb> e = Optional.empty();
      private Optional<cb> f = Optional.empty();

      public static bn.a a() {
         return new bn.a();
      }

      public bn.a a(cb.a $$0) {
         this.a = Optional.of($$0.b());
         return this;
      }

      public bn.a b(cb.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bn.a c(cb.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bn.a d(cb.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bn.a e(cb.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bn.a f(cb.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bn b() {
         return new bn(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }
}
