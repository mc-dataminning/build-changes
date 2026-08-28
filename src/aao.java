import java.util.Optional;
import java.util.UUID;

public record aao(Optional<UUID> b) implements aac<aai> {
   public static final zt<ws, aao> a = aac.a(aao::a, aao::new);

   private aao(ws $$0) {
      this($$0.b(kk.g));
   }

   private void a(ws $$0) {
      $$0.a(this.b, kk.g);
   }

   @Override
   public aae<aao> a() {
      return aau.f;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }
}
