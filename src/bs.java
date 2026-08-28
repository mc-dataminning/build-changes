import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class bs extends dl<bs.a> {
   @Override
   public Codec<bs.a> a() {
      return bs.a.a;
   }

   public void a(arv $$0, @Nullable bwv $$1) {
      faj $$2 = $$1 != null ? bz.b($$0, $$1) : null;
      this.a($$0, $$2x -> $$2x.a($$0, $$2));
   }

   public static record a(Optional<bj> b, Optional<cy> c, Optional<bj> d) implements dl.a {
      public static final Codec<bs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(bs.a::a),
                  cy.a.optionalFieldOf("effects").forGetter(bs.a::b),
                  bz.b.optionalFieldOf("source").forGetter(bs.a::c)
               )
               .apply($$0, bs.a::new)
      );

      public static ar<bs.a> a(cy.a $$0) {
         return aq.B.a(new bs.a(Optional.empty(), $$0.b(), Optional.empty()));
      }

      public static ar<bs.a> a(bz.a $$0) {
         return aq.B.a(new bs.a(Optional.empty(), Optional.empty(), Optional.of(bz.a($$0.b()))));
      }

      public boolean a(arv $$0, @Nullable faj $$1) {
         return this.c.isPresent() && !this.c.get().a((bxw)$$0) ? false : !this.d.isPresent() || $$1 != null && this.d.get().a($$1);
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
         $$0.a(this.d, ".source");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<cy> b() {
         return this.c;
      }

      public Optional<bj> c() {
         return this.d;
      }
   }
}
