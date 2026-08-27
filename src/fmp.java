import com.google.common.collect.ForwardingList;
import java.util.List;

public class fmp extends ForwardingList<ciy> {
   private final hn<ciy> a = hn.a(cbm.g(), ciy.b);

   protected List<ciy> delegate() {
      return this.a;
   }

   public qx a() {
      qx $$0 = new qx();

      for (ciy $$1 : this.delegate()) {
         $$0.add($$1.b(new qr()));
      }

      return $$0;
   }

   public void a(qx $$0) {
      List<ciy> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, ciy.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (ciy $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
