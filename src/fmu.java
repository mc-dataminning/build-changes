import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fmu implements Iterable<flu> {
   private final fpt a;
   private final Set<flu> b = new HashSet<>();
   private List<flu> c = List.of();

   public fmu(fpt $$0) {
      this.a = $$0;
   }

   public void a(List<flu> $$0) {
      List<flu> $$1 = new ArrayList<>($$0);
      $$1.sort(new flu.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(flu $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<flu> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
