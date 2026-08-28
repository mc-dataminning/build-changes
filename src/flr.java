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

public class flr extends axi {
   private final Map<ddl, ddk> b = new HashMap<>();
   private final Set<ddl> c = new HashSet<>();
   private Map<dbw, List<fxz>> d = Map.of();
   private List<fxz> e = List.of();

   public void a(ddk $$0) {
      this.b.put($$0.a(), $$0);
   }

   public void a(ddl $$0) {
      this.b.remove($$0);
      this.c.remove($$0);
   }

   public void b() {
      this.b.clear();
      this.c.clear();
   }

   public boolean b(ddl $$0) {
      return this.c.contains($$0);
   }

   public void c(ddl $$0) {
      this.c.remove($$0);
   }

   public void d(ddl $$0) {
      this.c.add($$0);
   }

   public void c() {
      Map<dch, List<List<ddk>>> $$0 = a(this.b.values());
      Map<dbw, List<fxz>> $$1 = new HashMap<>();
      Builder<fxz> $$2 = ImmutableList.builder();
      $$0.forEach(($$2x, $$3x) -> $$1.put($$2x, $$3x.stream().map(fxz::new).peek($$2::add).collect(ImmutableList.toImmutableList())));

      for (fyb $$3 : fyb.values()) {
         $$1.put($$3, $$3.a().stream().flatMap($$1x -> $$1.getOrDefault($$1x, List.of()).stream()).collect(ImmutableList.toImmutableList()));
      }

      this.d = Map.copyOf($$1);
      this.e = $$2.build();
   }

   private static Map<dch, List<List<ddk>>> a(Iterable<ddk> $$0) {
      Map<dch, List<List<ddk>>> $$1 = new HashMap<>();
      Table<dch, Integer, List<ddk>> $$2 = HashBasedTable.create();

      for (ddk $$3 : $$0) {
         dch $$4 = $$3.d();
         OptionalInt $$5 = $$3.c();
         if ($$5.isEmpty()) {
            $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add(List.of($$3));
         } else {
            List<ddk> $$6 = (List<ddk>)$$2.get($$4, $$5.getAsInt());
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

   public List<fxz> d() {
      return this.e;
   }

   public List<fxz> a(dbw $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
