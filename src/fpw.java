import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class fpw implements fpt {
   public static final String a = "OR";
   private final Iterable<? extends fpt> d;

   public fpw(Iterable<? extends fpt> $$0) {
      this.d = $$0;
   }

   @Override
   public Predicate<dfl> getPredicate(dfm<csx, dfl> $$0) {
      List<Predicate<dfl>> $$1 = Streams.stream(this.d).map($$1x -> $$1x.getPredicate($$0)).collect(Collectors.toList());
      return $$1x -> $$1.stream().anyMatch($$1xx -> $$1xx.test($$1x));
   }
}
