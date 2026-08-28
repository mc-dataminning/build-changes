import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface aul extends auo {
   Set<String> a();

   List<auj> a(alb var1);

   Map<alb, auj> b(String var1, Predicate<alb> var2);

   Map<alb, List<auj>> c(String var1, Predicate<alb> var2);

   Stream<asx> b();

   public static enum a implements aul {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<auj> getResource(alb $$0) {
         return Optional.empty();
      }

      @Override
      public List<auj> a(alb $$0) {
         return List.of();
      }

      @Override
      public Map<alb, auj> b(String $$0, Predicate<alb> $$1) {
         return Map.of();
      }

      @Override
      public Map<alb, List<auj>> c(String $$0, Predicate<alb> $$1) {
         return Map.of();
      }

      @Override
      public Stream<asx> b() {
         return Stream.of();
      }
   }
}
