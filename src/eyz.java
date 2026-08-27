import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class eyz implements Iterable<exy> {
   private final fby a;
   private final Set<exy> b = new HashSet<>();
   private List<exy> c = List.of();

   public eyz(fby $$0) {
      this.a = $$0;
   }

   public void a(List<exy> $$0) {
      List<exy> $$1 = new ArrayList<>($$0);
      $$1.sort(new exy.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(exy $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<exy> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
