import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bl(cv.c b, cv.c c, Optional<bx> d, Optional<Boolean> e, Optional<bm> f) {
   public static final Codec<bl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cv.c.d.optionalFieldOf("dealt", cv.c.c).forGetter(bl::a),
               cv.c.d.optionalFieldOf("taken", cv.c.c).forGetter(bl::b),
               bx.a.optionalFieldOf("source_entity").forGetter(bl::c),
               Codec.BOOL.optionalFieldOf("blocked").forGetter(bl::d),
               bm.a.optionalFieldOf("type").forGetter(bl::e)
            )
            .apply($$0, bl::new)
   );

   public boolean a(arr $$0, bus $$1, float $$2, float $$3, boolean $$4) {
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

   public cv.c a() {
      return this.b;
   }

   public cv.c b() {
      return this.c;
   }

   public Optional<bx> c() {
      return this.d;
   }

   public Optional<Boolean> d() {
      return this.e;
   }

   public Optional<bm> e() {
      return this.f;
   }

   public static class a {
      private cv.c a = cv.c.c;
      private cv.c b = cv.c.c;
      private Optional<bx> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();
      private Optional<bm> e = Optional.empty();

      public static bl.a a() {
         return new bl.a();
      }

      public bl.a a(cv.c $$0) {
         this.a = $$0;
         return this;
      }

      public bl.a b(cv.c $$0) {
         this.b = $$0;
         return this;
      }

      public bl.a a(bx $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bl.a a(Boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bl.a a(bm $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public bl.a a(bm.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bl b() {
         return new bl(this.a, this.b, this.c, this.d, this.e);
      }
   }
}
