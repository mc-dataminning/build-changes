import com.google.common.collect.ForwardingList;
import java.util.List;

public class fni extends ForwardingList<cjf> {
   private final hn<cjf> a = hn.a(cbt.g(), cjf.b);

   protected List<cjf> delegate() {
      return this.a;
   }

   public rc a() {
      rc $$0 = new rc();

      for (cjf $$1 : this.delegate()) {
         $$0.add($$1.b(new qw()));
      }

      return $$0;
   }

   public void a(rc $$0) {
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
