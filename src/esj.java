import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class esj implements Iterable<eri> {
   private final evi a;
   private final Set<eri> b = new HashSet<>();
   private List<eri> c = List.of();

   public esj(evi $$0) {
      this.a = $$0;
   }

   public void a(List<eri> $$0) {
      List<eri> $$1 = new ArrayList<>($$0);
      $$1.sort(new eri.b(this.a.V().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(eri $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<eri> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
