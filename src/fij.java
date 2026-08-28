import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fij implements Iterable<fhj> {
   private final flh a;
   private final Set<fhj> b = new HashSet<>();
   private List<fhj> c = List.of();

   public fij(flh $$0) {
      this.a = $$0;
   }

   public void a(List<fhj> $$0) {
      List<fhj> $$1 = new ArrayList<>($$0);
      $$1.sort(new fhj.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fhj $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fhj> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
