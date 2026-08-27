import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class eup implements Iterable<eto> {
   private final exo a;
   private final Set<eto> b = new HashSet<>();
   private List<eto> c = List.of();

   public eup(exo $$0) {
      this.a = $$0;
   }

   public void a(List<eto> $$0) {
      List<eto> $$1 = new ArrayList<>($$0);
      $$1.sort(new eto.b(this.a.W().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(eto $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<eto> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
