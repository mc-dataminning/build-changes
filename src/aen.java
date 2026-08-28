import java.util.List;
import java.util.UUID;

public record aen(List<UUID> b) implements zs<ach> {
   public static final zj<wi, aen> a = zs.a(aen::a, aen::new);

   private aen(wi $$0) {
      this($$0.a(kk.g));
   }

   private void a(wi $$0) {
      $$0.a(this.b, kk.g);
   }

   @Override
   public zu<aen> a() {
      return agw.af;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }
}
