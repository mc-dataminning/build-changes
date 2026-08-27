import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class esh implements esl {
   private static final esh b = new esh();
   public static final MapCodec<esh> a = MapCodec.unit(b);

   private esh() {
   }

   @Override
   public esm b() {
      return esn.n;
   }

   @Override
   public Set<eru<?>> a() {
      return ImmutableSet.of(erx.j);
   }

   public boolean a(epf $$0) {
      Float $$1 = $$0.c(erx.j);
      if ($$1 != null) {
         ayk $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static esl.a c() {
      return () -> b;
   }
}
