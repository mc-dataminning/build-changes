import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fil implements Iterable<fhl> {
   private final flj a;
   private final Set<fhl> b = new HashSet<>();
   private List<fhl> c = List.of();

   public fil(flj $$0) {
      this.a = $$0;
   }

   public void a(List<fhl> $$0) {
      List<fhl> $$1 = new ArrayList<>($$0);
      $$1.sort(new fhl.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fhl $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fhl> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
