import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class eqj implements Iterable<epi> {
   private final eti a;
   private final Set<epi> b = new HashSet<>();
   private List<epi> c = List.of();

   public eqj(eti $$0) {
      this.a = $$0;
   }

   public void a(List<epi> $$0) {
      List<epi> $$1 = new ArrayList<>($$0);
      $$1.sort(new epi.b(this.a.U().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(epi $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<epi> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
