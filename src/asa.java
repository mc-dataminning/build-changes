import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface asa extends asd {
   Set<String> a();

   List<ary> a(aiy var1);

   Map<aiy, ary> b(String var1, Predicate<aiy> var2);

   Map<aiy, List<ary>> c(String var1, Predicate<aiy> var2);

   Stream<aqo> b();

   public static enum a implements asa {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<ary> getResource(aiy $$0) {
         return Optional.empty();
      }

      @Override
      public List<ary> a(aiy $$0) {
         return List.of();
      }

      @Override
      public Map<aiy, ary> b(String $$0, Predicate<aiy> $$1) {
         return Map.of();
      }

      @Override
      public Map<aiy, List<ary>> c(String $$0, Predicate<aiy> $$1) {
         return Map.of();
      }

      @Override
      public Stream<aqo> b() {
         return Stream.of();
      }
   }
}
