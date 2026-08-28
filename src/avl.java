import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface avl extends avo {
   Set<String> a();

   List<avj> a(alp var1);

   Map<alp, avj> b(String var1, Predicate<alp> var2);

   Map<alp, List<avj>> c(String var1, Predicate<alp> var2);

   Stream<atw> b();

   public static enum a implements avl {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<avj> getResource(alp $$0) {
         return Optional.empty();
      }

      @Override
      public List<avj> a(alp $$0) {
         return List.of();
      }

      @Override
      public Map<alp, avj> b(String $$0, Predicate<alp> $$1) {
         return Map.of();
      }

      @Override
      public Map<alp, List<avj>> c(String $$0, Predicate<alp> $$1) {
         return Map.of();
      }

      @Override
      public Stream<atw> b() {
         return Stream.of();
      }
   }
}
