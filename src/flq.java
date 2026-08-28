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

public class flq extends axi {
   private final Map<ddk, ddj> b = new HashMap<>();
   private final Set<ddk> c = new HashSet<>();
   private Map<dbv, List<fxy>> d = Map.of();
   private List<fxy> e = List.of();

   public void a(ddj $$0) {
      this.b.put($$0.a(), $$0);
   }

   public void a(ddk $$0) {
      this.b.remove($$0);
      this.c.remove($$0);
   }

   public void b() {
      this.b.clear();
      this.c.clear();
   }

   public boolean b(ddk $$0) {
      return this.c.contains($$0);
   }

   public void c(ddk $$0) {
      this.c.remove($$0);
   }

   public void d(ddk $$0) {
      this.c.add($$0);
   }

   public void c() {
      Map<dcg, List<List<ddj>>> $$0 = a(this.b.values());
      Map<dbv, List<fxy>> $$1 = new HashMap<>();
      Builder<fxy> $$2 = ImmutableList.builder();
      $$0.forEach(($$2x, $$3x) -> $$1.put($$2x, $$3x.stream().map(fxy::new).peek($$2::add).collect(ImmutableList.toImmutableList())));

      for (fya $$3 : fya.values()) {
         $$1.put($$3, $$3.a().stream().flatMap($$1x -> $$1.getOrDefault($$1x, List.of()).stream()).collect(ImmutableList.toImmutableList()));
      }

      this.d = Map.copyOf($$1);
      this.e = $$2.build();
   }

   private static Map<dcg, List<List<ddj>>> a(Iterable<ddj> $$0) {
      Map<dcg, List<List<ddj>>> $$1 = new HashMap<>();
      Table<dcg, Integer, List<ddj>> $$2 = HashBasedTable.create();

      for (ddj $$3 : $$0) {
         dcg $$4 = $$3.d();
         OptionalInt $$5 = $$3.c();
         if ($$5.isEmpty()) {
            $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add(List.of($$3));
         } else {
            List<ddj> $$6 = (List<ddj>)$$2.get($$4, $$5.getAsInt());
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

   public List<fxy> d() {
      return this.e;
   }

   public List<fxy> a(dbv $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
