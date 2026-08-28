import java.util.UUID;
import javax.annotation.Nullable;

public class ais implements zp<agv> {
   public static final zg<wf, ais> a = zp.a(ais::a, ais::new);
   private final UUID b;

   public ais(UUID $$0) {
      this.b = $$0;
   }

   private ais(wf $$0) {
      this.b = $$0.n();
   }

   private void a(wf $$0) {
      $$0.a(this.b);
   }

   @Override
   public zr<ais> a() {
      return agt.ce;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   @Nullable
   public bue a(arn $$0) {
      return $$0.a(this.b);
   }
}
