import java.util.List;
import java.util.UUID;

public record ads(List<UUID> b) implements zb<abn> {
   public static final ys<vr, ads> a = zb.a(ads::a, ads::new);

   private ads(vr $$0) {
      this($$0.a(kd.g));
   }

   private void a(vr $$0) {
      $$0.a(this.b, kd.g);
   }

   @Override
   public zd<ads> a() {
      return afz.ae;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }
}
