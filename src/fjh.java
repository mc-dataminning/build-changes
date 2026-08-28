import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fjh implements Iterable<fih> {
   private final fme a;
   private final Set<fih> b = new HashSet<>();
   private List<fih> c = List.of();

   public fjh(fme $$0) {
      this.a = $$0;
   }

   public void a(List<fih> $$0) {
      List<fih> $$1 = new ArrayList<>($$0);
      $$1.sort(new fih.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fih $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fih> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
