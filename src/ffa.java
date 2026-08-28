import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ffa implements Iterable<feb> {
   private final fib a;
   private final Set<feb> b = new HashSet<>();
   private List<feb> c = List.of();

   public ffa(fib $$0) {
      this.a = $$0;
   }

   public void a(List<feb> $$0) {
      List<feb> $$1 = new ArrayList<>($$0);
      $$1.sort(new feb.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(feb $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<feb> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
