import java.util.List;
import java.util.UUID;

public record ack(List<UUID> b) implements xx<aag> {
   public static final xo<uq, ack> a = xx.a(ack::a, ack::new);

   private ack(uq $$0) {
      this($$0.a(jc.f));
   }

   private void a(uq $$0) {
      $$0.a(this.b, jc.f);
   }

   @Override
   public xz<ack> a() {
      return aeq.ad;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }
}
