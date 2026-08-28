import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface aue extends auh {
   Set<String> a();

   List<auc> a(akr var1);

   Map<akr, auc> b(String var1, Predicate<akr> var2);

   Map<akr, List<auc>> c(String var1, Predicate<akr> var2);

   Stream<asq> b();

   public static enum a implements aue {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<auc> getResource(akr $$0) {
         return Optional.empty();
      }

      @Override
      public List<auc> a(akr $$0) {
         return List.of();
      }

      @Override
      public Map<akr, auc> b(String $$0, Predicate<akr> $$1) {
         return Map.of();
      }

      @Override
      public Map<akr, List<auc>> c(String $$0, Predicate<akr> $$1) {
         return Map.of();
      }

      @Override
      public Stream<asq> b() {
         return Stream.of();
      }
   }
}
