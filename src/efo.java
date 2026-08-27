import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class efo implements efk {
   private static final efo b = new efo();
   public static final Codec<efo> a = Codec.unit(b);

   private efo() {
   }

   @Override
   public efl b() {
      return efm.h;
   }

   @Override
   public Set<eet<?>> a() {
      return ImmutableSet.of(eew.b);
   }

   public boolean a(ecl $$0) {
      return $$0.a(eew.b);
   }

   public static efk.a c() {
      return () -> b;
   }
}
