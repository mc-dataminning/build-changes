import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class ejy implements eju {
   private static final ejy b = new ejy();
   public static final Codec<ejy> a = Codec.unit(b);

   private ejy() {
   }

   @Override
   public ejv b() {
      return ejw.h;
   }

   @Override
   public Set<ejd<?>> a() {
      return ImmutableSet.of(ejg.b);
   }

   public boolean a(egv $$0) {
      return $$0.a(ejg.b);
   }

   public static eju.a c() {
      return () -> b;
   }
}
