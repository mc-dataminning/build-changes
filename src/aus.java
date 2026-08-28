import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface aus extends auv {
   Set<String> a();

   List<auq> a(alb var1);

   Map<alb, auq> b(String var1, Predicate<alb> var2);

   Map<alb, List<auq>> c(String var1, Predicate<alb> var2);

   Stream<ate> b();

   public static enum a implements aus {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<auq> getResource(alb $$0) {
         return Optional.empty();
      }

      @Override
      public List<auq> a(alb $$0) {
         return List.of();
      }

      @Override
      public Map<alb, auq> b(String $$0, Predicate<alb> $$1) {
         return Map.of();
      }

      @Override
      public Map<alb, List<auq>> c(String $$0, Predicate<alb> $$1) {
         return Map.of();
      }

      @Override
      public Stream<ate> b() {
         return Stream.of();
      }
   }
}
