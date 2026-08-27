import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class enr implements Iterable<emq> {
   private final eqp a;
   private final Set<emq> b = new HashSet<>();
   private List<emq> c = List.of();

   public enr(eqp $$0) {
      this.a = $$0;
   }

   public void a(List<emq> $$0) {
      List<emq> $$1 = new ArrayList<>($$0);
      $$1.sort(new emq.a(this.a.V().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(emq $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<emq> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
