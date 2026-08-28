import java.util.List;
import java.util.UUID;

public record ads(List<UUID> b) implements yw<abl> {
   public static final yn<vl, ads> a = yw.a(ads::a, ads::new);

   private ads(vl $$0) {
      this($$0.a(kl.g));
   }

   private void a(vl $$0) {
      $$0.a(this.b, kl.g);
   }

   @Override
   public yy<ads> a() {
      return age.af;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }
}
