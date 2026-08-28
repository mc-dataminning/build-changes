import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bi(de.c b, de.c c, Optional<bu> d, Optional<Boolean> e, Optional<bj> f) {
   public static final Codec<bi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               de.c.d.optionalFieldOf("dealt", de.c.c).forGetter(bi::a),
               de.c.d.optionalFieldOf("taken", de.c.c).forGetter(bi::b),
               bu.a.optionalFieldOf("source_entity").forGetter(bi::c),
               Codec.BOOL.optionalFieldOf("blocked").forGetter(bi::d),
               bj.a.optionalFieldOf("type").forGetter(bi::e)
            )
            .apply($$0, bi::new)
   );

   public boolean a(aql $$0, bqw $$1, float $$2, float $$3, boolean $$4) {
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

   public de.c a() {
      return this.b;
   }

   public de.c b() {
      return this.c;
   }

   public Optional<bu> c() {
      return this.d;
   }

   public Optional<Boolean> d() {
      return this.e;
   }

   public Optional<bj> e() {
      return this.f;
   }

   public static class a {
      private de.c a = de.c.c;
      private de.c b = de.c.c;
      private Optional<bu> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();
      private Optional<bj> e = Optional.empty();

      public static bi.a a() {
         return new bi.a();
      }

      public bi.a a(de.c $$0) {
         this.a = $$0;
         return this;
      }

      public bi.a b(de.c $$0) {
         this.b = $$0;
         return this;
      }

      public bi.a a(bu $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bi.a a(Boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bi.a a(bj $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public bi.a a(bj.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bi b() {
         return new bi(this.a, this.b, this.c, this.d, this.e);
      }
   }
}
