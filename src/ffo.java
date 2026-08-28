import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ffo implements Iterable<fep> {
   private final fip a;
   private final Set<fep> b = new HashSet<>();
   private List<fep> c = List.of();

   public ffo(fip $$0) {
      this.a = $$0;
   }

   public void a(List<fep> $$0) {
      List<fep> $$1 = new ArrayList<>($$0);
      $$1.sort(new fep.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fep $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fep> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
