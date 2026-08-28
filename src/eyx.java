import com.mojang.serialization.MapCodec;
import java.util.Set;

public class eyx implements ezb {
   private static final eyx b = new eyx();
   public static final MapCodec<eyx> a = MapCodec.unit(b);

   private eyx() {
   }

   @Override
   public ezc b() {
      return ezd.l;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eym.j);
   }

   public boolean a(evs $$0) {
      Float $$1 = $$0.c(eym.j);
      if ($$1 != null) {
         azh $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static ezb.a c() {
      return () -> b;
   }
}
