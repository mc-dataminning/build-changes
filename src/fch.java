import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fch implements Iterable<fbg> {
   private final ffg a;
   private final Set<fbg> b = new HashSet<>();
   private List<fbg> c = List.of();

   public fch(ffg $$0) {
      this.a = $$0;
   }

   public void a(List<fbg> $$0) {
      List<fbg> $$1 = new ArrayList<>($$0);
      $$1.sort(new fbg.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fbg $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fbg> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
