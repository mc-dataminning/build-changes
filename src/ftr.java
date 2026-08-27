import java.util.Map;
import java.util.stream.Collectors;

public class ftr implements AutoCloseable {
   public static final int a = fto.F().stream().mapToInt(fto::G).sum();
   private final Map<fto, epv> b = fto.F().stream().collect(Collectors.toMap($$0 -> (fto)$$0, $$0 -> new epv($$0.G())));

   public epv a(fto $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(epv::g);
   }

   public void b() {
      this.b.values().forEach(epv::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(epv::i);
   }
}
