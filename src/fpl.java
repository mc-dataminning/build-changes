import com.google.common.collect.ForwardingList;
import java.util.List;

public class fpl extends ForwardingList<clb> {
   private final il<clb> a = il.a(cdl.g(), clb.b);

   protected List<clb> delegate() {
      return this.a;
   }

   public sf a() {
      sf $$0 = new sf();

      for (clb $$1 : this.delegate()) {
         $$0.add($$1.b(new rz()));
      }

      return $$0;
   }

   public void a(sf $$0) {
      List<clb> $$1 = this.delegate();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, clb.a($$0.a($$2)));
      }
   }

   public boolean isEmpty() {
      for (clb $$0 : this.delegate()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }
}
