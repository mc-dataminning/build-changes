import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bk(dj.c b, dj.c c, Optional<bw> d, Optional<Boolean> e, Optional<bl> f) {
   public static final Codec<bk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dj.c.d.optionalFieldOf("dealt", dj.c.c).forGetter(bk::a),
               dj.c.d.optionalFieldOf("taken", dj.c.c).forGetter(bk::b),
               bw.a.optionalFieldOf("source_entity").forGetter(bk::c),
               Codec.BOOL.optionalFieldOf("blocked").forGetter(bk::d),
               bl.a.optionalFieldOf("type").forGetter(bk::e)
            )
            .apply($$0, bk::new)
   );

   public boolean a(asi $$0, btv $$1, float $$2, float $$3, boolean $$4) {
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

   public dj.c a() {
      return this.b;
   }

   public dj.c b() {
      return this.c;
   }

   public Optional<bw> c() {
      return this.d;
   }

   public Optional<Boolean> d() {
      return this.e;
   }

   public Optional<bl> e() {
      return this.f;
   }

   public static class a {
      private dj.c a = dj.c.c;
      private dj.c b = dj.c.c;
      private Optional<bw> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();
      private Optional<bl> e = Optional.empty();

      public static bk.a a() {
         return new bk.a();
      }

      public bk.a a(dj.c $$0) {
         this.a = $$0;
         return this;
      }

      public bk.a b(dj.c $$0) {
         this.b = $$0;
         return this;
      }

      public bk.a a(bw $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bk.a a(Boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bk.a a(bl $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public bk.a a(bl.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bk b() {
         return new bk(this.a, this.b, this.c, this.d, this.e);
      }
   }
}
