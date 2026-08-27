import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface apl extends apo {
   Set<String> a();

   List<apj> a(agm var1);

   Map<agm, apj> b(String var1, Predicate<agm> var2);

   Map<agm, List<apj>> c(String var1, Predicate<agm> var2);

   Stream<anz> b();

   public static enum a implements apl {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<apj> getResource(agm $$0) {
         return Optional.empty();
      }

      @Override
      public List<apj> a(agm $$0) {
         return List.of();
      }

      @Override
      public Map<agm, apj> b(String $$0, Predicate<agm> $$1) {
         return Map.of();
      }

      @Override
      public Map<agm, List<apj>> c(String $$0, Predicate<agm> $$1) {
         return Map.of();
      }

      @Override
      public Stream<anz> b() {
         return Stream.of();
      }
   }
}
