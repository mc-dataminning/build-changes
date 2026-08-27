import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface akx extends ala {
   Set<String> a();

   List<akv> a(acq var1);

   Map<acq, akv> b(String var1, Predicate<acq> var2);

   Map<acq, List<akv>> c(String var1, Predicate<acq> var2);

   Stream<ajl> b();

   public static enum a implements akx {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<akv> getResource(acq $$0) {
         return Optional.empty();
      }

      @Override
      public List<akv> a(acq $$0) {
         return List.of();
      }

      @Override
      public Map<acq, akv> b(String $$0, Predicate<acq> $$1) {
         return Map.of();
      }

      @Override
      public Map<acq, List<akv>> c(String $$0, Predicate<acq> $$1) {
         return Map.of();
      }

      @Override
      public Stream<ajl> b() {
         return Stream.of();
      }
   }
}
