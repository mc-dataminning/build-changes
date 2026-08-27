import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cy extends cx<cy.a> {
   @Override
   public Codec<cy.a> a() {
      return cy.a.a;
   }

   public void a(apg $$0, dnb $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<il<dac>> c, Optional<db> d) implements cx.a {
      public static final Codec<cy.a> a = awe.b(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(awe.a(br.b, "player").forGetter(cy.a::a), awe.a(ki.e.r(), "block").forGetter(cy.a::b), awe.a(db.a, "state").forGetter(cy.a::c))
                  .apply($$0, cy.a::new)
         ),
         cy.a::a
      );

      private static DataResult<cy.a> a(cy.a $$0) {
         return $$0.c
            .<DataResult<cy.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dac)$$1.a()).n())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static an<cy.a> a(dac $$0) {
         return am.K.a(new cy.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
      }

      public boolean a(dnb $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<il<dac>> b() {
         return this.c;
      }

      public Optional<db> c() {
         return this.d;
      }
   }
}
