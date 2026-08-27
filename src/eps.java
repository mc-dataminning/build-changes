import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class eps implements Iterable<eor> {
   private final esr a;
   private final Set<eor> b = new HashSet<>();
   private List<eor> c = List.of();

   public eps(esr $$0) {
      this.a = $$0;
   }

   public void a(List<eor> $$0) {
      List<eor> $$1 = new ArrayList<>($$0);
      $$1.sort(new eor.b(this.a.U().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(eor $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<eor> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
