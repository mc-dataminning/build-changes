import java.util.UUID;

public record aek(String a, UUID b) implements wb<aei> {
   public aek(tl $$0) {
      this($$0.d(16), $$0.p());
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a, 16);
      $$0.a(this.b);
   }

   public void a(aei $$0) {
      $$0.a(this);
   }

   public UUID d() {
      return this.b;
   }
}
