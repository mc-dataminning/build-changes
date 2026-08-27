import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ezv implements Iterable<eyu> {
   private final fcu a;
   private final Set<eyu> b = new HashSet<>();
   private List<eyu> c = List.of();

   public ezv(fcu $$0) {
      this.a = $$0;
   }

   public void a(List<eyu> $$0) {
      List<eyu> $$1 = new ArrayList<>($$0);
      $$1.sort(new eyu.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(eyu $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<eyu> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
