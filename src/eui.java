import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class eui implements Iterable<eth> {
   private final exh a;
   private final Set<eth> b = new HashSet<>();
   private List<eth> c = List.of();

   public eui(exh $$0) {
      this.a = $$0;
   }

   public void a(List<eth> $$0) {
      List<eth> $$1 = new ArrayList<>($$0);
      $$1.sort(new eth.b(this.a.V().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(eth $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<eth> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
