import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class esh implements Iterable<erg> {
   private final evg a;
   private final Set<erg> b = new HashSet<>();
   private List<erg> c = List.of();

   public esh(evg $$0) {
      this.a = $$0;
   }

   public void a(List<erg> $$0) {
      List<erg> $$1 = new ArrayList<>($$0);
      $$1.sort(new erg.b(this.a.V().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(erg $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<erg> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
