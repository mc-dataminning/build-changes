import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class eho implements ehk {
   private static final eho b = new eho();
   public static final Codec<eho> a = Codec.unit(b);

   private eho() {
   }

   @Override
   public ehl b() {
      return ehm.h;
   }

   @Override
   public Set<egt<?>> a() {
      return ImmutableSet.of(egw.b);
   }

   public boolean a(eel $$0) {
      return $$0.a(egw.b);
   }

   public static ehk.a c() {
      return () -> b;
   }
}
