import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dtw extends dua<iw> {
   protected dtw(String $$0, Collection<iw> $$1) {
      super($$0, iw.class, $$1);
   }

   public static dtw a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dtw a(String $$0, Predicate<iw> $$1) {
      return a($$0, Arrays.stream(iw.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dtw a(String $$0, iw... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dtw a(String $$0, Collection<iw> $$1) {
      return new dtw($$0, $$1);
   }
}
