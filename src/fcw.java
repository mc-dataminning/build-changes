import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fcw implements Iterable<fbv> {
   private final ffw a;
   private final Set<fbv> b = new HashSet<>();
   private List<fbv> c = List.of();

   public fcw(ffw $$0) {
      this.a = $$0;
   }

   public void a(List<fbv> $$0) {
      List<fbv> $$1 = new ArrayList<>($$0);
      $$1.sort(new fbv.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fbv $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fbv> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
