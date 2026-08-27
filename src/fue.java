import java.util.Map;
import java.util.stream.Collectors;

public class fue implements AutoCloseable {
   public static final int a = fub.F().stream().mapToInt(fub::G).sum();
   private final Map<fub, eqf> b = fub.F().stream().collect(Collectors.toMap($$0 -> (fub)$$0, $$0 -> new eqf($$0.G())));

   public eqf a(fub $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(eqf::g);
   }

   public void b() {
      this.b.values().forEach(eqf::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(eqf::i);
   }
}
