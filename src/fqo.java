import com.google.common.base.MoreObjects;
import com.google.common.base.Splitter;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class fqo implements fqn {
   private static final Splitter a = Splitter.on('|').omitEmptyStrings();
   private final String d;
   private final String e;

   public fqo(String $$0, String $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public Predicate<dgb> getPredicate(dgc<cua, dgb> $$0) {
      dhe<?> $$1 = $$0.a(this.d);
      if ($$1 == null) {
         throw new RuntimeException(String.format(Locale.ROOT, "Unknown property '%s' on '%s'", this.d, $$0.c()));
      } else {
         String $$2 = this.e;
         boolean $$3 = !$$2.isEmpty() && $$2.charAt(0) == '!';
         if ($$3) {
            $$2 = $$2.substring(1);
         }

         List<String> $$4 = a.splitToList($$2);
         if ($$4.isEmpty()) {
            throw new RuntimeException(String.format(Locale.ROOT, "Empty value '%s' for property '%s' on '%s'", this.e, this.d, $$0.c()));
         } else {
            Predicate<dgb> $$5;
            if ($$4.size() == 1) {
               $$5 = this.a($$0, $$1, $$2);
            } else {
               List<Predicate<dgb>> $$6 = $$4.stream().map($$2x -> this.a($$0, $$1, $$2x)).collect(Collectors.toList());
               $$5 = $$1x -> $$6.stream().anyMatch($$1xx -> $$1xx.test($$1x));
            }

            return $$3 ? $$5.negate() : $$5;
         }
      }
   }

   private Predicate<dgb> a(dgc<cua, dgb> $$0, dhe<?> $$1, String $$2) {
      Optional<?> $$3 = $$1.b($$2);
      if ($$3.isEmpty()) {
         throw new RuntimeException(String.format(Locale.ROOT, "Unknown value '%s' for property '%s' on '%s' in '%s'", $$2, this.d, $$0.c(), this.e));
      } else {
         return $$2x -> $$2x.c($$1).equals($$3.get());
      }
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("key", this.d).add("value", this.e).toString();
   }
}
