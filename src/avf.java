import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface avf extends avi {
   Set<String> a();

   List<avd> a(ali var1);

   Map<ali, avd> b(String var1, Predicate<ali> var2);

   Map<ali, List<avd>> c(String var1, Predicate<ali> var2);

   Stream<atr> b();

   public static enum a implements avf {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<avd> getResource(ali $$0) {
         return Optional.empty();
      }

      @Override
      public List<avd> a(ali $$0) {
         return List.of();
      }

      @Override
      public Map<ali, avd> b(String $$0, Predicate<ali> $$1) {
         return Map.of();
      }

      @Override
      public Map<ali, List<avd>> c(String $$0, Predicate<ali> $$1) {
         return Map.of();
      }

      @Override
      public Stream<atr> b() {
         return Stream.of();
      }
   }
}
