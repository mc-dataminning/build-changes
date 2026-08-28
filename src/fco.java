import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fco implements Iterable<fbn> {
   private final ffn a;
   private final Set<fbn> b = new HashSet<>();
   private List<fbn> c = List.of();

   public fco(ffn $$0) {
      this.a = $$0;
   }

   public void a(List<fbn> $$0) {
      List<fbn> $$1 = new ArrayList<>($$0);
      $$1.sort(new fbn.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fbn $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fbn> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
