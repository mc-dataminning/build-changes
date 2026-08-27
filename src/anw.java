import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface anw extends anz {
   Set<String> a();

   List<anu> a(aez var1);

   Map<aez, anu> b(String var1, Predicate<aez> var2);

   Map<aez, List<anu>> c(String var1, Predicate<aez> var2);

   Stream<amk> b();

   public static enum a implements anw {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<anu> getResource(aez $$0) {
         return Optional.empty();
      }

      @Override
      public List<anu> a(aez $$0) {
         return List.of();
      }

      @Override
      public Map<aez, anu> b(String $$0, Predicate<aez> $$1) {
         return Map.of();
      }

      @Override
      public Map<aez, List<anu>> c(String $$0, Predicate<aez> $$1) {
         return Map.of();
      }

      @Override
      public Stream<amk> b() {
         return Stream.of();
      }
   }
}
