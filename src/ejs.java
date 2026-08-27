import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class ejs implements ejo {
   private static final ejs b = new ejs();
   public static final Codec<ejs> a = Codec.unit(b);

   private ejs() {
   }

   @Override
   public ejp b() {
      return ejq.h;
   }

   @Override
   public Set<eix<?>> a() {
      return ImmutableSet.of(eja.b);
   }

   public boolean a(egp $$0) {
      return $$0.a(eja.b);
   }

   public static ejo.a c() {
      return () -> b;
   }
}
