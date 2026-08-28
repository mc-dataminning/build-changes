import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface ave extends avh {
   Set<String> a();

   List<avc> a(all var1);

   Map<all, avc> b(String var1, Predicate<all> var2);

   Map<all, List<avc>> c(String var1, Predicate<all> var2);

   Stream<atp> b();

   public static enum a implements ave {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<avc> getResource(all $$0) {
         return Optional.empty();
      }

      @Override
      public List<avc> a(all $$0) {
         return List.of();
      }

      @Override
      public Map<all, avc> b(String $$0, Predicate<all> $$1) {
         return Map.of();
      }

      @Override
      public Map<all, List<avc>> c(String $$0, Predicate<all> $$1) {
         return Map.of();
      }

      @Override
      public Stream<atp> b() {
         return Stream.of();
      }
   }
}
