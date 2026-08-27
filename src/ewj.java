import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ewj implements Iterable<evi> {
   private final ezi a;
   private final Set<evi> b = new HashSet<>();
   private List<evi> c = List.of();

   public ewj(ezi $$0) {
      this.a = $$0;
   }

   public void a(List<evi> $$0) {
      List<evi> $$1 = new ArrayList<>($$0);
      $$1.sort(new evi.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(evi $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<evi> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
