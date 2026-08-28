import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface avd extends avg {
   Set<String> a();

   List<avb> a(alj var1);

   Map<alj, avb> b(String var1, Predicate<alj> var2);

   Map<alj, List<avb>> c(String var1, Predicate<alj> var2);

   Stream<ato> b();

   public static enum a implements avd {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<avb> getResource(alj $$0) {
         return Optional.empty();
      }

      @Override
      public List<avb> a(alj $$0) {
         return List.of();
      }

      @Override
      public Map<alj, avb> b(String $$0, Predicate<alj> $$1) {
         return Map.of();
      }

      @Override
      public Map<alj, List<avb>> c(String $$0, Predicate<alj> $$1) {
         return Map.of();
      }

      @Override
      public Stream<ato> b() {
         return Stream.of();
      }
   }
}
