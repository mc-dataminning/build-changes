import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface auo extends aur {
   Set<String> a();

   List<aum> a(ale var1);

   Map<ale, aum> b(String var1, Predicate<ale> var2);

   Map<ale, List<aum>> c(String var1, Predicate<ale> var2);

   Stream<ata> b();

   public static enum a implements auo {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<aum> getResource(ale $$0) {
         return Optional.empty();
      }

      @Override
      public List<aum> a(ale $$0) {
         return List.of();
      }

      @Override
      public Map<ale, aum> b(String $$0, Predicate<ale> $$1) {
         return Map.of();
      }

      @Override
      public Map<ale, List<aum>> c(String $$0, Predicate<ale> $$1) {
         return Map.of();
      }

      @Override
      public Stream<ata> b() {
         return Stream.of();
      }
   }
}
