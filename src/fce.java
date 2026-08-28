import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fce implements Iterable<fbd> {
   private final ffd a;
   private final Set<fbd> b = new HashSet<>();
   private List<fbd> c = List.of();

   public fce(ffd $$0) {
      this.a = $$0;
   }

   public void a(List<fbd> $$0) {
      List<fbd> $$1 = new ArrayList<>($$0);
      $$1.sort(new fbd.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fbd $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fbd> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
