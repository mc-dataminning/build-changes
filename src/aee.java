import java.util.List;
import java.util.UUID;

public record aee(List<UUID> b) implements zj<aby> {
   public static final za<vy, aee> a = zj.a(aee::a, aee::new);

   private aee(vy $$0) {
      this($$0.a(ka.g));
   }

   private void a(vy $$0) {
      $$0.a(this.b, ka.g);
   }

   @Override
   public zl<aee> a() {
      return agr.af;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }
}
