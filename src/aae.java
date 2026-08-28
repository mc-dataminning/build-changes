import java.util.Optional;
import java.util.UUID;

public record aae(Optional<UUID> b) implements zs<zy> {
   public static final zj<wi, aae> a = zs.a(aae::a, aae::new);

   private aae(wi $$0) {
      this($$0.b(kk.g));
   }

   private void a(wi $$0) {
      $$0.a(this.b, kk.g);
   }

   @Override
   public zu<aae> a() {
      return aak.f;
   }

   public void a(zy $$0) {
      $$0.a(this);
   }
}
