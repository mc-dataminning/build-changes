import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface avo extends avr {
   Set<String> a();

   List<avm> a(alr var1);

   Map<alr, avm> b(String var1, Predicate<alr> var2);

   Map<alr, List<avm>> c(String var1, Predicate<alr> var2);

   Stream<aua> b();

   public static enum a implements avo {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<avm> getResource(alr $$0) {
         return Optional.empty();
      }

      @Override
      public List<avm> a(alr $$0) {
         return List.of();
      }

      @Override
      public Map<alr, avm> b(String $$0, Predicate<alr> $$1) {
         return Map.of();
      }

      @Override
      public Map<alr, List<avm>> c(String $$0, Predicate<alr> $$1) {
         return Map.of();
      }

      @Override
      public Stream<aua> b() {
         return Stream.of();
      }
   }
}
