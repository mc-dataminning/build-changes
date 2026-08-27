import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cy extends de<cy.a> {
   @Override
   public Codec<cy.a> a() {
      return cy.a.a;
   }

   public void a(aqi $$0, csz $$1, brh $$2) {
      eol $$3 = br.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$1, $$3));
   }

   public static record a(Optional<bc> b, Optional<ch> c, Optional<bc> d) implements de.a {
      public static final Codec<cy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(cy.a::a), axh.a(ch.a, "item").forGetter(cy.a::b), axh.a(br.b, "entity").forGetter(cy.a::c))
               .apply($$0, cy.a::new)
      );

      public static an<cy.a> a(Optional<bc> $$0, ch.a $$1, Optional<bc> $$2) {
         return am.T.a(new cy.a($$0, Optional.of($$1.b()), $$2));
      }

      public static an<cy.a> a(ch.a $$0, Optional<bc> $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public boolean a(csz $$0, eol $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.isEmpty() || this.d.get().a($$1);
      }

      @Override
      public void a(bd $$0) {
         de.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<ch> b() {
         return this.c;
      }

      public Optional<bc> c() {
         return this.d;
      }
   }
}
