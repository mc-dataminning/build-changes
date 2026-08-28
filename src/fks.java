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

public class fks extends awc {
   private final Map<dcj, dci> b = new HashMap<>();
   private final Set<dcj> c = new HashSet<>();
   private Map<dau, List<fyj>> d = Map.of();
   private List<fyj> e = List.of();

   public void a(dci $$0) {
      this.b.put($$0.a(), $$0);
   }

   public void a(dcj $$0) {
      this.b.remove($$0);
      this.c.remove($$0);
   }

   public void b() {
      this.b.clear();
      this.c.clear();
   }

   public boolean b(dcj $$0) {
      return this.c.contains($$0);
   }

   public void c(dcj $$0) {
      this.c.remove($$0);
   }

   public void d(dcj $$0) {
      this.c.add($$0);
   }

   public void c() {
      Map<dbf, List<List<dci>>> $$0 = a(this.b.values());
      Map<dau, List<fyj>> $$1 = new HashMap<>();
      Builder<fyj> $$2 = ImmutableList.builder();
      $$0.forEach(($$2x, $$3x) -> $$1.put($$2x, $$3x.stream().map(fyj::new).peek($$2::add).collect(ImmutableList.toImmutableList())));

      for (fyl $$3 : fyl.values()) {
         $$1.put($$3, $$3.a().stream().flatMap($$1x -> $$1.getOrDefault($$1x, List.of()).stream()).collect(ImmutableList.toImmutableList()));
      }

      this.d = Map.copyOf($$1);
      this.e = $$2.build();
   }

   private static Map<dbf, List<List<dci>>> a(Iterable<dci> $$0) {
      Map<dbf, List<List<dci>>> $$1 = new HashMap<>();
      Table<dbf, Integer, List<dci>> $$2 = HashBasedTable.create();

      for (dci $$3 : $$0) {
         dbf $$4 = $$3.d();
         OptionalInt $$5 = $$3.c();
         if ($$5.isEmpty()) {
            $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add(List.of($$3));
         } else {
            List<dci> $$6 = (List<dci>)$$2.get($$4, $$5.getAsInt());
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

   public List<fyj> d() {
      return this.e;
   }

   public List<fyj> a(dau $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
