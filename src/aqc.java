import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface aqc extends aqf {
   Set<String> a();

   List<aqa> a(ahd var1);

   Map<ahd, aqa> b(String var1, Predicate<ahd> var2);

   Map<ahd, List<aqa>> c(String var1, Predicate<ahd> var2);

   Stream<aoq> b();

   public static enum a implements aqc {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<aqa> getResource(ahd $$0) {
         return Optional.empty();
      }

      @Override
      public List<aqa> a(ahd $$0) {
         return List.of();
      }

      @Override
      public Map<ahd, aqa> b(String $$0, Predicate<ahd> $$1) {
         return Map.of();
      }

      @Override
      public Map<ahd, List<aqa>> c(String $$0, Predicate<ahd> $$1) {
         return Map.of();
      }

      @Override
      public Stream<aoq> b() {
         return Stream.of();
      }
   }
}
