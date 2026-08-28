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

public class fqb extends axb {
   private final Map<dgj, dgi> b = new HashMap<>();
   private final Set<dgj> c = new HashSet<>();
   private Map<det, List<gdt>> d = Map.of();
   private List<gdt> e = List.of();

   public void a(dgi $$0) {
      this.b.put($$0.a(), $$0);
   }

   public void a(dgj $$0) {
      this.b.remove($$0);
      this.c.remove($$0);
   }

   public void b() {
      this.b.clear();
      this.c.clear();
   }

   public boolean b(dgj $$0) {
      return this.c.contains($$0);
   }

   public void c(dgj $$0) {
      this.c.remove($$0);
   }

   public void d(dgj $$0) {
      this.c.add($$0);
   }

   public void c() {
      Map<dfe, List<List<dgi>>> $$0 = a(this.b.values());
      Map<det, List<gdt>> $$1 = new HashMap<>();
      Builder<gdt> $$2 = ImmutableList.builder();
      $$0.forEach(($$2x, $$3x) -> $$1.put($$2x, $$3x.stream().map(gdt::new).peek($$2::add).collect(ImmutableList.toImmutableList())));

      for (gdv $$3 : gdv.values()) {
         $$1.put($$3, $$3.a().stream().flatMap($$1x -> $$1.getOrDefault($$1x, List.of()).stream()).collect(ImmutableList.toImmutableList()));
      }

      this.d = Map.copyOf($$1);
      this.e = $$2.build();
   }

   private static Map<dfe, List<List<dgi>>> a(Iterable<dgi> $$0) {
      Map<dfe, List<List<dgi>>> $$1 = new HashMap<>();
      Table<dfe, Integer, List<dgi>> $$2 = HashBasedTable.create();

      for (dgi $$3 : $$0) {
         dfe $$4 = $$3.d();
         OptionalInt $$5 = $$3.c();
         if ($$5.isEmpty()) {
            $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add(List.of($$3));
         } else {
            List<dgi> $$6 = (List<dgi>)$$2.get($$4, $$5.getAsInt());
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

   public List<gdt> d() {
      return this.e;
   }

   public List<gdt> a(det $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
