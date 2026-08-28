import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cue {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cue c = a("empty").a(0, cuc.b).a();
   public static final cue d = a("simple").a(5000, cuc.c).a(11000, cuc.e).a();
   public static final cue e = a("villager_baby").a(10, cuc.b).a(3000, cuc.d).a(6000, cuc.b).a(10000, cuc.d).a(12000, cuc.e).a();
   public static final cue f = a("villager_default").a(10, cuc.b).a(2000, cuc.c).a(9000, cuc.f).a(11000, cuc.b).a(12000, cuc.e).a();
   private final Map<cuc, cug> g = Maps.newHashMap();

   protected static cuf a(String $$0) {
      cue $$1 = jt.a(mh.B, $$0, new cue());
      return new cuf($$1);
   }

   protected void a(cuc $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cug());
      }
   }

   protected cug b(cuc $$0) {
      return this.g.get($$0);
   }

   protected List<cug> c(cuc $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cuc a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cuc.b);
   }
}
