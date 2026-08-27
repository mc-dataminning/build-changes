import java.util.List;
import java.util.UUID;

public record acr(List<UUID> b) implements yb<aam> {
   public static final xs<uu, acr> a = yb.a(acr::a, acr::new);

   private acr(uu $$0) {
      this($$0.a(jf.g));
   }

   private void a(uu $$0) {
      $$0.a(this.b, jf.g);
   }

   @Override
   public yd<acr> a() {
      return aex.ae;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }
}
