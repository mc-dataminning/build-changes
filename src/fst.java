import java.util.Map;
import java.util.stream.Collectors;

public class fst implements AutoCloseable {
   public static final int a = fsq.F().stream().mapToInt(fsq::G).sum();
   private final Map<fsq, eoy> b = fsq.F().stream().collect(Collectors.toMap($$0 -> (fsq)$$0, $$0 -> new eoy($$0.G())));

   public eoy a(fsq $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(eoy::g);
   }

   public void b() {
      this.b.values().forEach(eoy::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(eoy::i);
   }
}
