import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class enq implements Iterable<emo> {
   private final eqn a;
   private final Set<emo> b = new HashSet<>();
   private List<emo> c = List.of();

   public enq(eqn $$0) {
      this.a = $$0;
   }

   public void a(List<emo> $$0) {
      List<emo> $$1 = new ArrayList<>($$0);
      $$1.sort(new emo.a(this.a.U().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(emo $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<emo> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
