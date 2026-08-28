import com.mojang.serialization.MapCodec;
import java.util.Set;

public class ezf implements ezb {
   private static final ezf b = new ezf();
   public static final MapCodec<ezf> a = MapCodec.unit(b);

   private ezf() {
   }

   @Override
   public ezc b() {
      return ezd.g;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eym.b);
   }

   public boolean a(evs $$0) {
      return $$0.a(eym.b);
   }

   public static ezb.a c() {
      return () -> b;
   }
}
