import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class ehg implements ehk {
   private static final ehg b = new ehg();
   public static final Codec<ehg> a = Codec.unit(b);

   private ehg() {
   }

   @Override
   public ehl b() {
      return ehm.m;
   }

   @Override
   public Set<egt<?>> a() {
      return ImmutableSet.of(egw.j);
   }

   public boolean a(eel $$0) {
      Float $$1 = $$0.c(egw.j);
      if ($$1 != null) {
         ato $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static ehk.a c() {
      return () -> b;
   }
}
