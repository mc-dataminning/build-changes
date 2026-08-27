import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class eno implements Iterable<emm> {
   private final eql a;
   private final Set<emm> b = new HashSet<>();
   private List<emm> c = List.of();

   public eno(eql $$0) {
      this.a = $$0;
   }

   public void a(List<emm> $$0) {
      List<emm> $$1 = new ArrayList<>($$0);
      $$1.sort(new emm.a(this.a.V().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(emm $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<emm> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
