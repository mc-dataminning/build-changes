import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fhh implements Iterable<fgi> {
   private final fke a;
   private final Set<fgi> b = new HashSet<>();
   private List<fgi> c = List.of();

   public fhh(fke $$0) {
      this.a = $$0;
   }

   public void a(List<fgi> $$0) {
      List<fgi> $$1 = new ArrayList<>($$0);
      $$1.sort(new fgi.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fgi $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fgi> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
