import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface ava extends avd {
   Set<String> a();

   List<auy> a(ald var1);

   Map<ald, auy> b(String var1, Predicate<ald> var2);

   Map<ald, List<auy>> c(String var1, Predicate<ald> var2);

   Stream<atm> b();

   public static enum a implements ava {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<auy> getResource(ald $$0) {
         return Optional.empty();
      }

      @Override
      public List<auy> a(ald $$0) {
         return List.of();
      }

      @Override
      public Map<ald, auy> b(String $$0, Predicate<ald> $$1) {
         return Map.of();
      }

      @Override
      public Map<ald, List<auy>> c(String $$0, Predicate<ald> $$1) {
         return Map.of();
      }

      @Override
      public Stream<atm> b() {
         return Stream.of();
      }
   }
}
