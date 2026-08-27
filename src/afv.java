import java.util.UUID;

public record afv(String a, UUID b) implements xg<aft> {
   public afv(uj $$0) {
      this($$0.d(16), $$0.p());
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a, 16);
      $$0.a(this.b);
   }

   public void a(aft $$0) {
      $$0.a(this);
   }

   public UUID d() {
      return this.b;
   }
}
