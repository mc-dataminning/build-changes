import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ens implements Iterable<emr> {
   private final eqq a;
   private final Set<emr> b = new HashSet<>();
   private List<emr> c = List.of();

   public ens(eqq $$0) {
      this.a = $$0;
   }

   public void a(List<emr> $$0) {
      List<emr> $$1 = new ArrayList<>($$0);
      $$1.sort(new emr.a(this.a.V().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(emr $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<emr> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
