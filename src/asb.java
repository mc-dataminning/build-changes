import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface asb extends ase {
   Set<String> a();

   List<arz> a(aiy var1);

   Map<aiy, arz> b(String var1, Predicate<aiy> var2);

   Map<aiy, List<arz>> c(String var1, Predicate<aiy> var2);

   Stream<aqp> b();

   public static enum a implements asb {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<arz> getResource(aiy $$0) {
         return Optional.empty();
      }

      @Override
      public List<arz> a(aiy $$0) {
         return List.of();
      }

      @Override
      public Map<aiy, arz> b(String $$0, Predicate<aiy> $$1) {
         return Map.of();
      }

      @Override
      public Map<aiy, List<arz>> c(String $$0, Predicate<aiy> $$1) {
         return Map.of();
      }

      @Override
      public Stream<aqp> b() {
         return Stream.of();
      }
   }
}
