import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface ant extends anw {
   Set<String> a();

   List<anr> a(aew var1);

   Map<aew, anr> b(String var1, Predicate<aew> var2);

   Map<aew, List<anr>> c(String var1, Predicate<aew> var2);

   Stream<amh> b();

   public static enum a implements ant {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<anr> getResource(aew $$0) {
         return Optional.empty();
      }

      @Override
      public List<anr> a(aew $$0) {
         return List.of();
      }

      @Override
      public Map<aew, anr> b(String $$0, Predicate<aew> $$1) {
         return Map.of();
      }

      @Override
      public Map<aew, List<anr>> c(String $$0, Predicate<aew> $$1) {
         return Map.of();
      }

      @Override
      public Stream<amh> b() {
         return Stream.of();
      }
   }
}
