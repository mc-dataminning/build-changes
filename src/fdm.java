import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fdm implements Iterable<fcn> {
   private final fgm a;
   private final Set<fcn> b = new HashSet<>();
   private List<fcn> c = List.of();

   public fdm(fgm $$0) {
      this.a = $$0;
   }

   public void a(List<fcn> $$0) {
      List<fcn> $$1 = new ArrayList<>($$0);
      $$1.sort(new fcn.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fcn $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fcn> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
