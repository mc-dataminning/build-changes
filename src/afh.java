import java.util.UUID;

public record afh(String a, UUID b) implements wu<aff> {
   public afh(ue $$0) {
      this($$0.d(16), $$0.p());
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a, 16);
      $$0.a(this.b);
   }

   public void a(aff $$0) {
      $$0.a(this);
   }

   public UUID d() {
      return this.b;
   }
}
