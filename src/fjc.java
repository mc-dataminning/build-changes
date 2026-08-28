import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fjc implements Iterable<fic> {
   private final flz a;
   private final Set<fic> b = new HashSet<>();
   private List<fic> c = List.of();

   public fjc(flz $$0) {
      this.a = $$0;
   }

   public void a(List<fic> $$0) {
      List<fic> $$1 = new ArrayList<>($$0);
      $$1.sort(new fic.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fic $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fic> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
