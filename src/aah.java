import java.util.Optional;
import java.util.UUID;

public record aah(Optional<UUID> b) implements zw<aac> {
   public static final zn<wm, aah> a = zw.a(aah::a, aah::new);

   private aah(wm $$0) {
      this($$0.b(kc.g));
   }

   private void a(wm $$0) {
      $$0.a(this.b, kc.g);
   }

   @Override
   public zy<aah> a() {
      return aam.e;
   }

   public void a(aac $$0) {
      $$0.a(this);
   }
}
