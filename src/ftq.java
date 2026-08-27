import java.util.Map;
import java.util.stream.Collectors;

public class ftq implements AutoCloseable {
   public static final int a = ftn.F().stream().mapToInt(ftn::G).sum();
   private final Map<ftn, epu> b = ftn.F().stream().collect(Collectors.toMap($$0 -> (ftn)$$0, $$0 -> new epu($$0.G())));

   public epu a(ftn $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(epu::g);
   }

   public void b() {
      this.b.values().forEach(epu::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(epu::i);
   }
}
