import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cy extends ds<cy.a> {
   @Override
   public Codec<cy.a> a() {
      return cy.a.a;
   }

   public void a(aql $$0, evz $$1, int $$2) {
      this.a($$0, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public static record a(Optional<bf> b, Optional<bl> c, de.d d) implements ds.a {
      public static final Codec<cy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(cy.a::a),
                  bl.a.optionalFieldOf("distance").forGetter(cy.a::b),
                  de.d.d.optionalFieldOf("duration", de.d.c).forGetter(cy.a::c)
               )
               .apply($$0, cy.a::new)
      );

      public static an<cy.a> a(bl $$0) {
         return am.v.a(new cy.a(Optional.empty(), Optional.of($$0), de.d.c));
      }

      public boolean a(aql $$0, evz $$1, int $$2) {
         return this.c.isPresent() && !this.c.get().a($$1.c, $$1.d, $$1.e, $$0.du(), $$0.dw(), $$0.dA()) ? false : this.d.d($$2);
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<bl> b() {
         return this.c;
      }

      public de.d c() {
         return this.d;
      }
   }
}
