import java.util.Map;
import java.util.stream.Collectors;

public class frf implements AutoCloseable {
   public static final int a = frc.F().stream().mapToInt(frc::G).sum();
   private final Map<frc, enr> b = frc.F().stream().collect(Collectors.toMap($$0 -> (frc)$$0, $$0 -> new enr($$0.G())));

   public enr a(frc $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.b.values().forEach(enr::g);
   }

   public void b() {
      this.b.values().forEach(enr::h);
   }

   @Override
   public void close() {
      this.b.values().forEach(enr::i);
   }
}
