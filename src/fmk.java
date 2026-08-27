import com.google.common.collect.ForwardingList;
import java.util.List;

public class fmk extends ForwardingList<ciw> {
   private final ho<ciw> a = ho.a(cbk.g(), ciw.b);

   protected List<ciw> delegate() {
      return this.a;
   }

   public qy a() {
      qy $$0 = new qy();

      for (ciw $$1 : this.delegate()) {
         $$0.add($$1.b(new qs()));
      }

      return $$0;
   }

   public void a(qy $$0) {
      List<ciw> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, ciw.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (ciw $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
