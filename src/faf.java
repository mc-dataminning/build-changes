import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class faf implements Iterable<eze> {
   private final fde a;
   private final Set<eze> b = new HashSet<>();
   private List<eze> c = List.of();

   public faf(fde $$0) {
      this.a = $$0;
   }

   public void a(List<eze> $$0) {
      List<eze> $$1 = new ArrayList<>($$0);
      $$1.sort(new eze.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(eze $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<eze> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
