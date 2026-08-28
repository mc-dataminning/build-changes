import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fik implements Iterable<fhk> {
   private final fli a;
   private final Set<fhk> b = new HashSet<>();
   private List<fhk> c = List.of();

   public fik(fli $$0) {
      this.a = $$0;
   }

   public void a(List<fhk> $$0) {
      List<fhk> $$1 = new ArrayList<>($$0);
      $$1.sort(new fhk.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fhk $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fhk> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
