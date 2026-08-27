import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ess implements Iterable<err> {
   private final evr a;
   private final Set<err> b = new HashSet<>();
   private List<err> c = List.of();

   public ess(evr $$0) {
      this.a = $$0;
   }

   public void a(List<err> $$0) {
      List<err> $$1 = new ArrayList<>($$0);
      $$1.sort(new err.b(this.a.V().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(err $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<err> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
