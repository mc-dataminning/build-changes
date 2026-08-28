import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class flt implements Iterable<fkt> {
   private final fos a;
   private final Set<fkt> b = new HashSet<>();
   private List<fkt> c = List.of();

   public flt(fos $$0) {
      this.a = $$0;
   }

   public void a(List<fkt> $$0) {
      List<fkt> $$1 = new ArrayList<>($$0);
      $$1.sort(new fkt.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fkt $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fkt> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
