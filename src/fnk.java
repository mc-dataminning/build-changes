import com.google.common.collect.ForwardingList;
import java.util.List;

public class fnk extends ForwardingList<cjh> {
   private final hp<cjh> a = hp.a(cbv.g(), cjh.b);

   protected List<cjh> delegate() {
      return this.a;
   }

   public re a() {
      re $$0 = new re();

      for (cjh $$1 : this.delegate()) {
         $$0.add($$1.b(new qy()));
      }

      return $$0;
   }

   public void a(re $$0) {
      List<cjh> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, cjh.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (cjh $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
