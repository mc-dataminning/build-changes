import java.util.Map;
import java.util.stream.Collectors;

public class ftk implements AutoCloseable {
   public static final int a = fth.F().stream().mapToInt(fth::G).sum();
   private final Map<fth, epo> b = fth.F().stream().collect(Collectors.toMap($$0 -> (fth)$$0, $$0 -> new epo($$0.G())));

   public epo a(fth $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(epo::g);
   }

   public void b() {
      this.b.values().forEach(epo::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(epo::i);
   }
}
