import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class dvx extends dwb<jl> {
   protected dvx(String $$0, Collection<jl> $$1) {
      super($$0, jl.class, $$1);
   }

   public static dvx a(String $$0) {
      return a($$0, $$0x -> true);
   }

   public static dvx a(String $$0, Predicate<jl> $$1) {
      return a($$0, Arrays.stream(jl.values()).filter($$1).collect(Collectors.toList()));
   }

   public static dvx a(String $$0, jl... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static dvx a(String $$0, Collection<jl> $$1) {
      return new dvx($$0, $$1);
   }
}
