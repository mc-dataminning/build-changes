import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bs(Optional<cs> b, Optional<cs> c, Optional<cs> d, Optional<cs> e, Optional<cs> f, Optional<cs> g, Optional<cs> h) {
   public static final Codec<bs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cs.a.optionalFieldOf("head").forGetter(bs::a),
               cs.a.optionalFieldOf("chest").forGetter(bs::b),
               cs.a.optionalFieldOf("legs").forGetter(bs::c),
               cs.a.optionalFieldOf("feet").forGetter(bs::d),
               cs.a.optionalFieldOf("body").forGetter(bs::e),
               cs.a.optionalFieldOf("mainhand").forGetter(bs::f),
               cs.a.optionalFieldOf("offhand").forGetter(bs::g)
            )
            .apply($$0, bs::new)
   );

   public static bs a(jo<cvg> $$0, jo<dqu> $$1) {
      return bs.a.a().a(cs.a.a().a($$0, cvo.uR).a(kp.a(cpc.a($$1).a()))).b();
   }

   public boolean a(@Nullable btj $$0) {
      if ($$0 instanceof buf $$1) {
         if (this.b.isPresent() && !this.b.get().a($$1.a(btr.f))) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().a($$1.a(btr.e))) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1.a(btr.d))) {
            return false;
         } else if (this.e.isPresent() && !this.e.get().a($$1.a(btr.c))) {
            return false;
         } else if (this.f.isPresent() && !this.f.get().a($$1.a(btr.g))) {
            return false;
         } else {
            return this.g.isPresent() && !this.g.get().a($$1.a(btr.a)) ? false : !this.h.isPresent() || this.h.get().a($$1.a(btr.b));
         }
      } else {
         return false;
      }
   }

   public Optional<cs> a() {
      return this.b;
   }

   public Optional<cs> b() {
      return this.c;
   }

   public Optional<cs> c() {
      return this.d;
   }

   public Optional<cs> d() {
      return this.e;
   }

   public Optional<cs> e() {
      return this.f;
   }

   public Optional<cs> f() {
      return this.g;
   }

   public Optional<cs> g() {
      return this.h;
   }

   public static class a {
      private Optional<cs> a = Optional.empty();
      private Optional<cs> b = Optional.empty();
      private Optional<cs> c = Optional.empty();
      private Optional<cs> d = Optional.empty();
      private Optional<cs> e = Optional.empty();
      private Optional<cs> f = Optional.empty();
      private Optional<cs> g = Optional.empty();

      public static bs.a a() {
         return new bs.a();
      }

      public bs.a a(cs.a $$0) {
         this.a = Optional.of($$0.b());
         return this;
      }

      public bs.a b(cs.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bs.a c(cs.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bs.a d(cs.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bs.a e(cs.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bs.a f(cs.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bs.a g(cs.a $$0) {
         this.g = Optional.of($$0.b());
         return this;
      }

      public bs b() {
         return new bs(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
