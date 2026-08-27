import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class evl implements Iterable<euk> {
   private final eyk a;
   private final Set<euk> b = new HashSet<>();
   private List<euk> c = List.of();

   public evl(eyk $$0) {
      this.a = $$0;
   }

   public void a(List<euk> $$0) {
      List<euk> $$1 = new ArrayList<>($$0);
      $$1.sort(new euk.b(this.a.W().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(euk $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<euk> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
