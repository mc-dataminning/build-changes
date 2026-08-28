import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class foe implements Iterable<fne> {
   private final frd a;
   private final Set<fne> b = new HashSet<>();
   private List<fne> c = List.of();

   public foe(frd $$0) {
      this.a = $$0;
   }

   public void a(List<fne> $$0) {
      List<fne> $$1 = new ArrayList<>($$0);
      $$1.sort(new fne.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fne $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fne> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
