import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bl(Optional<bz> c, Optional<bz> d, Optional<bz> e, Optional<bz> f, Optional<bz> g, Optional<bz> h) {
   public static final Codec<bl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.a(bz.a, "head").forGetter(bl::a),
               aqy.a(bz.a, "chest").forGetter(bl::b),
               aqy.a(bz.a, "legs").forGetter(bl::c),
               aqy.a(bz.a, "feet").forGetter(bl::d),
               aqy.a(bz.a, "mainhand").forGetter(bl::e),
               aqy.a(bz.a, "offhand").forGetter(bl::f)
            )
            .apply($$0, bl::new)
   );
   public static final bl b = new bl(
      bz.a.a().a(cja.tV).a(cct.s().v()).b(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()
   );

   static Optional<bl> a(Optional<bz> $$0, Optional<bz> $$1, Optional<bz> $$2, Optional<bz> $$3, Optional<bz> $$4, Optional<bz> $$5) {
      return $$0.isEmpty() && $$1.isEmpty() && $$2.isEmpty() && $$3.isEmpty() && $$4.isEmpty() && $$5.isEmpty()
         ? Optional.empty()
         : Optional.of(new bl($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public boolean a(@Nullable bii $$0) {
      if ($$0 instanceof biy $$1) {
         if (this.c.isPresent() && !this.c.get().a($$1.c(bin.f))) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1.c(bin.e))) {
            return false;
         } else if (this.e.isPresent() && !this.e.get().a($$1.c(bin.d))) {
            return false;
         } else if (this.f.isPresent() && !this.f.get().a($$1.c(bin.c))) {
            return false;
         } else {
            return this.g.isPresent() && !this.g.get().a($$1.c(bin.a)) ? false : !this.h.isPresent() || this.h.get().a($$1.c(bin.b));
         }
      } else {
         return false;
      }
   }

   public Optional<bz> a() {
      return this.c;
   }

   public Optional<bz> b() {
      return this.d;
   }

   public Optional<bz> c() {
      return this.e;
   }

   public Optional<bz> d() {
      return this.f;
   }

   public Optional<bz> e() {
      return this.g;
   }

   public Optional<bz> f() {
      return this.h;
   }

   public static class a {
      private Optional<bz> a = Optional.empty();
      private Optional<bz> b = Optional.empty();
      private Optional<bz> c = Optional.empty();
      private Optional<bz> d = Optional.empty();
      private Optional<bz> e = Optional.empty();
      private Optional<bz> f = Optional.empty();

      public static bl.a a() {
         return new bl.a();
      }

      public bl.a a(bz.a $$0) {
         this.a = $$0.b();
         return this;
      }

      public bl.a b(bz.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public bl.a c(bz.a $$0) {
         this.c = $$0.b();
         return this;
      }

      public bl.a d(bz.a $$0) {
         this.d = $$0.b();
         return this;
      }

      public bl.a e(bz.a $$0) {
         this.e = $$0.b();
         return this;
      }

      public bl.a f(bz.a $$0) {
         this.f = $$0.b();
         return this;
      }

      public Optional<bl> b() {
         return bl.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }
}
