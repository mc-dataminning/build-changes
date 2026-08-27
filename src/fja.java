import com.google.common.collect.ForwardingList;
import java.util.List;

public class fja extends ForwardingList<cfz> {
   private final hn<cfz> a = hn.a(byn.g(), cfz.b);

   protected List<cfz> delegate() {
      return this.a;
   }

   public qx a() {
      qx $$0 = new qx();

      for (cfz $$1 : this.delegate()) {
         $$0.add($$1.b(new qr()));
      }

      return $$0;
   }

   public void a(qx $$0) {
      List<cfz> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, cfz.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (cfz $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
