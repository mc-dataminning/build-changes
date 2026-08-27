import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface aso extends asr {
   Set<String> a();

   List<asm> a(ajh var1);

   Map<ajh, asm> b(String var1, Predicate<ajh> var2);

   Map<ajh, List<asm>> c(String var1, Predicate<ajh> var2);

   Stream<ara> b();

   public static enum a implements aso {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<asm> getResource(ajh $$0) {
         return Optional.empty();
      }

      @Override
      public List<asm> a(ajh $$0) {
         return List.of();
      }

      @Override
      public Map<ajh, asm> b(String $$0, Predicate<ajh> $$1) {
         return Map.of();
      }

      @Override
      public Map<ajh, List<asm>> c(String $$0, Predicate<ajh> $$1) {
         return Map.of();
      }

      @Override
      public Stream<ara> b() {
         return Stream.of();
      }
   }
}
