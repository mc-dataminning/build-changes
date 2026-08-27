import com.google.common.collect.ForwardingList;
import java.util.List;

public class fnd extends ForwardingList<cja> {
   private final hp<cja> a = hp.a(cbo.g(), cja.b);

   protected List<cja> delegate() {
      return this.a;
   }

   public ra a() {
      ra $$0 = new ra();

      for (cja $$1 : this.delegate()) {
         $$0.add($$1.b(new qu()));
      }

      return $$0;
   }

   public void a(ra $$0) {
      List<cja> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, cja.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (cja $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
