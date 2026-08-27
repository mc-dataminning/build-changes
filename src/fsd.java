import com.google.common.collect.ForwardingList;
import java.util.List;

public class fsd extends ForwardingList<cmr> {
   private final iq<cmr> a = iq.a(cfa.g(), cmr.f);

   protected List<cmr> delegate() {
      return this.a;
   }

   public sr a() {
      sr $$0 = new sr();

      for (cmr $$1 : this.delegate()) {
         $$0.add($$1.b(new sl()));
      }

      return $$0;
   }

   public void a(sr $$0) {
      List<cmr> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, cmr.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (cmr $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
