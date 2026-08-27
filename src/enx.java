import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class enx implements Iterable<emw> {
   private final eqv a;
   private final Set<emw> b = new HashSet<>();
   private List<emw> c = List.of();

   public enx(eqv $$0) {
      this.a = $$0;
   }

   public void a(List<emw> $$0) {
      List<emw> $$1 = new ArrayList<>($$0);
      $$1.sort(new emw.a(this.a.V().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(emw $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<emw> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
