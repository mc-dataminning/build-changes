import java.util.List;
import java.util.UUID;

public record aen(List<UUID> b) implements zw<aci> {
   public static final zn<wm, aen> a = zw.a(aen::a, aen::new);

   private aen(wm $$0) {
      this($$0.a(kc.g));
   }

   private void a(wm $$0) {
      $$0.a(this.b, kc.g);
   }

   @Override
   public zy<aen> a() {
      return agu.ae;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }
}
