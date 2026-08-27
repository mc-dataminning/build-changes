import java.util.List;
import java.util.UUID;

public record aag(List<UUID> a) implements wk<yd> {
   public aag(tu $$0) {
      this($$0.a(tu::p));
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a, tu::a);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }
}
