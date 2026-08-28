import java.util.Optional;
import java.util.UUID;

public record aad(Optional<UUID> b) implements zr<zx> {
   public static final zi<wh, aad> a = zr.a(aad::a, aad::new);

   private aad(wh $$0) {
      this($$0.b(kk.g));
   }

   private void a(wh $$0) {
      $$0.a(this.b, kk.g);
   }

   @Override
   public zt<aad> a() {
      return aaj.f;
   }

   public void a(zx $$0) {
      $$0.a(this);
   }
}
