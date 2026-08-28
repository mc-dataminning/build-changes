import java.util.List;
import java.util.UUID;

public record aej(List<UUID> b) implements zs<ace> {
   public static final zj<wl, aej> a = zs.a(aej::a, aej::new);

   private aej(wl $$0) {
      this($$0.a(kc.g));
   }

   private void a(wl $$0) {
      $$0.a(this.b, kc.g);
   }

   @Override
   public zu<aej> a() {
      return agq.ae;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }
}
