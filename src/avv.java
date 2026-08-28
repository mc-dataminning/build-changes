import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface avv extends avy {
   Set<String> a();

   List<avt> a(alz var1);

   Map<alz, avt> b(String var1, Predicate<alz> var2);

   Map<alz, List<avt>> c(String var1, Predicate<alz> var2);

   Stream<aug> b();

   public static enum a implements avv {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<avt> getResource(alz $$0) {
         return Optional.empty();
      }

      @Override
      public List<avt> a(alz $$0) {
         return List.of();
      }

      @Override
      public Map<alz, avt> b(String $$0, Predicate<alz> $$1) {
         return Map.of();
      }

      @Override
      public Map<alz, List<avt>> c(String $$0, Predicate<alz> $$1) {
         return Map.of();
      }

      @Override
      public Stream<aug> b() {
         return Stream.of();
      }
   }
}
