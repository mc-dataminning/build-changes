import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class enz implements Iterable<emy> {
   private final eqx a;
   private final Set<emy> b = new HashSet<>();
   private List<emy> c = List.of();

   public enz(eqx $$0) {
      this.a = $$0;
   }

   public void a(List<emy> $$0) {
      List<emy> $$1 = new ArrayList<>($$0);
      $$1.sort(new emy.a(this.a.V().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(emy $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<emy> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
