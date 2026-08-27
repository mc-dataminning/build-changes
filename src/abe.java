import java.util.List;
import java.util.UUID;

public record abe(List<UUID> a) implements xg<zb> {
   public abe(uj $$0) {
      this($$0.a(uj::p));
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a, uj::a);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }
}
