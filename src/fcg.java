import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fcg implements Iterable<fbf> {
   private final fff a;
   private final Set<fbf> b = new HashSet<>();
   private List<fbf> c = List.of();

   public fcg(fff $$0) {
      this.a = $$0;
   }

   public void a(List<fbf> $$0) {
      List<fbf> $$1 = new ArrayList<>($$0);
      $$1.sort(new fbf.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fbf $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fbf> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
