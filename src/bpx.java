import com.google.common.math.Quantiles;
import com.google.common.math.Quantiles.ScaleAndIndexes;
import it.unimi.dsi.fastutil.ints.Int2DoubleRBTreeMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps;
import java.util.Comparator;
import java.util.Map;

public class bpx {
   public static final ScaleAndIndexes a = Quantiles.scale(100).indexes(new int[]{50, 75, 90, 99});

   private bpx() {
   }

   public static Map<Integer, Double> a(long[] $$0) {
      return $$0.length == 0 ? Map.of() : a(a.compute($$0));
   }

   public static Map<Integer, Double> a(double[] $$0) {
      return $$0.length == 0 ? Map.of() : a(a.compute($$0));
   }

   private static Map<Integer, Double> a(Map<Integer, Double> $$0) {
      Int2DoubleSortedMap $$1 = ae.a(new Int2DoubleRBTreeMap(Comparator.reverseOrder()), $$1x -> $$1x.putAll($$0));
      return Int2DoubleSortedMaps.unmodifiable($$1);
   }
}
