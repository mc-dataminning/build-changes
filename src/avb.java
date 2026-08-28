import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface avb extends ave {
   Set<String> a();

   List<auz> a(ali var1);

   Map<ali, auz> b(String var1, Predicate<ali> var2);

   Map<ali, List<auz>> c(String var1, Predicate<ali> var2);

   Stream<atm> b();

   public static enum a implements avb {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<auz> getResource(ali $$0) {
         return Optional.empty();
      }

      @Override
      public List<auz> a(ali $$0) {
         return List.of();
      }

      @Override
      public Map<ali, auz> b(String $$0, Predicate<ali> $$1) {
         return Map.of();
      }

      @Override
      public Map<ali, List<auz>> c(String $$0, Predicate<ali> $$1) {
         return Map.of();
      }

      @Override
      public Stream<atm> b() {
         return Stream.of();
      }
   }
}
