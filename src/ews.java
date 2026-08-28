import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class ews implements eww {
   private static final ews b = new ews();
   public static final MapCodec<ews> a = MapCodec.unit(b);

   private ews() {
   }

   @Override
   public ewx b() {
      return ewy.l;
   }

   @Override
   public Set<ewe<?>> a() {
      return ImmutableSet.of(ewh.j);
   }

   public boolean a(etl $$0) {
      Float $$1 = $$0.c(ewh.j);
      if ($$1 != null) {
         azn $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static eww.a c() {
      return () -> b;
   }
}
