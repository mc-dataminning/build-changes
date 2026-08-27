import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ckl {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final ckl c = a("empty").a(0, ckj.b).a();
   public static final ckl d = a("simple").a(5000, ckj.c).a(11000, ckj.e).a();
   public static final ckl e = a("villager_baby").a(10, ckj.b).a(3000, ckj.d).a(6000, ckj.b).a(10000, ckj.d).a(12000, ckj.e).a();
   public static final ckl f = a("villager_default").a(10, ckj.b).a(2000, ckj.c).a(9000, ckj.f).a(11000, ckj.b).a(12000, ckj.e).a();
   private final Map<ckj, ckn> g = Maps.newHashMap();

   protected static ckm a(String $$0) {
      ckl $$1 = iy.a(ki.D, $$0, new ckl());
      return new ckm($$1);
   }

   protected void a(ckj $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new ckn());
      }
   }

   protected ckn b(ckj $$0) {
      return this.g.get($$0);
   }

   protected List<ckn> c(ckj $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public ckj a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(ckj.b);
   }
}
