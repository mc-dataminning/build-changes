import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fim implements Iterable<fhm> {
   private final flk a;
   private final Set<fhm> b = new HashSet<>();
   private List<fhm> c = List.of();

   public fim(flk $$0) {
      this.a = $$0;
   }

   public void a(List<fhm> $$0) {
      List<fhm> $$1 = new ArrayList<>($$0);
      $$1.sort(new fhm.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fhm $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fhm> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
