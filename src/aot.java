import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface aot extends aow {
   Set<String> a();

   List<aor> a(afw var1);

   Map<afw, aor> b(String var1, Predicate<afw> var2);

   Map<afw, List<aor>> c(String var1, Predicate<afw> var2);

   Stream<anh> b();

   public static enum a implements aot {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<aor> getResource(afw $$0) {
         return Optional.empty();
      }

      @Override
      public List<aor> a(afw $$0) {
         return List.of();
      }

      @Override
      public Map<afw, aor> b(String $$0, Predicate<afw> $$1) {
         return Map.of();
      }

      @Override
      public Map<afw, List<aor>> c(String $$0, Predicate<afw> $$1) {
         return Map.of();
      }

      @Override
      public Stream<anh> b() {
         return Stream.of();
      }
   }
}
