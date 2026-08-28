import com.mojang.serialization.MapCodec;
import java.util.Set;

public class ezt implements ezx {
   private static final ezt b = new ezt();
   public static final MapCodec<ezt> a = MapCodec.unit(b);

   private ezt() {
   }

   @Override
   public ezy b() {
      return ezz.l;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(ezi.j);
   }

   public boolean a(ewo $$0) {
      Float $$1 = $$0.c(ezi.j);
      if ($$1 != null) {
         bam $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static ezx.a c() {
      return () -> b;
   }
}
