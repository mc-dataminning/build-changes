import java.util.List;
import java.util.UUID;

public record acn(List<UUID> b) implements xz<aai> {
   public static final xq<us, acn> a = xz.a(acn::a, acn::new);

   private acn(us $$0) {
      this($$0.a(je.g));
   }

   private void a(us $$0) {
      $$0.a(this.b, je.g);
   }

   @Override
   public yb<acn> a() {
      return aet.ae;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }
}
