import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fcb implements Iterable<fba> {
   private final ffa a;
   private final Set<fba> b = new HashSet<>();
   private List<fba> c = List.of();

   public fcb(ffa $$0) {
      this.a = $$0;
   }

   public void a(List<fba> $$0) {
      List<fba> $$1 = new ArrayList<>($$0);
      $$1.sort(new fba.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fba $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fba> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
