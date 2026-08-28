import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface aup extends aus {
   Set<String> a();

   List<aun> a(akv var1);

   Map<akv, aun> b(String var1, Predicate<akv> var2);

   Map<akv, List<aun>> c(String var1, Predicate<akv> var2);

   Stream<atc> b();

   public static enum a implements aup {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<aun> getResource(akv $$0) {
         return Optional.empty();
      }

      @Override
      public List<aun> a(akv $$0) {
         return List.of();
      }

      @Override
      public Map<akv, aun> b(String $$0, Predicate<akv> $$1) {
         return Map.of();
      }

      @Override
      public Map<akv, List<aun>> c(String $$0, Predicate<akv> $$1) {
         return Map.of();
      }

      @Override
      public Stream<atc> b() {
         return Stream.of();
      }
   }
}
