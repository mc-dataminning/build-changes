import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface apd extends apg {
   Set<String> a();

   List<apb> a(agg var1);

   Map<agg, apb> b(String var1, Predicate<agg> var2);

   Map<agg, List<apb>> c(String var1, Predicate<agg> var2);

   Stream<anr> b();

   public static enum a implements apd {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<apb> getResource(agg $$0) {
         return Optional.empty();
      }

      @Override
      public List<apb> a(agg $$0) {
         return List.of();
      }

      @Override
      public Map<agg, apb> b(String $$0, Predicate<agg> $$1) {
         return Map.of();
      }

      @Override
      public Map<agg, List<apb>> c(String $$0, Predicate<agg> $$1) {
         return Map.of();
      }

      @Override
      public Stream<anr> b() {
         return Stream.of();
      }
   }
}
