import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dcv extends dcz<ha> {
   protected dcv(String $$0, Collection<ha> $$1) {
      super($$0, ha.class, $$1);
   }

   public static dcv a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dcv a(String $$0, Predicate<ha> $$1) {
      return a($$0, Arrays.stream(ha.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dcv a(String $$0, ha... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dcv a(String $$0, Collection<ha> $$1) {
      return new dcv($$0, $$1);
   }
}
