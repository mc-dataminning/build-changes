import com.mojang.serialization.MapCodec;
import java.util.Set;

public class ezu implements ezy {
   private static final ezu b = new ezu();
   public static final MapCodec<ezu> a = MapCodec.unit(b);

   private ezu() {
   }

   @Override
   public ezz b() {
      return faa.l;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(ezj.j);
   }

   public boolean a(ewp $$0) {
      Float $$1 = $$0.c(ezj.j);
      if ($$1 != null) {
         bam $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static ezy.a c() {
      return () -> b;
   }
}
