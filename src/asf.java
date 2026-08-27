import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface asf extends asi {
   Set<String> a();

   List<asd> a(ajc var1);

   Map<ajc, asd> b(String var1, Predicate<ajc> var2);

   Map<ajc, List<asd>> c(String var1, Predicate<ajc> var2);

   Stream<aqt> b();

   public static enum a implements asf {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<asd> getResource(ajc $$0) {
         return Optional.empty();
      }

      @Override
      public List<asd> a(ajc $$0) {
         return List.of();
      }

      @Override
      public Map<ajc, asd> b(String $$0, Predicate<ajc> $$1) {
         return Map.of();
      }

      @Override
      public Map<ajc, List<asd>> c(String $$0, Predicate<ajc> $$1) {
         return Map.of();
      }

      @Override
      public Stream<aqt> b() {
         return Stream.of();
      }
   }
}
