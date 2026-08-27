import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface atr extends atu {
   Set<String> a();

   List<atp> a(akh var1);

   Map<akh, atp> b(String var1, Predicate<akh> var2);

   Map<akh, List<atp>> c(String var1, Predicate<akh> var2);

   Stream<asd> b();

   public static enum a implements atr {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<atp> getResource(akh $$0) {
         return Optional.empty();
      }

      @Override
      public List<atp> a(akh $$0) {
         return List.of();
      }

      @Override
      public Map<akh, atp> b(String $$0, Predicate<akh> $$1) {
         return Map.of();
      }

      @Override
      public Map<akh, List<atp>> c(String $$0, Predicate<akh> $$1) {
         return Map.of();
      }

      @Override
      public Stream<asd> b() {
         return Stream.of();
      }
   }
}
