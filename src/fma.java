import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fma implements Iterable<fla> {
   private final foz a;
   private final Set<fla> b = new HashSet<>();
   private List<fla> c = List.of();

   public fma(foz $$0) {
      this.a = $$0;
   }

   public void a(List<fla> $$0) {
      List<fla> $$1 = new ArrayList<>($$0);
      $$1.sort(new fla.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fla $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fla> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
