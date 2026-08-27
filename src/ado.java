import java.util.UUID;

public record ado(String a, UUID b) implements vf<adm> {
   public ado(sq $$0) {
      this($$0.d(16), $$0.o());
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a, 16);
      $$0.a(this.b);
   }

   public void a(adm $$0) {
      $$0.a(this);
   }

   public UUID d() {
      return this.b;
   }
}
