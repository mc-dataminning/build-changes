import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface ava extends avd {
   Set<String> a();

   List<auy> a(alh var1);

   Map<alh, auy> b(String var1, Predicate<alh> var2);

   Map<alh, List<auy>> c(String var1, Predicate<alh> var2);

   Stream<atl> b();

   public static enum a implements ava {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<auy> getResource(alh $$0) {
         return Optional.empty();
      }

      @Override
      public List<auy> a(alh $$0) {
         return List.of();
      }

      @Override
      public Map<alh, auy> b(String $$0, Predicate<alh> $$1) {
         return Map.of();
      }

      @Override
      public Map<alh, List<auy>> c(String $$0, Predicate<alh> $$1) {
         return Map.of();
      }

      @Override
      public Stream<atl> b() {
         return Stream.of();
      }
   }
}
