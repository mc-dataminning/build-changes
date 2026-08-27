import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dih extends dil<ib> {
   protected dih(String $$0, Collection<ib> $$1) {
      super($$0, ib.class, $$1);
   }

   public static dih a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dih a(String $$0, Predicate<ib> $$1) {
      return a($$0, Arrays.stream(ib.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dih a(String $$0, ib... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dih a(String $$0, Collection<ib> $$1) {
      return new dih($$0, $$1);
   }
}
