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

public class fkv extends awd {
   private final Map<dcm, dcl> b = new HashMap<>();
   private final Set<dcm> c = new HashSet<>();
   private Map<dax, List<fyn>> d = Map.of();
   private List<fyn> e = List.of();

   public void a(dcl $$0) {
      this.b.put($$0.a(), $$0);
   }

   public void a(dcm $$0) {
      this.b.remove($$0);
      this.c.remove($$0);
   }

   public void b() {
      this.b.clear();
      this.c.clear();
   }

   public boolean b(dcm $$0) {
      return this.c.contains($$0);
   }

   public void c(dcm $$0) {
      this.c.remove($$0);
   }

   public void d(dcm $$0) {
      this.c.add($$0);
   }

   public void c() {
      Map<dbi, List<List<dcl>>> $$0 = a(this.b.values());
      Map<dax, List<fyn>> $$1 = new HashMap<>();
      Builder<fyn> $$2 = ImmutableList.builder();
      $$0.forEach(($$2x, $$3x) -> $$1.put($$2x, $$3x.stream().map(fyn::new).peek($$2::add).collect(ImmutableList.toImmutableList())));

      for (fyp $$3 : fyp.values()) {
         $$1.put($$3, $$3.a().stream().flatMap($$1x -> $$1.getOrDefault($$1x, List.of()).stream()).collect(ImmutableList.toImmutableList()));
      }

      this.d = Map.copyOf($$1);
      this.e = $$2.build();
   }

   private static Map<dbi, List<List<dcl>>> a(Iterable<dcl> $$0) {
      Map<dbi, List<List<dcl>>> $$1 = new HashMap<>();
      Table<dbi, Integer, List<dcl>> $$2 = HashBasedTable.create();

      for (dcl $$3 : $$0) {
         dbi $$4 = $$3.d();
         OptionalInt $$5 = $$3.c();
         if ($$5.isEmpty()) {
            $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add(List.of($$3));
         } else {
            List<dcl> $$6 = (List<dcl>)$$2.get($$4, $$5.getAsInt());
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

   public List<fyn> d() {
      return this.e;
   }

   public List<fyn> a(dax $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
