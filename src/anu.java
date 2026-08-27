import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface anu extends anx {
   Set<String> a();

   List<ans> a(aex var1);

   Map<aex, ans> b(String var1, Predicate<aex> var2);

   Map<aex, List<ans>> c(String var1, Predicate<aex> var2);

   Stream<ami> b();

   public static enum a implements anu {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<ans> getResource(aex $$0) {
         return Optional.empty();
      }

      @Override
      public List<ans> a(aex $$0) {
         return List.of();
      }

      @Override
      public Map<aex, ans> b(String $$0, Predicate<aex> $$1) {
         return Map.of();
      }

      @Override
      public Map<aex, List<ans>> c(String $$0, Predicate<aex> $$1) {
         return Map.of();
      }

      @Override
      public Stream<ami> b() {
         return Stream.of();
      }
   }
}
