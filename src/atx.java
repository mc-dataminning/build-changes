import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface atx extends aua {
   Set<String> a();

   List<atv> a(akn var1);

   Map<akn, atv> b(String var1, Predicate<akn> var2);

   Map<akn, List<atv>> c(String var1, Predicate<akn> var2);

   Stream<asj> b();

   public static enum a implements atx {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<atv> getResource(akn $$0) {
         return Optional.empty();
      }

      @Override
      public List<atv> a(akn $$0) {
         return List.of();
      }

      @Override
      public Map<akn, atv> b(String $$0, Predicate<akn> $$1) {
         return Map.of();
      }

      @Override
      public Map<akn, List<atv>> c(String $$0, Predicate<akn> $$1) {
         return Map.of();
      }

      @Override
      public Stream<asj> b() {
         return Stream.of();
      }
   }
}
