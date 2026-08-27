import java.util.UUID;

public record afa(String a, UUID b) implements wo<aey> {
   public afa(ty $$0) {
      this($$0.d(16), $$0.p());
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a, 16);
      $$0.a(this.b);
   }

   public void a(aey $$0) {
      $$0.a(this);
   }

   public UUID d() {
      return this.b;
   }
}
