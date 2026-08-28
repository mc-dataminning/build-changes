import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bl(dk.c b, dk.c c, Optional<bx> d, Optional<Boolean> e, Optional<bm> f) {
   public static final Codec<bl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dk.c.d.optionalFieldOf("dealt", dk.c.c).forGetter(bl::a),
               dk.c.d.optionalFieldOf("taken", dk.c.c).forGetter(bl::b),
               bx.a.optionalFieldOf("source_entity").forGetter(bl::c),
               Codec.BOOL.optionalFieldOf("blocked").forGetter(bl::d),
               bm.a.optionalFieldOf("type").forGetter(bl::e)
            )
            .apply($$0, bl::new)
   );

   public boolean a(aro $$0, buh $$1, float $$2, float $$3, boolean $$4) {
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

   public dk.c a() {
      return this.b;
   }

   public dk.c b() {
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
      private dk.c a = dk.c.c;
      private dk.c b = dk.c.c;
      private Optional<bx> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();
      private Optional<bm> e = Optional.empty();

      public static bl.a a() {
         return new bl.a();
      }

      public bl.a a(dk.c $$0) {
         this.a = $$0;
         return this;
      }

      public bl.a b(dk.c $$0) {
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
