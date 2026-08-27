import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface aps extends apv {
   Set<String> a();

   List<apq> a(agt var1);

   Map<agt, apq> b(String var1, Predicate<agt> var2);

   Map<agt, List<apq>> c(String var1, Predicate<agt> var2);

   Stream<aog> b();

   public static enum a implements aps {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<apq> getResource(agt $$0) {
         return Optional.empty();
      }

      @Override
      public List<apq> a(agt $$0) {
         return List.of();
      }

      @Override
      public Map<agt, apq> b(String $$0, Predicate<agt> $$1) {
         return Map.of();
      }

      @Override
      public Map<agt, List<apq>> c(String $$0, Predicate<agt> $$1) {
         return Map.of();
      }

      @Override
      public Stream<aog> b() {
         return Stream.of();
      }
   }
}
