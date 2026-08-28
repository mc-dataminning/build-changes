import java.util.Optional;
import java.util.UUID;

public record aac(Optional<UUID> b) implements zq<zw> {
   public static final zh<wg, aac> a = zq.a(aac::a, aac::new);

   private aac(wg $$0) {
      this($$0.b(kk.g));
   }

   private void a(wg $$0) {
      $$0.a(this.b, kk.g);
   }

   @Override
   public zs<aac> a() {
      return aai.f;
   }

   public void a(zw $$0) {
      $$0.a(this);
   }
}
