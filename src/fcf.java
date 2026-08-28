import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fcf implements Iterable<fbe> {
   private final ffe a;
   private final Set<fbe> b = new HashSet<>();
   private List<fbe> c = List.of();

   public fcf(ffe $$0) {
      this.a = $$0;
   }

   public void a(List<fbe> $$0) {
      List<fbe> $$1 = new ArrayList<>($$0);
      $$1.sort(new fbe.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fbe $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fbe> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
