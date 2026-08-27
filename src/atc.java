import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface atc extends atf {
   Set<String> a();

   List<ata> a(ajt var1);

   Map<ajt, ata> b(String var1, Predicate<ajt> var2);

   Map<ajt, List<ata>> c(String var1, Predicate<ajt> var2);

   Stream<aro> b();

   public static enum a implements atc {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<ata> getResource(ajt $$0) {
         return Optional.empty();
      }

      @Override
      public List<ata> a(ajt $$0) {
         return List.of();
      }

      @Override
      public Map<ajt, ata> b(String $$0, Predicate<ajt> $$1) {
         return Map.of();
      }

      @Override
      public Map<ajt, List<ata>> c(String $$0, Predicate<ajt> $$1) {
         return Map.of();
      }

      @Override
      public Stream<aro> b() {
         return Stream.of();
      }
   }
}
