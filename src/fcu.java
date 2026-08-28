import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fcu implements Iterable<fbt> {
   private final fft a;
   private final Set<fbt> b = new HashSet<>();
   private List<fbt> c = List.of();

   public fcu(fft $$0) {
      this.a = $$0;
   }

   public void a(List<fbt> $$0) {
      List<fbt> $$1 = new ArrayList<>($$0);
      $$1.sort(new fbt.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fbt $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fbt> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
