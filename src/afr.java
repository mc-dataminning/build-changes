import java.util.UUID;

public record afr(String a, UUID b) implements xd<afp> {
   public afr(ug $$0) {
      this($$0.d(16), $$0.p());
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a, 16);
      $$0.a(this.b);
   }

   public void a(afp $$0) {
      $$0.a(this);
   }

   public UUID d() {
      return this.b;
   }
}
