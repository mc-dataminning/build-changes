import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ffz implements Iterable<ffa> {
   private final fja a;
   private final Set<ffa> b = new HashSet<>();
   private List<ffa> c = List.of();

   public ffz(fja $$0) {
      this.a = $$0;
   }

   public void a(List<ffa> $$0) {
      List<ffa> $$1 = new ArrayList<>($$0);
      $$1.sort(new ffa.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(ffa $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<ffa> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
