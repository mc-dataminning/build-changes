import java.util.UUID;

public record adm(String a, UUID b) implements vd<adk> {
   public adm(so $$0) {
      this($$0.d(16), $$0.o());
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, 16);
      $$0.a(this.b);
   }

   public void a(adk $$0) {
      $$0.a(this);
   }

   public UUID d() {
      return this.b;
   }
}
