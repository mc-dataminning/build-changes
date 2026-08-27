import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface ate extends ath {
   Set<String> a();

   List<atc> a(ajv var1);

   Map<ajv, atc> b(String var1, Predicate<ajv> var2);

   Map<ajv, List<atc>> c(String var1, Predicate<ajv> var2);

   Stream<arq> b();

   public static enum a implements ate {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<atc> getResource(ajv $$0) {
         return Optional.empty();
      }

      @Override
      public List<atc> a(ajv $$0) {
         return List.of();
      }

      @Override
      public Map<ajv, atc> b(String $$0, Predicate<ajv> $$1) {
         return Map.of();
      }

      @Override
      public Map<ajv, List<atc>> c(String $$0, Predicate<ajv> $$1) {
         return Map.of();
      }

      @Override
      public Stream<arq> b() {
         return Stream.of();
      }
   }
}
