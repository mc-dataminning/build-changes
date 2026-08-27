import com.google.common.collect.ForwardingList;
import java.util.List;

public class fqd extends ForwardingList<clo> {
   private final ip<clo> a = ip.a(cdy.g(), clo.b);

   protected List<clo> delegate() {
      return this.a;
   }

   public sj a() {
      sj $$0 = new sj();

      for (clo $$1 : this.delegate()) {
         $$0.add($$1.b(new sd()));
      }

      return $$0;
   }

   public void a(sj $$0) {
      List<clo> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, clo.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (clo $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
