import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fmp implements Iterable<flp> {
   private final fpo a;
   private final Set<flp> b = new HashSet<>();
   private List<flp> c = List.of();

   public fmp(fpo $$0) {
      this.a = $$0;
   }

   public void a(List<flp> $$0) {
      List<flp> $$1 = new ArrayList<>($$0);
      $$1.sort(new flp.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(flp $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<flp> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
