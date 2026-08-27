import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class eop implements Iterable<eno> {
   private final ero a;
   private final Set<eno> b = new HashSet<>();
   private List<eno> c = List.of();

   public eop(ero $$0) {
      this.a = $$0;
   }

   public void a(List<eno> $$0) {
      List<eno> $$1 = new ArrayList<>($$0);
      $$1.sort(new eno.b(this.a.V().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(eno $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<eno> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
