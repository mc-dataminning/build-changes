import java.util.List;
import java.util.UUID;

public record aba(List<UUID> a) implements xd<yx> {
   public aba(ug $$0) {
      this($$0.a(ug::p));
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a, ug::a);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }
}
