import java.util.List;
import java.util.UUID;

public record adr(List<UUID> b) implements yw<abl> {
   public static final yn<vl, adr> a = yw.a(adr::a, adr::new);

   private adr(vl $$0) {
      this($$0.a(kl.g));
   }

   private void a(vl $$0) {
      $$0.a(this.b, kl.g);
   }

   @Override
   public yy<adr> a() {
      return agd.ae;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }
}
