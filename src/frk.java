import java.util.Map;
import java.util.stream.Collectors;

public class frk implements AutoCloseable {
   public static final int a = frh.F().stream().mapToInt(frh::G).sum();
   private final Map<frh, enw> b = frh.F().stream().collect(Collectors.toMap($$0 -> (frh)$$0, $$0 -> new enw($$0.G())));

   public enw a(frh $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(enw::g);
   }

   public void b() {
      this.b.values().forEach(enw::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(enw::i);
   }
}
