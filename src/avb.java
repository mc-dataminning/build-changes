import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface avb extends ave {
   Set<String> a();

   List<auz> a(ale var1);

   Map<ale, auz> b(String var1, Predicate<ale> var2);

   Map<ale, List<auz>> c(String var1, Predicate<ale> var2);

   Stream<atn> b();

   public static enum a implements avb {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<auz> getResource(ale $$0) {
         return Optional.empty();
      }

      @Override
      public List<auz> a(ale $$0) {
         return List.of();
      }

      @Override
      public Map<ale, auz> b(String $$0, Predicate<ale> $$1) {
         return Map.of();
      }

      @Override
      public Map<ale, List<auz>> c(String $$0, Predicate<ale> $$1) {
         return Map.of();
      }

      @Override
      public Stream<atn> b() {
         return Stream.of();
      }
   }
}
