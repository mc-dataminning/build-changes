import java.util.Map;
import java.util.stream.Collectors;

public class fqs implements AutoCloseable {
   public static final int a = fqp.F().stream().mapToInt(fqp::G).sum();
   private final Map<fqp, enf> b = fqp.F().stream().collect(Collectors.toMap($$0 -> (fqp)$$0, $$0 -> new enf($$0.G())));

   public enf a(fqp $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(enf::g);
   }

   public void b() {
      this.b.values().forEach(enf::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(enf::i);
   }
}
