import java.util.UUID;

public record aew(String a, UUID b) implements wk<aeu> {
   public aew(tu $$0) {
      this($$0.d(16), $$0.p());
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a, 16);
      $$0.a(this.b);
   }

   public void a(aeu $$0) {
      $$0.a(this);
   }

   public UUID d() {
      return this.b;
   }
}
