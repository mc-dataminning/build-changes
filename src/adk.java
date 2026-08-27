import java.util.UUID;

public record adk(String a, UUID b) implements va<adi> {
   public adk(sl $$0) {
      this($$0.d(16), $$0.o());
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a, 16);
      $$0.a(this.b);
   }

   public void a(adi $$0) {
      $$0.a(this);
   }

   public UUID d() {
      return this.b;
   }
}
