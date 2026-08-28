import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dtu extends dty<ji> {
   protected dtu(String $$0, Collection<ji> $$1) {
      super($$0, ji.class, $$1);
   }

   public static dtu a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dtu a(String $$0, Predicate<ji> $$1) {
      return a($$0, Arrays.stream(ji.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dtu a(String $$0, ji... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dtu a(String $$0, Collection<ji> $$1) {
      return new dtu($$0, $$1);
   }
}
