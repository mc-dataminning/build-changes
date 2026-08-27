import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class eyq implements Iterable<exp> {
   private final fbp a;
   private final Set<exp> b = new HashSet<>();
   private List<exp> c = List.of();

   public eyq(fbp $$0) {
      this.a = $$0;
   }

   public void a(List<exp> $$0) {
      List<exp> $$1 = new ArrayList<>($$0);
      $$1.sort(new exp.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(exp $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<exp> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
