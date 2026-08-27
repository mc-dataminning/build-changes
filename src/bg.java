import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bg(cu.c b, cu.c c, Optional<bs> d, Optional<Boolean> e, Optional<bh> f) {
   public static final Codec<bg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axu.a(cu.c.d, "dealt", cu.c.c).forGetter(bg::a),
               axu.a(cu.c.d, "taken", cu.c.c).forGetter(bg::b),
               axu.a(bs.a, "source_entity").forGetter(bg::c),
               axu.a(Codec.BOOL, "blocked").forGetter(bg::d),
               axu.a(bh.a, "type").forGetter(bg::e)
            )
            .apply($$0, bg::new)
   );

   public boolean a(aqu $$0, bqt $$1, float $$2, float $$3, boolean $$4) {
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

   public cu.c a() {
      return this.b;
   }

   public cu.c b() {
      return this.c;
   }

   public Optional<bs> c() {
      return this.d;
   }

   public Optional<Boolean> d() {
      return this.e;
   }

   public Optional<bh> e() {
      return this.f;
   }

   public static class a {
      private cu.c a = cu.c.c;
      private cu.c b = cu.c.c;
      private Optional<bs> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();
      private Optional<bh> e = Optional.empty();

      public static bg.a a() {
         return new bg.a();
      }

      public bg.a a(cu.c $$0) {
         this.a = $$0;
         return this;
      }

      public bg.a b(cu.c $$0) {
         this.b = $$0;
         return this;
      }

      public bg.a a(bs $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bg.a a(Boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bg.a a(bh $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public bg.a a(bh.a $$0) {
         this.e = Optional.of($$0.b());
         return this;
      }

      public bg b() {
         return new bg(this.a, this.b, this.c, this.d, this.e);
      }
   }
}
