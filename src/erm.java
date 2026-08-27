import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class erm implements erq {
   private static final erm b = new erm();
   public static final Codec<erm> a = Codec.unit(b);

   private erm() {
   }

   @Override
   public err b() {
      return ers.n;
   }

   @Override
   public Set<eqz<?>> a() {
      return ImmutableSet.of(erc.j);
   }

   public boolean a(eol $$0) {
      Float $$1 = $$0.c(erc.j);
      if ($$1 != null) {
         ayg $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static erq.a c() {
      return () -> b;
   }
}
