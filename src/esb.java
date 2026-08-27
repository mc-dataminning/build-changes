import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class esb implements Iterable<era> {
   private final eva a;
   private final Set<era> b = new HashSet<>();
   private List<era> c = List.of();

   public esb(eva $$0) {
      this.a = $$0;
   }

   public void a(List<era> $$0) {
      List<era> $$1 = new ArrayList<>($$0);
      $$1.sort(new era.b(this.a.U().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(era $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<era> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
