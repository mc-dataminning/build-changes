import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bm(cw.c b, cw.c c, Optional<by> d, Optional<Boolean> e, Optional<bn> f) {
   public static final Codec<bm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cw.c.d.optionalFieldOf("dealt", cw.c.c).forGetter(bm::a),
               cw.c.d.optionalFieldOf("taken", cw.c.c).forGetter(bm::b),
               by.a.optionalFieldOf("source_entity").forGetter(bm::c),
               Codec.BOOL.optionalFieldOf("blocked").forGetter(bm::d),
               bn.a.optionalFieldOf("type").forGetter(bm::e)
            )
            .apply($$0, bm::new)
   );

   public boolean a(arr $$0, bux $$1, float $$2, float $$3, boolean $$4) {
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

   public cw.c a() {
      return this.b;
   }

   public cw.c b() {
      return this.c;
   }

   public Optional<by> c() {
      return this.d;
   }

   public Optional<Boolean> d() {
      return this.e;
   }

   public Optional<bn> e() {
      return this.f;
   }

   public static class a {
      private cw.c a = cw.c.c;
      private cw.c b = cw.c.c;
      private Optional<by> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();
      private Optional<bn> e = Optional.empty();

      public static bm.a a() {
         return new bm.a();
      }

      public bm.a a(cw.c $$0) {
         this.a = $$0;
         return this;
      }

      public bm.a b(cw.c $$0) {
         this.b = $$0;
         return this;
      }

      public bm.a a(by $$0) {
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
