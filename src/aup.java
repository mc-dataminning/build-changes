import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface aup extends aus {
   Set<String> a();

   List<aun> a(aku var1);

   Map<aku, aun> b(String var1, Predicate<aku> var2);

   Map<aku, List<aun>> c(String var1, Predicate<aku> var2);

   Stream<atb> b();

   public static enum a implements aup {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<aun> getResource(aku $$0) {
         return Optional.empty();
      }

      @Override
      public List<aun> a(aku $$0) {
         return List.of();
      }

      @Override
      public Map<aku, aun> b(String $$0, Predicate<aku> $$1) {
         return Map.of();
      }

      @Override
      public Map<aku, List<aun>> c(String $$0, Predicate<aku> $$1) {
         return Map.of();
      }

      @Override
      public Stream<atb> b() {
         return Stream.of();
      }
   }
}
