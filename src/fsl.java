import com.google.common.collect.ForwardingList;
import java.util.List;

public class fsl extends ForwardingList<cmy> {
   private final iq<cmy> a = iq.a(cfh.g(), cmy.f);

   protected List<cmy> delegate() {
      return this.a;
   }

   public st a() {
      st $$0 = new st();

      for (cmy $$1 : this.delegate()) {
         $$0.add($$1.b(new sn()));
      }

      return $$0;
   }

   public void a(st $$0) {
      List<cmy> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, cmy.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (cmy $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
