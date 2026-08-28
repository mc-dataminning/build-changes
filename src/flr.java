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

public class flr extends awd {
   private final Map<ddd, ddc> b = new HashMap<>();
   private final Set<ddd> c = new HashSet<>();
   private Map<dbn, List<fzj>> d = Map.of();
   private List<fzj> e = List.of();

   public void a(ddc $$0) {
      this.b.put($$0.a(), $$0);
   }

   public void a(ddd $$0) {
      this.b.remove($$0);
      this.c.remove($$0);
   }

   public void b() {
      this.b.clear();
      this.c.clear();
   }

   public boolean b(ddd $$0) {
      return this.c.contains($$0);
   }

   public void c(ddd $$0) {
      this.c.remove($$0);
   }

   public void d(ddd $$0) {
      this.c.add($$0);
   }

   public void c() {
      Map<dby, List<List<ddc>>> $$0 = a(this.b.values());
      Map<dbn, List<fzj>> $$1 = new HashMap<>();
      Builder<fzj> $$2 = ImmutableList.builder();
      $$0.forEach(($$2x, $$3x) -> $$1.put($$2x, $$3x.stream().map(fzj::new).peek($$2::add).collect(ImmutableList.toImmutableList())));

      for (fzl $$3 : fzl.values()) {
         $$1.put($$3, $$3.a().stream().flatMap($$1x -> $$1.getOrDefault($$1x, List.of()).stream()).collect(ImmutableList.toImmutableList()));
      }

      this.d = Map.copyOf($$1);
      this.e = $$2.build();
   }

   private static Map<dby, List<List<ddc>>> a(Iterable<ddc> $$0) {
      Map<dby, List<List<ddc>>> $$1 = new HashMap<>();
      Table<dby, Integer, List<ddc>> $$2 = HashBasedTable.create();

      for (ddc $$3 : $$0) {
         dby $$4 = $$3.d();
         OptionalInt $$5 = $$3.c();
         if ($$5.isEmpty()) {
            $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add(List.of($$3));
         } else {
            List<ddc> $$6 = (List<ddc>)$$2.get($$4, $$5.getAsInt());
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

   public List<fzj> d() {
      return this.e;
   }

   public List<fzj> a(dbn $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
