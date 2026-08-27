import java.util.List;
import java.util.UUID;

public record aar(List<UUID> a) implements wu<yo> {
   public aar(ue $$0) {
      this($$0.a(ue::p));
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a, ue::a);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }
}
