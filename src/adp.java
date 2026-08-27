import java.util.List;
import java.util.UUID;

public record adp(List<UUID> b) implements yz<abk> {
   public static final yq<vs, adp> a = yz.a(adp::a, adp::new);

   private adp(vs $$0) {
      this($$0.a(jp.g));
   }

   private void a(vs $$0) {
      $$0.a(this.b, jp.g);
   }

   @Override
   public zb<adp> a() {
      return afv.ae;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }
}
