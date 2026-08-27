import com.google.common.collect.ForwardingList;
import java.util.List;

public class fsk extends ForwardingList<cmx> {
   private final iq<cmx> a = iq.a(cfg.g(), cmx.f);

   protected List<cmx> delegate() {
      return this.a;
   }

   public st a() {
      st $$0 = new st();

      for (cmx $$1 : this.delegate()) {
         $$0.add($$1.b(new sn()));
      }

      return $$0;
   }

   public void a(st $$0) {
      List<cmx> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, cmx.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (cmx $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
