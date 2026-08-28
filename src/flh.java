import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class flh implements Iterable<fkh> {
   private final fof a;
   private final Set<fkh> b = new HashSet<>();
   private List<fkh> c = List.of();

   public flh(fof $$0) {
      this.a = $$0;
   }

   public void a(List<fkh> $$0) {
      List<fkh> $$1 = new ArrayList<>($$0);
      $$1.sort(new fkh.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fkh $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fkh> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
