import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface aud extends aug {
   Set<String> a();

   List<aub> a(akq var1);

   Map<akq, aub> b(String var1, Predicate<akq> var2);

   Map<akq, List<aub>> c(String var1, Predicate<akq> var2);

   Stream<asp> b();

   public static enum a implements aud {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<aub> getResource(akq $$0) {
         return Optional.empty();
      }

      @Override
      public List<aub> a(akq $$0) {
         return List.of();
      }

      @Override
      public Map<akq, aub> b(String $$0, Predicate<akq> $$1) {
         return Map.of();
      }

      @Override
      public Map<akq, List<aub>> c(String $$0, Predicate<akq> $$1) {
         return Map.of();
      }

      @Override
      public Stream<asp> b() {
         return Stream.of();
      }
   }
}
