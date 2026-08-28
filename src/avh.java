import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface avh extends avk {
   Set<String> a();

   List<avf> a(alk var1);

   Map<alk, avf> b(String var1, Predicate<alk> var2);

   Map<alk, List<avf>> c(String var1, Predicate<alk> var2);

   Stream<att> b();

   public static enum a implements avh {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<avf> getResource(alk $$0) {
         return Optional.empty();
      }

      @Override
      public List<avf> a(alk $$0) {
         return List.of();
      }

      @Override
      public Map<alk, avf> b(String $$0, Predicate<alk> $$1) {
         return Map.of();
      }

      @Override
      public Map<alk, List<avf>> c(String $$0, Predicate<alk> $$1) {
         return Map.of();
      }

      @Override
      public Stream<att> b() {
         return Stream.of();
      }
   }
}
