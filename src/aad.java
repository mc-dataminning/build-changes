import java.util.Optional;
import java.util.UUID;

public record aad(Optional<UUID> b) implements zs<zy> {
   public static final zj<wl, aad> a = zs.a(aad::a, aad::new);

   private aad(wl $$0) {
      this($$0.b(kc.g));
   }

   private void a(wl $$0) {
      $$0.a(this.b, kc.g);
   }

   @Override
   public zu<aad> a() {
      return aai.e;
   }

   public void a(zy $$0) {
      $$0.a(this);
   }
}
