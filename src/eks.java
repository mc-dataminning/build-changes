import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class eks {
   private final enn a;
   private final Set<ejq> b = Sets.newHashSet();
   private List<ejq> c = Lists.newArrayList();

   public eks(enn $$0) {
      this.a = $$0;
   }

   public List<ejq> a(List<ejq> $$0) {
      List<ejq> $$1 = new ArrayList<>($$0);
      $$1.sort(new ejq.a(this.a.U().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
      return List.copyOf(this.c);
   }

   public synchronized List<ejq> a(ejq $$0) {
      this.c.remove($$0);
      this.b.add($$0);
      return List.copyOf(this.c);
   }
}
