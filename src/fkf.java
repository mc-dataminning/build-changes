import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fkf implements Iterable<fjf> {
   private final fnd a;
   private final Set<fjf> b = new HashSet<>();
   private List<fjf> c = List.of();

   public fkf(fnd $$0) {
      this.a = $$0;
   }

   public void a(List<fjf> $$0) {
      List<fjf> $$1 = new ArrayList<>($$0);
      $$1.sort(new fjf.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fjf $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fjf> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
