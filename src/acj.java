import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public record acj(Object2IntMap<awu<?>> b) implements zq<acf> {
   private static final zh<wu, Object2IntMap<awu<?>>> c = zf.a(Object2IntOpenHashMap::new, awu.a, zf.h);
   public static final zh<wu, acj> a = c.a(acj::new, acj::b);

   @Override
   public zs<acj> a() {
      return agu.f;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }
}
