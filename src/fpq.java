import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class fpq implements fpr {
   public static final String a = "AND";
   private final Iterable<? extends fpr> d;

   public fpq(Iterable<? extends fpr> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dfj> getPredicate(dfk<csv, dfj> $$0) {
      List<Predicate<dfj>> $$1 = Streams.stream(this.d).map($$1x -> $$1x.getPredicate($$0)).collect(Collectors.toList());
      return $$1x -> $$1.stream().allMatch($$1xx -> $$1xx.test($$1x));
   }
}
