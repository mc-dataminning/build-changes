import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface avd extends avg {
   Set<String> a();

   List<avb> a(alg var1);

   Map<alg, avb> b(String var1, Predicate<alg> var2);

   Map<alg, List<avb>> c(String var1, Predicate<alg> var2);

   Stream<atp> b();

   public static enum a implements avd {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<avb> getResource(alg $$0) {
         return Optional.empty();
      }

      @Override
      public List<avb> a(alg $$0) {
         return List.of();
      }

      @Override
      public Map<alg, avb> b(String $$0, Predicate<alg> $$1) {
         return Map.of();
      }

      @Override
      public Map<alg, List<avb>> c(String $$0, Predicate<alg> $$1) {
         return Map.of();
      }

      @Override
      public Stream<atp> b() {
         return Stream.of();
      }
   }
}
