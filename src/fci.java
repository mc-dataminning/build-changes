import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fci implements Iterable<fbh> {
   private final ffh a;
   private final Set<fbh> b = new HashSet<>();
   private List<fbh> c = List.of();

   public fci(ffh $$0) {
      this.a = $$0;
   }

   public void a(List<fbh> $$0) {
      List<fbh> $$1 = new ArrayList<>($$0);
      $$1.sort(new fbh.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fbh $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fbh> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
