import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class ezo implements ezs {
   private static final ezo b = new ezo();
   public static final MapCodec<ezo> a = MapCodec.unit(b);

   private ezo() {
   }

   @Override
   public ezt b() {
      return ezu.l;
   }

   @Override
   public Set<eza<?>> a() {
      return ImmutableSet.of(ezd.j);
   }

   public boolean a(ewh $$0) {
      Float $$1 = $$0.c(ezd.j);
      if ($$1 != null) {
         bam $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static ezs.a c() {
      return () -> b;
   }
}
