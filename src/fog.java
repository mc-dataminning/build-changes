import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fog implements Iterable<fng> {
   private final frf a;
   private final Set<fng> b = new HashSet<>();
   private List<fng> c = List.of();

   public fog(frf $$0) {
      this.a = $$0;
   }

   public void a(List<fng> $$0) {
      List<fng> $$1 = new ArrayList<>($$0);
      $$1.sort(new fng.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fng $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fng> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
