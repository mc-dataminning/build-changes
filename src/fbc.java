import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fbc implements Iterable<fab> {
   private final feb a;
   private final Set<fab> b = new HashSet<>();
   private List<fab> c = List.of();

   public fbc(feb $$0) {
      this.a = $$0;
   }

   public void a(List<fab> $$0) {
      List<fab> $$1 = new ArrayList<>($$0);
      $$1.sort(new fab.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fab $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fab> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
