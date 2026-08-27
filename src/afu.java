import java.util.UUID;

public record afu(String a, UUID b) implements xf<afs> {
   public afu(ui $$0) {
      this($$0.d(16), $$0.p());
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a, 16);
      $$0.a(this.b);
   }

   public void a(afs $$0) {
      $$0.a(this);
   }

   public UUID d() {
      return this.b;
   }
}
