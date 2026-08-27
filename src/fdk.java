import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fdk implements Iterable<fcj> {
   private final fgj a;
   private final Set<fcj> b = new HashSet<>();
   private List<fcj> c = List.of();

   public fdk(fgj $$0) {
      this.a = $$0;
   }

   public void a(List<fcj> $$0) {
      List<fcj> $$1 = new ArrayList<>($$0);
      $$1.sort(new fcj.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fcj $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fcj> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
