import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bw(Optional<cn> b, Optional<cn> c, Optional<cn> d, Optional<cn> e, Optional<cn> f, Optional<cn> g, Optional<cn> h) {
   public static final Codec<bw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cn.a.optionalFieldOf("head").forGetter(bw::a),
               cn.a.optionalFieldOf("chest").forGetter(bw::b),
               cn.a.optionalFieldOf("legs").forGetter(bw::c),
               cn.a.optionalFieldOf("feet").forGetter(bw::d),
               cn.a.optionalFieldOf("body").forGetter(bw::e),
               cn.a.optionalFieldOf("mainhand").forGetter(bw::f),
               cn.a.optionalFieldOf("offhand").forGetter(bw::g)
            )
            .apply($$0, bw::new)
   );

   public static bw a(jh<dag> $$0, jh<dyd> $$1) {
      return bw.a.a().a(cn.a.a().a($$0, dao.wa).a(bo.a.a().a(kf.a(cty.a($$1).a(), kl.am, kl.h)).b())).b();
   }

   public boolean a(@Nullable bxe $$0) {
      if ($$0 instanceof byf $$1) {
         if (this.b.isPresent() && !this.b.get().a($$1.a(bxo.f))) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().a($$1.a(bxo.e))) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1.a(bxo.d))) {
            return false;
         } else if (this.e.isPresent() && !this.e.get().a($$1.a(bxo.c))) {
            return false;
         } else if (this.f.isPresent() && !this.f.get().a($$1.a(bxo.g))) {
            return false;
         } else {
            return this.g.isPresent() && !this.g.get().a($$1.a(bxo.a)) ? false : !this.h.isPresent() || this.h.get().a($$1.a(bxo.b));
         }
      } else {
         return false;
      }
   }

   public Optional<cn> a() {
      return this.b;
   }

   public Optional<cn> b() {
      return this.c;
   }

   public Optional<cn> c() {
      return this.d;
   }

   public Optional<cn> d() {
      return this.e;
   }

   public Optional<cn> e() {
      return this.f;
   }

   public Optional<cn> f() {
      return this.g;
   }

   public Optional<cn> g() {
      return this.h;
   }

   public static class a {
      private Optional<cn> a = Optional.empty();
      private Optional<cn> b = Optional.empty();
      private Optional<cn> c = Optional.empty();
      private Optional<cn> d = Optional.empty();
      private Optional<cn> e = Optional.empty();
      private Optional<cn> f = Optional.empty();
      private Optional<cn> g = Optional.empty();

      public static bw.a a() {
         return new bw.a();
      }

      public bw.a a(cn.a $$0) {
         this.a = Optional.of($$0.b());
         return this;
      }

      public bw.a b(cn.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bw.a c(cn.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bw.a d(cn.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bw.a e(cn.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bw.a f(cn.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bw.a g(cn.a $$0) {
         this.g = Optional.of($$0.b());
         return this;
      }

      public bw b() {
         return new bw(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
