import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class eww implements ews {
   private static final eww b = new eww();
   public static final MapCodec<eww> a = MapCodec.unit(b);

   private eww() {
   }

   @Override
   public ewt b() {
      return ewu.g;
   }

   @Override
   public Set<ewa<?>> a() {
      return ImmutableSet.of(ewd.b);
   }

   public boolean a(eth $$0) {
      return $$0.a(ewd.b);
   }

   public static ews.a c() {
      return () -> b;
   }
}
