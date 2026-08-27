import java.util.UUID;

public record adh(String a, UUID b) implements ux<adf> {
   public adh(si $$0) {
      this($$0.d(16), $$0.o());
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a, 16);
      $$0.a(this.b);
   }

   public void a(adf $$0) {
      $$0.a(this);
   }

   public UUID d() {
      return this.b;
   }
}
