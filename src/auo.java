import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface auo extends aur {
   Set<String> a();

   List<aum> a(aku var1);

   Map<aku, aum> b(String var1, Predicate<aku> var2);

   Map<aku, List<aum>> c(String var1, Predicate<aku> var2);

   Stream<atb> b();

   public static enum a implements auo {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<aum> getResource(aku $$0) {
         return Optional.empty();
      }

      @Override
      public List<aum> a(aku $$0) {
         return List.of();
      }

      @Override
      public Map<aku, aum> b(String $$0, Predicate<aku> $$1) {
         return Map.of();
      }

      @Override
      public Map<aku, List<aum>> c(String $$0, Predicate<aku> $$1) {
         return Map.of();
      }

      @Override
      public Stream<atb> b() {
         return Stream.of();
      }
   }
}
