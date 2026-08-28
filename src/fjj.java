import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fjj implements Iterable<fij> {
   private final fmg a;
   private final Set<fij> b = new HashSet<>();
   private List<fij> c = List.of();

   public fjj(fmg $$0) {
      this.a = $$0;
   }

   public void a(List<fij> $$0) {
      List<fij> $$1 = new ArrayList<>($$0);
      $$1.sort(new fij.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fij $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fij> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
