import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ffk implements Iterable<fel> {
   private final fil a;
   private final Set<fel> b = new HashSet<>();
   private List<fel> c = List.of();

   public ffk(fil $$0) {
      this.a = $$0;
   }

   public void a(List<fel> $$0) {
      List<fel> $$1 = new ArrayList<>($$0);
      $$1.sort(new fel.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fel $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fel> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
