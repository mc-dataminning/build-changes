import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class ejz implements ejv {
   private static final ejz b = new ejz();
   public static final Codec<ejz> a = Codec.unit(b);

   private ejz() {
   }

   @Override
   public ejw b() {
      return ejx.h;
   }

   @Override
   public Set<eje<?>> a() {
      return ImmutableSet.of(ejh.b);
   }

   public boolean a(egw $$0) {
      return $$0.a(ejh.b);
   }

   public static ejv.a c() {
      return () -> b;
   }
}
