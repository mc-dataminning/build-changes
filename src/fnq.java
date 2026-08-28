import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Table;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;

public class fnq extends awo {
   private final Map<der, deq> b = new HashMap<>();
   private final Set<der> c = new HashSet<>();
   private Map<ddb, List<gbl>> d = Map.of();
   private List<gbl> e = List.of();

   public void a(deq $$0) {
      this.b.put($$0.a(), $$0);
   }

   public void a(der $$0) {
      this.b.remove($$0);
      this.c.remove($$0);
   }

   public void b() {
      this.b.clear();
      this.c.clear();
   }

   public boolean b(der $$0) {
      return this.c.contains($$0);
   }

   public void c(der $$0) {
      this.c.remove($$0);
   }

   public void d(der $$0) {
      this.c.add($$0);
   }

   public void c() {
      Map<ddm, List<List<deq>>> $$0 = a(this.b.values());
      Map<ddb, List<gbl>> $$1 = new HashMap<>();
      Builder<gbl> $$2 = ImmutableList.builder();
      $$0.forEach(($$2x, $$3x) -> $$1.put($$2x, $$3x.stream().map(gbl::new).peek($$2::add).collect(ImmutableList.toImmutableList())));

      for (gbn $$3 : gbn.values()) {
         $$1.put($$3, $$3.a().stream().flatMap($$1x -> $$1.getOrDefault($$1x, List.of()).stream()).collect(ImmutableList.toImmutableList()));
      }

      this.d = Map.copyOf($$1);
      this.e = $$2.build();
   }

   private static Map<ddm, List<List<deq>>> a(Iterable<deq> $$0) {
      Map<ddm, List<List<deq>>> $$1 = new HashMap<>();
      Table<ddm, Integer, List<deq>> $$2 = HashBasedTable.create();

      for (deq $$3 : $$0) {
         ddm $$4 = $$3.d();
         OptionalInt $$5 = $$3.c();
         if ($$5.isEmpty()) {
            $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add(List.of($$3));
         } else {
            List<deq> $$6 = (List<deq>)$$2.get($$4, $$5.getAsInt());
            if ($$6 == null) {
               $$6 = new ArrayList<>();
               $$2.put($$4, $$5.getAsInt(), $$6);
               $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add($$6);
            }

            $$6.add($$3);
         }
      }

      return $$1;
   }

   public List<gbl> d() {
      return this.e;
   }

   public List<gbl> a(ddb $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
