import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class erl implements Iterable<eqk> {
   private final euk a;
   private final Set<eqk> b = new HashSet<>();
   private List<eqk> c = List.of();

   public erl(euk $$0) {
      this.a = $$0;
   }

   public void a(List<eqk> $$0) {
      List<eqk> $$1 = new ArrayList<>($$0);
      $$1.sort(new eqk.b(this.a.U().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(eqk $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<eqk> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
