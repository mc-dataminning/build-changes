import java.util.List;
import java.util.UUID;

public record adz(List<UUID> b) implements zg<abu> {
   public static final yx<vw, adz> a = zg.a(adz::a, adz::new);

   private adz(vw $$0) {
      this($$0.a(kg.g));
   }

   private void a(vw $$0) {
      $$0.a(this.b, kg.g);
   }

   @Override
   public zi<adz> a() {
      return agg.ae;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }
}
