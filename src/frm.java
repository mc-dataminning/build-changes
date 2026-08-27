import com.google.common.collect.ForwardingList;
import java.util.List;

public class frm extends ForwardingList<cmh> {
   private final io<cmh> a = io.a(ceq.g(), cmh.f);

   protected List<cmh> delegate() {
      return this.a;
   }

   public sp a() {
      sp $$0 = new sp();

      for (cmh $$1 : this.delegate()) {
         $$0.add($$1.b(new sj()));
      }

      return $$0;
   }

   public void a(sp $$0) {
      List<cmh> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, cmh.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (cmh $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
