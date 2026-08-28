import java.util.Optional;
import java.util.UUID;

public record aac(Optional<UUID> b) implements zo<zw> {
   public static final ze<vy, aac> a = zo.a(aac::a, aac::new);

   private aac(vy $$0) {
      this($$0.b(ka.g));
   }

   private void a(vy $$0) {
      $$0.a(this.b, ka.g);
   }

   @Override
   public zq<aac> a() {
      return aai.f;
   }

   public void a(zw $$0) {
      $$0.a(this);
   }
}
