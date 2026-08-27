import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cy extends cv<cy.a> {
   @Override
   public Codec<cy.a> a() {
      return cy.a.a;
   }

   public void a(amq $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bb> b) implements cv.a {
      public static final Codec<cy.a> a = RecordCodecBuilder.create($$0 -> $$0.group(atg.a(bp.b, "player").forGetter(cy.a::a)).apply($$0, cy.a::new));

      public static an<cy.a> a(bp.a $$0) {
         return am.S.a(new cy.a(Optional.of(bp.a($$0))));
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }
   }
}
