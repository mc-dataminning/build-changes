import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fdo implements Iterable<fcp> {
   private final fgo a;
   private final Set<fcp> b = new HashSet<>();
   private List<fcp> c = List.of();

   public fdo(fgo $$0) {
      this.a = $$0;
   }

   public void a(List<fcp> $$0) {
      List<fcp> $$1 = new ArrayList<>($$0);
      $$1.sort(new fcp.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fcp $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fcp> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
