import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fji implements Iterable<fii> {
   private final fmg a;
   private final Set<fii> b = new HashSet<>();
   private List<fii> c = List.of();

   public fji(fmg $$0) {
      this.a = $$0;
   }

   public void a(List<fii> $$0) {
      List<fii> $$1 = new ArrayList<>($$0);
      $$1.sort(new fii.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fii $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fii> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
