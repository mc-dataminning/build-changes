import java.util.List;
import java.util.UUID;

public record aea(List<UUID> b) implements zf<abu> {
   public static final yw<vu, aea> a = zf.a(aea::a, aea::new);

   private aea(vu $$0) {
      this($$0.a(jz.g));
   }

   private void a(vu $$0) {
      $$0.a(this.b, jz.g);
   }

   @Override
   public zh<aea> a() {
      return agn.af;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }
}
