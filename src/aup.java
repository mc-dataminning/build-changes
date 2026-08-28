import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface aup extends aus {
   Set<String> a();

   List<aun> a(alf var1);

   Map<alf, aun> b(String var1, Predicate<alf> var2);

   Map<alf, List<aun>> c(String var1, Predicate<alf> var2);

   Stream<atb> b();

   public static enum a implements aup {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<aun> getResource(alf $$0) {
         return Optional.empty();
      }

      @Override
      public List<aun> a(alf $$0) {
         return List.of();
      }

      @Override
      public Map<alf, aun> b(String $$0, Predicate<alf> $$1) {
         return Map.of();
      }

      @Override
      public Map<alf, List<aun>> c(String $$0, Predicate<alf> $$1) {
         return Map.of();
      }

      @Override
      public Stream<atb> b() {
         return Stream.of();
      }
   }
}
