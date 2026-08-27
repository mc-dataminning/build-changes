import com.google.common.collect.ForwardingList;
import java.util.List;

public class fsx extends ForwardingList<cng> {
   private final iq<cng> a = iq.a(cfp.g(), cng.f);

   protected List<cng> delegate() {
      return this.a;
   }

   public su a() {
      su $$0 = new su();

      for (cng $$1 : this.delegate()) {
         $$0.add($$1.b(new so()));
      }

      return $$0;
   }

   public void a(su $$0) {
      List<cng> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, cng.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (cng $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
