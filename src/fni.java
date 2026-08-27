import com.google.common.collect.ForwardingList;
import java.util.List;

public class fni extends ForwardingList<cjf> {
   private final hp<cjf> a = hp.a(cbt.g(), cjf.b);

   protected List<cjf> delegate() {
      return this.a;
   }

   public rd a() {
      rd $$0 = new rd();

      for (cjf $$1 : this.delegate()) {
         $$0.add($$1.b(new qx()));
      }

      return $$0;
   }

   public void a(rd $$0) {
      List<cjf> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, cjf.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (cjf $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
