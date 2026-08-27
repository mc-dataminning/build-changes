import java.util.Optional;
import java.util.UUID;

public record abm(String a, Optional<UUID> b) implements uo<abk> {
   public abm(sf $$0) {
      this($$0.e(16), $$0.b(sf::o));
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a, 16);
      $$0.a(this.b, sf::a);
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public Optional<UUID> c() {
      return this.b;
   }
}
