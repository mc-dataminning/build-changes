import java.util.Map;
import java.util.stream.Collectors;

public class fok {
   private final Map<foh, elf> a = foh.G().stream().collect(Collectors.toMap($$0 -> (foh)$$0, $$0 -> new elf($$0.H())));

   public elf a(foh $$0) {
      return this.a.get($$0);
   }

   public void a() {
      this.a.values().forEach(elf::g);
   }

   public void b() {
      this.a.values().forEach(elf::h);
   }
}
