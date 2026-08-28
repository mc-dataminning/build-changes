import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bv(Optional<cm> b, Optional<cm> c, Optional<cm> d, Optional<cm> e, Optional<cm> f, Optional<cm> g, Optional<cm> h) {
   public static final Codec<bv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cm.a.optionalFieldOf("head").forGetter(bv::a),
               cm.a.optionalFieldOf("chest").forGetter(bv::b),
               cm.a.optionalFieldOf("legs").forGetter(bv::c),
               cm.a.optionalFieldOf("feet").forGetter(bv::d),
               cm.a.optionalFieldOf("body").forGetter(bv::e),
               cm.a.optionalFieldOf("mainhand").forGetter(bv::f),
               cm.a.optionalFieldOf("offhand").forGetter(bv::g)
            )
            .apply($$0, bv::new)
   );

   public static bv a(jg<czu> $$0, jg<dxr> $$1) {
      return bv.a.a().a(cm.a.a().a($$0, dac.wa).a(ke.a(ctn.a($$1).a(), kk.am, kk.h))).b();
   }

   public boolean a(@Nullable bwt $$0) {
      if ($$0 instanceof bxu $$1) {
         if (this.b.isPresent() && !this.b.get().a($$1.a(bxd.f))) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().a($$1.a(bxd.e))) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1.a(bxd.d))) {
            return false;
         } else if (this.e.isPresent() && !this.e.get().a($$1.a(bxd.c))) {
            return false;
         } else if (this.f.isPresent() && !this.f.get().a($$1.a(bxd.g))) {
            return false;
         } else {
            return this.g.isPresent() && !this.g.get().a($$1.a(bxd.a)) ? false : !this.h.isPresent() || this.h.get().a($$1.a(bxd.b));
         }
      } else {
         return false;
      }
   }

   public Optional<cm> a() {
      return this.b;
   }

   public Optional<cm> b() {
      return this.c;
   }

   public Optional<cm> c() {
      return this.d;
   }

   public Optional<cm> d() {
      return this.e;
   }

   public Optional<cm> e() {
      return this.f;
   }

   public Optional<cm> f() {
      return this.g;
   }

   public Optional<cm> g() {
      return this.h;
   }

   public static class a {
      private Optional<cm> a = Optional.empty();
      private Optional<cm> b = Optional.empty();
      private Optional<cm> c = Optional.empty();
      private Optional<cm> d = Optional.empty();
      private Optional<cm> e = Optional.empty();
      private Optional<cm> f = Optional.empty();
      private Optional<cm> g = Optional.empty();

      public static bv.a a() {
         return new bv.a();
      }

      public bv.a a(cm.a $$0) {
         this.a = Optional.of($$0.b());
         return this;
      }

      public bv.a b(cm.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bv.a c(cm.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bv.a d(cm.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bv.a e(cm.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bv.a f(cm.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bv.a g(cm.a $$0) {
         this.g = Optional.of($$0.b());
         return this;
      }

      public bv b() {
         return new bv(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
