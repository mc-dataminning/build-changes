import java.util.Optional;
import java.util.UUID;

public record aag(Optional<UUID> b) implements zv<aab> {
   public static final zm<wl, aag> a = zv.a(aag::a, aag::new);

   private aag(wl $$0) {
      this($$0.b(kc.g));
   }

   private void a(wl $$0) {
      $$0.a(this.b, kc.g);
   }

   @Override
   public zx<aag> a() {
      return aal.e;
   }

   public void a(aab $$0) {
      $$0.a(this);
   }
}
