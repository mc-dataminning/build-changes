import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bj(di.c b, di.c c, Optional<bv> d, Optional<Boolean> e, Optional<bk> f) {
   public static final Codec<bj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               di.c.d.optionalFieldOf("dealt", di.c.c).forGetter(bj::a),
               di.c.d.optionalFieldOf("taken", di.c.c).forGetter(bj::b),
               bv.a.optionalFieldOf("source_entity").forGetter(bj::c),
               Codec.BOOL.optionalFieldOf("blocked").forGetter(bj::d),
               bk.a.optionalFieldOf("type").forGetter(bj::e)
            )
            .apply($$0, bj::new)
   );

   public boolean a(arn $$0, bsp $$1, float $$2, float $$3, boolean $$4) {
      if (!this.b.d((double)$$2)) {
         return false;
      } else if (!this.c.d((double)$$3)) {
         return false;
      } else if (this.d.isPresent() && !this.d.get().a($$0, $$1.d())) {
         return false;
      } else {
         return this.e.isPresent() && this.e.get() != $$4 ? false : !this.f.isPresent() || this.f.get().a($$0, $$1);
      }
   }

   public di.c a() {
      return this.b;
   }

   public di.c b() {
      return this.c;
   }

   public Optional<bv> c() {
      return this.d;
   }

   public Optional<Boolean> d() {
      return this.e;
   }

   public Optional<bk> e() {
      return this.f;
   }

   public static class a {
      private di.c a = di.c.c;
      private di.c b = di.c.c;
      private Optional<bv> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();
      private Optional<bk> e = Optional.empty();

      public static bj.a a() {
         return new bj.a();
      }

      public bj.a a(di.c $$0) {
         this.a = $$0;
         return this;
      }

      public bj.a b(di.c $$0) {
         this.b = $$0;
         return this;
      }

      public bj.a a(bv $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bj.a a(Boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bj.a a(bk $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public bj.a a(bk.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bj b() {
         return new bj(this.a, this.b, this.c, this.d, this.e);
      }
   }
}
