import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class eqe implements Iterable<epd> {
   private final etd a;
   private final Set<epd> b = new HashSet<>();
   private List<epd> c = List.of();

   public eqe(etd $$0) {
      this.a = $$0;
   }

   public void a(List<epd> $$0) {
      List<epd> $$1 = new ArrayList<>($$0);
      $$1.sort(new epd.b(this.a.U().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(epd $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<epd> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
