import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface anv extends any {
   Set<String> a();

   List<ant> a(aey var1);

   Map<aey, ant> b(String var1, Predicate<aey> var2);

   Map<aey, List<ant>> c(String var1, Predicate<aey> var2);

   Stream<amj> b();

   public static enum a implements anv {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<ant> getResource(aey $$0) {
         return Optional.empty();
      }

      @Override
      public List<ant> a(aey $$0) {
         return List.of();
      }

      @Override
      public Map<aey, ant> b(String $$0, Predicate<aey> $$1) {
         return Map.of();
      }

      @Override
      public Map<aey, List<ant>> c(String $$0, Predicate<aey> $$1) {
         return Map.of();
      }

      @Override
      public Stream<amj> b() {
         return Stream.of();
      }
   }
}
