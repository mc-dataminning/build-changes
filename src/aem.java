import java.util.List;
import java.util.UUID;

public record aem(List<UUID> b) implements zv<ach> {
   public static final zm<wl, aem> a = zv.a(aem::a, aem::new);

   private aem(wl $$0) {
      this($$0.a(kc.g));
   }

   private void a(wl $$0) {
      $$0.a(this.b, kc.g);
   }

   @Override
   public zx<aem> a() {
      return agt.ae;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }
}
