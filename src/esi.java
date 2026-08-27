import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class esi implements Iterable<erh> {
   private final evh a;
   private final Set<erh> b = new HashSet<>();
   private List<erh> c = List.of();

   public esi(evh $$0) {
      this.a = $$0;
   }

   public void a(List<erh> $$0) {
      List<erh> $$1 = new ArrayList<>($$0);
      $$1.sort(new erh.b(this.a.V().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(erh $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<erh> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
