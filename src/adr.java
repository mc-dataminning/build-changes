import java.util.List;
import java.util.UUID;

public record adr(List<UUID> b) implements yv<abk> {
   public static final ym<vl, adr> a = yv.a(adr::a, adr::new);

   private adr(vl $$0) {
      this($$0.a(kl.g));
   }

   private void a(vl $$0) {
      $$0.a(this.b, kl.g);
   }

   @Override
   public yx<adr> a() {
      return agd.af;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }
}
