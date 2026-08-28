import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface atw extends atz {
   Set<String> a();

   List<atu> a(akk var1);

   Map<akk, atu> b(String var1, Predicate<akk> var2);

   Map<akk, List<atu>> c(String var1, Predicate<akk> var2);

   Stream<asi> b();

   public static enum a implements atw {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<atu> getResource(akk $$0) {
         return Optional.empty();
      }

      @Override
      public List<atu> a(akk $$0) {
         return List.of();
      }

      @Override
      public Map<akk, atu> b(String $$0, Predicate<akk> $$1) {
         return Map.of();
      }

      @Override
      public Map<akk, List<atu>> c(String $$0, Predicate<akk> $$1) {
         return Map.of();
      }

      @Override
      public Stream<asi> b() {
         return Stream.of();
      }
   }
}
