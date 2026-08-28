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

public class foz extends awq {
   private final Map<dfj, dfi> b = new HashMap<>();
   private final Set<dfj> c = new HashSet<>();
   private Map<ddt, List<gcq>> d = Map.of();
   private List<gcq> e = List.of();

   public void a(dfi $$0) {
      this.b.put($$0.a(), $$0);
   }

   public void a(dfj $$0) {
      this.b.remove($$0);
      this.c.remove($$0);
   }

   public void b() {
      this.b.clear();
      this.c.clear();
   }

   public boolean b(dfj $$0) {
      return this.c.contains($$0);
   }

   public void c(dfj $$0) {
      this.c.remove($$0);
   }

   public void d(dfj $$0) {
      this.c.add($$0);
   }

   public void c() {
      Map<dee, List<List<dfi>>> $$0 = a(this.b.values());
      Map<ddt, List<gcq>> $$1 = new HashMap<>();
      Builder<gcq> $$2 = ImmutableList.builder();
      $$0.forEach(($$2x, $$3x) -> $$1.put($$2x, $$3x.stream().map(gcq::new).peek($$2::add).collect(ImmutableList.toImmutableList())));

      for (gcs $$3 : gcs.values()) {
         $$1.put($$3, $$3.a().stream().flatMap($$1x -> $$1.getOrDefault($$1x, List.of()).stream()).collect(ImmutableList.toImmutableList()));
      }

      this.d = Map.copyOf($$1);
      this.e = $$2.build();
   }

   private static Map<dee, List<List<dfi>>> a(Iterable<dfi> $$0) {
      Map<dee, List<List<dfi>>> $$1 = new HashMap<>();
      Table<dee, Integer, List<dfi>> $$2 = HashBasedTable.create();

      for (dfi $$3 : $$0) {
         dee $$4 = $$3.d();
         OptionalInt $$5 = $$3.c();
         if ($$5.isEmpty()) {
            $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add(List.of($$3));
         } else {
            List<dfi> $$6 = (List<dfi>)$$2.get($$4, $$5.getAsInt());
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

   public List<gcq> d() {
      return this.e;
   }

   public List<gcq> a(ddt $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
