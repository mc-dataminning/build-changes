import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ewh implements Iterable<evg> {
   private final ezg a;
   private final Set<evg> b = new HashSet<>();
   private List<evg> c = List.of();

   public ewh(ezg $$0) {
      this.a = $$0;
   }

   public void a(List<evg> $$0) {
      List<evg> $$1 = new ArrayList<>($$0);
      $$1.sort(new evg.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(evg $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<evg> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
