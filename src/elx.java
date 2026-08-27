import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class elx implements emb {
   private static final elx b = new elx();
   public static final Codec<elx> a = Codec.unit(b);

   private elx() {
   }

   @Override
   public emc b() {
      return emd.m;
   }

   @Override
   public Set<elk<?>> a() {
      return ImmutableSet.of(eln.j);
   }

   public boolean a(ejc $$0) {
      Float $$1 = $$0.c(eln.j);
      if ($$1 != null) {
         awp $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static emb.a c() {
      return () -> b;
   }
}
