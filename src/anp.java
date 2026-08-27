import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface anp extends ans {
   Set<String> a();

   List<ann> a(aeu var1);

   Map<aeu, ann> b(String var1, Predicate<aeu> var2);

   Map<aeu, List<ann>> c(String var1, Predicate<aeu> var2);

   Stream<amd> b();

   public static enum a implements anp {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<ann> getResource(aeu $$0) {
         return Optional.empty();
      }

      @Override
      public List<ann> a(aeu $$0) {
         return List.of();
      }

      @Override
      public Map<aeu, ann> b(String $$0, Predicate<aeu> $$1) {
         return Map.of();
      }

      @Override
      public Map<aeu, List<ann>> c(String $$0, Predicate<aeu> $$1) {
         return Map.of();
      }

      @Override
      public Stream<amd> b() {
         return Stream.of();
      }
   }
}
