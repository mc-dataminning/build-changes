import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface atu extends atx {
   Set<String> a();

   List<ats> a(akk var1);

   Map<akk, ats> b(String var1, Predicate<akk> var2);

   Map<akk, List<ats>> c(String var1, Predicate<akk> var2);

   Stream<asg> b();

   public static enum a implements atu {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<ats> getResource(akk $$0) {
         return Optional.empty();
      }

      @Override
      public List<ats> a(akk $$0) {
         return List.of();
      }

      @Override
      public Map<akk, ats> b(String $$0, Predicate<akk> $$1) {
         return Map.of();
      }

      @Override
      public Map<akk, List<ats>> c(String $$0, Predicate<akk> $$1) {
         return Map.of();
      }

      @Override
      public Stream<asg> b() {
         return Stream.of();
      }
   }
}
