import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fgh implements Iterable<ffi> {
   private final fji a;
   private final Set<ffi> b = new HashSet<>();
   private List<ffi> c = List.of();

   public fgh(fji $$0) {
      this.a = $$0;
   }

   public void a(List<ffi> $$0) {
      List<ffi> $$1 = new ArrayList<>($$0);
      $$1.sort(new ffi.b(this.a.X().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(ffi $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<ffi> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
