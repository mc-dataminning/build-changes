import java.util.Optional;
import java.util.UUID;

public record aab(Optional<UUID> b) implements zp<zv> {
   public static final zg<wf, aab> a = zp.a(aab::a, aab::new);

   private aab(wf $$0) {
      this($$0.b(kk.g));
   }

   private void a(wf $$0) {
      $$0.a(this.b, kk.g);
   }

   @Override
   public zr<aab> a() {
      return aah.f;
   }

   public void a(zv $$0) {
      $$0.a(this);
   }
}
