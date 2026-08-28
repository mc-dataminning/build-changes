import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fha implements Iterable<fgb> {
   private final fjx a;
   private final Set<fgb> b = new HashSet<>();
   private List<fgb> c = List.of();

   public fha(fjx $$0) {
      this.a = $$0;
   }

   public void a(List<fgb> $$0) {
      List<fgb> $$1 = new ArrayList<>($$0);
      $$1.sort(new fgb.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fgb $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fgb> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
