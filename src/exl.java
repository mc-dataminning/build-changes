import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class exl implements exh {
   private static final exl b = new exl();
   public static final MapCodec<exl> a = MapCodec.unit(b);

   private exl() {
   }

   @Override
   public exi b() {
      return exj.g;
   }

   @Override
   public Set<ewp<?>> a() {
      return ImmutableSet.of(ews.b);
   }

   public boolean a(etw $$0) {
      return $$0.a(ews.b);
   }

   public static exh.a c() {
      return () -> b;
   }
}
