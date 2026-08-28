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

public class fqo extends aws {
   private final Map<dfx, dfw> b = new HashMap<>();
   private final Set<dfx> c = new HashSet<>();
   private Map<deh, List<geg>> d = Map.of();
   private List<geg> e = List.of();

   public void a(dfw $$0) {
      this.b.put($$0.a(), $$0);
   }

   public void a(dfx $$0) {
      this.b.remove($$0);
      this.c.remove($$0);
   }

   public void b() {
      this.b.clear();
      this.c.clear();
   }

   public boolean b(dfx $$0) {
      return this.c.contains($$0);
   }

   public void c(dfx $$0) {
      this.c.remove($$0);
   }

   public void d(dfx $$0) {
      this.c.add($$0);
   }

   public void c() {
      Map<des, List<List<dfw>>> $$0 = a(this.b.values());
      Map<deh, List<geg>> $$1 = new HashMap<>();
      Builder<geg> $$2 = ImmutableList.builder();
      $$0.forEach(($$2x, $$3x) -> $$1.put($$2x, $$3x.stream().map(geg::new).peek($$2::add).collect(ImmutableList.toImmutableList())));

      for (gei $$3 : gei.values()) {
         $$1.put($$3, $$3.a().stream().flatMap($$1x -> $$1.getOrDefault($$1x, List.of()).stream()).collect(ImmutableList.toImmutableList()));
      }

      this.d = Map.copyOf($$1);
      this.e = $$2.build();
   }

   private static Map<des, List<List<dfw>>> a(Iterable<dfw> $$0) {
      Map<des, List<List<dfw>>> $$1 = new HashMap<>();
      Table<des, Integer, List<dfw>> $$2 = HashBasedTable.create();

      for (dfw $$3 : $$0) {
         des $$4 = $$3.d();
         OptionalInt $$5 = $$3.c();
         if ($$5.isEmpty()) {
            $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add(List.of($$3));
         } else {
            List<dfw> $$6 = (List<dfw>)$$2.get($$4, $$5.getAsInt());
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

   public List<geg> d() {
      return this.e;
   }

   public List<geg> a(deh $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
