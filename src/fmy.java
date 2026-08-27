import com.google.common.collect.ForwardingList;
import java.util.List;

public class fmy extends ForwardingList<cix> {
   private final hn<cix> a = hn.a(cbl.g(), cix.b);

   protected List<cix> delegate() {
      return this.a;
   }

   public qx a() {
      qx $$0 = new qx();

      for (cix $$1 : this.delegate()) {
         $$0.add($$1.b(new qr()));
      }

      return $$0;
   }

   public void a(qx $$0) {
      List<cix> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, cix.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (cix $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
