import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface ato extends atr {
   Set<String> a();

   List<atm> a(akf var1);

   Map<akf, atm> b(String var1, Predicate<akf> var2);

   Map<akf, List<atm>> c(String var1, Predicate<akf> var2);

   Stream<asa> b();

   public static enum a implements ato {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<atm> getResource(akf $$0) {
         return Optional.empty();
      }

      @Override
      public List<atm> a(akf $$0) {
         return List.of();
      }

      @Override
      public Map<akf, atm> b(String $$0, Predicate<akf> $$1) {
         return Map.of();
      }

      @Override
      public Map<akf, List<atm>> c(String $$0, Predicate<akf> $$1) {
         return Map.of();
      }

      @Override
      public Stream<asa> b() {
         return Stream.of();
      }
   }
}
