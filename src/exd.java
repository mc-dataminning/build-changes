import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class exd implements exh {
   private static final exd b = new exd();
   public static final MapCodec<exd> a = MapCodec.unit(b);

   private exd() {
   }

   @Override
   public exi b() {
      return exj.l;
   }

   @Override
   public Set<ewp<?>> a() {
      return ImmutableSet.of(ews.j);
   }

   public boolean a(etw $$0) {
      Float $$1 = $$0.c(ews.j);
      if ($$1 != null) {
         azr $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static exh.a c() {
      return () -> b;
   }
}
