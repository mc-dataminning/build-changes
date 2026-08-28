import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cfd extends cfo<bve> {
   @Override
   public Set<cei<?>> a() {
      return ImmutableSet.of(cei.X);
   }

   @Override
   protected void a(arq $$0, bve $$1) {
      if ($$1.bl()) {
         $$1.ee().a(cei.X, bat.a);
      } else {
         $$1.ee().b(cei.X);
      }
   }
}
