import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bt(Optional<cu> b, Optional<cu> c, Optional<cu> d, Optional<cu> e, Optional<cu> f, Optional<cu> g, Optional<cu> h) {
   public static final Codec<bt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cu.a.optionalFieldOf("head").forGetter(bt::a),
               cu.a.optionalFieldOf("chest").forGetter(bt::b),
               cu.a.optionalFieldOf("legs").forGetter(bt::c),
               cu.a.optionalFieldOf("feet").forGetter(bt::d),
               cu.a.optionalFieldOf("body").forGetter(bt::e),
               cu.a.optionalFieldOf("mainhand").forGetter(bt::f),
               cu.a.optionalFieldOf("offhand").forGetter(bt::g)
            )
            .apply($$0, bt::new)
   );

   public static bt a(jr<cxg> $$0, jr<duf> $$1) {
      return bt.a.a().a(cu.a.a().a($$0, cxo.vF).a(ks.a(crf.a($$1).a(), ku.ai, ku.h))).b();
   }

   public boolean a(@Nullable bvf $$0) {
      if ($$0 instanceof bwb $$1) {
         if (this.b.isPresent() && !this.b.get().a($$1.a(bvn.f))) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().a($$1.a(bvn.e))) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1.a(bvn.d))) {
            return false;
         } else if (this.e.isPresent() && !this.e.get().a($$1.a(bvn.c))) {
            return false;
         } else if (this.f.isPresent() && !this.f.get().a($$1.a(bvn.g))) {
            return false;
         } else {
            return this.g.isPresent() && !this.g.get().a($$1.a(bvn.a)) ? false : !this.h.isPresent() || this.h.get().a($$1.a(bvn.b));
         }
      } else {
         return false;
      }
   }

   public Optional<cu> a() {
      return this.b;
   }

   public Optional<cu> b() {
      return this.c;
   }

   public Optional<cu> c() {
      return this.d;
   }

   public Optional<cu> d() {
      return this.e;
   }

   public Optional<cu> e() {
      return this.f;
   }

   public Optional<cu> f() {
      return this.g;
   }

   public Optional<cu> g() {
      return this.h;
   }

   public static class a {
      private Optional<cu> a = Optional.empty();
      private Optional<cu> b = Optional.empty();
      private Optional<cu> c = Optional.empty();
      private Optional<cu> d = Optional.empty();
      private Optional<cu> e = Optional.empty();
      private Optional<cu> f = Optional.empty();
      private Optional<cu> g = Optional.empty();

      public static bt.a a() {
         return new bt.a();
      }

      public bt.a a(cu.a $$0) {
         this.a = Optional.of($$0.b());
         return this;
      }

      public bt.a b(cu.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bt.a c(cu.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bt.a d(cu.a $$0) {
         this.d = Optional.of($$0.b());
         return this;
      }

      public bt.a e(cu.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bt.a f(cu.a $$0) {
         this.f = Optional.of($$0.b());
         return this;
      }

      public bt.a g(cu.a $$0) {
         this.g = Optional.of($$0.b());
         return this;
      }

      public bt b() {
         return new bt(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }
}
