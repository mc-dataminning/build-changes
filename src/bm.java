import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bm(cx.c b, cx.c c, Optional<bz> d, Optional<Boolean> e, Optional<bn> f) {
   public static final Codec<bm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cx.c.d.optionalFieldOf("dealt", cx.c.c).forGetter(bm::a),
               cx.c.d.optionalFieldOf("taken", cx.c.c).forGetter(bm::b),
               bz.a.optionalFieldOf("source_entity").forGetter(bm::c),
               Codec.BOOL.optionalFieldOf("blocked").forGetter(bm::d),
               bn.a.optionalFieldOf("type").forGetter(bm::e)
            )
            .apply($$0, bm::new)
   );

   public boolean a(arv $$0, bvk $$1, float $$2, float $$3, boolean $$4) {
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

   public cx.c a() {
      return this.b;
   }

   public cx.c b() {
      return this.c;
   }

   public Optional<bz> c() {
      return this.d;
   }

   public Optional<Boolean> d() {
      return this.e;
   }

   public Optional<bn> e() {
      return this.f;
   }

   public static class a {
      private cx.c a = cx.c.c;
      private cx.c b = cx.c.c;
      private Optional<bz> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();
      private Optional<bn> e = Optional.empty();

      public static bm.a a() {
         return new bm.a();
      }

      public bm.a a(cx.c $$0) {
         this.a = $$0;
         return this;
      }

      public bm.a b(cx.c $$0) {
         this.b = $$0;
         return this;
      }

      public bm.a a(bz $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bm.a a(Boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bm.a a(bn $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public bm.a a(bn.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bm b() {
         return new bm(this.a, this.b, this.c, this.d, this.e);
      }
   }
}
