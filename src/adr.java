import java.util.List;
import java.util.UUID;

public record adr(List<UUID> b) implements zb<abm> {
   public static final ys<vu, adr> a = zb.a(adr::a, adr::new);

   private adr(vu $$0) {
      this($$0.a(jq.g));
   }

   private void a(vu $$0) {
      $$0.a(this.b, jq.g);
   }

   @Override
   public zd<adr> a() {
      return afx.ae;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }
}
