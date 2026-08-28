import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface aut extends auw {
   Set<String> a();

   List<aur> a(alc var1);

   Map<alc, aur> b(String var1, Predicate<alc> var2);

   Map<alc, List<aur>> c(String var1, Predicate<alc> var2);

   Stream<atf> b();

   public static enum a implements aut {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<aur> getResource(alc $$0) {
         return Optional.empty();
      }

      @Override
      public List<aur> a(alc $$0) {
         return List.of();
      }

      @Override
      public Map<alc, aur> b(String $$0, Predicate<alc> $$1) {
         return Map.of();
      }

      @Override
      public Map<alc, List<aur>> c(String $$0, Predicate<alc> $$1) {
         return Map.of();
      }

      @Override
      public Stream<atf> b() {
         return Stream.of();
      }
   }
}
