import java.util.UUID;

public record adf(String a, UUID b) implements uw<add> {
   public adf(sh $$0) {
      this($$0.d(16), $$0.o());
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a, 16);
      $$0.a(this.b);
   }

   public void a(add $$0) {
      $$0.a(this);
   }

   public UUID d() {
      return this.b;
   }
}
