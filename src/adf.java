import java.util.List;
import java.util.UUID;

public record adf(List<UUID> b) implements yp<aba> {
   public static final yg<vi, adf> a = yp.a(adf::a, adf::new);

   private adf(vi $$0) {
      this($$0.a(jh.g));
   }

   private void a(vi $$0) {
      $$0.a(this.b, jh.g);
   }

   @Override
   public yr<adf> a() {
      return afl.ae;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }
}
